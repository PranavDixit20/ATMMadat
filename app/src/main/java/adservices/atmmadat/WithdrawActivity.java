package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class WithdrawActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    String x;
    Button bb;
    String uid = "ca-app-pub-3715652664770345/9286598713";
   /* FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageRef = storage.getReferenceFromUrl("gs://atm-madat.appspot.com");
    StorageReference sref = storageRef.child("BankImages/sbi1.png");*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdraw);

        MobileAds.initialize(getApplicationContext(),uid);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        bb = (Button)findViewById(R.id.wb);
        bb.setOnClickListener(this);

        t1=(TextView)findViewById(R.id.info1);
        t2=(TextView)findViewById(R.id.info2);
        t3=(TextView)findViewById(R.id.info3);
        t4=(TextView)findViewById(R.id.info4);
        t5=(TextView)findViewById(R.id.info5);
        t6=(TextView)findViewById(R.id.info6);
        t7=(TextView)findViewById(R.id.info7);
        t8=(TextView)findViewById(R.id.info8);
        t9=(TextView)findViewById(R.id.info9);
        t10=(TextView)findViewById(R.id.info10);
        t11=(TextView)findViewById(R.id.info11);

        w1=(ImageView)findViewById(R.id.w1);
        w2=(ImageView)findViewById(R.id.w2);
        w3=(ImageView)findViewById(R.id.w3);
        w4=(ImageView)findViewById(R.id.w4);
        w5=(ImageView)findViewById(R.id.w5);
        w6=(ImageView)findViewById(R.id.w6);
        w7=(ImageView)findViewById(R.id.w7);
        w8=(ImageView)findViewById(R.id.w8);
        w9=(ImageView)findViewById(R.id.w9);
        w10=(ImageView)findViewById(R.id.w10);
        w11=(ImageView)findViewById(R.id.w11);


        x=getIntent().getStringExtra("y");

        imagSet();

    }
    public void imagSet(){
        switch (x){
            case "1":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "2":
                ImageLoader.upload(this,"bobone.png",w1);
                ImageLoader.upload(this,"bobtwo.png",w2);
                ImageLoader.upload(this,"bobthree.png",w3);
                ImageLoader.upload(this,"bobfour.png",w4);
                ImageLoader.upload(this,"bobfive.png",w5);
                ImageLoader.upload(this,"bobsix.png",w6);
                ImageLoader.upload(this,"bobseven.png",w7);
                ImageLoader.upload(this,"bobeight.png",w8);
                ImageLoader.upload(this,"bobnine.png",w9);
                ImageLoader.upload(this,"bobten.png",w10);
                ImageLoader.upload(this,"bobeleven.png",w11);


                t1.setText(R.string.bob1);
                t2.setText(R.string.bob2);
                t3.setText(R.string.bob3);
                t4.setText(R.string.bob4);
                t5.setText(R.string.bob5);
                t6.setText(R.string.bob6);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob8);
                t9.setText(R.string.bob9);
                t10.setText(R.string.bob10);
                t11.setText(R.string.bob11);

                break;
            case "3":

                ImageLoader.upload(this,"boi1.png",w1);
                ImageLoader.upload(this,"boi2.png",w2);
                ImageLoader.upload(this,"boi3.png",w3);
                ImageLoader.upload(this,"boi4.png",w4);
                ImageLoader.upload(this,"boi5.png",w5);
                ImageLoader.upload(this,"boi6.png",w6);
                w7.setVisibility(View.GONE);
                w8.setVisibility(View.GONE);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.bob2);
                t3.setText(R.string.bob3);
                t4.setText(R.string.bob5);
                t5.setText(R.string.bob7);
                t6.setText(R.string.bob11);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "4":
                ImageLoader.upload(this,"c1.jpg",w1);
                ImageLoader.upload(this,"c2.jpg",w2);
                ImageLoader.upload(this,"c3.jpg",w3);
                ImageLoader.upload(this,"c4.jpg",w4);
                ImageLoader.upload(this,"c5.jpg",w5);
                ImageLoader.upload(this,"c6.jpg",w6);
                ImageLoader.upload(this,"c7.jpg",w7);

                w8.setVisibility(View.GONE);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob3);
                t2.setText(R.string.bob5);
                t3.setText(R.string.bob6);
                t4.setText(R.string.bob11);
                t5.setText(R.string.bob7);
                t6.setText(R.string.bob8);
                t7.setText(R.string.bob10);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);

                break;
            case "5":
                ImageLoader.upload(this,"cb1.png",w1);
                ImageLoader.upload(this,"cb2.png",w2);
                ImageLoader.upload(this,"cb4.png",w3);
                ImageLoader.upload(this,"cb5.png",w4);
                ImageLoader.upload(this,"cb6.png",w5);
                ImageLoader.upload(this,"cb7.png",w6);
                ImageLoader.upload(this,"cb8.png",w7);
                w8.setVisibility(View.GONE);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.bob2);
                t3.setText(R.string.bob3);
                t4.setText(R.string.bob5);
                t5.setText(R.string.sbi4);
                t6.setText(R.string.bob7);
                t7.setText(R.string.bob11);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "6":

                ImageLoader.upload(this,"hdfc1.png",w1);
                ImageLoader.upload(this,"hdfc2.png",w2);
                ImageLoader.upload(this,"hdfc3.png",w3);
                ImageLoader.upload(this,"hdfc4.png",w4);
                ImageLoader.upload(this,"hdfc5.png",w5);
                ImageLoader.upload(this,"hdfc6.png",w6);
                ImageLoader.upload(this,"hdfc7.png",w7);
                w8.setVisibility(View.GONE);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.bob2);
                t3.setText(R.string.bob5);
                t4.setText(R.string.sbi4);
                t5.setText(R.string.bob7);
                t6.setText(R.string.bob3);
                t7.setText(R.string.bob11);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "7":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);

                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "8":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi4.png",w4);
                ImageLoader.upload(this,"sbi5.png",w5);
                ImageLoader.upload(this,"sbi6.png",w6);
                ImageLoader.upload(this,"sbi7.png",w7);
                ImageLoader.upload(this,"sbi8.png",w8);
                ImageLoader.upload(this,"sbi9.png",w9);

                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "9":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);

                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "10":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);

                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "11":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi4.png",w4);
                ImageLoader.upload(this,"sbi5.png",w5);
                ImageLoader.upload(this,"sbi6.png",w6);
                ImageLoader.upload(this,"sbi7.png",w7);
                ImageLoader.upload(this,"sbi8.png",w8);
                ImageLoader.upload(this,"sbi9.png",w9);

                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "12":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi4.png",w4);
                ImageLoader.upload(this,"sbi5.png",w5);
                ImageLoader.upload(this,"sbi6.png",w6);
                ImageLoader.upload(this,"sbi7.png",w7);
                ImageLoader.upload(this,"sbi8.png",w8);
                ImageLoader.upload(this,"sbi9.png",w9);

                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "13":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi4.png",w4);
                ImageLoader.upload(this,"sbi5.png",w5);
                ImageLoader.upload(this,"sbi6.png",w6);
                ImageLoader.upload(this,"sbi7.png",w7);
                ImageLoader.upload(this,"sbi8.png",w8);
                ImageLoader.upload(this,"sbi9.png",w9);

                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "14":

                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi4.png",w4);
                ImageLoader.upload(this,"sbi5.png",w5);
                ImageLoader.upload(this,"sbi6.png",w6);
                ImageLoader.upload(this,"sbi7.png",w7);
                ImageLoader.upload(this,"sbi8.png",w8);
                ImageLoader.upload(this,"sbi9.png",w9);

                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "15":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi4.png",w4);
                ImageLoader.upload(this,"sbi5.png",w5);
                ImageLoader.upload(this,"sbi6.png",w6);
                ImageLoader.upload(this,"sbi7.png",w7);
                ImageLoader.upload(this,"sbi8.png",w8);
                ImageLoader.upload(this,"sbi9.png",w9);

                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.sbi3);
                t5.setText(R.string.bob3);
                t6.setText(R.string.bob5);
                t7.setText(R.string.sbi4);
                t8.setText(R.string.bob7);
                t9.setText(R.string.bob11);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "16":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);

                break;
            case "17":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "18":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "19":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "20":
                ImageLoader.upload(this,"synd1.png",w1);
                ImageLoader.upload(this,"synd2.png",w2);
                ImageLoader.upload(this,"synd3.png",w3);
                ImageLoader.upload(this,"synd4.png",w4);
                ImageLoader.upload(this,"synd5.png",w5);
                ImageLoader.upload(this,"synd6.png",w6);
                ImageLoader.upload(this,"synd7.png",w7);

                w8.setVisibility(View.GONE);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.bob2);
                t3.setText(R.string.bob3);
                t4.setText(R.string.bob5);
                t5.setText(R.string.sbi4);
                t6.setText(R.string.bob7);
                t7.setText(R.string.bob11);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);

                break;
            case "21":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);

                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "22":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
            case "23":
                ImageLoader.upload(this,"sbi1.png",w1);
                ImageLoader.upload(this,"sbi2.png",w2);
                ImageLoader.upload(this,"sbi3.png",w3);
                ImageLoader.upload(this,"sbi5.png",w4);
                ImageLoader.upload(this,"sbi6.png",w5);
                ImageLoader.upload(this,"sbi7.png",w6);
                ImageLoader.upload(this,"sbi8.png",w7);
                ImageLoader.upload(this,"sbi9.png",w8);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.sbi2);
                t3.setText(R.string.bob2);
                t4.setText(R.string.bob3);
                t5.setText(R.string.bob5);
                t6.setText(R.string.sbi4);
                t7.setText(R.string.bob7);
                t8.setText(R.string.bob11);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;

            case "24":
                ImageLoader.upload(this,"yb1.png",w1);
                ImageLoader.upload(this,"yb2.png",w2);
                ImageLoader.upload(this,"yb3.png",w3);
                ImageLoader.upload(this,"yb4.png",w4);
                ImageLoader.upload(this,"yb5.png",w5);
                ImageLoader.upload(this,"yb6.png",w6);

                w7.setVisibility(View.GONE);
                w8.setVisibility(View.GONE);
                w9.setVisibility(View.GONE);
                w10.setVisibility(View.GONE);
                w11.setVisibility(View.GONE);


                t1.setText(R.string.bob1);
                t2.setText(R.string.bob5);
                t3.setText(R.string.sbi4);
                t4.setText(R.string.bob7);
                t5.setText(R.string.bob11);
                t6.setText(R.string.bob3);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent ii=new Intent(this,AtmMenu.class);
        ii.putExtra("x",x);
        startActivity(ii);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.wb:
                Intent ii=new Intent(this,AtmMenu.class);
                ii.putExtra("x",x);
                startActivity(ii);
                break;
        }
    }
}
