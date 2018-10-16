package com.company;

import java.util.Scanner;

public class EjemploCalificaciones {
        //Funcion pedirNumero: recogemos los valores por teclado.
        public static double pedirNumero() {
            Scanner numero = new Scanner(System.in);
            System.out.println("Introduzca número");
            return numero.nextDouble();
        }
        public static int pedirOpcion(){
            Scanner opcion = new Scanner(System.in);
            System.out.println("Introduzca el número de la opción correspondiente a la operación que desea\n 1.-Suma\n 2.-Resta\n 3.-Multiplicación\n 4.-División");
            return opcion.nextInt();
        }
        //Funciones de operacion.
        public static double suma (double num1, double num2){
            return (num1+num2);
        }
        public static double resta (double num1, double num2){
            return (num1-num2);
        }
        public static double multiplicacion (double num1, double num2){
            return (num1*num2);
        }
        public static double division (double num1, double num2){
            return (num1/num2);
        }
        //Funciones de calculo.
        public static void calculaSuma(double numero1, double numero2){
            System.out.println(resultado()+(int)suma(numero1, numero2));
        }
        public static void calculaResta(double numero1, double numero2){
            System.out.println(resultado()+(int)resta(numero1, numero2));
        }
        public static void calculaMulti(double numero1, double numero2){
            System.out.println(resultado()+(int)multiplicacion(numero1, numero2));
        }
        public static void calculaDivi(double numero1, double numero2){
            System.out.println(resultado()+(int)division(numero1, numero2));
        }
        //String para resultado.
        public static String resultado(){
            return "El resultado de la operación es ";
        }

        public static void main(String[] args) {
            double numero1 = pedirNumero();
            double numero2 = pedirNumero();
            switch (pedirOpcion()){
                case 1:
                    calculaSuma(numero1, numero2);
                    break;
                case 2:
                    calculaResta(numero1, numero2);
                    break;
                case 3:
                    calculaMulti(numero1, numero2);
                    break;
                case 4:
                    calculaDivi(numero1, numero2);
                    break;
            }
        }
    }

