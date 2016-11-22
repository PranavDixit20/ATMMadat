package adservices.atmmadat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener {

    Button bk, one, two, three, four, five, six, seven, eight, nine, ten;
    AtmMenu am;
    String x;
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
        }
    }

}
