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

public class CreditCard extends AppCompatActivity implements View.OnClickListener {

    String uid = "ca-app-pub-3715652664770345/9286598713";
    Button bb;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bb = (Button)findViewById(R.id.cb);
        tv = (TextView)findViewById(R.id.vcard);

        bb.setOnClickListener(this);
        tv.setText(R.string.cci);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cb:
                startActivity(new Intent(this,TypeOfCard.class));
                break;
        }

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,TypeOfCard.class));
    }
}
