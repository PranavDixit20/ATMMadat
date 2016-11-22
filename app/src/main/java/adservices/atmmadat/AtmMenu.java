package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AtmMenu extends AppCompatActivity implements View.OnClickListener {

    Button bi,aci,wi,bc,b;
    String y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_menu);

        bi = (Button)findViewById(R.id.bi);
        aci = (Button)findViewById(R.id.aci);
        wi = (Button)findViewById(R.id.wi);
        bc = (Button)findViewById(R.id.bc);
        b = (Button)findViewById(R.id.backk);

        bi.setOnClickListener(this);
        aci.setOnClickListener(this);
        wi.setOnClickListener(this);
        bc.setOnClickListener(this);
        b.setOnClickListener(this);
    y=getIntent().getStringExtra("x");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bi :
                Intent in=new Intent(this,BankInfo.class);
                in.putExtra("y",y);
                startActivity(in);
                break;
            case R.id.aci :
                break;
            case R.id.wi :
                break;
            case R.id.bc :
                break;
            case R.id.backk :
                startActivity(new Intent(this,Welcome.class));
                break;
        }

    }
}
