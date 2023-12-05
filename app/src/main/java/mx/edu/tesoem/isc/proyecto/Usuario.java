package mx.edu.tesoem.isc.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Usuario extends AppCompatActivity {

    Button save;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        save = findViewById(R.id.btnsave);
        nombre = findViewById(R.id.ednombre);

        Intent lanza = new Intent(Usuario.this, Local.class);
        startService(lanza);
    }
}