
package exerciciosjavaaula06;

import java.util.Scanner;


public class ExerciciosJavaAula06 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
         System.out.print("Digite seu nome: ");
         String nome = teclado.nextLine();
         
         System.out.print("Digite a sua nota: ");
         float nota = teclado.nextFloat();
         
         System.out.format("A nota de , %s , é %.2f : ", nome,nota);
    }
    
}
