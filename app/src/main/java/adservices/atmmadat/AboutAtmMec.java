package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AboutAtmMec extends AppCompatActivity implements View.OnClickListener {

    Button b;
    TextView tv;
    String uid="ca-app-pub-3715652664770345/9286598713";
    ImageView w1,w2,w3,w4,w5,w6,w7,w8;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_atm_mec);

        MobileAds.initialize(getApplicationContext(),uid);
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        b = (Button)findViewById(R.id.hawnxt);
        tv = (TextView)findViewById(R.id.hawinfo);

        tv.setText(R.string.hawinfo);
        b.setOnClickListener(this);

        tv1=(TextView)findViewById(R.id.info1);
        tv2=(TextView)findViewById(R.id.info2);
        tv3=(TextView)findViewById(R.id.info3);
        tv4=(TextView)findViewById(R.id.info4);
        tv5=(TextView)findViewById(R.id.info5);
        tv6=(TextView)findViewById(R.id.info6);
        tv7=(TextView)findViewById(R.id.info7);
        tv8=(TextView)findViewById(R.id.info8);

        w1=(ImageView)findViewById(R.id.w1);
        w2=(ImageView)findViewById(R.id.w2);
        w3=(ImageView)findViewById(R.id.w3);
        w4=(ImageView)findViewById(R.id.w4);
        w5=(ImageView)findViewById(R.id.w5);
        w6=(ImageView)findViewById(R.id.w6);
        w7=(ImageView)findViewById(R.id.w7);
        w8=(ImageView)findViewById(R.id.w8);

        w1.setImageResource(R.mipmap.sbi1);
        w2.setImageResource(R.mipmap.sbi2);
        w3.setImageResource(R.mipmap.sbi3);
        w4.setImageResource(R.mipmap.sbi5);
        w5.setImageResource(R.mipmap.sbi6);
        w6.setImageResource(R.mipmap.sbi7);
        w7.setImageResource(R.mipmap.sbi8);
        w8.setImageResource(R.mipmap.sbi9);


        tv1.setText(R.string.bob1);
        tv2.setText(R.string.sbi2);
        tv3.setText(R.string.bob2);
        tv4.setText(R.string.bob3);
        tv5.setText(R.string.bob5);
        tv6.setText(R.string.sbi4);
        tv7.setText(R.string.bob7);
        tv8.setText(R.string.bob11);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hawnxt:
                startActivity(new Intent(this,MechineInformtion.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,MechineInformtion.class));
        finish();
    }
}
