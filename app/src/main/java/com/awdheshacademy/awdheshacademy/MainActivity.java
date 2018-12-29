package com.awdheshacademy.awdheshacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mAboutUsBtn, mContactUsBtn, mOurCoursesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAboutUsBtn = findViewById(R.id.aboutUSbtn);
        mContactUsBtn = findViewById(R.id.contactUsbtn);
        mOurCoursesBtn = findViewById(R.id.ourcoursesbtn);

        mOurCoursesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OurcoursesIntent = new Intent(MainActivity.this, OurCoursesActivity.class);
                startActivity(OurcoursesIntent);
            }
        });

        mAboutUsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AboutusIntent = new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(AboutusIntent);
            }
        });
    }
}
