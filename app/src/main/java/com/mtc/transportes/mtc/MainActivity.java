package com.mtc.transportes.mtc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import api.model.Repository;
import api.service.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToProfile(View view){
        //String message = "i'm here in MTC";
        //Log.v("MTC",message);


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        ApiClient client = retrofit.create(ApiClient.class);
        Call<List<Repository>> call = client.reposForUser("aquima");

        call.enqueue(new Callback<List<Repository>>() {
            @Override
            public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                List<Repository> repos = response.body();

            }

            @Override
            public void onFailure(Call<List<Repository>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Houston i have a problem",Toast.LENGTH_SHORT).show();

            }
        });
    }

}
