package com.example.jackrode31.pretorneo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Verificar extends AppCompatActivity {
    Button listar, verificar, volver;
    Button verificar2;
    TextView resultado;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verificar);

        final SuperClase masterClass = new SuperClase();



        verificar2 = findViewById(R.id.verificarbtn2);
        resultado = findViewById(R.id.result);
        input = findViewById(R.id.inputNumber);


        verificar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int conversor = Integer.parseInt(input.getText().toString());
                resultado.setText(conversor+" "+masterClass.checkReversible(conversor));

            }
        });




    }
}
