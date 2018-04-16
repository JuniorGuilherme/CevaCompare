package com.example.notebookdell.cevacompare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Notebook Dell on 28/03/2018.
 */

public class AdapterCerveja extends BaseAdapter {
    ArrayList<Cerveja> cervejas;
    Context context;

    public AdapterCerveja(ArrayList<Cerveja> cervejas, Context context){
        this.cervejas = cervejas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView = LayoutInflater.from(context).inflate(R.layout.item_cerveja, viewGroup, false);
        TextView tvNomeCerveja = resultView.findViewById(R.id.tvNomeCerveja);
        TextView tvPrecoMedio = resultView.findViewById(R.id.tvPrecoMedio);

        Cerveja c = cervejas.get(i);

        tvNomeCerveja.setText(c.getNomeCerveja().toString());
        tvPrecoMedio.setText(String.format("%.2f",c.getPrecoMedio()));

        if(i % 2 ==0){
            resultView.setBackgroundColor(252235205);
        }


        return resultView;
    }
}
