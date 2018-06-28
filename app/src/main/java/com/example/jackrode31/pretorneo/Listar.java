package com.example.jackrode31.pretorneo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    Button listar, verificar, volver;

    final ArrayList<String> data = new ArrayList<String>();
    SuperClase sp= new SuperClase();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar);



        final Button listar2;
        final TextView resultadolista;
        final EditText inputlista;

        listar2 = findViewById(R.id.listarbtn2); //Botón de enviar
        resultadolista = findViewById(R.id.resultLista); //resultado
        inputlista = findViewById(R.id.inputlista); //Input text

        listar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int conversor = Integer.parseInt(inputlista.getText().toString());
                resultadolista.setText("Hay: "+sp.countReversible(conversor)+" número reversibles con "+conversor+" dígitos");
            }
        });

    }
}
