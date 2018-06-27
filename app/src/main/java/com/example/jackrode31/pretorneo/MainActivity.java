package com.example.jackrode31.pretorneo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button listar, verificar, volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listar = findViewById(R.id.listarbtn);
        verificar = findViewById(R.id.verificarbtn);
        volver = findViewById(R.id.volverbtn);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.verificar);

                Button verificar2;
                TextView resultado;
                EditText input;

                verificar2 = findViewById(R.id.verificarbtn2);
                resultado = findViewById(R.id.result);
                input = findViewById(R.id.inputNumber);

                volver();



            }
        });

        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.listar);

                Button listar2;
                TextView resultadolista;
                EditText inputlista;

                listar2 = findViewById(R.id.listarbtn2);
                resultadolista = findViewById(R.id.resultLista);
                inputlista = findViewById(R.id.inputlista);

            }
        });


    }
    public void volver(){

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });


    }
}
