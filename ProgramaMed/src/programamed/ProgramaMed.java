
package programamed;

import java.util.Scanner;

public class ProgramaMed {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       
       System.out.print("Digite a primeira nota: ");
       float n1 = teclado.nextFloat();
       
        System.out.print("Digite a segunda nota: ");
       float n2 = teclado.nextFloat();
       
       float m = (n1+n2)/2;
       System.out.println("sua média é " + m);
       
       if (m>9){
           System.out.println("Parabéns, você estudou bastante!");
          
       }
       
    }
    
}
