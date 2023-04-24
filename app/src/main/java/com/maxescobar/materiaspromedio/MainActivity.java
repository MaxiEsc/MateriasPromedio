package com.maxescobar.materiaspromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etMatematicas;
    private EditText etFisica;
    private EditText etQuimica;
    private EditText etAlgebra;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMatematicas = (EditText) findViewById(R.id.txtmatematicas);
        etFisica = (EditText) findViewById(R.id.txtFisica);
        etQuimica = (EditText) findViewById(R.id.txtQuimica);
        etAlgebra = (EditText) findViewById(R.id.txtAlgebra);
        tvResultado = (TextView) findViewById(R.id.tv1);

    }

    public void estadoResultado(View vista){
        String matematicas_string = etMatematicas.getText().toString();
        String fisica_string = etFisica.getText().toString();
        String quimica_string = etQuimica.getText().toString();
        String algebra_string = etAlgebra.getText().toString();

        int intMatematicas, intFisica, intQuimica, intAlgebra = 0;
        intMatematicas = Integer.parseInt(matematicas_string);
        intFisica = Integer.parseInt(fisica_string);
        intQuimica = Integer.parseInt(quimica_string);
        intAlgebra = Integer.parseInt(algebra_string);

        int promedio = (intMatematicas + intFisica + intQuimica + intAlgebra) / 4;

        if (promedio >= 6 ){
            tvResultado.setText("Estado del Alumno esta -> Aprobado <- con: " + promedio);
        }else{
            tvResultado.setText("Estado del Alumno esta -> Reprobado <-"+ promedio);
        }
    }
}