
package programaidade;

import java.util.Scanner;
public class ProgramaIdade {

    
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.print("Digite o ano de seu nascimento: ");
        int nasc = t.nextInt();
        
        int idade = 2023-nasc;
        System.out.print("Que legal! Você tem "+idade +" anos, então você é , ");
        if (idade>=18){
            System.out.println("maior de idade.");
           }else{
            System.out.println("menor de idade");
        }
    }
    
}
