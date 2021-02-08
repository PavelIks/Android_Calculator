package com.example.calc;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText Edittext1_ID;
    Button btn5_ID, btn6_ID, btn7_ID, btn9_ID, btn10_ID, btn11_ID, btn13_ID, btn14_ID, btn15_ID;
    Button btn16_ID; // ...
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edittext1_ID = (EditText) findViewById(R.id.edittext1);

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
                if (Edittext1_ID == null)
                {
                    Edittext1_ID.setText("");
                }
                else
                    {
                        mValueOne = Float.parseFloat(Edittext1_ID.getText() + "");
                        crunchifyAddition = true;
                        Edittext1_ID.setText(null);
                    }
            }
        });

        btn5_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "7");
            }
        });

        btn6_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "8");
            }
        });

        btn7_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "9");
            }
        });

        btn9_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "4");
            }
        });

        btn10_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "5");
            }
        });

        btn11_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "6");
            }
        });

        btn13_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "1");
            }
        });

        btn14_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "2");
            }
        });

        btn15_ID.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Edittext1_ID.setText(Edittext1_ID.getText() + "3");
            }
        });


    }
}