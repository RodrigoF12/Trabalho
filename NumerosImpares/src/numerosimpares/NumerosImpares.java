/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosimpares;

/**
 *
 * @author Rodrigo Fonseca
 */
public class NumerosImpares {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
           /*Escreva um programa que imprima na tela a soma dos números ímpares entre
            0 e 30 e a multiplicação dos números pares entre 0 e 30.*/

           int num = 0;
           for (int i=0;i<30;i++)
           if (i%2==0)
           num+=i;
           System.out.println("Soma dos numeros impares de 0 a 30 é\n" +num);
               
             for(int i=0;i<31;i++){
                   if(i==2)
                   num=i;
                   if(i%2==0&&i>0) {
                       num*=i;
             
                   
                   }
            System.out.println("Multiplicação dos numeros pares de 0 a 30 e\n" +num);
    }
    
    }
}
