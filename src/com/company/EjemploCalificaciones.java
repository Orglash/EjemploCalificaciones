package com.company;

import java.util.Scanner;

    public class EjemploCalificaciones {
        //Funcion pedirNumero: recogemos los valores por teclado.
        public static int pedirNumero() {
            Scanner numero = new Scanner(System.in);
            return numero.nextInt();
        }

        //Funciones de operacion.
        public static double operacion(int numeroAciertos, int numeroErrores, int numeroPreguntas) {
            return (((numeroAciertos - (numeroErrores / 2)) * 10) / numeroPreguntas)+(0.5);
        }
        public static void califica (String nota){
            System.out.printf("La calificación del alumno es: \n%s\n", nota);
        }
        public static void introduce(String tipoPregunta, String sujeto) {
            System.out.printf("Introduzca cantidad de %s del %s, por favor.\n", tipoPregunta ,sujeto);
        }

        public static void main(String[] args) {
            String nota ="";
            final String aciertos = "aciertos";
            final String errores = "errores";
            final String preguntas = "preguntas";
            final String alumno = "alumno";
            final String examen = "examen";
            introduce(aciertos, alumno);
            int numAciertos = pedirNumero();
            introduce(errores, alumno);
            int numErrores = pedirNumero();
            introduce(preguntas, examen);
            int numPreguntas = pedirNumero();
            int calificacion = (int) operacion(numAciertos, numErrores, numPreguntas);
            if (calificacion >= 5) {
                switch (calificacion){
                    case 5:
                        nota = "SUFICIENTE";
                    break;
                    case 6:
                        nota= "BIEN";
                        break;
                    case 7:
                        nota= "NOTABLE";
                        break;
                    case 8:
                        nota= "NOTABLE";
                        break;
                    case 9:
                        nota= "SOBRESALIENTE";
                        break;
                    case 10:
                        nota= "SOBRESALIENTE";
                        break;
                }
                califica(nota);
            } else {
                nota="INSUFICIENTE";
                califica(nota);
            }
        }
    }
