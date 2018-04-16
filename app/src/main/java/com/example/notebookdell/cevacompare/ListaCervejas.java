package com.example.notebookdell.cevacompare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaCervejas extends AppCompatActivity {
    ListView lvCervejas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cervejas);

        Cerveja c = new Cerveja();
        lvCervejas = findViewById(R.id.lvCervejas);
        ArrayList<Cerveja> lcc = c.retornaArrayCervejas();
        lvCervejas.setAdapter(new AdapterCerveja(c.retornaArrayCervejas(), this));
    }
}
