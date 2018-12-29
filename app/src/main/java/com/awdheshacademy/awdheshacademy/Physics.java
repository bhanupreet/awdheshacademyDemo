package com.awdheshacademy.awdheshacademy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.Key;

public class Physics extends AppCompatActivity {

    private TextView chapter1, chapter2;
   //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        chapter1 = findViewById(R.id.chapter1);
        chapter2 = findViewById(R.id.chapter2);

        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtubeintent = new Intent(Physics.this,Chapter1Activity.class);
                startActivity(youtubeintent);
            }
        });

    }
}
