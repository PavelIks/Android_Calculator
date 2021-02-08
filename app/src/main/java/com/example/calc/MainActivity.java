package com.example.calc;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText textview1;
    Button btn5_ID, btn6_ID, btn7_ID, btn9_ID, btn10_ID, btn11_ID, btn13_ID, btn14_ID, btn15_ID;
    Button btn16_ID; // ...

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float mValueOne, mValueTwo;

        boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

        textview1 = (EditText) findViewById(R.id.tv1);

        btn5_ID = (Button) findViewById(R.id.btn5);
        btn6_ID = (Button) findViewById(R.id.btn6);
        btn7_ID = (Button) findViewById(R.id.btn7);
        btn9_ID = (Button) findViewById(R.id.btn9);
        btn10_ID = (Button) findViewById(R.id.btn10);
        btn11_ID = (Button) findViewById(R.id.btn11);
        btn13_ID = (Button) findViewById(R.id.btn13);
        btn14_ID = (Button) findViewById(R.id.btn14);
        btn15_ID = (Button) findViewById(R.id.btn15);

        btn16_ID = (Button) findViewById(R.id.btn16); // buttonadd

        btn16_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (textview1 == null)
                {
                    textview1.setText("");
                }
                else
                    {
                        mValueOne = Float.parseFloat(textview1.getText() + "");
                        crunchifyAddition = true;
                        textview1.setText(null);
                    }
            }
        });

        btn5_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "7");
            }
        });

        btn6_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "8");
            }
        });

        btn7_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "9");
            }
        });

        btn9_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "4");
            }
        });

        btn10_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "5");
            }
        });

        btn11_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "6");
            }
        });

        btn13_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "1");
            }
        });

        btn14_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "2");
            }
        });

        btn15_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textview1.setText(textview1.getText() + "3");
            }
        });


    }
}