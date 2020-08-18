package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.CharSequenceTransformation;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    EditText btnum1;
    EditText btnum2;



    String number1;
    String number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //defineing the text object
        btnum1 =findViewById(R.id.btnum1);
        btnum2 =findViewById(R.id.btnum2);





    }

       public void openSecondActivity(View view){

        Toast.makeText(FirstActivity.this, "creating calculater", Toast.LENGTH_SHORT).show();//Creating the LayoutInflater instance
           LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
           View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                   findViewById(R.id.custom_toast_layout));
//Creating the Toast object
           Toast toast = new Toast(getApplicationContext());
           toast.setDuration(Toast.LENGTH_SHORT);
           toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
           toast.setView(layout);//setting the view of custom toast layout
           toast.show();


    Intent Intent =new Intent(FirstActivity.this,SecondActivity.class);
        Intent.putExtra("n1",btnum1.getText().toString());
        Intent.putExtra("n2",btnum2.getText().toString());

        startActivity(Intent);

    }



    }
