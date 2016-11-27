package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WithdrawActivity extends AppCompatActivity {
    ImageView w1,w2,w3,w4,w5,w6,w7,w8,w9;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    String x;
    String uid = "ca-app-pub-3715652664770345/9286598713";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdraw);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        t1=(TextView)findViewById(R.id.info1);
        t2=(TextView)findViewById(R.id.info2);
        t3=(TextView)findViewById(R.id.info3);
        t4=(TextView)findViewById(R.id.info4);
        t5=(TextView)findViewById(R.id.info5);
        t6=(TextView)findViewById(R.id.info6);
        t7=(TextView)findViewById(R.id.info7);
        t8=(TextView)findViewById(R.id.info8);
        t9=(TextView)findViewById(R.id.info9);

        w1=(ImageView)findViewById(R.id.w1);
        w2=(ImageView)findViewById(R.id.w2);
        w3=(ImageView)findViewById(R.id.w3);
        w4=(ImageView)findViewById(R.id.w4);
        w5=(ImageView)findViewById(R.id.w5);
        w6=(ImageView)findViewById(R.id.w6);
        w7=(ImageView)findViewById(R.id.w7);
        w8=(ImageView)findViewById(R.id.w8);
        w9=(ImageView)findViewById(R.id.w9);


        t1.setText(R.string.step1);
        t2.setText(R.string.step2);
        t3.setText(R.string.step3);
        t4.setText(R.string.step4);
        t5.setText(R.string.step5);
        t6.setText(R.string.step6);
        t7.setText(R.string.step7);
        t8.setText(R.string.step8);


        x=getIntent().getStringExtra("y");

        imagSet();

    }
    public void imagSet(){
        switch (x){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                w1.setImageResource(R.mipmap.can1);
                w2.setImageResource(R.mipmap.can2);
                w3.setImageResource(R.mipmap.can3);
                w4.setImageResource(R.mipmap.can4);
                w5.setImageResource(R.mipmap.can5);
                w6.setImageResource(R.mipmap.can6);
                w7.setImageResource(R.mipmap.can7);

                break;
            case "5":
                break;
            case "6":

                break;
            case "7":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "8":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "9":
                break;
            case "10":
                break;
            case "11":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "12":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "13":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "14":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "15":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi4);
                w5.setImageResource(R.mipmap.sbi5);
                w6.setImageResource(R.mipmap.sbi6);
                w7.setImageResource(R.mipmap.sbi7);
                w8.setImageResource(R.mipmap.sbi8);
                w9.setImageResource(R.mipmap.sbi9);
                t9.setText(R.string.step9);
                break;
            case "16":
                break;


        }

    }

    @Override
    public void onBackPressed() {
        Intent ii=new Intent(this,AtmMenu.class);
        ii.putExtra("x",x);
        startActivity(ii);
    }
}
