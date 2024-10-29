package Secuenciales1;

import static javax.swing.JOptionPane.*;

public class Zodiaco {
    public static void main(String[]args){


      int dia;
      String mes;
      int anio;

      showMessageDialog(null, "Bienvenido");
      showMessageDialog(null, "Ingrese su fecha de nacimiento");


      dia = Integer.parseInt(showInputDialog("Dia: "));

      mes = showInputDialog("Mes: ");

      anio = Integer.parseInt(showInputDialog("Año: "));

      switch (mes){
          case "enero":
              if (dia <= 19){
                  showMessageDialog(null, "Usted es de Capricornio");
                  break;
              }
              else if (dia >= 20 && dia <= 31){
                  showMessageDialog(null, "Usted es de Acuario");
                  break;
              }
          case "febrero":
              if (dia <= 18){
                  showMessageDialog(null, "Usted es de Acuario");
                  break;
              } else if (dia >= 19 && dia <= 28) {
                  showMessageDialog(null, "Usted es de Piscis");
                  break;
              }
          case "marzo":
              if (dia <= 20){
                  showMessageDialog(null, "Usted es de Piscis");
                  break;
              } else if (dia >= 21 && dia <= 31 ) {
                  showMessageDialog(null, "Usted es de Aries");
                  break;
              }
          case "abril":
              if (dia <= 19){
                  showMessageDialog(null, "Usted es de Aries");
                  break;
              } else if (dia >= 20 && dia <= 31) {
                  showMessageDialog(null, "Usted es de Tauro");
                  break;
              }
          case "mayo":
              if (dia <= 20){
                  showMessageDialog(null, "Usted es de Tauro");
                  break;
              }
              else if (dia >= 21 && dia <= 31){
                  showMessageDialog(null, "Usted es de Geminis");
                  break;
              }
          case "junio":
              if (dia <= 20){
                  showMessageDialog(null, "Usted es de Geminis");
                  break;
              } else if (dia >= 21 && dia <= 31) {
                  showMessageDialog(null, "Usted es de Cancer");
                  break;
              }
          case "julio":
              if (dia <= 22){
                  showMessageDialog(null, "Usted es de Cancer");
                  break;
              }
                else if (dia >= 23 && dia <= 31){
                  showMessageDialog(null, "Usted es de Leo");
                  break;
              }
          case "agosto":
              if (dia <= 22){
                  showMessageDialog(null, "Usted es de Leo");
                  break;
              } else if (dia >= 23 && dia <= 31) {
                  showMessageDialog(null, "Usted es de Virgo");
                  break;
              }
          case "septiembre":
              if (dia <= 22){
                  showMessageDialog(null, "Usted es de Virgo");
                  break;
              }
              else if (dia >= 23 && dia <= 31){
                  showMessageDialog(null, "Usted es de Libra");
                  break;
              }
          case "octubre":
              if (dia <= 22){
                  showMessageDialog(null, "Usted es de Libra");
                  break;
              } else if (dia >= 23 && dia <= 31) {
                  showMessageDialog(null, "Usted es de Escorpio");
                  break;
              }
          case "noviembre":
              if (dia <= 21){
                  showMessageDialog(null, "Usted es de Escorpio");
                  break;
              }
              else if (dia >= 22 && dia <= 31){
                  showMessageDialog(null, "Usted es de Sagitario");
                  break;
              }
          case "diciembre":
              if (dia <= 21){
                  showMessageDialog(null, "Usted es de Sagitario");
                  break;
              } else if (dia >= 22 && dia <= 31) {
                  showMessageDialog(null, "Usted es de Capricornio");
                  break;
              }
      }
      }
    }