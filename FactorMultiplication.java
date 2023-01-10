import java.util.Scanner;

class Numbers
{
    public int FactorMult(int iValue)
    {
        int iCnt=0;
        int iMult=1;
        for(iCnt=1;iCnt<iValue;iCnt++)
        {
            if(iValue % iCnt==0)
            {
                iMult=iMult * iCnt;
            }
        }
        return iMult;
    }
}
///////////////////////////////////////////////////////////////////////////////////////

class  FactorMultiplication
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int iNo=sobj.nextInt();
        
        Numbers nobj=new Numbers();
        int iRet=nobj.FactorMult(iNo);
        System.out.println("Multiplication of Factors is:"+iRet);
    }
}