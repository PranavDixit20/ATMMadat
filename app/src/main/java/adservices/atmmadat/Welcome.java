package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Welcome extends AppCompatActivity implements View.OnClickListener {

    Button bk, one, two, three, four, five, six, seven, eight, nine, ten,
            eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,
            nineteen,twenty,twentyone,twentytwo,twentythree;
    String x;
    String uid = "ca-app-pub-3715652664770345/9286598713";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bk = (Button) findViewById(R.id.back);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        ten = (Button) findViewById(R.id.ten);
        eleven = (Button) findViewById(R.id.eleven);
        twelve = (Button) findViewById(R.id.twelve);
        thirteen = (Button) findViewById(R.id.thirteen);
        fourteen = (Button) findViewById(R.id.fourteen);
        fifteen = (Button) findViewById(R.id.fifteen);
        sixteen= (Button) findViewById(R.id.sixteen);
        seventeen = (Button) findViewById(R.id.seventeen);
        eighteen = (Button) findViewById(R.id.eighteen);
        nineteen = (Button) findViewById(R.id.nineteen);
        twenty = (Button) findViewById(R.id.twenty);
        twentyone = (Button) findViewById(R.id.twentyone);
        twentytwo= (Button) findViewById(R.id.twentytwo);
        twentythree = (Button) findViewById(R.id.twentythree);



        bk.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
        eleven.setOnClickListener(this);
        twelve.setOnClickListener(this);
        thirteen.setOnClickListener(this);
        fourteen.setOnClickListener(this);
        fifteen.setOnClickListener(this);
        sixteen.setOnClickListener(this);
        seventeen.setOnClickListener(this);
        eighteen.setOnClickListener(this);
        nineteen.setOnClickListener(this);
        twenty.setOnClickListener(this);
        twentyone.setOnClickListener(this);
        twentytwo.setOnClickListener(this);
        twentythree.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                startActivity(new Intent(this, BasicInfo.class));
                break;
            case R.id.one:
                Intent i=new Intent(this,AtmMenu.class);
                 x="1";
                i.putExtra("x",x);
                startActivity(i);
                break;
            case R.id.two:
                Intent i2=new Intent(this,AtmMenu.class);
                 x="2";
                i2.putExtra("x",x);
                startActivity(i2);
                break;
            case R.id.three:
                Intent i3=new Intent(this,AtmMenu.class);
                 x="3";
                i3.putExtra("x",x);
                startActivity(i3);
                break;
            case R.id.four:
                Intent i4=new Intent(this,AtmMenu.class);
                 x="4";
                i4.putExtra("x",x);
                startActivity(i4);
                break;
            case R.id.five:
                Intent i5=new Intent(this,AtmMenu.class);
                 x="5";
                i5.putExtra("x",x);
                startActivity(i5);
                break;
            case R.id.six:
                Intent i6=new Intent(this,AtmMenu.class);
                x="6";
                i6.putExtra("x",x);
                startActivity(i6);
                break;
            case R.id.seven:
                Intent i7=new Intent(this,AtmMenu.class);
                x="7";
                i7.putExtra("x",x);
                startActivity(i7);
                break;
            case R.id.eight:
                Intent i8=new Intent(this,AtmMenu.class);
                x="8";
                i8.putExtra("x",x);
                startActivity(i8);
                break;
            case R.id.nine:
                Intent i9=new Intent(this,AtmMenu.class);
                x="9";
                i9.putExtra("x",x);
                startActivity(i9);
                break;
            case R.id.ten:
                Intent i10=new Intent(this,AtmMenu.class);
                x="10";
                i10.putExtra("x",x);
                startActivity(i10);
                break;
            case R.id.eleven:
                Intent i11=new Intent(this,AtmMenu.class);
                x="11";
                i11.putExtra("x",x);
                startActivity(i11);
                break;
            case R.id.twelve:
                Intent i12=new Intent(this,AtmMenu.class);
                x="12";
                i12.putExtra("x",x);
                startActivity(i12);
                break;
            case R.id.thirteen:
                Intent i13=new Intent(this,AtmMenu.class);
                x="13";
                i13.putExtra("x",x);
                startActivity(i13);
                break;
            case R.id.fourteen:
                Intent i14=new Intent(this,AtmMenu.class);
                x="14";
                i14.putExtra("x",x);
                startActivity(i14);
                break;
            case R.id.fifteen:
                Intent i15=new Intent(this,AtmMenu.class);
                x="15";
                i15.putExtra("x",x);
                startActivity(i15);
                break;
            case R.id.sixteen:
                Intent i16=new Intent(this,AtmMenu.class);
                x="16";
                i16.putExtra("x",x);
                startActivity(i16);
                break;
            case R.id.seventeen:
                Intent i17=new Intent(this,AtmMenu.class);
                x="17";
                i17.putExtra("x",x);
                startActivity(i17);
                break;
            case R.id.eighteen:
                Intent i18=new Intent(this,AtmMenu.class);
                x="18";
                i18.putExtra("x",x);
                startActivity(i18);
                break;
            case R.id.nineteen:
                Intent i19=new Intent(this,AtmMenu.class);
                x="19";
                i19.putExtra("x",x);
                startActivity(i19);
                break;
            case R.id.twenty:
                Intent i20=new Intent(this,AtmMenu.class);
                x="20";
                i20.putExtra("x",x);
                startActivity(i20);
                break;
            case R.id.twentyone:
                Intent i21=new Intent(this,AtmMenu.class);
                x="21";
                i21.putExtra("x",x);
                startActivity(i21);
                break;
            case R.id.twentytwo:
                Intent i22=new Intent(this,AtmMenu.class);
                x="22";
                i22.putExtra("x",x);
                startActivity(i22);
                break;
            case R.id.twentythree:
                Intent i23=new Intent(this,AtmMenu.class);
                x="23";
                i23.putExtra("x",x);
                startActivity(i23);
                break;





        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, BasicInfo.class));
    }
}
