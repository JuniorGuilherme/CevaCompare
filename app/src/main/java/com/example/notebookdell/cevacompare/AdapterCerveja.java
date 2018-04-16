package com.example.notebookdell.cevacompare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Notebook Dell on 28/03/2018.
 */

public class AdapterCerveja extends ArrayAdapter<Cerveja> {

    public AdapterCerveja(ArrayList<Cerveja> cervejas, Context context){
        super(context, 0, cervejas);
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView = LayoutInflater.from(getContext()).inflate(R.layout.item_cerveja, viewGroup, false);
        TextView tvNomeCerveja = resultView.findViewById(R.id.tvNomeCerveja);
        TextView tvPrecoMedio = resultView.findViewById(R.id.tvPrecoMedio);
        Cerveja c = getItem(i);

        DecimalFormat df = new DecimalFormat("0.00");
        tvNomeCerveja.setText(c.getNomeCerveja().toString());
        tvPrecoMedio.setText(df.format(c.getPrecoMedio()));

        if(i % 2 ==0){
            resultView.setBackgroundColor(252235205);
        }


        return resultView;
    }
}
