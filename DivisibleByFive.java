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

//problem:Accept number from user and Check whether it is divisible by 5 or not
//Test case1:
//Input:25
//Output: 25 is not divisible by 5

////////////////////////////////////////////////////////////

//Algorithum
/*
 * START
 *     Accept the number from user 
 *     Divide that NO by 5 and check the value of reminder
 *     if the value is 0
 *       Then Display as No is Divisible by 5
 *     otherwisw
 *     Display as No is not divisible by 5
 * End
 */
//////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.Scanner;;
 /////////////////////////////////////////////////////////////

 //Function Name:DivisibleByFive
 //Description :to check Input is divisible
 //Input:Integer
 //Output:Integer
 //Author : Sukanya Hanumnat Gund
 //Date:14/10/2022

 /////////////////////////////////////////////////////////////

 class  DivisibleByFive
 {
    public static void main(String arg[]) {
        Scanner sobj=new Scanner(System.in);  //user input
        System.out.println("Enter the First Number:");
        int iNo1=sobj.nextInt();
        
        Divisible dobj=new Divisible();
       //functional Approach
       int iRet=dobj.divisibleByFive(iNo1);
      
       if(iRet==1)
       {
         System.out.println(+iNo1+":Number is Divisible by 5");
       }
      else
      {
        System.out.println(+iNo1+":Number is not divisible by 5");
      }
    }
 }

 class Divisible
 {
   int divisibleByFive(int iValue)
    {
    int iAns=iValue % 5;

    if((iAns % 5)==0)
    {
        return 1;
    }
    else
    {
       return 0;
    }
  }
 }
///////////////////////////////////////////////////////////////
