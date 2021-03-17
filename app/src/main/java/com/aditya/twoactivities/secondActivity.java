package com.aditya.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView helloMsg = findViewById(R.id.hello_text);
        Intent intent = getIntent();
        int mCount = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0);
        TextView mCountTextView = findViewById(R.id.count_text);
        mCountTextView.setText(String.valueOf(mCount));
        mCountTextView.setVisibility(View.VISIBLE);
        helloMsg.setVisibility(View.VISIBLE);



    }
}