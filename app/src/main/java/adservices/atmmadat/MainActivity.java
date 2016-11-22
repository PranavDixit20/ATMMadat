package adservices.atmmadat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.storage.FirebaseStorage;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button eng, mr, nxt,ext;
    TextView cyl,tt;
    Locale myLocale;
    Bundle b;
    Intent in;
    String lang = "en";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseStorage storage = FirebaseStorage.getInstance();

        eng = (Button)findViewById(R.id.eng);
        mr = (Button)findViewById(R.id.mr);
        nxt = (Button)findViewById(R.id.nxt);
        cyl = (TextView)findViewById(R.id.cyl);
        tt = (TextView)findViewById(R.id.tt);
        ext = (Button)findViewById(R.id.exit);

        eng.setOnClickListener(this);
        mr.setOnClickListener(this);
        nxt.setOnClickListener(this);
        ext.setOnClickListener(this);

        loadLocale();

        /*StorageReference storageReference = storage.getReferenceFromUrl("gs://atm-madat.appspot.com/sp.jpg");
       // Load the image using Glide (download image from firebase)
        Glide.with(this)
                .using(new FirebaseImageLoader())
                .load(storageReference)
                .into(iv);*/
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
            case R.id.nxt:
               startActivity(new Intent(this,Welcome.class));
                break;
            case R.id.exit:
                moveTaskToBack(true);
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
    }
}
