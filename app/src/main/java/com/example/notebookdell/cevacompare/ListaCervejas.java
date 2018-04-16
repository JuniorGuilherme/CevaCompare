package com.example.notebookdell.cevacompare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListaCervejas extends AppCompatActivity {
    ListView lvCervejas;
    TextView tvCevaMaisBarata, tvMenorPreco, tvTitulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cervejas);

        Cerveja c = new Cerveja();
        lvCervejas = findViewById(R.id.lvCervejas);
        tvCevaMaisBarata = findViewById(R.id.tvCevaMaisBarata);
        tvMenorPreco = findViewById(R.id.tvMenorPreco);
        tvTitulo = findViewById(R.id.tvTituloMaisBarata);

        ArrayList<Cerveja> lcc = c.retornaArrayCervejas();
        lvCervejas.setAdapter(new AdapterCerveja(c.retornaArrayCervejas(), getApplicationContext()));
        int index=0;
        float flag=0;
        ArrayList<Cerveja> lcAux = new ArrayList<>();
        for(int i =0; i<lcc.size(); i++){
            if(lcc.get(i).getPrecoMedio()!=0){
                lcAux.add(lcc.get(i));
            }
        }

        if(!lcAux.isEmpty()){
            flag=lcAux.get(0).getPrecoMedio();
            for(int i=0; i<lcAux.size(); i++){
                if(lcAux.get(i).getPrecoMedio()<flag){
                    flag=lcAux.get(i).getPrecoMedio();
                    index=i;
                }
            }
            tvCevaMaisBarata.setText(lcAux.get(index).getNomeCerveja());
            DecimalFormat df = new DecimalFormat("0.00");
            tvMenorPreco.setText(df.format(flag));
            tvTitulo.setText("Cerveja Vencedora");

        }
    }
}
