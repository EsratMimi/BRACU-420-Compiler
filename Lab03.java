/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 17101305
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner af = new Scanner(new File("C:\\Users\\17101305\\Documents\\NetBeansProjects\\lab03\\src\\lab03\\input"));

             int n=af.nextInt();
             af.nextLine();
             String s[]=new String[n];
             for(int i=0;i<n;i++){
              s[i] = af.nextLine().trim();
               System.out.println(s[i]);
              
    }
//     Pattern r = Pattern.compile(pattern);
//     Matcher m = r.matcher(line);
           
            int p=af.nextInt();
             af.nextLine(); 
            
         for(int i=0;i<p;i++){
             boolean x=false;
             String d="";
              String input=af.nextLine().trim();
              for(int t=0;t<n;t++){
              if(Pattern.matches(s[t],input)){
               x=true;
               d=d+(t+1)+" ";
              }
             
              }
              if(x){
              System.out.println("Yes, "+d);
    }  
              else{
              System.out.println("No, "+0);
              }
              
         }
             
    }
}
