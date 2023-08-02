///////////////////////////////////////////////////////////////
//Steps to follow while Programming 
//////////////////////////////////////////////////////////////

//Steps1-Understand the problem Statement
//Step2-write the algorithum
//Step3-Deside the Programming language
//Step4-Write the program
//Step5-Test the program
/////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////

//problem:Accept number from user and Check whether it is divisible by 5 and 3

////////////////////////////////////////////////////////////

//Algorithum
/*
 * START
 *     Accept the number from user 
 *     Divide that NO by 5 and 3 check the value of reminder
 *     if the value is 0
 *       Then Display as No is Divisible by 5 and 3
 *     otherwisw
 *     Display as No is not divisible by 5 and 3
 * End
 */
//////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;;
 /////////////////////////////////////////////////////////////

 //Function Name:DivisibleByThreeeAndFive
 //Description :to check Input is divisible
 //Input:Integer
 //Output:Integer
 //Author : Sukanya Hanumnat Gund
 //Date:14/10/2022

 /////////////////////////////////////////////////////////////

 class DivisibleByThreeeAndFive
 {
    public static void main(String arg[]) {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter first Number:");
      int iNo1=sobj.nextInt();     
      System.out.println("Enter second Number:");
      int iNo2=sobj.nextInt();   
      
      Divisible dobj=new Divisible();
      int iRet=dobj.divisibleByThreeeAndFive(iNo1,iNo2);

      if(iRet==1)
      {
        System.out.println("Numnber is divisible by 3 and 5");
      }
      else
      {
        System.out.println("Number is not divisible by 3 and 5");
      }

    }
 }
class Divisible
{
    int divisibleByThreeeAndFive(int iValue1,int iValue2)
    {
        int iAns1=iValue1 % 3;
        int iAns2=iValue2 % 5;

        if(iAns1==0)
        {
            if(iAns2==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
}
 
 
