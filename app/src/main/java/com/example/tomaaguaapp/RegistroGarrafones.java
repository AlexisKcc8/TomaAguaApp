package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroGarrafones extends AppCompatActivity {
    Button btn_go_reportes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_garrafones);
        btn_go_reportes = findViewById(R.id.button_verreportes);

        btn_go_reportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroGarrafones.this, show_report_activity.class);
                startActivity(i);
            }
        });
    }
}