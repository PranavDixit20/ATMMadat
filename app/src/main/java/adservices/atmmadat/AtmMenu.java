package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AtmMenu extends AppCompatActivity implements View.OnClickListener {

    Button bi,aci,wi,bc,b;
    TextView tv;
    String y;
    String uid = "ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_menu);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bi = (Button)findViewById(R.id.bi);
        aci = (Button)findViewById(R.id.aci);
        wi = (Button)findViewById(R.id.wi);
        bc = (Button)findViewById(R.id.bc);
        b = (Button)findViewById(R.id.backk);
        tv = (TextView)findViewById(R.id.na);

        bi.setOnClickListener(this);
        aci.setOnClickListener(this);
        wi.setOnClickListener(this);
        bc.setOnClickListener(this);
        b.setOnClickListener(this);

        y=getIntent().getStringExtra("x");

        switch (y){
            case "1":
                tv.setBackgroundResource(R.mipmap.a);
                break;
            case "2":
                tv.setBackgroundResource(R.mipmap.b);
                break;
            case "3":
                tv.setBackgroundResource(R.mipmap.c);
                break;
            case "4":
                tv.setBackgroundResource(R.mipmap.download123);
                break;
            case "5":
                tv.setBackgroundResource(R.mipmap.e);
                break;
            case "6":
                tv.setBackgroundResource(R.mipmap.f);
                break;
            case "7":
                tv.setBackgroundResource(R.mipmap.g);
                break;
            case "8":
                tv.setBackgroundResource(R.mipmap.h);
                break;
            case "9":
                tv.setBackgroundResource(R.mipmap.i);
                break;
            case "10":
                tv.setBackgroundResource(R.mipmap.j);
                break;
            case "11":
                tv.setBackgroundResource(R.mipmap.sbbj);
                break;
            case "12":
                tv.setBackgroundResource(R.mipmap.sbt);
                break;
            case "13":
                tv.setBackgroundResource(R.mipmap.sbp);
                break;
            case "14":
                tv.setBackgroundResource(R.mipmap.sbm);
                break;
            case "15":
                tv.setBackgroundResource(R.mipmap.sbh);
                break;
            case "16":
                tv.setBackgroundResource(R.mipmap.ucologo);
                break;
            case "17":
                tv.setBackgroundResource(R.mipmap.orientallogo);
                break;
            case "18":
                tv.setBackgroundResource(R.mipmap.dblogo);
                break;
            case "19":
                tv.setBackgroundResource(R.mipmap.ublogo);
                break;
            case "20":
                tv.setBackgroundResource(R.mipmap.synlogo);
                break;
            case "21":
                tv.setBackgroundResource(R.mipmap.pns);
                break;
            case "22":
                tv.setBackgroundResource(R.mipmap.vblogo);
                break;
            case "23":
                tv.setBackgroundResource(R.mipmap.andlogo);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bi :
                Intent in=new Intent(this,BankInfo.class);
                in.putExtra("y",y);
                startActivity(in);
                break;
            case R.id.aci :
                Intent i=new Intent(this,AtmInfoFront.class);
                i.putExtra("y",y);
                startActivity(i);
                break;
            case R.id.wi :
                Intent ii=new Intent(this,WithdrawActivity.class);
                ii.putExtra("y",y);
                startActivity(ii);
                break;
            case R.id.bc :
                Intent iii=new Intent(this,BalanceCheck.class);
                iii.putExtra("y",y);
                startActivity(iii);
                break;
            case R.id.backk :
                startActivity(new Intent(this,Welcome.class));
                break;
        }

    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this, Welcome.class));
    }
}
