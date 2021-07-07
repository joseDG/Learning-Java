/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Debian10
 */
public class matrices2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        boolean simetrica = true;
        
        System.out.println("Digite la matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        if(nFilas == nCol){
            int i, j;
            i=0;
            while(i<nFilas && simetrica == true){
                j = 0;
                while(j<i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica == true){
                JOptionPane.showMessageDialog(null, "Matriz es simetrica");
            }else{
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }
}
