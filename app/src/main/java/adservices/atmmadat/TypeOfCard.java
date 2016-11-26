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

public class TypeOfCard extends AppCompatActivity implements View.OnClickListener {

    Button b,b1,b2,b3,b4;
    String uid = "ca-app-pub-3715652664770345/9286598713";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_card);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        b = (Button) findViewById(R.id.vcard);
        b1 = (Button) findViewById(R.id.rcard);
        b2 = (Button) findViewById(R.id.mcard);
        b3 = (Button)findViewById(R.id.pcard);
        b4 = (Button)findViewById(R.id.tocnxt);

        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.vcard:
                startActivity(new Intent(this,CreditCard.class));
                break;
            case R.id.rcard:
                startActivity(new Intent(this,AtmCard.class));
                break;
            case R.id.mcard:
                startActivity(new Intent(this,DebitATMCard.class));
                break;
            case R.id.pcard:
                startActivity(new Intent(this,PaymentGetway.class));
                break;
            case R.id.tocnxt:
                startActivity(new Intent(this,BasicInfo.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,BasicInfo.class));
        finish();
    }
}
