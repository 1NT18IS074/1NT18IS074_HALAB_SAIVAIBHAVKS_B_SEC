package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "App has stopped", Toast.LENGTH_SHORT).show();
    }

    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "App has started", Toast.LENGTH_SHORT).show();
    }

    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "App has resumed", Toast.LENGTH_SHORT).show();
    }

    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "App has paused", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "App has restarted", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "App has destroyed", Toast.LENGTH_SHORT).show();
    }
}