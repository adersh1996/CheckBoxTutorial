package com.adersh.checkboxtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox ch1,ch2,ch3,ch4;
Button submit,nxtActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1=findViewById(R.id.checkPaint);
        ch2=findViewById(R.id.checkRead);
        ch3=findViewById(R.id.checkBoxSing);
        ch4=findViewById(R.id.checkBoxCook);
        submit=findViewById(R.id.button);
        nxtActivityBtn=findViewById(R.id.nextActivity);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg ="";

                if (ch1.isChecked()){
                    msg=msg+"Painting";
                }
                if (ch2.isChecked()){
                    msg=msg+"Reading";
                }
                if (ch3.isChecked()){
                    msg=msg+"Singning";
                }
                if (ch4.isChecked()){
                    msg=msg+"cooking";
                }

                Toast.makeText(getApplicationContext(), msg+"Are selected", Toast.LENGTH_SHORT).show();

            }
        });
        nxtActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ActivityTwo.class));
            }
        });


    }
}