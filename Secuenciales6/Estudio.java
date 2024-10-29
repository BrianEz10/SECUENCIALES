package Secuenciales6;
import javax.swing.JOptionPane;

public class Estudio {
    public static void main(String[] args) {
        String horasDiariasStr = JOptionPane.showInputDialog("¿Cuántas horas al día puedes estudiar?");
        int horasDiarias = Integer.parseInt(horasDiariasStr);

        int horasSemanales = horasDiarias * 7;

        String cantidadMateriasStr = JOptionPane.showInputDialog("¿Cuántas materias quieres estudiar?");
        int cantidadMaterias = Integer.parseInt(cantidadMateriasStr);

        String materia1 = "", materia2 = "", materia3 = "";
        if (cantidadMaterias >= 1) {
            materia1 = JOptionPane.showInputDialog("Introduce el nombre de la primera materia:");
        }
        if (cantidadMaterias >= 2) {
            materia2 = JOptionPane.showInputDialog("Introduce el nombre de la segunda materia:");
        }
        if (cantidadMaterias >= 3) {
            materia3 = JOptionPane.showInputDialog("Introduce el nombre de la tercera materia:");
        }

        int horasPorMateria = horasSemanales / cantidadMaterias;

        StringBuilder planEstudio = new StringBuilder();
        planEstudio.append("--- Plan de estudio semanal ---\n");

        for (int dia = 1; dia <= 7; dia++) {
            planEstudio.append("Día ").append(dia).append(":\n");
            if (cantidadMaterias >= 1) {
                planEstudio.append("  - ").append(materia1).append(": ").append(horasPorMateria).append(" horas\n");
            }
            if (cantidadMaterias >= 2) {
                planEstudio.append("  - ").append(materia2).append(": ").append(horasPorMateria).append(" horas\n");
            }
            if (cantidadMaterias >= 3) {
                planEstudio.append("  - ").append(materia3).append(": ").append(horasPorMateria).append(" horas\n");
            }
            planEstudio.append("\n");
        }

        JOptionPane.showMessageDialog(null, planEstudio.toString());
    }
}
