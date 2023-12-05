package mx.edu.tesoem.isc.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    Button admin, registra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        admin = findViewById(R.id.btnadmin);
        registra = findViewById(R.id.btnreg);

        admin.setOnClickListener(v -> {
            Intent lanza = new Intent(this, Admin.class);
            startActivity(lanza);
        });

        registra.setOnClickListener(v -> {
            Intent lanza = new Intent(Principal.this, Usuario.class);
            startActivity(lanza);
        });
    }
}