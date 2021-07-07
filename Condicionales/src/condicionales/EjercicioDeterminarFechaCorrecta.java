/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Debian10
 */
public class EjercicioDeterminarFechaCorrecta {
    public static void main(String[] args) {
        
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if(año == 0){
            JOptionPane.showMessageDialog(null, "Fecha Correcta");
        }else if((mes == 2) && (dia >= 1 && dia <= 28)){
            JOptionPane.showInputDialog(null, "Fecha correcta");
        }else if((mes==4 || mes ==6  || mes==9 || mes == 11) && (dia>1 && dia<30)){
            JOptionPane.showMessageDialog(null, "Fecha Correcta");
        }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7  || mes==8 || mes==10 || mes==12) && (dia >= 1 && dia <=31)){
            JOptionPane.showMessageDialog(null, "Fecha correcta" );
        }else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
    }
}
