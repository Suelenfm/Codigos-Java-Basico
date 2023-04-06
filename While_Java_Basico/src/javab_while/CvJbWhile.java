
package javab_while;
public class CvJbWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cc = 0;
    while (cc<10){
        cc++;
        if (cc==2 || cc==4 ){
            // continue; = interrupção do laço pulando expressões e prosseguindo.
            continue;
        }
        if (cc==7){
            break;
            // break; = interrupção do laço indo para o terminal quando chega na expressão.
            
         
        }
        System.out.println("Cambalhota " + cc);
        
        
    }
    }
    
}
