/*
Write a Java program for handling the following exceptions
 (i)  Arithmetic Exception          (ii) ArrayIndexOutOfBounds Exception 
(iii) NumberFormatException         (iv) StringIndexOutOfBounds Exception
 */
package labexcercise9;

import java.util.Scanner;

public class exceptions2 {
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in); 
       int a=5;
       int b=0;
       
       int d[]=new int[3];
       
       int f,g;
       
       String i="java";
       try
       {
          int c=a/b;
          c=Integer.parseInt(obj.next());
          System.out.println(c);
       }  
       catch(ArithmeticException e)
       {
           System.out.println(e);
       }
       try
       {
          d[5]=10;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
       try
       {
          f=Integer.parseInt(args[0]);
          g=Integer.parseInt(args[1]);
          int h=f+g;
          System.out.println(h);
       }
       catch(NumberFormatException e)
       {
           System.out.println(e);
       }
       try
       {
           i.substring(5);
           System.out.println(i);
       }
       catch(StringIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
       
    }
}
