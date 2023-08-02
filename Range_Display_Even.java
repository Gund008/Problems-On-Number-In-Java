/* 
Write a Program which accept range from user and display all even numbers in between that range.
//Input :23 35
//Output: 24 26 28 30 32 34

//Input :10 18
//Output :10 12 14 16 18

//Input :10 10
//Output:10

//Input : -10 2
//Output :-10 -8 -6 -4 -2 0 2

//Input: -90 18
//Output: Invalid range

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
    public void displayEven()
    {
        int iCnt=0;
        
        if(iValue1<0)
        {
            iValue1=-iValue1;
        }
        
        if(iValue1>iValue2)
        {
            for(iCnt=iValue1;iCnt<=iValue2;iCnt++)
            {
                if(iCnt % 2==0)
                {
                    System.out.println(""+(-iCnt));
                }
                else
                {
                    System.out.println("Invalid Position");
                }
            }
        }
        else if((iValue1<iValue2) || (iValue1==iValue2))
        {
            for(iCnt=iValue1;iCnt<=iValue2;iCnt++)
            {
                if(iCnt % 2==0)
                {
                    System.out.print("\t"+iCnt);
                }
            }

        }
        System.out.println();
         
    }
  
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class  RangeDisplayEven
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the Number:");
        int iNo1=sobj.nextInt();

        System.out.println("Please Enter the Number:");
        int iNo2=sobj.nextInt();

        Range robj=new Range(iNo1,iNo2);
        robj.displayEven();        
    }
}
