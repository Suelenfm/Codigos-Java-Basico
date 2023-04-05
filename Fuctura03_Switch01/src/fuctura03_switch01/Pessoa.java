public class Conta {
    
    Scanner en = new Scanner (System.in);
    Scanner el = new Scanner (System.in);
    
    private int cc;
    private int ag;
    private int op;
    private Long cpf;
    private String nome;
    private float depos;
    private float saque;
    private float saldo;
    
    

   public void dadosc(){
       
       System.out.print("NOME COMPLETO: " );
       nome = el.next();
       
       System.out.print("CPF: ");
       cpf = en.nextLong();
       
       System.out.print("CONTA CORRENTE: ");
       cc = en.nextInt();
       
       System.out.print("AGÊNCIA: ");
       ag = en.nextInt();
       
       System.out.print("OPERAÇÃO: ");
       op = en.nextInt();
       
       
   
   }
   
   public void menu (){
       System.out.println("1 - SAQUE");
       System.out.println("2 - DEPOSITO");
       System.out.println("3 - SALDO");
       
       
   }

   public void operacoes(){
       int entrada = en.nextInt();
       String opcao="";
       switch (entrada){
          
           case 1: 
           opcao = "";
           System.out.print("INFORME O VALOR DO SAQUE: ");
           saque = en.nextInt();
           saque -= saldo;
           
           
           if (saldo < saque ){
               
               System.out.println("Saldo insuficiente" + "\nNOVO DEPÓSITO? [S/N]");
               el.next();
           el.equals("S");
               Deposito();
               
               }else if(el.equals("N")){
                   
               break;
                   
                
               }
       
           
               
           }else if(saldo == saque || saque < saldo ){
               System.out.println("SAQUE: "+ saque+"SALDO ATUAL: " + saldo);
       
               
                
           }
           break;
           
           case 2:
           opcao = "";
           System.out.print("INFORME O VALOR DEPÓSITO: ");
           depos = en.nextFloat();
           depos += saldo;
           System.out.println("DEPOSITO: "+ depos+"SALDO ATUAL: " + saldo);
           break;
           
           
           case 3:
           opcao = "";
           System.out.println("SALDO ATUAL: " + saldo);
           break;
       }
   
       System.out.println(opcao);
   
       {
}


     void Deposito(){
 
     System.out.print("DIGITE O VALOR DO DEPOSITO:");
     depos = en.nextFloat();
     saldo += depos;
     System.out.println("DEPOSITO: "+ depos+"SALDO ATUAL: " + saldo);
      }
       
    
    
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDepos() {
        return depos;
    }

    public void setDepos(float depos) {
        this.depos = depos;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
}







































  public void operacoes(){
       int entrada = en.nextInt();
       String opcao="";
       String resps ="";
       switch (entrada){
          
           case 1: 
           opcao = "";
           System.out.print("INFORME O VALOR DO SAQUE: ");
           saque = en.nextInt();
           saque -= saldo;
           
           if (saldo < saque )
           {    
             System.out.println("Saldo insuficiente | Saldo: " + saldo );
             resps = el.nextLine();   
           }
          
           else if(resps.equals("s"))
           {
                Deposito();
           }
           else{
               System.out.println("Obrigada, volte sempre! ");
               break;
           }
           break;
           
           
            case 2:
           opcao = "";
           System.out.print("INFORME O VALOR DEPÓSITO: ");
           depos = en.nextFloat();
           depos += saldo;
           System.out.println("DEPOSITO: "+ depos+" SALDO ATUAL: " + saldo);
           break;
           
           
           case 3:
           opcao = "";
           System.out.println("SALDO ATUAL: " + saldo);
           break;
           
          

       }
       System.out.println(opcao);
   }






public class JavaPoo05ContaBanco {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
      
      Conta c1 = new Conta();
      
      c1.dadosc();
      c1.menu();
      c1.operacoes();
      
        System.out.println("DESEJA REPETIR A OPERAÇÃO? [S/N] ou exit");
        String resp = entrada.next();
        
        String exit = resp;
        while (resp.equalsIgnoreCase(exit)){
        if (resp.equalsIgnoreCase("s"))
           {    
      c1.dadosc();
      c1.menu();
      c1.operacoes();
           }
        else if (resp.equalsIgnoreCase("n")){
            System.out.println("OBRIGADA, VOLTE SEMPRE! ");
        }
          
      break;
      }



 if(login == true)
        {
            System.out.println("CONECTADO");  
        }
       
    
        
        else 
                {
                    
                    System.out.println("FAÇA SEU LOGIN OU CRIE UMA NOVA CONTA");
                    System.out.println("");
                    System.out.print("NOME: ");
                    nome = entrada.next();
                    System.out.print("CPF: ");

                }
        








 public void login(){   
        String resplog =null; 
        if(login == true)
        {
            System.out.println("CONECTADO");   
            System.out.println("DIGITE 'OK' PARA VOLTAR AO MENU PRINCIPAL");
            resplog = entrada.next();  
        }
        
        if(resplog.equalsIgnoreCase("OK"))
            menu();
        
            
         
    
        
        else 
                {
                    
                    System.out.println("FAÇA SEU LOGIN OU CRIE UMA NOVA CONTA");
                    System.out.println("");
                    System.out.print("NOME: ");
                    nome = entrada.next();
                    System.out.print("CPF: ");
                    cpf = entrada.nextLong();
                    System.out.println("");

                }











