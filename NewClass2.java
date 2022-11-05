
package test.java;

import java.util.Scanner;


public class NewClass2 {
     public static void main (String args[]){
     Scanner scanner = new Scanner(System.in) ;   
     String id = null ;
     String name = null;
     int balance = 0;
  
     System.out.println("Enter the id of doughter account :");     
     id = scanner.next();
     System.out.println("Enter the name of doughter account :");          
     name = scanner.next();    
     System.out.println("Enter the balance of doughter account :");  
     balance = scanner.nextInt(); 
      Account doughter = new Account(id , name , balance);
      
      
      
     System.out.println("Enter the id of father account :");     
     id = scanner.next();
     System.out.println("Enter the name of father account :");          
     name = scanner.next();    
     System.out.println("Enter the balance of father account :");  
     balance = scanner.nextInt();
     
     Account father = new Account(id , name, balance);
     
     System.out.println(doughter.credit(1000));
     System.out.println(doughter.debit(2000)); 
     System.out.println(father.transferto(father, 200, doughter)); 

     
     
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     }    
}
