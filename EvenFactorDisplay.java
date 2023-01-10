import java.util.Scanner;

class Numbers
{
    public void EvenFactorDisplay(int iValue)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=(iValue/2);iCnt++)
        {
            if((iValue % iCnt==0)&&(iCnt % 2==0))
            {
                System.out.println("Even Factor is:"+iCnt);
            }
        }
    }

}

class  EvenFactorDisplay
{
    public static void main(String arg[]) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int iNo=sobj.nextInt();

        Numbers nobj=new Numbers();

        nobj.EvenFactorDisplay(iNo);

    }
}