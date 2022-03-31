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

        spListaUbicaciones = findViewById(R.id.spinnerEdificios);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.EdificiosItem, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
    }
}