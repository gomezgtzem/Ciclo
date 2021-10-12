package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ciclo For
//        for(contador=0;contador < numero de repeticiones; contador++){
//
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un numero");
//        int numero = sc.nextInt();
//        for(int i = 0; i<= 10 ; i++){
//            System.out.println(numero + " x " + i + " = " + (numero*i));
//        }
//        Serie de fibonacci
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un numero");
//        int numero = sc.nextInt();
//        int acarreo1=0;
//        int acarreo2=1;
//        int suma;
//        for(int i = 1; i <=numero;i++){
//            suma=acarreo1+acarreo2;
//            acarreo1=acarreo2;
//            acarreo2=suma;
//            System.out.println("Iteracion "+i+", es "+suma);
//        }
//        While con prueba del numero secreto
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Adivina el numero secreto");
//        int numero = sc.nextInt();
//        int numeroSecreto = 511;
//
//        while(numero != numeroSecreto){
//            System.out.println("Ese no es, vuelve a intentar");
//            numero = sc.nextInt();
//        }
//        System.out.println("Al fin!, efectivamente el numero es: " +numero);

//        Prueba numero secreto con do while
//        Scanner sc = new Scanner(System.in);
//        int numero = 0;
//        int numeroSecreto = 511;
//        do{
//            System.out.println("Adivina el numero secreto");
//            numero = sc.nextInt();
//        }
//        while(numero != numeroSecreto);
//        System.out.println("Al fin!, efectivamente el numero es: " +numero);
//Ejercicio factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero del que quieres el factorial");
        int numero = sc.nextInt();
        int factorial = 1;
        int i = 1;
        if (numero != 0) {
            while (i <= numero) {
                factorial = factorial * i;
                i++;
            }
        }
        System.out.println("El resultado de " + numero + "! es " + factorial);
    }
}
