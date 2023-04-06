
package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
       int num , s = 0;
       String resp;
      Scanner entrada = new Scanner (System.in); 
       
      do{
          System.out.print("Digite um número:");
          num = entrada.nextInt();
          
          s += num; // s = s + num;
          
          System.out.print("Quer continuar? [S/N]");
          resp = entrada.next();
      }while (resp.equals("S"));
        System.out.println("A soma de tudo é: "+ s);
      
    }
    
}
