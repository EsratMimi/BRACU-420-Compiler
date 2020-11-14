/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse420lab;
import java.util.Scanner;
/**
 *
 * @author Esrat 
 */
public class CSE420Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("How many identifier you want to give ?");
        int n=sc.nextInt();
        String s[]=new String[n+1];
        String num[]={"0","1","2","3","4","5","6","7","8","9"};
        
        for (int i=0; i<s.length ; i++){
            s[i]=sc.nextLine();
         //   String[] words=s[i].split("\\s");//splits the string based on whitespace  
        }
        
        char ch[]=new char[100];
        int m = sc.nextInt();
        String st[]=new String[m+1];
        for(int i=0;i<st.length;i++){
            st[i]=sc.nextLine();
            String words[]=st[i].split("\\s");
            for(int j=0; j<words.length;j++){
             //   if(words.equals())
            }
            
            
        }
        
        
    
    }
}
