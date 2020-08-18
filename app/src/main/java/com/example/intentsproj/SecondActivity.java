package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText btnum1;
    EditText btnum2;

    String number1;
    String number2;

    TextView lblsum;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnum1 =findViewById(R.id.btnum1);
        btnum2 =findViewById(R.id.btnum2);

        lblsum=findViewById(R.id.lbl);

        Intent Intent = getIntent();

         number1 =Intent.getStringExtra("n1");
         number2 =Intent.getStringExtra("n2");

        btnum1.setText(number1);
        btnum2.setText(number2);

        n1 =Integer.parseInt(number1);
        n2 =Integer.parseInt(number2);

    }

    public void add(View view){

        lblsum.setText(number1 +" + " + number2+ " = " +(n1+n2));
    }

    public void substaction(View view){

        lblsum.setText(number1 +" - " + number2+ " = " +(n1-n2));
    }

    public void mutification(View view){

        lblsum.setText(number1 +" + " + number2+ " = " +(n1*n2));
    }

    public void divistion(View view){

        lblsum.setText(number1 +" + " + number2+ " = " +(n1/n2));
    }
}