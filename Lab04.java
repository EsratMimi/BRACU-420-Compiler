/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     */
    
    
    public static Stack<String> stack = new Stack<>();
    
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner af;
        String s = null;
       


        
       
        
    
         
          
        af = new Scanner(new File("input.txt"));
        
        System.out.println("Methods: ");
        
    while(af.hasNext()){
         s=af.nextLine();
        //System.out.println(s); 
        String[] k = s.split(" "); 
        
        
        for (String k1 : k) {
             //System.out.println(k1); 
            stack.push(k1);
            
            if(")".equals(k1)){
            String t="", re="void";
            t=stack.pop()+t;
          while(!"(".equals(stack.peek())){
           t=stack.pop()+t;
          }
           t=stack.pop()+t;
            t=stack.pop()+t;
            
            if("int".equals(stack.peek()) || "String".equals(stack.peek()) ||"boolean".equals(stack.peek()) ||"long".equals(stack.peek()) ||"short".equals(stack.peek()) ){
            re=stack.pop();
            }
            
            System.out.println(t+"   ,   return type:"+re);
            
           }
        }
        
    }
}
        
        
}
    


   


