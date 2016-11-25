package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WithdrawActivity extends AppCompatActivity {

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

        t1.setText(R.string.step1);
        t2.setText(R.string.step2);
        t3.setText(R.string.step3);
        t4.setText(R.string.step4);
        t5.setText(R.string.step5);
        t6.setText(R.string.step6);
        t7.setText(R.string.step7);
        t8.setText(R.string.step8);
        t9.setText(R.string.step9);

        x=getIntent().getStringExtra("y");

    }

    @Override
    public void onBackPressed() {
        Intent ii=new Intent(this,AtmMenu.class);
        ii.putExtra("x",x);
        startActivity(ii);
    }
}
