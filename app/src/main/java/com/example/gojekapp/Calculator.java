package com.example.gojekapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator extends AppCompatActivity {

    EditText edAngka1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        edAngka1 = (EditText) findViewById(R.id.edAngka1);
        // taruh di dalam onlklik
        int numAngka1 = Integer.parseInt(edAngka1.getText().toString());
        // android studio settext textview
    }
}