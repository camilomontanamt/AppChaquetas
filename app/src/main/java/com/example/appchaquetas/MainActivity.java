package com.example.appchaquetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.productos) {
            Toast.makeText(this, "Ingreso a productos", Toast.LENGTH_LONG).show();
            Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(pantallaProductos);
        }

        if (id == R.id.sucursales) {
            Toast.makeText(this, "Ingreso a sucursales", Toast.LENGTH_LONG).show();
            Intent pantallaSucursales = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(pantallaSucursales);
        }

        if (id == R.id.servicios) {
            Toast.makeText(this, "Ingreso a servicios", Toast.LENGTH_LONG).show();
            Intent pantallaServicios = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(pantallaServicios);
        }

        return super.onOptionsItemSelected(item);
    }
}