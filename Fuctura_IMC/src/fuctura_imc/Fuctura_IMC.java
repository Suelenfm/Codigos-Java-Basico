/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuctura_imc;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Fuctura_IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
        
		Double peso;
		Double altura ;
		String sexo;
		String nome;
		double imc;
	System.out.print("Digite seu nome:");
		nome = entrada.nextLine();
	
	System.out.print("Digite sua altura:");
		altura = entrada.nextDouble();
	
	System.out.printf("Digite seu peso:", .2f);
		peso = entrada.nextDouble();
	
	System.out.print("Digite seu sexo:");
		sexo = entrada.next();
	
	imc = peso / (altura*altura);
	
	System.out.printf(nome + ", seu peso em (kg): " + "%.2f" , imc);
    }
    
}
   

