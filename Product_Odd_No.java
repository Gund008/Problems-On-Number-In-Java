/*
Write Java Program Which accept N numbers from user and return Product of all odd elements.
Input: N:6
       Elements:15  66  3 70 10 88
Output:45

Input: N:6
       Elements:44  66 72 70 10 88
Output : 0
       
*/

import java.lang.*;
import java.util.*;

class Program5
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Size of Array we Want to Create:");
            int iNo1=sobj.nextInt();

            ArrayX aobj=new ArrayX(iNo1);
            aobj.accept();
           
            int iRet=aobj.checkOdd();
            System.out.println("Product of all Odd Elements:"+iRet);
      }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
      
class ArrayX
{
      public int Arr[];
      
      public ArrayX(int iValue1)
      {
            Arr=new int[iValue1];
      }

      public void accept()
      {
            Scanner sobj=new Scanner(System.in);
            for(int iCnt=0;iCnt<Arr.length;iCnt++)
            {
                System.out.println("Enter the elements no:"+(iCnt+1));
                Arr[iCnt]=sobj.nextInt();
            }
      }

      public int checkOdd()
      {
            int iCnt=0;
            int iMult=1;
            
            for( iCnt=0;iCnt<Arr.length;iCnt++)
            {
                  if((Arr[iCnt] % 2)!=0)
                  {
                        iMult=iMult * Arr[iCnt];
                  }
            }
            if(iMult==1) 
            {
              return 0;
            }
            else
            {
              return iMult;
            }
      }
}
