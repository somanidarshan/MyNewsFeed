package com.akan.mynewsfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailNews extends AppCompatActivity {

    String title, desc, content, imageUrl, url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        title = getIntent().getStringExtra("title");
        desc = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        desc = getIntent().getStringExtra("desc");
        imageUrl = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");
    }
}