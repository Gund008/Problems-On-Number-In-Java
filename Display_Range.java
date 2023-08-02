/* 
write a Program which Accept range from user and display all numbers in between that range.

Input : 23 35
Output:23   24  25 26 27 28 29 30 31 32 33 34 35

Input :10 18
Output : 10 11  12 13 14 15 16 17 18

Input :10 10
Output :10s

Input : -10 2
Output : -10 -9 -8 -7 -6 -5 -4 -3  -2 -1  0 1 2

Input :90 18
Output: Invalid range

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
    public void rangedisplay()
    {
        int iCnt=0;
        if(iValue1>iValue2)  //filter
        {
            System.out.println("Invalid Range");
        }

        for(iCnt=iValue1;iCnt<=iValue2;iCnt++)
        {
            System.out.print("\t"+iCnt);
        }
        System.out.println();
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class Program1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int iNo1=sobj.nextInt();

        System.out.println("Please Enter the Number:");
        int iNo2=sobj.nextInt();

        Range robj=new Range(iNo1,iNo2);
        robj.rangedisplay();        
    }
}
