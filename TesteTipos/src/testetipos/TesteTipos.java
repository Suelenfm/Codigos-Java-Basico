
package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        
       /*int idade = 30;
       String valor = Integer.toString(idade);
        */
       String valor = "30.5";
       float idade = Float.parseFloat(valor);
       
       String nome = "80";
       
       float vnome = Float.parseFloat(nome);
       System.out.printf("o valor %s , idade %.2f, vnome %.2f ",valor,idade, vnome);
        
        
       
    }
    
}
