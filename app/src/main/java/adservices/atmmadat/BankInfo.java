package adservices.atmmadat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BankInfo extends AppCompatActivity {
        String z;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_info);

        z=getIntent().getStringExtra("y");
        tv=(TextView)findViewById(R.id.info);

       switch (z){
           case "1":
                   tv.setText(R.string.bominfo);
                     break;
           case "2":
               tv.setText(R.string.bobinfo);
               break;
           case "3":
               tv.setText(R.string.boiinfo);
               break;
           case "4":
               tv.setText(R.string.caninfo);
               break;
           case "5":
               tv.setText(R.string.cbinfo);
               break;
           case "6":
               tv.setText(R.string.hdfcinfo);
               break;
           case "7":
               tv.setText(R.string.icicinfo);
               break;
           case "8":
               tv.setText(R.string.sbinfo);
               break;
           case "9":
               tv.setText(R.string.pnbinfo);
               break;
           case "10":
               tv.setText(R.string.ubinfo);
               break;




        }
    }
}
