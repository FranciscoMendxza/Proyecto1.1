package mx.edu.tesoem.isc.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Admin extends AppCompatActivity {

    Button listar, preguntas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        listar = findViewById(R.id.btnlistar);
        preguntas = findViewById(R.id.btncapturar);

        listar.setOnClickListener(v -> {
            Intent lanza = new Intent(this, Usuarios.class);
            startActivity(lanza);
        });

        preguntas.setOnClickListener(v -> {
            Intent lanza = new Intent(this, LlenarPreguntas.class);
            startActivity(lanza);
        });
    }
}