/* 
write a Program which accept range from user and return addition of all even numbers in between that range(Range should contains positive numbers only)

//Input : 23 30
//Output :108

//Input :10 18
//Output:70

//Input: -10 2
//Output :Invalid range

//Input : 90 18
//Output : Invalid range

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

    public int rangeSum()
    {
        int iCnt=0;
        int iSum=0;
        if(iValue1<0)  //filter
        {
            iValue1=-iValue1;
        }
        
        if(iValue1>iValue2)
        {
            return 0;
        }
        else if(iValue1<iValue2)
        {
            for(iCnt=iValue1;iCnt<=iValue2;iCnt++)
            {
                if(iCnt % 2==0)
                {
                    iSum=iSum + iCnt;
                }
            }
        }
        return iSum;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int iNo1=sobj.nextInt();

        System.out.println("Please Enter the Number:");
        int iNo2=sobj.nextInt();

        Range robj=new Range(iNo1,iNo2);
        int iRet=robj.rangeSum(); 

        if(iRet==0)
        {
            System.out.println("Invalid Position:");   
        }
        else
        {
            System.out.println("Addition:"+iRet); 
        }
            
    }
}