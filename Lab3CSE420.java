/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Lab3CSE420 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int noi = sc.nextInt();
        String s[]=new String [10];
        for(int i=0;i<noi;i++){
            s[i]=sc.next();
        }
        int out=sc.nextInt();
        String st[]=new String [10];
        for(int i=0;i<out;i++){
            st[i]=sc.next();
        }
    }
    
    public boolean star(String s[]){
        char [] c= s.toCharArray();
        
    }
    
}
