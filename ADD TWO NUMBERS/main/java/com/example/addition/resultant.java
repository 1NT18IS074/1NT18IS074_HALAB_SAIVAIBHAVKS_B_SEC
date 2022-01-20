package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class resultant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultant);
        TextView num3 = (TextView) findViewById(R.id.resultantsum);
        Bundle bundle = getIntent().getExtras();
        num3.setText(bundle.getString("key", "No value from the MainActivity"));
    }
}
