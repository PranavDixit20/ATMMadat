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

public class ShopWithYourCard extends AppCompatActivity implements View.OnClickListener {

    String uid="ca-app-pub-3715652664770345/9286598713";
    Button bb;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_with_your_card);

        MobileAds.initialize(getApplicationContext(),uid);
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bb = (Button)findViewById(R.id.swdcb);
        t = (TextView)findViewById(R.id.swdc);

        bb.setOnClickListener(this);
        t.setText(R.string.swc);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.swdcb:
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
