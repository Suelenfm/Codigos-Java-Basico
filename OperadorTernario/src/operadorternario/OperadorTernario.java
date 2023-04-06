
package operadorternario;

/**
 *
 * @author DELL
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r =(n1>n2)?n1:n2; - SE N1 FOR MAIOR QUE N2 MOSTRA = 0 , SENÃO , MOSTRA N2.
        
        System.out.println(r);
        */
        int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r =(n1>n2)?n1+n2:n2-n1; 
        
        System.out.println(r);
        
    }
    
}
