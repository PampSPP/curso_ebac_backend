package br.com.pampspp;

import java.util.Scanner;

public class PrimeiraClasse {

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite seu nome:");

        String name = myObj.nextLine();
        System.out.println("Olá, " + name + "! Origada por corrigir minha tarefa.");
        System.out.println("Eu sei fazer o Hello World. :)");
    }
}