package com.mli.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView bmiText;
    TextView calcuText;
    EditText inputHeight;
    EditText inputWeight;
    TextView answerText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmiText = findViewById(R.id.bmi_text);
        bmiText.setText(R.string.bmi_text);

        calcuText = findViewById(R.id.calcu_text);
        calcuText.setText(R.string.calcu_text);
    }


    public void setCalcuText(View view){

        inputWeight = (EditText) findViewById(R.id.weight_text);
        String s = inputWeight.getText().toString();
        float weight =Float.parseFloat(s);

        inputHeight = (EditText) findViewById(R.id.height_text);
        String s1 = inputHeight.getText().toString();
        float height =Float.parseFloat(s1);

        float bmi = weight/(height/100*height/100);

        answerText = (TextView) findViewById(R.id.answer_text);
        answerText.setText(String.valueOf(bmi));
    }

}