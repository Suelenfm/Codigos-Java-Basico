
package fuctura02_if_else;

import java.util.Scanner;
public class Fuctura02_If_Else {

    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
 
			
    String nome;
			
			
    System.out.print("Digite o seu nome aqui :");  
    nome = entrada.nextLine() ;

    String sexo;     
    System.out.print("Digite seu sexo [F/M] :");     
    sexo = entrada.next() ;   
			 
			
			 
    if(sexo.equalsIgnoreCase("m")){  
    System.out.print(nome + ", seu sexo é: " + "masculino" ); 
				 
    }else if(sexo.equalsIgnoreCase("f")){
    System.out.print(nome + " , seu sexo é: "+ "feminino");
				 
    }else{
    System.out.print("Sexo invalido");
            }

        }
    }