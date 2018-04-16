package com.example.notebookdell.cevacompare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Cerveja c = new Cerveja();
    Button btnTelaCotacao, btnTelaLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTelaCotacao = findViewById(R.id.btnTelaCotacao);
        btnTelaLista = findViewById(R.id.btnTelaLista);
        c.carregarCercejas();

        btnTelaCotacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, AdicionarCerveja.class);
                MainActivity.this.startActivity(intencao);
            }
        });

        btnTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, ListaCervejas.class);
                MainActivity.this.startActivity(intencao);
            }
        });
    }
}
