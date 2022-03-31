package com.example.tomaaguaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class volverse_premium extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volverse_premium);
        b1= findViewById(R.id.boton_premium);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComprarPremium();
            }
        });
    }
    private void ComprarPremium(){
        AlertDialog.Builder builder = new AlertDialog.Builder(volverse_premium.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alertpremium, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
        Button conf = view.findViewById(R.id.confirmarpremium);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(volverse_premium.this);
                builder1.setTitle("Convertirse en premium");
                builder1.setMessage("Confirme")
                        .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(volverse_premium.this, "Se comprado exitosamente", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(volverse_premium.this, "Cancelado", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setCancelable(false)
                        .show();
                dialog.dismiss();
            }
        });
        Button canc = view.findViewById(R.id.cancelarpremium);
        canc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(volverse_premium.this, "Cancelado", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
    }
}