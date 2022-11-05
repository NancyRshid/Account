
package test.java;


public class Account {
    
   private String id ; 
   private String name ;  
   private int balance; 

    public Account(String id, String name, int balance) {
        this.balance = balance;
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    
    public int credit(int amount){
        balance = amount + this.getBalance();
        System.out.println("The balance after credit : ");
        return balance ;
    }
    
   public int debit(int amount){
    if(amount<=this.getBalance()){
        balance = this.getBalance() - amount;
        System.out.println("The balance after debit : ");
    } 
    else{
        System.out.println("Acount exceeded balance");
    }   
    return balance;   
   } 
   
    
   public int transferto(Account father , int amount ,Account doughter){
    
       if(father.balance >= amount){
           father.balance =   father.balance - amount ;
           doughter.balance = doughter.balance + amount ;
       }
       
       else{
           System.out.println("A failed attempt ");
       }
      return father.balance ; 
   }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
