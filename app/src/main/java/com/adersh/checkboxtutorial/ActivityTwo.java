package com.adersh.checkboxtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {
    CheckBox ch1,ch2,ch3,ch4;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ch1=findViewById(R.id.checkPaint);
        ch2=findViewById(R.id.checkRead);
        ch3=findViewById(R.id.checkBoxSing);
        ch4=findViewById(R.id.checkBoxCook);
        submit=findViewById(R.id.button);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalAmount=0;
                if (ch1.isChecked()){
                    totalAmount=totalAmount+100;
                }
                if (ch2.isChecked()){
                    totalAmount=totalAmount+100;
                }
                if (ch3.isChecked()){
                    totalAmount=totalAmount+100;
                }
                if (ch4.isChecked()){
                    totalAmount=totalAmount+100;
                }

                Toast.makeText(getApplicationContext(), "Toatal Amount is"+totalAmount, Toast.LENGTH_SHORT).show();
            }
        });

    }
}