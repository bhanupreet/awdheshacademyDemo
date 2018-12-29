package com.awdheshacademy.awdheshacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Chapter1Activity extends AppCompatActivity {
    private TextView mTests,mVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        mTests = findViewById(R.id.chapter1tests);
        mVideo = findViewById(R.id.chapter1Video);

        mVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtubeintent = new Intent(Chapter1Activity.this,YoutubeActivity.class);
                startActivity(youtubeintent);
            }
        });
        mTests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testIntent = new Intent(Chapter1Activity.this,TestActivtity.class);
                startActivity(testIntent);
            }
        });
    }
}
