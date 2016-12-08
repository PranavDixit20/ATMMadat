package adservices.atmmadat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.storage.FirebaseStorage;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   // Button eng, mr,punjabi,hindi,malayalam,guj,tel,kan, nxt,ext;
    TextView nxt,ext;
    TextView eng,mr,hindi,au,disc;
    TextView cyl,tt;
    Locale myLocale;
    Bundle b;
    Intent in;
    String lang = "en",uid="ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        FirebaseStorage storage = FirebaseStorage.getInstance();

        eng = (TextView) findViewById(R.id.eng);
        mr = (TextView) findViewById(R.id.mr);
        hindi=(TextView) findViewById(R.id.hnd);
        au = (TextView)findViewById(R.id.au);
        disc =(TextView)findViewById(R.id.disc);

       /* punjabi=(Button) findViewById(R.id.pnb);
        malayalam=(Button)findViewById(R.id.mlm);
        guj=(Button)findViewById(R.id.gj);
        tel=(Button)findViewById(R.id.tl);
        kan=(Button)findViewById(R.id.kn);*/
        nxt = (TextView) findViewById(R.id.nxt);
        cyl = (TextView)findViewById(R.id.cyl);
        tt = (TextView)findViewById(R.id.tt);
        ext = (TextView) findViewById(R.id.exit);

        eng.setOnClickListener(this);
        mr.setOnClickListener(this);
        hindi.setOnClickListener(this);
      /*  punjabi.setOnClickListener(this);
        malayalam.setOnClickListener(this);
        guj.setOnClickListener(this);
        tel.setOnClickListener(this);
        kan.setOnClickListener(this);*/
        nxt.setOnClickListener(this);
        ext.setOnClickListener(this);
        au.setOnClickListener(this);
        disc.setOnClickListener(this);
        loadLocale();

    }

    public void loadLocale()
    {
        String langPref = "Language";
        SharedPreferences prefs = getSharedPreferences("CommonPrefs", AppCompatActivity.MODE_PRIVATE);
        String language = prefs.getString(langPref, "");
        changeLang(language);
    }

    public void saveLocale(String lang)
    {
        String langPref = "Language";
        SharedPreferences prefs = getSharedPreferences("CommonPrefs", AppCompatActivity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(langPref, lang);
        editor.apply();
    }

    public void changeLang(String lang)
    {
        if (lang.equalsIgnoreCase(""))
            return;
        myLocale = new Locale(lang);
        saveLocale(lang);
        Locale.setDefault(myLocale);
        android.content.res.Configuration config = new android.content.res.Configuration();
        config.locale = myLocale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        updateTexts();
    }

    private void updateTexts()
    {
        eng.setText(R.string.english);
        mr.setText(R.string.Marathi);
        nxt.setText(R.string.nxt);
        cyl.setText(R.string.lang_selection);
        ext.setText(R.string.exit);
        tt.setText(R.string.app_name);
        au.setText(R.string.about_us);
        disc.setText(R.string.disclaimer);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.eng:
                lang = "en";
                break;
            case R.id.mr:
                lang = "mr";
                break;
            case R.id.hnd:
                lang = "hi";
                break;
        /*    case R.id.pnb:
                lang = "pa";
                break;
            case R.id.gj:
                lang = "gu";
                break;
            case R.id.mlm:
                lang = "ml";
            case R.id.tl:
                lang = "te";
                break;
            case R.id.kn:
                lang = "kn";
                break; */
            case R.id.nxt:
               startActivity(new Intent(this,BasicInfo.class));
                break;
            case R.id.exit:
                moveTaskToBack(true);
                finish();
                break;
            case R.id.au:
                startActivity(new Intent(this,About.class));
                finish();
                break;
            case R.id.disc:
                startActivity(new Intent(this,Disclaimer.class));
                finish();
                break;
        }
        changeLang(lang);
    }

    @Override
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (myLocale != null){
            newConfig.locale = myLocale;
            Locale.setDefault(myLocale);
            getBaseContext().getResources().updateConfiguration(newConfig, getBaseContext().getResources().getDisplayMetrics());
        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        finish();
    }
}
