package com.awdheshacademy.awdheshacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class TestActivtity extends AppCompatActivity {
    private Button mSubmitButton;
    private RadioButton moption1,moption2;
    private TextView mAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activtity);

        mSubmitButton = findViewById(R.id.submitbtn);
        moption1 = findViewById(R.id.option1);
        moption2 = findViewById(R.id.option2);
        mAns = findViewById(R.id.ans);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(moption1.isChecked()){
                    mAns.setText("Wrong Answer!");
                    mSubmitButton.setClickable(false);
                    mSubmitButton.setBackgroundColor(0xFF000000);
                }
                else if(moption2.isChecked()){
                    mAns.setText("Right Answer!");
                    mSubmitButton.setClickable(false);
                    mSubmitButton.setBackgroundColor(0xFF000000);
                }
                else{
                    mAns.setText("Please Select a value!");
                    mSubmitButton.setClickable(true);
                //    mSubmitButton.setBackgroundColor(0xFF000000);
                }
            }
        });


    }
}
