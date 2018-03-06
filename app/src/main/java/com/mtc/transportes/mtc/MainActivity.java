package com.mtc.transportes.mtc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToProfile(View view){
        String message = "i'm here in MTC";
        Log.v("MTC",message);
        Intent activityProfile = new Intent(this,ProfileActivity.class);
        startActivity(activityProfile);
    }
}
