package com.awdheshacademy.awdheshacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {
    private TextView mAboutUsdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        mAboutUsdata = findViewById(R.id.aboutusdata);
        mAboutUsdata.setText("'Awdhesh Academy' is an E-Learning platform started by Dr. Awdhesh Singh to impart online education to students, professionals and individuals to improve their life skills.\n" +
                "\n" +
                "Dr. Awdhesh Singh is an author, educator, speaker and a Top Quora Writer in the world. He holds his B. Tech. from IIT-BHU Varanasi and M. Tech. from IIT Delhi. He has also done his PhD from ABV-Indian Institute of Information Technology and Management (IIITM), Gwalior. \n" +
                "\n" +
                "He joined the Indian Revenue Service (C&CE) in 1991 and served the Government of India for more than 25 years. He received the \"WCO Certificate of Merit\" instituted by World Customs Organization (WCO) Brussels, on the International Customs Day 2011 and the \"Presidential Award\" by the Government of India on the eve of Republic Day 2015. He took voluntary retirement in October 2016 in the rank of Commissioner of Customs, Excise and Service Tax to pursue his passion in writing. \n" +
                "\n" +
                "He had authored four books viz. \"Practising Spiritual Intelligence\" (2013), \"The Secret Red Book of Leadership\" (2015), 'Myths are Real, Reality is a Myth' (2017) and 'GST Made Simple' (2017). He is the FIFTH MOST followed Writer on Quora.com with more than 230,000 followers. His answers have received more than 100 Million views. \n" +
                "\n" +
                "'Awdhesh Academy' aims at providing online education to everyone at the most affordable rates at all level and all stages of life. ");
    }
}
