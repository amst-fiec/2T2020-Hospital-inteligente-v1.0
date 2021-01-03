package com.example.getabed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.auth.api.Auth;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Menu extends AppCompatActivity {
    private Button bsignOut;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mAuth= FirebaseAuth.getInstance();
        bsignOut = (Button) findViewById(R.id.button_cerrarsesion);
        bsignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(Menu.this,MainActivity.class));
                finish();
            }
        });
        //cerrarSesion();
    }

    public void verCamasDisponibles(View view){
        Intent intent= new Intent(getBaseContext(),EstadoCamas.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //int id = item.getItemId();
        //if (id == R.id.button_cerrarsesion) {
            //cerrarSesion();
            //return true;
        //}
        return super.onOptionsItemSelected(item);
    }

    private void cerrarSesion(){
        Intent intent= new Intent(getBaseContext(),MainActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}