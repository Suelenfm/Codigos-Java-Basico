
package vetormes;
public class VetorMes {


    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul","Ago","Set","Out","Nov","Dez"};
        int tot [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < mes.length; i++){
            
            System.out.println(" Mês | " +mes[i] + " | == " + tot[i] + " dias");
                       }
        
         int ano = 2023;
          if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)){
              System.out.println("O ano é bissexto");   
          }else{   
              System.out.println("O ano não é bissexto");
          }

       
    }
    
}
