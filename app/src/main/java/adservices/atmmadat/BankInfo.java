package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BankInfo extends AppCompatActivity implements View.OnClickListener {
    String z;
    TextView tv,tv1;
    Button prv;
    String uid = "ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_info);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        z=getIntent().getStringExtra("y");

        tv=(TextView)findViewById(R.id.info);
        tv1 = (TextView)findViewById(R.id.nam);
        prv = (Button)findViewById(R.id.prv);

        prv.setOnClickListener(this);

       switch (z)
       {
           case "1":
               tv.setText(R.string.bominfo);
               tv1.setBackgroundResource(R.mipmap.a);
               break;
           case "2":
               tv.setText(R.string.bobinfo);
               tv1.setBackgroundResource(R.mipmap.b);
               break;
           case "3":
               tv.setText(R.string.boiinfo);
               tv1.setBackgroundResource(R.mipmap.c);
               break;
           case "4":
               tv.setText(R.string.caninfo);
               tv1.setBackgroundResource(R.mipmap.download123);
               break;
           case "5":
               tv.setText(R.string.cbinfo);
               tv1.setBackgroundResource(R.mipmap.e);
               break;
           case "6":
               tv.setText(R.string.hdfcinfo);
               tv1.setBackgroundResource(R.mipmap.f);
               break;
           case "7":
               tv.setText(R.string.icicinfo);
               tv1.setBackgroundResource(R.mipmap.g);
               break;
           case "8":
               tv.setText(R.string.sbinfo);
               tv1.setBackgroundResource(R.mipmap.h);
               break;
           case "9":
               tv.setText(R.string.pnbinfo);
               tv1.setBackgroundResource(R.mipmap.i);
               break;
           case "10":
               tv.setText(R.string.ubinfo);
               tv1.setBackgroundResource(R.mipmap.j);
               break;
           case "11":
               tv.setText(R.string.ax);
               tv1.setBackgroundResource(R.mipmap.ax);
               break;
           case "12":
               tv.setText(R.string.sbinfo);
               tv1.setBackgroundResource(R.mipmap.sbt);
               break;
           case "13":
               tv.setText(R.string.sbinfo);
               tv1.setBackgroundResource(R.mipmap.sbp);
               break;
           case "14":
               tv.setText(R.string.sbinfo);
               tv1.setBackgroundResource(R.mipmap.sbim);
               break;
           case "15":
               tv.setText(R.string.idbi);
               tv1.setBackgroundResource(R.mipmap.idbi);
               break;
           case "16":
               tv.setText(R.string.ucoinfo);
               tv1.setBackgroundResource(R.mipmap.ucologo);
               break;
           case "17":
               tv.setText(R.string.orbinfo);
               tv1.setBackgroundResource(R.mipmap.orientallogo);
               break;
           case "18":
               tv.setText(R.string.dbinfo);
               tv1.setBackgroundResource(R.mipmap.dblogo);
               break;
           case "19":
               tv.setText(R.string.ubiinfo);
               tv1.setBackgroundResource(R.drawable.ib1);
               break;
           case "20":
               tv.setText(R.string.syninfo);
               tv1.setBackgroundResource(R.mipmap.synlogo);
               break;
           case "21":
               tv.setText(R.string.pnsinfo);
               tv1.setBackgroundResource(R.mipmap.pns);
               break;
           case "22":
               tv.setText(R.string.vijinfo);
               tv1.setBackgroundResource(R.mipmap.vblogo);
               break;
           case "23":
               tv.setText(R.string.sarswatbinfo);
               tv1.setBackgroundResource(R.drawable.sb1);
               break;
           case "24":
               tv.setText(R.string.yesbank);
               tv1.setBackgroundResource(R.drawable.yb1);
               break;
       }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.prv:
                Intent i=new Intent(this,AtmMenu.class);
                i.putExtra("x",z);
                startActivity(i);
                finish();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        finish();
        Intent i=new Intent(this,AtmMenu.class);
        i.putExtra("x",z);
        startActivity(i);
        finish();
    }
}
