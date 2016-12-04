package adservices.atmmadat;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Pranav on 20-08-2016.
 */
public class About extends Activity implements View.OnClickListener {

    TextView tv,tv1,tv2,tv3;
    ImageView im1,im2;
    Button b;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3715652664770345/9286598713");

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        tv = (TextView) findViewById(R.id.web);
        tv3 = (TextView)findViewById(R.id.email);

        im1 = (ImageView) findViewById(R.id.fb);
        im2 = (ImageView) findViewById(R.id.tw);

        b = (Button)findViewById(R.id.prv);

        tv.setOnClickListener(this);
        tv3.setOnClickListener(this);

        im1.setOnClickListener(this);
        im2.setOnClickListener(this);

        b.setOnClickListener(this);

        wv = (WebView) findViewById(R.id.webvv);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.prv:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }

        switch (v.getId()) {
            case R.id.web:
                tv.setAutoLinkMask(Linkify.WEB_URLS);
                tv.setText("www.adservices.in");
                break;

            case R.id.fb:

                wv.loadUrl("https://www.facebook.com/adservices.in/");
                break;

            case R.id.tw:
                wv.loadUrl("https://twitter.com/ADservicesamaze/");
                break;

            case R.id.email:
                tv3.setAutoLinkMask(Linkify.EMAIL_ADDRESSES);
                tv3.setText("Info@adservices.in");
                break;

        }

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,MainActivity.class));
    }
}
