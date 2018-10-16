package com.company;

import java.util.Scanner;

    public class EjemploCalificaciones {
        //Funcion pedirNumero: recogemos los valores por teclado.
        public static int pedirNumero() {
            Scanner numero = new Scanner(System.in);
            return numero.nextInt();
        }
        public static int operacion(int numeroAciertos, int numeroErrores, int numeroPreguntas) {
            return ((numeroAciertos - (numeroErrores / 2)) * 10) / numeroPreguntas;
        }
        public static void califica (int puntuacion, String nota){
            System.out.printf("La puntuación ha sido de %d\nLa calificación del alumno es: \n%s\n", puntuacion, nota);
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
            int puntuacion = operacion(numAciertos, numErrores, numPreguntas);
            if (puntuacion >= 5) {
                switch (puntuacion){
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
                califica(puntuacion, nota);
            } else {
                nota="INSUFICIENTE";
                califica(puntuacion, nota);
            }
        }
    }
