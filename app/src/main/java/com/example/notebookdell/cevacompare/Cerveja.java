package com.example.notebookdell.cevacompare;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by Notebook Dell on 28/03/2018.
 */

public class Cerveja {
    int tamanhoMl;
    float price;
    float precoMedio;
    String nomeCerveja;
    Image imagem;
    static ArrayList<Cerveja> lc = new ArrayList<>();

    @Override
    public String toString() {
        return nomeCerveja;
    }

    public void carregarCercejas(){
        lc.add(addCerveja("Longneck", 355));
        lc.add(addCerveja("Lata", 350));
        lc.add(addCerveja("Latão", 473));
        lc.add(addCerveja("Garrafa", 600));
        lc.add(addCerveja("Litrão", 1000));
    }

    public int getTamanhoMl() {
        return tamanhoMl;
    }

    public void setTamanhoMl(int tamanhoMl) {
        this.tamanhoMl = tamanhoMl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;
    }

    public String getNomeCerveja() {
        return nomeCerveja;
    }

    public void setNomeCerveja(String nomeCerveja) {
        this.nomeCerveja = nomeCerveja;
    }

    public Cerveja addCerveja(String nome, int tamanho){
        Cerveja c = new Cerveja();
        c.nomeCerveja = nome;
        c.tamanhoMl = tamanho;
        return c;
    }

    public ArrayList retornaArrayCervejas(){

        return lc;
    }

    public void adicionaCotacao(int id, float valor){
        lc.get(id).setPrice(valor);
        lc.get(id).setPrecoMedio((lc.get(id).getPrice()/(lc.get(id).getTamanhoMl()))*1000);

    }


}
