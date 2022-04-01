package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class UbicacionesActivity extends AppCompatActivity {

    Spinner spListaUbicaciones;
    Button btn_showStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicaciones);

        spListaUbicaciones = (Spinner) findViewById(R.id.spinnerEdificios);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_item);
        spListaUbicaciones.setAdapter(adapter);

        btn_showStatus = findViewById(R.id.btn_status);
        btn_showStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UbicacionesActivity.this, garrafon_status.class);
                startActivity(i);
            }
        });

    }
}