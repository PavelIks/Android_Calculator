package com.example.calc;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button btn1_ID, btn2_ID, btn3_ID, btn5_ID, btn6_ID, btn7_ID, btn9_ID, btn10_ID, btn11_ID;
    TextView tv1_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1_ID = (Button) findViewById(R.id.btn1);
        btn2_ID = (Button) findViewById(R.id.btn2);
        btn3_ID = (Button) findViewById(R.id.btn3);
        btn5_ID = (Button) findViewById(R.id.btn5);
        btn6_ID = (Button) findViewById(R.id.btn6);
        btn7_ID = (Button) findViewById(R.id.btn7);
        btn9_ID = (Button) findViewById(R.id.btn9);
        btn10_ID = (Button) findViewById(R.id.btn10);
        btn11_ID = (Button) findViewById(R.id.btn11);
        tv1_ID = (TextView) findViewById(R.id.tv1);

        btn1_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn2_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn3_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn5_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn6_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn7_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn9_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn10_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });

        btn11_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv1_ID.setText(tv1_ID.getText() + "1");
            }
        });
    }
}