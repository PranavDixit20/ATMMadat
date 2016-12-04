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

public class AtmInfoFront extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button b,b1;
    String y;
    String uid = "ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_info_front);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        tv = (TextView)findViewById(R.id.finfo);
        b = (Button)findViewById(R.id.nxtt);
        b1 = (Button)findViewById(R.id.pr);

        tv.setText(R.string.atmfinfo);

        b.setOnClickListener(this);
        b1.setOnClickListener(this);

        y=getIntent().getStringExtra("y");

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.nxtt:
                Intent in=new Intent(this,AtmInfoBack.class);
                in.putExtra("x",y);
                startActivity(in);
                finish();
                break;
            case R.id.pr:
                Intent i=new Intent(this,AtmMenu.class);
                i.putExtra("x",y);
                startActivity(i);
                finish();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(this,AtmMenu.class);
        i.putExtra("x",y);
        startActivity(i);
        finish();
    }
}
