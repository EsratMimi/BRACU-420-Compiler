/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASUS
 */



public class Lab05{
//input
   public static String input="";
   public static String matched="";
    public int indexOfInput=-1;
    static int p=0;
    public static String action="";
    //Stack
    static Stack <String> st=new Stack<String>();
    //Table of rules
    String [][] table=
    {
        {"TD",null,null,"TD",null,null}
            ,
        {null,"+TD",null,null,"",""}
            ,
        {"FS",null,null,"FS",null,null}
            ,
        {null,"","*FS",null,"",""}
            ,
        {"a",null,null,"(E)",null,null}
    
    
    };
    String [] nonTers={"E","D","T","S","F"};
String [] terminals={"a","+","*","(",")","$"};

public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner af;
       
          af = new Scanner(new File("input.txt"));
          
           int n=af.nextInt();
        
             af.nextLine();
           
             
         for(int i=0;i<n;i++){
            String t=af.nextLine()+"$";
            System.out.println("Trace number:"+(i+1));
            String t2="";
            for(int j=0;j<t.length();j++){
        if(t.charAt(j)=='i'){
        t2=t2+"a";
        j++;
        }
        else{
        t2=t2+t.charAt(j);
        }
        }
          
              System.out.println("Matched                 Stack                 Input             Action");
        Lab05 parser=new Lab05(t2);
        parser.algo();
         }
          
          
          
      
  
    }
public Lab05(String in)
{
this.input=in;
}

public  void pushRule(String rule)
{
for(int i=rule.length()-1;i>=0;i--)
{
char ch=rule.charAt(i);
String str=String.valueOf(ch);
this.st.push(str);
}
}

    
public void algo()
{

    this.st.push("$");
     
    this.st.push("E");
   

    printa(3);
    String token=read();
    String top=null;
    
    while(true)
    {
        top=this.st.pop();
      
        if(isNonTerminal(top))
        {
        String rule=this.getRule(top, token);
        this.pushRule(rule);
        String vhul="";
        for(int k=0;k<rule.length();k++){
        if(rule.charAt(k)=='D'){
        vhul=vhul+"E'";
        }
        else if(rule.charAt(k)=='S'){
        vhul=vhul+"T'";
        }
         else if(rule.charAt(k)=='a'){
        vhul=vhul+"id";
        }
        else{
        vhul=vhul+rule.charAt(k);
        }
        
        
        }
        if(top.equals("S")){
        action="output T'->"+vhul;
        }
        else if(top.equals("D")){
        action="output E'->"+vhul;
       }
        else{
        action="output "+top+"->"+vhul;
        }
        printa(1);
      
        
        }
        else if(isTerminal(top))
        {
        if(!top.equals(token))
{
error("this token is not corrent , By Grammer rule . Token : ("+token+")");
}
else
{
    if(token.equals("a")){
    matched=matched+"id";
    p=p+2;
    }
    else{
    matched=matched+token;
    p++;
    }

    printa(2);
token =read();

}
        }
        else
        {
        error("Never Happens , Because top : ( "+top+" )");
        }
        if(token.equals("$")&& st.peek().equals("$") )
        {
        break;
        }
      
    
    }
    
    
    if(token.equals("$"))
        {
         System.out.println("Input is Accepted by LL1");   
        }
    else
    {
     System.out.println("Input is not Accepted by LL1");   
    }
}

    public boolean isTerminal(String s) {
               for(int i=0;i<this.terminals.length;i++)
        {
        if(s.equals(this.terminals[i]))
        {
        return true;
        }

        }
              return false;
    }

    public boolean isNonTerminal(String s) {
        for(int i=0;i<this.nonTers.length;i++)
        {
        if(s.equals(this.nonTers[i]))
        {
        return true;
        }

        }
              return false;
    }

    public String read() {
        indexOfInput++;
        char ch=this.input.charAt(indexOfInput);
String str=String.valueOf(ch);

        return str;
    }

    
       

    public void error(String message) {
        System.out.println(message);
        throw new RuntimeException(message);
    }
    public String getRule(String non,String term)
    {
        
    int row=getnonTermIndex(non);
    int column=getTermIndex(term);
    String rule=this.table[row][column];
    if(rule==null)
    {
    error("There is no Rule by this , Non-Terminal("+non+") ,Terminal("+term+") ");
    }
    return rule;
    }

    public int getnonTermIndex(String non) {
       for(int i=0;i<this.nonTers.length;i++)
       {
       if(non.equals(this.nonTers[i]))
       {
       return i;
       }
       }
       error(non +" is not NonTerminal");
       return -1;
    }

    public int getTermIndex(String term) {
              for(int i=0;i<this.terminals.length;i++)
       {
       if(term.equals(this.terminals[i]))
       {
       return i;
       }
       }
       error(term +" is not Terminal");
       return -1;
    }
    
       public static void printa(int c){

  
        String ts=Arrays.toString(st.toArray());
        String st="";
        
        for(int i=0;i<ts.length();i++){
        
         if(ts.charAt(i)=='D')
        {
            st="E'"+st;
        }
        else if(ts.charAt(i)=='S')
        {
            st="T'"+st;
        }
        else if(ts.charAt(i)=='a')
        {
            st="id"+st;
        }
                else if(ts.charAt(i)!='[' && ts.charAt(i)!=']'&& ts.charAt(i)!=','&& ts.charAt(i)!=' '){
        st=ts.charAt(i)+st;
        }
        
        }
        
        String t="";
        for(int i=0;i<input.length();i++){
        if(input.charAt(i)=='a'){
        t=t+"id";
        }
        else{
        t=t+input.charAt(i);
        }
        }
        
        
        
        if(c==1){
          System.out.println(matched+"                  "+st+"                "+t.substring(p)+"            "+action);
       
}
        else if(c==2){
            if(matched.charAt(matched.length()-1)=='d'){
        System.out.println(matched+"                  "+st+"                "+t.substring(p)+"             match id");
       }
            else{
            System.out.println(matched+"                  "+st+"                "+t.substring(p)+"             match "+matched.charAt(matched.length()-1));
            }   
        }
        else if (c==3){
         System.out.println(matched+"                  "+st+"                "+t.substring(p));
        
        }
        
        
        
        
       }
    

}
/*
 
 */