package com.example.calc;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button btn5_ID, btn6_ID, btn7_ID, btn9_ID, btn10_ID, btn11_ID, btn13_ID, btn14_ID, btn15_ID;
    TextView tv1_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn5_ID = (Button) findViewById(R.id.btn5);
        tv1_ID = (TextView) findViewById(R.id.tv1);

        btn5_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });


    }
}