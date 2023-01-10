import java.util.Scanner;

class Numbers
{
    public void CommonFactorsDisplay(int iValue1,int iValue2)
    {
        int iCnt=0;

        for(iCnt=1;((iCnt<=iValue1/2)&&(iCnt<=iValue2/2));iCnt++)
        {
            if((iValue1 % iCnt==0)&&(iValue2 % iCnt==0))
            {
                System.out.println("Even Factor is:"+iCnt);
            }
        }
    }
}

class  CommonFactors
{
           public static void main(String arg[]) 
            {
                Scanner sobj=new Scanner(System.in);
                System.out.println("Enter the First Number:");
                int iNo1=sobj.nextInt();
                
                System.out.println("Enter the First Number:");
                int iNo2=sobj.nextInt();

                Numbers nobj=new Numbers();
        
                nobj.CommonFactorsDisplay(iNo1,iNo2);
        
            }
 }
