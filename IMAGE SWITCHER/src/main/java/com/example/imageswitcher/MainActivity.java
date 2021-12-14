package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] pics = {
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.img3,
            R.drawable.img4
    };

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.photo);
        Button prevBtn = findViewById(R.id.prev);
        Button nextBtn = findViewById(R.id.next);

        img.setImageResource(pics[position]);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position = (position + 1) % pics.length;

                img.setImageResource(pics[position]);
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position--;

                if (position < 0) {
                    position = pics.length - 1;
                }

                img.setImageResource(pics[position]);
            }
        });





    }
}