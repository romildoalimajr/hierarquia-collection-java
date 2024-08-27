package main.java.generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList{
    public static void main(String[] args){
        //Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); //Permite adicionar qualquer tipo de objeto

        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        System.out.println();
        //Iterando sobre a lista com Generics
        for(String elemento : listaGenerics){
            System.out.println(elemento);
        }

        //iterando sobre a lista sem Generics (necessário fazer cast)

        System.out.println();
        for (Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}