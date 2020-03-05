package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        TextView txtCount;
    TextView Recordv;
        Button btnClick;
        Button btnReset;
        ImageView iv;
    TextView ggRec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCount = (TextView)findViewById(R.id.TextViewCount);
        btnClick = (Button)findViewById(R.id.buttonClick);
        btnReset=(Button)findViewById(R.id.buttonReset);
        Recordv =(TextView)findViewById(R.id.RecordView);

        ggRec = (TextView)findViewById(R.id.GGview);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggRec.setVisibility(View.INVISIBLE);

                Random random = new Random();
               int color = android.graphics.Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                String CountValues=txtCount.getText().toString();
                int intCountValues = Integer.parseInt(CountValues);
                intCountValues++;
                txtCount.setText(String.valueOf(intCountValues));
                int n=2;

                if((intCountValues % 50)==0){
                    int res =0;
                    res =intCountValues;

                    //System.out.println(res);
                    btnClick.setBackgroundColor(color);
                    btnReset.setBackgroundColor(color);
                    Recordv.setTextColor(color);
                    txtCount.setTextColor(color);
                            Recordv.setText(String.valueOf(res));



                    //  txtCount.setTextColor(Color.parseColor(String.valueOf(Math.random()* 0x1000000)));
                    if ( (intCountValues % 200)==0){
                        ggRec.setText("Good Job GG  !!");
                            ggRec.setTextColor(color);
                           ggRec.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                int resetValue = 0;

                Random random = new Random();
                int color = android.graphics.Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                ggRec.setText("Click On The Push");
                ggRec.setVisibility(View.VISIBLE);
                ggRec.setTextColor(color);
                txtCount.setText(String.valueOf(resetValue));
                btnClick.setBackgroundColor(color);
                btnReset.setBackgroundColor(color);
                Recordv.setTextColor(color);
                txtCount.setTextColor(color);
            }
        });

    }
}
