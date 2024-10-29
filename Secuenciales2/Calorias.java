package Secuenciales2;

import javax.swing.*;

public class Calorias {
    public static void main(String[] args) {
        double peso;
        double minutos;
        String ejercicio;
        double caloriasQuemadas;

        //Metabolic Equivalent of Task
        double Met_correr = 8.0;
        double Met_nadar = 7.0;
        double Met_Bicicleta = 10.0;

        JOptionPane.showMessageDialog(null,"Calculadora de Calorias quemadas");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
        ejercicio = JOptionPane.showInputDialog("¿Que tipo de ejercicio realizo? \ncorrer \nnadar \nbicicleta");
        minutos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos minutos se ejercito?"));

        minutos = minutos / 60.0;
        //minutos convertido a decimal

    switch (ejercicio){
        case "correr":
            caloriasQuemadas = (double) (Met_correr * peso * minutos);
            minutos = minutos * 60.0;
            //hora decimal convertida a minutos
            JOptionPane.showMessageDialog(null,"Usted habiendo corrido "+ minutos + " minutos a quemado " + caloriasQuemadas + " calorias");
            break;
        case "nadar":
            caloriasQuemadas = (double) (Met_nadar * peso * minutos);
            minutos = minutos * 60.0;
            //hora decimal convertida a minutos
            JOptionPane.showMessageDialog(null,"Usted habiendo nadado "+ minutos + " minutos a quemado " + caloriasQuemadas + " calorias" );
            break;
        case "bicicleta":
            caloriasQuemadas = (double) (Met_Bicicleta * peso * minutos);
            minutos = minutos * 60.0;
            //hora decimal convertida a minutos
            JOptionPane.showMessageDialog(null,"Usted en bicicleta  "+ minutos + " minutos a quemado " + caloriasQuemadas + " calorias" );
            break;
        default:
            JOptionPane.showMessageDialog(null,"Ejercicion no encontrado");
            break;
    }
    }
}
