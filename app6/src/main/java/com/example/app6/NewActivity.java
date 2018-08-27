package com.example.app6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    private String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Log.i(TAG, "onCreate()");
        Toast.makeText(this, "onCreate() 메소드 호출", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
        Toast.makeText(this, "onStart() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
        Toast.makeText(this, "onRestart() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
        Toast.makeText(this, "onResume() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
        Toast.makeText(this, "onPause() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "oonStop()");
        Toast.makeText(this, "onStop() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
        Toast.makeText(this, "onDestroy() 메소드 호출", Toast.LENGTH_SHORT).show();
    }
}
