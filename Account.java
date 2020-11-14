/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author ASUS
 */
public class Account {
      
    
    private int accountId;
    private String accountTitle;
    private double openingBal;
    private String emailID="";
    private double accountBal;
    
    private static int minBalLimit=100;
    private static int numAccounts;
    /**
     * @param args the command line arguments
     */
    public Account(int accountId, String accountTitle, double openingBal,String emailID){
    this.setAccount(accountId);
     this.setOpeningBal(openingBal);
    this.setAccountTitle(accountTitle);
    this.setEmailId(emailID);
    System.out.println("Account created successfully");
    numAccounts++;
    
    }
    
    public Account(int accountId, String accountTitle, double openingBal){
      this.setOpeningBal(openingBal);
      this.setAccountTitle(accountTitle);
     this.setAccount(accountId);
     System.out.println("Account created successfully");
    numAccounts++;
    }
    
    public void setAccount(int accountId){
    this.accountId=accountId;
    }
    
   public void setAccountTitle(String accountTitle){
   this.accountTitle=accountTitle;
   }
   
   public void setOpeningBal(double openingBal){
   this.openingBal=openingBal;
   }
   
   
   public boolean setAccountBal(double newAccountBa){
       boolean x=false;
       
       if(newAccountBa>minBalLimit){
        x=true;
        accountBal=newAccountBa;
       }
       
       return x;
       }
   
   public void setEmailId(String emailID){
   this.emailID=emailID;
   }
   
   public static boolean setMinBalLimit(int newLimit){
       
      minBalLimit=newLimit;
       return true;
   }
   
    
   public int getAccountId(){return this.accountId;}
   
   public String getAccountTitle(){return this.accountTitle;}
   
   public double getOpeningBal(){return this.openingBal;}
   
   public String getEmailID(){return this.emailID;}
   
   public double getAccountBal(){return this.accountBal;}
  
   public static int getNumAccount(){return numAccounts;}
   
   public static int getMinBalLimit(){return minBalLimit;}
   
   
   public String toString(){
   String x="AccountId= "+accountId+"\nAccount Title= "+accountTitle+"\nOpening Balance= "+openingBal+"\nEmail ID = Email ID Not Available";
           if(!emailID.equals("")){
   x="Account Id= "+accountId+"\nAccount Title= "+accountTitle+"\nOpening Balance= "+openingBal+"\nEmail ID = "+emailID;
   }
           return x;
   }
   
   public boolean equals(Account account){
       boolean x=false;
   if(account.equals(account)){
   x=true;
       return x;
   }    
   return x;
   }
  
   
   public boolean deposit(double amount){
       
   accountBal=accountBal+amount;
    return true;
   }
   
   public boolean withdraw(double amount){
        accountBal=accountBal-amount;
    return true;
   
   }
   
    
}
