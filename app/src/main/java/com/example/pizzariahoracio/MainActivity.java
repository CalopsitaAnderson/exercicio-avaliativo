package com.example.pizzariahoracio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText txtChopp;
        EditText txtPizzas;
    EditText txtRecheios;
    EditText txtPessoas;
    TextView lblConsumo;
    TextView lblServicos;
    TextView lblTotal;
    TextView lblPorPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPizzas = findViewById( R.id.txtPizzas);
        txtChopp = findViewById( R.id.txtChopp);
        txtRecheios = findViewById( R.id.txtRecheios);
        txtPessoas = findViewById( R.id.txtPessoas);
        lblConsumo = findViewById( R.id.lblConsumo);
        lblServicos = findViewById( R.id.lblServicos);
        lblTotal = findViewById( R.id.lblTotal);
        lblPorPessoa = findViewById( R.id.lblPorPessoa);


    }

    public void onCalcular(View V) {

        if (txtChopp.getText().toString().isEmpty() || txtPizzas.getText().toString().isEmpty()|| txtRecheios.getText().toString().isEmpty()|| txtPessoas.getText().toString().isEmpty() ) {


        } else {


            double pizz = Double.parseDouble(txtPizzas.getText().toString());
            double chop = Double.parseDouble(txtChopp.getText().toString());
            double rech = Double.parseDouble(txtRecheios.getText().toString());
            double pp = Double.parseDouble(txtPessoas.getText().toString());

            double consumo = (chop * 7.00) + (pizz * 15.50) + (rech * 5.00);
            lblConsumo.setText(String.valueOf(consumo));

            double servico = consumo / 10;
            lblServicos.setText(String.valueOf(servico));

            double total = consumo + servico;
            lblTotal.setText(String.valueOf(total));

            double porPessoa = total / pp;
            lblPorPessoa.setText(String.valueOf(porPessoa));
        }
    }
}
