package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtEmpName = findViewById(R.id.NAME);
        EditText edtDesig = findViewById(R.id.edtDesig);
        EditText edtSalary = findViewById(R.id.edtSalary);
        Button btnSave = findViewById(R.id.button);
        DatabaseHelper dbh= new DatabaseHelper(getApplicationContext());
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Employee objEmp = new Employee(edtEmpName.getText().toString(),edtDesig.getText().toString(),Integer.parseInt(edtSalary.getText().toString()));
                if(dbh.InsertEmployee(objEmp))
                    Toast.makeText(getApplicationContext(),"Record inserted successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Record not inserted",Toast.LENGTH_LONG).show();

            }
        });
    }
}