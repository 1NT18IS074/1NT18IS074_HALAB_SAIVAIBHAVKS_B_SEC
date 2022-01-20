package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt;
        bt = (Button) findViewById(R.id.button);
        EditText a,b;
        TextView c;
        a = (EditText) findViewById(R.id.num1);
        b = (EditText) findViewById(R.id.num2);
        c = (TextView) findViewById(R.id.result);
        Intent it = new Intent(this,resultant.class);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(a.getText().toString());
                double num2 = Double.parseDouble(b.getText().toString());
                double sum = num1 + num2;
                c.setText(Double.toString(sum));
                Bundle bundle = new Bundle();
                bundle.putString("key", String.valueOf(sum));
                it.putExtras(bundle);
                startActivity(it);


            }
        });
    }



}