//write a program Accept the value from user and Multiplication of two number.

import java.lang.*;
import java.util.*;

class  Program5
{
    public static void main(String arg[])
    {

        Scanner sobj=new Scanner(System.in); 
        System.out.println("Enter the first number:");   
        int  iNo1=sobj.nextInt();
        System.out.println("Enter the second number:");
        int  iNo2=sobj.nextInt();
    
        Addtion aobj=new Addtion();
        int iret= aobj.multiplication(iNo1,iNo2);  
        System.out.println("Multiplication is:"+iret);
      

    }
}
////////////////////////////////////////////////////////////////////////////////
class Addtion
{
    public int multiplication(int ivalue1,int ivalue2)
     {
        int iAns1=ivalue1;
        int iAns2=ivalue2;
        int iAns=0;
        iAns=iAns1*iAns2;
        return iAns;
     }   
}
/////////////////////////////////////////////////////////////////////////////////
