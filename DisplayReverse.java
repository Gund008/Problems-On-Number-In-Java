/* 
Write a program which accept range from user and display all numbers in between that range in revrse order.

//Input : 23   35
//Output :35 34 33 32 31 30 29 28 27 26 25 24 23

//Input :10 18
//Output :18 17 16 15 14 13 12 11 10

//Input :10 10
//Output:10

//Input: -10 2
//Output: 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -8 -10

//Input:90 18
//Output:Invalid range

 */

 import java.util.*;

 class Range
 {
     public int iValue1;
     public int iValue2;
 
     public Range(int i,int j)
     {
         this.iValue1=i;
         this.iValue2=j;
     }
     public void displayRangeReverse()
     {
         int iCnt=0;
         if(iValue1>iValue2)  //filter
         {
             System.out.println("Invalid Range");
         }
 
         for(iCnt=iValue2;iCnt>=iValue1;iCnt--)
         {
             System.out.print("\t"+iCnt);
         }
         System.out.println();
     }
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program5
 {
     public static void main(String arg[])
     {
         Scanner sobj=new Scanner(System.in);
         
         System.out.println("Please Enter the Number:");
         int iNo1=sobj.nextInt();
 
         System.out.println("Please Enter the Number:");
         int iNo2=sobj.nextInt();
 
         Range robj=new Range(iNo1,iNo2);
         robj.displayRangeReverse();        
     }
 }