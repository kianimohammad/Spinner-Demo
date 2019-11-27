package com.ut.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "Android";
    Spinner spinner;
    Button choose;
    Button order;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.food);
        choose = findViewById(R.id.choose_food);
        order = findViewById(R.id.order_food);
        textView = findViewById(R.id.food_name);
        Log.i(TAG, "onCreate: 1st view");
    }

    public void chooseFood(View view) {
        textView.setText(spinner.getSelectedItem().toString());
    }

    public void orderFood(View view) {
        //intent
        Intent intent = new Intent(this, showOrderActivity.class);
        intent.putExtra("foodName", textView.getText());
        startActivity(intent);
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 1st view");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 1st view");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 1st view");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 1st view");
    }

    /** Called just before the activity is destroyed. */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 1st view");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 1st view");
    }
}
