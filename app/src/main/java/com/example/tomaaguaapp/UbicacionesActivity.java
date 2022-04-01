package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UbicacionesActivity extends AppCompatActivity {

    Spinner spListaUbicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicaciones);

        spListaUbicaciones = (Spinner) findViewById(R.id.spinnerEdificios);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_item);
        spListaUbicaciones.setAdapter(adapter);

    }
}