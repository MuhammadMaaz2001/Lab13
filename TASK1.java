
package lab12;

import java.util.Random;
import java.util.Scanner;

 

public class TASK1
{
 public static void main(String[] args) 
 {
     final int SIZE=10;
     Random rand = new Random();
     Scanner sc= new Scanner(System.in);
     int[] arr= new int[SIZE];
     for (int i=0;i< SIZE;i++)
     {
         arr[i]=1+rand.nextInt(10);
     }
     
  System.out.println("Enter the Index of array for v2");
  int index = sc.nextInt();
  try 
  {
      int value=arr[index];
      System.out.println("Corresponding value at the index  "+ index +"  is "+ value);
  } 
  catch(ArrayIndexOutOfBoundsException ex) 
  {
      System.out.println("Out of Bounds.");
  } 
 }}
