/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodecrescente;

import java.util.Scanner;

public class NumeroDecrescente {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o numero ");
    
        int numero = ler.nextInt();
                 while (numero > -1){
           
           System.out.println("numero é \n" + numero);
      
      numero--;
        }
                
    }
}
