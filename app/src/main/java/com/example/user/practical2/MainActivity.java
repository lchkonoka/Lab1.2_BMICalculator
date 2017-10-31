package com.example.user.practical2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText editTextWeight, editTextHeight;
    ImageView imageViewResult;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link UI to program variables
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }
    //calculate BMI==============================================
    public void calculateBMI(View view)
    {
        double weight, height;
        double BMIresult;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        BMIresult = weight / (height * height);
        if (BMIresult <= 18.5)
        {
            textViewResult.setText("Under Weight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if (BMIresult > 18.5 && BMIresult < 21)
        {
            textViewResult.setText("Normal");
            imageViewResult.setImageResource(R.drawable.normal);
        }
        else
        {
            textViewResult.setText("Over Weight");
            imageViewResult.setImageResource(R.drawable.over);
        }

    }
    //=============================================================

    //reset all input field===================================
    public void resetResult(View view)
    {
        textViewResult.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        editTextWeight.setText("");
        editTextHeight.setText("");
    }
    //==============================================
}
