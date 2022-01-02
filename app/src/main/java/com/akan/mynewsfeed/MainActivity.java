package com.akan.mynewsfeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   // ea39a79a90e044fb98ce7f58e6394c2d
    NewsAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<Articles> articlesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.idRecyclerView);
        articlesArrayList = new ArrayList<>();
        adapter = new NewsAdapter(articlesArrayList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<String> fetchdata() {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add("item "+i);
        }
        return list;
    }

}