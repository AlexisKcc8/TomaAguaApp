package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_home extends AppCompatActivity {

    Button reportes,ubicaciones,premium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        reportes = findViewById(R.id.button_report);
        ubicaciones = findViewById(R.id.button_ubicaciones);
        premium = findViewById(R.id.button_premium);

        reportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_home.this, activity_report.class);
                startActivity(i);
            }
        });

        ubicaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_home.this, UbicacionesActivity.class);
                startActivity(i);
            }
        });

        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_home.this, volverse_premium.class);
                startActivity(i);
            }
        });
    }
}