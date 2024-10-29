package Secuenciales4;

import javax.swing.*;

public class Musica {
    public static void main(String[] args) {
        String estadoAnimo;
        estadoAnimo = JOptionPane.showInputDialog("¿Cual es su estado de animo actual? \nFeliz \nTriste \nEnergico \nRelajado");

        switch (estadoAnimo.toLowerCase()){
            case "feliz":
            {
                JOptionPane.showMessageDialog(null,"Estas canciones tienen un ritmo positivo y letras que transmiten alegría \n1.\"Happy\" - Pharrell Williams\n2.\"On Top of the World\" - Imagine Dragons\n3.\"Here Comes the Sun\" - The Beatles\n4.\"Dancing Queen\" - ABBA\n5.\"Good as Hell\" - Lizzo\n");
            }
            break;
            case "triste":
            {
                JOptionPane.showMessageDialog(null,"Para esos momentos introspectivos, estas canciones ayudan a procesar emociones más profundas\n1.\"When I Was Your Man\" - Bruno Mars\n2.\"Someone Like You\" - Adele\n3.\"Fix You\" - Coldplay\n4.\"I Will Always Love You\" - Whitney Houston\n5.\"Skinny Love\" - Bon Iver");
            }
            break;
            case "energico":
            {
                JOptionPane.showMessageDialog(null,"Para motivarte y llenarte de energía, estas canciones tienen ritmos potentes y letras motivadoras\n1.\"Uptown Funk\" - Mark Ronson ft. Bruno Mars\n2.\"Lose Yourself\" - Eminem\n3.\"Till I Collapse\" - Eminem ft. Nate Dogg\n4.\"Believer\" - Imagine Dragons\n5.\"Born to Run\" - Bruce Springsteen");
            }
            break;
            case "relajado":
            {
                JOptionPane.showMessageDialog(null,"Para momentos de calma o para desconectar, estas canciones tienen un tono suave y armonioso\n1.\"Beyond\" - Leon Bridges\n2.\"Gravity\" - John Mayer\n3.\"Ocean Eyes\" - Billie Eilish\n4.\"Banana Pancakes\" - Jack Johnson\n5.\"Weightless\" - Marconi Union\n");
            }
            break;
        }
    }
}
