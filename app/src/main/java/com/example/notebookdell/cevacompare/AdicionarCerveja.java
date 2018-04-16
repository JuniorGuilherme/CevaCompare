package com.example.notebookdell.cevacompare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AdicionarCerveja extends AppCompatActivity {
    Spinner spTamanhos;
    Button btnAdicionaCotacao;
    EditText etCotacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_cerveja);
        Cerveja c = new Cerveja();
        spTamanhos = findViewById(R.id.spTamanhos);
        btnAdicionaCotacao = findViewById(R.id.btnAdicionarCotacao);
        etCotacao = findViewById(R.id.etCotacao);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, c.retornaArrayCervejas());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTamanhos.setAdapter(adapter);

        btnAdicionaCotacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cerveja c = new Cerveja();
                if(!etCotacao.getText().toString().isEmpty()){
                    c.adicionaCotacao(spTamanhos.getSelectedItemPosition(), Float.parseFloat(etCotacao.getText().toString()));
                    Intent intencao = new Intent(AdicionarCerveja.this, MainActivity.class);
                    AdicionarCerveja.this.startActivity(intencao);
                }else{
                    Context contexto = getApplicationContext();
                    int duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(contexto, "Digite algum valor a cerveja." ,duracao);
                    toast.show();
                }
            }
        });

    }
}
