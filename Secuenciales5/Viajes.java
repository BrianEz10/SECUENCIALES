package Secuenciales5;

import javax.swing.*;
import java.text.DecimalFormat;

public class Viajes {
    public static void main(String[] args) {
        double kilometros;
        double nafta;
        double precioNafta;
        double Gastotal;
        double consumoVehiculo;

        JOptionPane.showMessageDialog(null,"Calculadora del coste del combustible");
        kilometros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilometros recorridos"));
        nafta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de combustible que utiliza su vehiculo por kilometro"));
        precioNafta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro de Nafta"));

        consumoVehiculo = (double) kilometros * nafta;
        Gastotal = (double) consumoVehiculo * precioNafta;
        JOptionPane.showMessageDialog(null,"Usted a consumido "+ consumoVehiculo + " litros de combustible, habiendo recorrido "+ kilometros + " kilometros");

        String patron = "#,###.##";
        DecimalFormat formato = new DecimalFormat(patron);

        JOptionPane.showMessageDialog(null,"El coste total de los litros gastados es de "+ formato.format(Gastotal) +" pesos");
    }
}
