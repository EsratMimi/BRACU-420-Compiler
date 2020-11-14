/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS17101538
 */
public class Lab01 {
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner af;
        String s = null;
        
        
        
        ArrayList<String> Key = new ArrayList(Arrays.asList("abstract","assert","boolean","break","byte","case","catch","char",
                                                            "class","const","continue","default","do","double","else","enum",
                                                            "extends","final","finally","float","for","goto","if","implements",
                                                            "import","instanceof","int","interface","long","native","new","package",
                                                            "private","protected","public","return",
                                                            "short","static","strictfp","super","switch",
                                                            "synchronized","this","throw","throws","transient","try","void","volatile",
                                                            "while","true","false","null"));
        
        ArrayList<String> Ident = new ArrayList(Arrays.asList("a", "b", "c", "d","e",
                                                              "f", "g", "h", "i", "j",
                                                              "k", "l", "m", "n", "o",
                                                              "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        ArrayList<String> Log = new ArrayList(Arrays.asList(">", "<", ">=", "<=","||","&&","^","|","&","!"));
        ArrayList<String> Oth = new ArrayList(Arrays.asList(",", ";", "(",")","{","}","[","]"));
        ArrayList<String> MathOp = new ArrayList(Arrays.asList("+", "-", "=", "/","%","*","++","--"));
        
        
        
        
        ArrayList<String> Keywords = new ArrayList<>();
        ArrayList<String> NumValues = new ArrayList<>();
        ArrayList<String> LogOperators = new ArrayList<>();
        ArrayList<String> Others = new ArrayList<>();
        ArrayList<String> MathOperators = new ArrayList<>();
        ArrayList<String> Identifiers = new ArrayList<>();
        
        af = new Scanner(new File("E:\\8th sem\\CSE 420\\420 lab works\\lab01\\src\\lab01\\input"));
        while(af.hasNext()){
            s=af.nextLine().trim();
            
            String[] k = s.split(" "); 
            
            
            
            for (String k1 : k) {
                if (Key.contains(k1) && !Keywords.contains(k1)) {
                    Keywords.add(k1);
                } else if (Ident.contains(k1) && !Identifiers.contains(k1)) {
                    Identifiers.add(k1);
                } else if (MathOp.contains(k1) && !MathOperators.contains(k1)) {
                    MathOperators.add(k1);
                } else if (Log.contains(k1) && !LogOperators.contains(k1)) {
                    LogOperators.add(k1);
                } else if (Oth.contains(k1) && !Others.contains(k1)) {
                    Others.add(k1);
                } else if (isStringInt(k1) && !NumValues.contains(k1)) {
                    NumValues.add(k1);
                } else if (isStringDouble(k1) && !NumValues.contains(k1)) {
                    NumValues.add(k1);
                }
            }
        }
        System.out.print("Keywords: ");
        for(int i=0;i<Keywords.size();i++){
            System.out.print(Keywords.get(i)+", ");
        }
        System.out.println();
        System.out.print("Identifiers: ");
        for(int i=0;i<Identifiers.size();i++){
            System.out.print(Identifiers.get(i)+", ");
        }
        System.out.println();
        System.out.print("Math Operators: ");
        for(int i=0;i<MathOperators.size();i++){
            System.out.print(MathOperators.get(i)+", ");
        }
        System.out.println();
        System.out.print("Logical Operators: ");
        for(int i=0;i<LogOperators.size();i++){
            System.out.print(LogOperators.get(i)+", ");
        }
        System.out.println();
        System.out.print("Numerical Values: ");
        for(int i=0;i<NumValues.size();i++){
            System.out.print(NumValues.get(i)+", ");
        }
        System.out.println();
        System.out.print("Others: ");
        for(int i=0;i<Others.size();i++){
            System.out.print(Others.get(i)+" ");
        }
        System.out.println();
        
        
        
    }
    public static boolean isStringInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
    
    public static boolean isStringDouble(String s)
    {
        try
        {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
    
}