package com.github.michaeltp1.oopjose;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOPJose {


    public static void main(String[] args) {

        Usuario jose=new Usuario("jose","jose@mail.com",  "contraseña");
        Usuario michael= new Usuario();
        //arraylist

        ArrayList<Integer> listaNumeros =new ArrayList<>();

        Scanner entrda=new Scanner(System.in);

        int numero=0;
        do{
            System.out.println("introduce un número, 0 par salir");
            numero=entrda.nextInt();
            listaNumeros.add(numero);
        }
        while(numero!=0);


        System.out.println("los numeros introducidos son:");
        for(int i=0;i<listaNumeros.size();i++)
            System.out.println(listaNumeros.get(i));





    }
}
