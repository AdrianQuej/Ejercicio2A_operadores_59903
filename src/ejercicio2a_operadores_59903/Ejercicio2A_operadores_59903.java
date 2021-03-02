/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2a_operadores_59903;

/**
 *
 * @author Adrian Quej
 */
public class Ejercicio2A_operadores_59903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cali[][] = new int[3][3];
        int determinante = 0;
        
        cali[0][0]=3;
        cali[0][1]=2;
        cali[0][2]=1;
        cali[1][0]=2;
        cali[1][1]=1;
        cali[1][2]=2;
        cali[2][0]=1;
        cali[2][1]=2;
        cali[2][2]=1;
        
        determinante = (( cali[0][0] * cali[1][1] * cali[2][2]) - ( cali[2][0] * cali[1][1] * cali[0][2]));
        System.out.println("determinante = " + determinante);
       
       
        
    }
    
}
