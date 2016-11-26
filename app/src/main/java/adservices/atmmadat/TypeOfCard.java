package adservices.atmmadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TypeOfCard extends AppCompatActivity implements View.OnClickListener {

    TextView tv,tv1,tv2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_card);

        tv = (TextView)findViewById(R.id.vcard);
        tv1 = (TextView)findViewById(R.id.rcard);
        tv2 = (TextView)findViewById(R.id.mcard);
        b = (Button)findViewById(R.id.tocnxt);

        b.setOnClickListener(this);
        tv.setText(R.string.vcard);
        tv1.setText(R.string.rcard);
        tv2.setText(R.string.mcard);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tocnxt:
                startActivity(new Intent(this,BasicInfo.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,BasicInfo.class));
        finish();
    }
}
