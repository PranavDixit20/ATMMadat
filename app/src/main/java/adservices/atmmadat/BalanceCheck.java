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

public class BalanceCheck extends AppCompatActivity implements View.OnClickListener {
    TextView b1,b2,b3,b4,b5;
    String x;
    Button b;
    String uid = "ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_check);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        b1=(TextView)findViewById(R.id.bcheck1);
        b2=(TextView)findViewById(R.id.bcheck2);
        b3=(TextView)findViewById(R.id.bcheck3);
        b4=(TextView)findViewById(R.id.bcheck4);
        b5=(TextView)findViewById(R.id.bcheck5);
        b = (Button)findViewById(R.id.bcb);

        b1.setText(R.string.bcheck1);
        b2.setText(R.string.bcheck2);
        b3.setText(R.string.bcheck3);
        b4.setText(R.string.bcheck4);
        b5.setText(R.string.bcheck5);

        b.setOnClickListener(this);

        x=getIntent().getStringExtra("y");
    }

    @Override
    public void onBackPressed() {
        Intent in=new Intent(this,AtmMenu.class);
        in.putExtra("x",x);
        startActivity(in);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bcb:
                Intent in=new Intent(this,AtmMenu.class);
                in.putExtra("x",x);
                startActivity(in);
                break;
        }
    }
}
