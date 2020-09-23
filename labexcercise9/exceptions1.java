/*
Write a java program for exception handling:
a) To create a user defined exception whenever user input the word “hello”.
b) To add two integers and raise exception when any other character except number (0 – 9) is given as input.
 */
package labexcercise9;

import java.util.Scanner;

public class exceptions1 
{
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    String c=new String();
    System.out.println("Enter the word to be checked:");
    c = obj.next();
    
    try 
       {
        if(c.equals("hello"))
           {
               throw new WordHelloFoundException ("Word 'hello' not allowed");   
           } 
        System.out.println("Valid word:"+c);
       }
       catch(WordHelloFoundException e)
       {
           System.out.println(e);
       }
    exceptions1 obj1=new exceptions1(); 
    try
    {
    obj1.checkchar();
    }
    catch(CharacterFoundException e)
    {
       System.out.println(e); 
    }
     
    }
    void checkchar() throws CharacterFoundException
    {
      boolean flag=true;
      Scanner obj2=new Scanner(System.in);
      System.out.println("Enter a string of length 2:");
      String s=obj2.next();
      char c[]=new char[2];
      c=s.toCharArray();
      int a[]=new int[2];
      int j=0;
      int sum=0;
      
      for(int i=0;i<c.length;i++)
      {
          if(c[i]>=48 && c[i]<=57)
          {
              char b=c[i];
              String z=Character.toString(b);
              a[j]=Integer.parseInt(z);
              sum=sum+a[j];
              j++;
              
              if(flag==false)
              {
                  break;
              }
          }
          else
          {
              flag=false;
              throw new CharacterFoundException("Character is found"); 
          }
      }
      if(flag==true);
      {
          System.out.println("Sum:"+sum);
      }
    }

}
class WordHelloFoundException extends Exception
{
    WordHelloFoundException(String msg)
    {
        super(msg);
    }
}
class CharacterFoundException extends Exception
{
   CharacterFoundException(String msg)
    {
        super(msg);
    }
}
