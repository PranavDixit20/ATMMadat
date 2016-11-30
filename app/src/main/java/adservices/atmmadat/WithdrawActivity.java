package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WithdrawActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    String x;
    Button bb;
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

        bb = (Button)findViewById(R.id.wb);
        bb.setOnClickListener(this);

        t1=(TextView)findViewById(R.id.info1);
        t2=(TextView)findViewById(R.id.info2);
        t3=(TextView)findViewById(R.id.info3);
        t4=(TextView)findViewById(R.id.info4);
        t5=(TextView)findViewById(R.id.info5);
        t6=(TextView)findViewById(R.id.info6);
        t7=(TextView)findViewById(R.id.info7);
        t8=(TextView)findViewById(R.id.info8);
        t9=(TextView)findViewById(R.id.info9);
        t10=(TextView)findViewById(R.id.info10);
        t11=(TextView)findViewById(R.id.info11);

        w1=(ImageView)findViewById(R.id.w1);
        w2=(ImageView)findViewById(R.id.w2);
        w3=(ImageView)findViewById(R.id.w3);
        w4=(ImageView)findViewById(R.id.w4);
        w5=(ImageView)findViewById(R.id.w5);
        w6=(ImageView)findViewById(R.id.w6);
        w7=(ImageView)findViewById(R.id.w7);
        w8=(ImageView)findViewById(R.id.w8);
        w9=(ImageView)findViewById(R.id.w9);
        w10=(ImageView)findViewById(R.id.w10);
        w11=(ImageView)findViewById(R.id.w11);


        x=getIntent().getStringExtra("y");

        imagSet();

    }
    public void imagSet(){
        switch (x){
            case "1":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "2":
                w1.setImageResource(R.mipmap.bobone);
                w2.setImageResource(R.mipmap.bobtwo);
                w3.setImageResource(R.mipmap.bobthree);
                w4.setImageResource(R.mipmap.bobfour);
                w5.setImageResource(R.mipmap.bobfive);
                w6.setImageResource(R.mipmap.bobsix);
                w7.setImageResource(R.mipmap.bobseven);
                w8.setImageResource(R.mipmap.bobeight);
                w9.setImageResource(R.mipmap.bobnine);
                w10.setImageResource(R.mipmap.bobten);
                w11.setImageResource(R.mipmap.bobeleven);

                t1.setText(R.string.bob1);
                t2.setText(R.string.bob2);
                t3.setText(R.string.bob3);
                t4.setText(R.string.bob4);
                t5.setText(R.string.bob5);
                t6.setText(R.string.bob6);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob8);
                t9.setText(R.string.bob9);
                t10.setText(R.string.bob10);
                t11.setText(R.string.bob11);

                break;
            case "3":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "4":
                w1.setImageResource(R.mipmap.c1);
                w2.setImageResource(R.mipmap.c2);
                w3.setImageResource(R.mipmap.c3);
                w4.setImageResource(R.mipmap.c4);
                w5.setImageResource(R.mipmap.c5);
                w6.setImageResource(R.mipmap.c6);
                w7.setImageResource(R.mipmap.c7);

                t1.setText(R.string.bob3);
                t2.setText(R.string.bob5);
                t3.setText(R.string.bob6);
                t4.setText(R.string.bob11);
                t5.setText(R.string.bob7);
                t6.setText(R.string.bob8);
                t7.setText(R.string.bob10);

                break;
            case "5":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "6":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "7":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
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

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                break;
            case "9":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "10":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
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

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
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

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
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

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
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

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
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

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                break;
            case "16":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "17":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "18":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "19":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "20":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "21":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "22":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
            case "23":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;

            case "24":
                w1.setImageResource(R.mipmap.sbi1);
                w2.setImageResource(R.mipmap.sbi2);
                w3.setImageResource(R.mipmap.sbi3);
                w4.setImageResource(R.mipmap.sbi5);
                w5.setImageResource(R.mipmap.sbi6);
                w6.setImageResource(R.mipmap.sbi7);
                w7.setImageResource(R.mipmap.sbi8);
                w8.setImageResource(R.mipmap.sbi9);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent ii=new Intent(this,AtmMenu.class);
        ii.putExtra("x",x);
        startActivity(ii);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.wb:
                Intent ii=new Intent(this,AtmMenu.class);
                ii.putExtra("x",x);
                startActivity(ii);
                break;
        }
    }
}
