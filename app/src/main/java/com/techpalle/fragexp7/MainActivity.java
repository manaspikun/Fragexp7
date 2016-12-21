package com.techpalle.fragexp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button b;
    public static final int REQ_CD1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent, REQ_CD1);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestcode, int resultcode, Intent intent) {


        if (requestcode == REQ_CD1) ;
        {
            if (resultcode == RESULT_OK) {

                Bundle bn = intent.getExtras();
                String val = bn.getString("val");
                textView.setText("" +val);

            }
        }
    }
}