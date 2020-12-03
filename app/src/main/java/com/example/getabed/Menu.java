package com.example.getabed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void verCamasDisponibles(View view){
        Intent intent= new Intent(getBaseContext(),EstadoCamas.class);
        startActivity(intent);
    }

    public void cerrarSesion(View view){
        Intent intent= new Intent(getBaseContext(),MainActivity.class);
        startActivity(intent);
    }
}