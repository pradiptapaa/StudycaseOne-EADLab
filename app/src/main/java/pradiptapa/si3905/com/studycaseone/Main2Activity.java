package pradiptapa.si3905.com.studycaseone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.textView5);
        tv2 = (TextView) findViewById(R.id.textView7);
        tv3 = (TextView) findViewById(R.id.textView9);
        tv4 = (TextView) findViewById(R.id.textView11);

        tv1.setText(getIntent().getStringExtra("warung"));
        tv2.setText(getIntent().getStringExtra("makanan"));
        tv3.setText(String.valueOf(getIntent().getIntExtra("jumlahPorsi",0)));
        tv4.setText(String.valueOf(getIntent().getIntExtra("total", 0)));
    }
}
