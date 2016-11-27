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

public class MachineControl extends AppCompatActivity implements View.OnClickListener {

    Button bb;
    String uid="ca-app-pub-3715652664770345/9286598713";
    TextView t,t1,t2,t3,t4,t5,t6,t7,t8;
    ImageView i,i1,i2,i3,i4,i5,i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_control);

        MobileAds.initialize(getApplicationContext(),uid);
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bb = (Button)findViewById(R.id.mcback);
        t = (TextView)findViewById(R.id.mc1);
        t1 = (TextView)findViewById(R.id.mc2);
        t2= (TextView)findViewById(R.id.mc3);
        t3 = (TextView)findViewById(R.id.mc4);
        t4 = (TextView)findViewById(R.id.mc5);
        t5 = (TextView)findViewById(R.id.mc6);
        t6 = (TextView)findViewById(R.id.mc7);
        t7= (TextView)findViewById(R.id.mc8);
        t8= (TextView)findViewById(R.id.mc9);

        i = (ImageView)findViewById(R.id.m1);
        i1 = (ImageView)findViewById(R.id.m2);
        i2 = (ImageView)findViewById(R.id.m3);
        i3 = (ImageView)findViewById(R.id.m4);
        i4 = (ImageView)findViewById(R.id.m5);
        i5 = (ImageView)findViewById(R.id.m6);
        i6 = (ImageView)findViewById(R.id.m7);

        bb.setOnClickListener(this);

        t.setText(R.string.mc);
        t1.setText(R.string.mc1);
        t2.setText(R.string.mc2);
        t3.setText(R.string.mc3);
        t4.setText(R.string.mc4);
        t5.setText(R.string.mc5);
        t6.setText(R.string.mc6);
        t7.setText(R.string.mc7);
        t8.setText(R.string.mc8);

        i.setImageResource(R.mipmap.gusuingscreenbutton);
        i1.setImageResource(R.mipmap.gtouchscreenimage);
        i2.setImageResource(R.mipmap.gpinkeypad);
        i3.setImageResource(R.mipmap.gcardintakeslot);
        i4.setImageResource(R.mipmap.gcarddipslot);
        i5.setImageResource(R.mipmap.gmoney);
        i6.setImageResource(R.mipmap.greceiptslot);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mcback:
                startActivity(new Intent(this,MechineInformtion.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,MechineInformtion.class));
    }
}
