package main.java.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Set conjuntoSemgenerics = new HashSet();
        conjuntoSemgenerics.add("Elemento 1");
        conjuntoSemgenerics.add(10); // permite adicionar qualquer tipo de objeto

        //Exemplo com Generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        //ierando sobre o conjunto com GEnerics
        for(String elemento : conjuntoGenerics){
            System.out.println(elemento);
        }

        //iterando sobre o conjunto sem Generics (necessário fazer cast)
        for (Object elemento : conjuntoSemgenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
