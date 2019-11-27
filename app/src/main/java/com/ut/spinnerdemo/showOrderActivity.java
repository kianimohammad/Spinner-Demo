package com.ut.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class showOrderActivity extends AppCompatActivity {

    String TAG = "Android";
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_order);

        TextView textView = findViewById(R.id.food_ordered);
        Intent intent = getIntent();
        String foodName = intent.getExtras().getString("foodName");
        textView.setText(foodName);
        Log.i(TAG, "onCreate: 2nd view");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 2nd view");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 2nd view");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 2nd view");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 2nd view");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 2nd view");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 2nd view");
    }
}
