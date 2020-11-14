/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 17101538
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    
    
   static Stack<Character> st= new Stack<Character>(); 
   static char []a;
   static String pfb="";
   static int value[]=new int[26];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner af;
       
          af = new Scanner(new File("E:\\8th sem\\CSE 420\\420 lab works\\Lab06\\input.txt"));
          
         int n=af.nextInt();
             af.nextLine();
           
             
         for(int i=0;i<n;i++){
            String t=af.nextLine();
             value[(int)t.charAt(0)-97]=(int)t.charAt(2)-48;
         }
          
     int r=af.nextInt();
             af.nextLine();
           String z[]=new String[r];
             
         for(int i=0;i<r;i++){
             String t=af.nextLine();
            z[i]=t;
           System.out.println(PFB(t));
           
         }
          for(int i=0;i<r;i++){
              System.out.println(PFE(PFB(z[i])));
           
         }
          
      
        

        
        
    }
    
    
    
    public static String PFB(String s){
    a=s.toCharArray();
      
      
      for(int i=0;i<a.length;i++){
        
        if ((int)a[i]>96 && (int)a[i]<123 ){
          pfb=pfb+a[i];
        }
         else if( a[i]=='(' ){
                  st.push(a[i]);
         }
          else if( (a[i]== '+' || a[i] == '-' || a[i] == '*' || a[i] == '/' || a[i] == '%' ) ){
              method4(i);
              
            }
          
           else if( a[i]==')' ){
                  while( !(st.peek()=='(')){
                  pfb=pfb+st.pop();
                  }
                  st.pop();
                  
         }
      }
      
          while(!st.isEmpty()){
            pfb=pfb+st.pop();
            
            }
      String q=pfb;   
          pfb="";
          
       return q;
       
       
       
    }   
          
          
          
          
    
    public static void method4(int i){
    if(st.isEmpty()){
              st.push(a[i]);
              }
              else if(st.peek()=='('){
              st.push(a[i]);
              }
              else if( ( a[i]=='%' || a[i]=='/' || a[i]=='*' ) && ( st.peek()=='+' || st.peek()=='-' )){
                st.push(a[i]);
              }
              else{
               pfb=pfb+st.pop();
               method4(i);
              }
    }
    
    
    
     public static String PFE(String s){
   Stack<Integer> sta=new Stack<Integer>();
   for(int i=0;i<s.length();i++){
       
     if((int)s.charAt(i)>96 && (int)s.charAt(i)<123){
         if(value[(int)s.charAt(i)-97]==0){
         return "Compilation Error";
         }
         else{
       sta.push(value[(int)s.charAt(i)-97]);
   }
         
     }
     else if(s.charAt(i)=='+'){
       int y=sta.pop();
       int x=sta.pop();
      sta.push(x+y);
     }
       else if(s.charAt(i)=='-'){
       int y=sta.pop();
       int x=sta.pop();
      sta.push(x-y);
     }
         else if(s.charAt(i)=='*'){
       int y=sta.pop();
       int x=sta.pop();
      sta.push(x*y);
     }
            else if(s.charAt(i)=='/'){
       int y=sta.pop();
       int x=sta.pop();
      sta.push(x/y);
     }
            else if(s.charAt(i)=='%'){
       int y=sta.pop();
       int x=sta.pop();
      sta.push(x%y);
     }
            
     }
   return sta.pop()+"";
  }
    
}
