package com.aditya.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//public class secondActivity extends AppCompatActivity {
//
//    public static final String EXTRA_REPLY =
//            "com.example.android.twoactivities.extra.REPLY";
//
//
//    private EditText mReply;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
//
//
//        mReply = findViewById(R.id.editText_second);
//
//
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//
//        TextView textView = findViewById(R.id.text_message);
//        textView.setText(message);
//    }
//
//
//    public void returnReply(View view) {
//
//        String reply = mReply.getText().toString();
//
//
//        Intent replyIntent = new Intent();
//        replyIntent.putExtra(EXTRA_REPLY, reply);
//        setResult(RESULT_OK, replyIntent);
//        finish();
//    }
//}

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int mCount = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0);
        TextView mCountTextView = findViewById(R.id.show_count);
        mCountTextView.setText(String.valueOf(mCount));
    }
}