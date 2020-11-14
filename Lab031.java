/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class Lab031 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
       Scanner af = new Scanner(new File("F:\\Study\\Bracu\\7. CSE 420\\420 lab works\\Lab03.1\\src\\lab03\\pkg1\\input3.1"));

             
             String s[]={"a(bc)*de", "a(bc)+de", "a(bc)?de", "[a-m]*", "[^aeiou]", "[^aeiou]{6}"};
            
           
              
   

           
            int n=0,p=0;
         while(n<s.length){
             boolean x=false;
             String d=af.nextLine().trim();
             
            
              if(Pattern.matches(s[n],d)){
               x=true;
              }
              p++;
              
              
              if(x){
              System.out.println(d+" - input is valid for number "+s[n]+" RE");
    }  
              else{
              System.out.println(d+" - input is invalid for number "+s[n]+" RE");
              }
              
              if(p==4){
              n++;
              p=0;
              }
              
         }
             
    }
        
        
    }
    

