package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MechineInformtion extends AppCompatActivity implements View.OnClickListener {

    Button b,b1,b2;
    String uid="ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechine_informtion);

        MobileAds.initialize(getApplicationContext(),uid);
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        b = (Button)findViewById(R.id.amc);
        b1 = (Button)findViewById(R.id.gpw);
        b2 = (Button)findViewById(R.id.amiback);

        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.amc:
                startActivity(new Intent(this,MachineControl.class));
                break;
            case R.id.gpw:
                startActivity(new Intent(this,AboutAtmMec.class));
                break;
            case R.id.amiback:
                startActivity(new Intent(this,BasicInfo.class));
                break;
        }

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,BasicInfo.class));
    }
}
