package com.example.gojekapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator extends AppCompatActivity {

    // variabel / objek global
    EditText edAngka1;
    Spinner spAgama;
    Button btncek;
    int index;
    SharedPreferences sharedPreferences;
    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "no name");
        edAngka1 = (EditText) findViewById(R.id.edAngka1);
        tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvUsername.setText(username);
        spAgama = (Spinner) findViewById(R.id.spAgama);
        btncek = (Button) findViewById(R.id.btnCek);
        btncek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (index) {
                    case 0:
                        Toast.makeText(Calculator.this, "ISLAM", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(Calculator.this, "KRISTEN", Toast.LENGTH_SHORT).show();
                        break;
                }
            }


        });

        spAgama.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                index = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}