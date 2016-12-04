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

public class ShopOnline extends AppCompatActivity implements View.OnClickListener {

    String uid="ca-app-pub-3715652664770345/9286598713";
    Button bb;
    TextView t,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_online);

        MobileAds.initialize(getApplicationContext(),uid);
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bb = (Button)findViewById(R.id.osb);
        t = (TextView)findViewById(R.id.vcard);
        tv1 = (TextView)findViewById(R.id.one);
        tv2 = (TextView)findViewById(R.id.two);
        tv3 = (TextView)findViewById(R.id.three);
        tv4 = (TextView)findViewById(R.id.four);
        tv5 = (TextView)findViewById(R.id.five);
        tv6 = (TextView)findViewById(R.id.six);
        tv7 = (TextView)findViewById(R.id.seven);
        tv8 = (TextView)findViewById(R.id.eight);
        tv9 = (TextView)findViewById(R.id.nine);

        bb.setOnClickListener(this);
        t.setText(R.string.osinfo);
        tv1.setText(R.string.os1);
        tv2.setText(R.string.os2);
        tv3.setText(R.string.os3);
        tv4.setText(R.string.os4);
        tv5.setText(R.string.os5);
        tv6.setText(R.string.os6);
        tv7.setText(R.string.os7);
        tv8.setText(R.string.os8);
        tv9.setText(R.string.os9);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.osb:
                startActivity(new Intent(this,BasicInfo.class));
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,BasicInfo.class));
        finish();
    }
}
