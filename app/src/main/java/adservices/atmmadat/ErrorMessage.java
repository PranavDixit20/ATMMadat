package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ErrorMessage extends AppCompatActivity implements View.OnClickListener {

    String uid="ca-app-pub-3715652664770345/9286598713";

    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    ImageView im,im1,im2,im3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_message);

        MobileAds.initialize(getApplicationContext(),uid);
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        tv = (TextView)findViewById(R.id.vcard);
        tv1=(TextView)findViewById(R.id.e1);
        tv2 = (TextView)findViewById(R.id.e2);
        tv3 = (TextView)findViewById(R.id.e3);
        tv4 = (TextView)findViewById(R.id.e4);
        tv5 = (TextView)findViewById(R.id.e5);
        tv6 = (TextView)findViewById(R.id.e6);
        tv7 = (TextView)findViewById(R.id.e7);
        im = (ImageView)findViewById(R.id.em1);
        im1 = (ImageView)findViewById(R.id.em2);
        b = (Button)findViewById(R.id.eb);

        b.setOnClickListener(this);
        im.setImageResource(R.mipmap.errnocash);
        im1.setImageResource(R.mipmap.errtempoutofservice);
        tv.setText(R.string.err);
        tv1.setText(R.string.err1);
        tv2.setText(R.string.err2);
        tv3.setText(R.string.err3);
        tv4.setText(R.string.err4);
        tv5.setText(R.string.err5);
        tv6.setText(R.string.err6);
        tv7.setText(R.string.err7);
        /*work is done*/
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.eb:
                startActivity(new Intent(this,BasicInfo.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,BasicInfo.class));
    }
}
