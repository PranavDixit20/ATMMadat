package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AboutAtmMec extends AppCompatActivity implements View.OnClickListener {

    Button b;
    TextView tv;
    String uid="ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_atm_mec);

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
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hawnxt:
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
