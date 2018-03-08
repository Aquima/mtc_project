package com.mtc.transportes.mtc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import api.model.Repository;

public class ProfileActivity extends AppCompatActivity {
    List<Repository> repos;
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        recycler = findViewById(R.id.rvItems);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        AdapterRepository reposAdapter = new AdapterRepository(repos);
        recycler.setAdapter(reposAdapter);
    }
}
