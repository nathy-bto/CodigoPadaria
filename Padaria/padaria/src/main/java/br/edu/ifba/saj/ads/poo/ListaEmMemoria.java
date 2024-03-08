package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class ListaEmMemoria {
    private static List<Produtos> listaProdutos = new ArrayList<>();
    private static List<Fregues> listaFregues = new ArrayList<>();

    public static List<Produtos> getListaProdutos(){
        return listaProdutos;
    }

    public static List<Fregues> getListFregues(){
        return listaFregues;
    }
}
