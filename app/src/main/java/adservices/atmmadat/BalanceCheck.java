package adservices.atmmadat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BalanceCheck extends AppCompatActivity {
    TextView b1,b2,b3,b4,b5;
    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_check);
        b1=(TextView)findViewById(R.id.bcheck1);
        b2=(TextView)findViewById(R.id.bcheck2);
        b3=(TextView)findViewById(R.id.bcheck3);
        b4=(TextView)findViewById(R.id.bcheck4);
        b5=(TextView)findViewById(R.id.bcheck5);

        b1.setText(R.string.bcheck1);
        b2.setText(R.string.bcheck2);
        b3.setText(R.string.bcheck3);
        b4.setText(R.string.bcheck4);
        b5.setText(R.string.bcheck5);

        x=getIntent().getStringExtra("y");
    }
}
