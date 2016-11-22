package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BankInfo extends AppCompatActivity implements View.OnClickListener {
    String z;
    TextView tv,tv1;
    Button prv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_info);

        z=getIntent().getStringExtra("y");

        tv=(TextView)findViewById(R.id.info);
        tv1 = (TextView)findViewById(R.id.nam);
        prv = (Button)findViewById(R.id.prv);

        prv.setOnClickListener(this);

       switch (z)
       {
           case "1":
               tv.setText(R.string.bominfo);
               tv1.setBackgroundResource(R.mipmap.a);
               break;
           case "2":
               tv.setText(R.string.bobinfo);
               tv1.setBackgroundResource(R.mipmap.b);
               break;
           case "3":
               tv.setText(R.string.boiinfo);
               tv1.setBackgroundResource(R.mipmap.c);
               break;
           case "4":
               tv.setText(R.string.caninfo);
               tv1.setBackgroundResource(R.mipmap.d);
               break;
           case "5":
               tv.setText(R.string.cbinfo);
               tv1.setBackgroundResource(R.mipmap.e);
               break;
           case "6":
               tv.setText(R.string.hdfcinfo);
               tv1.setBackgroundResource(R.mipmap.f);
               break;
           case "7":
               tv.setText(R.string.icicinfo);
               tv1.setBackgroundResource(R.mipmap.g);
               break;
           case "8":
               tv.setText(R.string.sbinfo);
               tv1.setBackgroundResource(R.mipmap.h);
               break;
           case "9":
               tv.setText(R.string.pnbinfo);
               tv1.setBackgroundResource(R.mipmap.i);
               break;
           case "10":
               tv.setText(R.string.ubinfo);
               tv1.setBackgroundResource(R.mipmap.j);
               break;
       }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.prv:
                Intent i=new Intent(this,AtmMenu.class);
                i.putExtra("x",z);
                startActivity(i);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        finish();
        Intent i=new Intent(this,AtmMenu.class);
        i.putExtra("x",z);
        startActivity(i);
    }
}
