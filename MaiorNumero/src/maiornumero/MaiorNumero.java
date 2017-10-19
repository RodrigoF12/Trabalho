
package maiornumero;

import java.util.Scanner;
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);
        System.out.println("Informe o valor de x e y");
        
        int x = user.nextInt();
        int y = user.nextInt();
        int resultado;
                
        if (x > y){
            resultado = (x);
            System.out.println("resultado e " + resultado);
            
        }
        else {
            resultado = (y);
             System.out.println("resultado e " + resultado);
            
        }
    }
    
   
}
