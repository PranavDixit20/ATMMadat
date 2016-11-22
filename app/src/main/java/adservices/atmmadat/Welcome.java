package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener {

    Button bk, one, two, three, four, five, six, seven, eight, nine, ten;
    AtmMenu am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

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

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.one:
                am = new AtmMenu();
                startActivity(new Intent(this,AtmMenu.class));
                break;
            case R.id.two:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.three:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.four:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.five:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.six:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.seven:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.eight:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.nine:
                startActivity(new Intent(this, AtmMenu.class));
                break;
            case R.id.ten:
                startActivity(new Intent(this, AtmMenu.class));
                break;
        }
    }

}
