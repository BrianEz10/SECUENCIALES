package Secuenciales7;

import java.util.Scanner;

public class Felicidad {
    public static void main(String[] args) {
        Scanner Sentimientos = new Scanner(System.in);
        int Satisfaccion;
        int Estres;
        int Salud;
        int indiceFelicidad;


        do {
            System.out.println("En una escala del 1 al 10 ingrese que tal se siente con su vida en general");
            Satisfaccion = Sentimientos.nextInt();
        }while (Satisfaccion < 1 || Satisfaccion > 10);
        do {
            System.out.println("En una escala del 1 al 10 ingrese cual es su nivel del estres");
            Estres = Sentimientos.nextInt();
        }while (Estres < 1 || Estres > 10);
        do {
            System.out.println("En una escala del 1 al 10 ingrese cual es su nivel de salud");
            Salud = Sentimientos.nextInt();
        }while (Salud < 1 || Salud > 10);

        indiceFelicidad = (int) ((Satisfaccion + Estres + Salud)/3);
        System.out.println("Su indice de felicidad es de "+ indiceFelicidad);

    }
}
