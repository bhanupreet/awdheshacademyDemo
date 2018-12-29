package com.awdheshacademy.awdheshacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OurCoursesActivity extends AppCompatActivity {

    private Button mPhysicsbtn, mMathsbtn, mChemistrybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_courses);

        mPhysicsbtn = findViewById(R.id.physics);

        mPhysicsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent physicsintent = new Intent(OurCoursesActivity.this,Physics.class);
                startActivity(physicsintent);
            }
        });


    }
}
