package Secuenciales3;

import javax.swing.*;
import java.util.Locale;

public class Rutina {
    public static void main(String[] args) {
       String condicion;
        JOptionPane.showMessageDialog(null,"Hola");
        condicion = JOptionPane.showInputDialog(null,"Ingrese su nivel de de condicion fisica \n1- Principiante \n2- Intermedio \n3- Avanzado");

        switch (condicion.toLowerCase()){
            case "principiante":
                JOptionPane.showMessageDialog(null,"A usted se le recomienda realizar los distintos ejercicios 3 veces a la semana: ");
                JOptionPane.showMessageDialog(null,"1.Sentadillas (Squats)\n -3 series de 10-15 repeticiones \n -Mantén los pies al ancho de los hombros y baja como si te fueras a sentar");
                JOptionPane.showMessageDialog(null,"2.Flexiones de brazos (Push-ups)\n -3 series de 5-10 repeticiones (puedes hacerlas con las rodillas en el suelo)\n-Mantén el cuerpo recto y baja el pecho hacia el suelo");
                JOptionPane.showMessageDialog(null,"3.Plancha (Plank)\n-Mantén la posición durante 20-30 segundos\n-Asegúrate de mantener una línea recta desde la cabeza hasta los pies");
                JOptionPane.showMessageDialog(null,"4.Puente de glúteos (Glute Bridge)\n-3 series de 10-15 repeticiones\n-Acostado de espaldas, eleva las caderas manteniendo los pies en el suelo");
                JOptionPane.showMessageDialog(null,"5.Caminata rápida (Brisk Walking)\n-20-30 minutos, 3 veces por semana\n-Aumenta la duración a medida que te sientas más cómodo");
                break;
            case "intermedio":
                JOptionPane.showMessageDialog(null,"A usted se le recomienda realizar los distintos ejercicios 4 veces a la semana: ");
                JOptionPane.showMessageDialog(null,"1.Sentadillas con salto (Jump Squats)\n-3 series de 10-12 repeticiones\n-Realiza una sentadilla y salta explosivamente al subir");
                JOptionPane.showMessageDialog(null,"2.Flexiones de brazos con elevación de pies (Decline Push-ups)\n-3 series de 8-10 repeticiones (con los pies elevados en un banco o silla)\n-Mantén el cuerpo recto y baja el pecho");
                JOptionPane.showMessageDialog(null,"3.Plancha lateral (Side Plank)\n-3 series de 15-20 segundos por lado\n-Mantén la posición de lado, asegurándote de que tu cuerpo esté alineado");
                JOptionPane.showMessageDialog(null,"4.Peso muerto con piernas rectas (Straight-Leg Deadlift)\n-3 series de 10-12 repeticiones\n-Usa un par de mancuernas o una barra si tienes acceso\n");
                JOptionPane.showMessageDialog(null,"5.Correr (Running)\n-20-30 minutos, 4 veces por semana, alternando ritmos\n-Puedes incluir intervalos para mayor intensidad");
                break;
            case "avanzado":
                JOptionPane.showMessageDialog(null,"A usted se le recomienda realizar los distintos ejercicios 5 o 6 veces a la semana: ");
                JOptionPane.showMessageDialog(null,"1.Sentadillas con peso (Weighted Squats)\n-4 series de 8-10 repeticiones con una barra o mancuernas\n-Asegúrate de mantener una buena forma y postura");
                JOptionPane.showMessageDialog(null,"2.Flexiones de brazos explosivas (Explosive Push-ups)\n-3 series de 6-8 repeticiones (intenta elevar las manos del suelo al empujar)\n-Mantén el cuerpo recto");
                JOptionPane.showMessageDialog(null,"3.Plancha con elevación de pierna (Plank with Leg Lift)\n-3 series de 10-12 repeticiones por lado\n-Levanta una pierna manteniendo la posición de plancha");
                JOptionPane.showMessageDialog(null,"4.Burpees\n-3 series de 10-12 repeticiones\n-Incluye una flexión y un salto al final.");
                JOptionPane.showMessageDialog(null,"5.Correr o hacer sprints\n-30-45 minutos, 5 o 6 veces por semana, incluyendo sprints cortos\n-Alterna entre correr a un ritmo moderado y hacer sprints");
                break;
        }
        JOptionPane.showMessageDialog(null, "No te olvides de calentar antes de iniciar los ejercicios y al finalizar elongar");
        JOptionPane.showMessageDialog(null,"Buena Suerte ♥");
    }
}
