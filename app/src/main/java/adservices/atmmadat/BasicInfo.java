package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BasicInfo extends AppCompatActivity implements View.OnClickListener {

    String uid="ca-app-pub-3715652664770345/9286598713";
    Button b,b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        b = (Button)findViewById(R.id.bitoc);
        b1 = (Button)findViewById(R.id.biaci);
        b2 = (Button)findViewById(R.id.biback);
        b3 = (Button)findViewById(R.id.binxt);

        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bitoc:
                startActivity(new Intent(this,TypeOfCard.class));
                break;
            case R.id.biaci:
                startActivity(new Intent(this,AboutAtmMec.class));
                break;
            case R.id.biback:
                startActivity(new Intent(this,MainActivity.class));
                break;
            case R.id.binxt:
                startActivity(new Intent(this,Welcome.class));
                break;

        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,MainActivity.class));
    }
}
