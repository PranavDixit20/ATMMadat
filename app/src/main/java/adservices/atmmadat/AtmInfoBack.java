package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AtmInfoBack extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button b;
    String y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_info_back);

        tv = (TextView)findViewById(R.id.binfo);
        b = (Button)findViewById(R.id.pro);

        tv.setText(R.string.atmbinfo);
        b.setOnClickListener(this);

        y=getIntent().getStringExtra("x");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pro:
                Intent in=new Intent(this,AtmInfoFront.class);
                in.putExtra("y",y);
                startActivity(in);
                finish();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent in=new Intent(this,AtmInfoFront.class);
        in.putExtra("y",y);
        startActivity(in);
        finish();
    }
}
