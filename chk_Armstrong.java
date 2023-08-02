import java.util.Scanner;

class Digits
{
    private int CountDigits(int iValue)
    {
        int icnt=0;
        while(iValue!=0)
        {
            icnt++;
            iValue=iValue / 10;
        }
       return icnt;
    }

    private int Power(int Base,int index)
    {
        int iAns=1;

        for(int icnt=1;icnt<=index;icnt++)
        {
            iAns=iAns * Base;
        }
        return iAns;
    }

    public boolean checkArmstrong(int iNo)
    {
        int iTemp=iNo;
        int iSum=0;
        int iDigit=0;
        int iRet=0;

        int iCount=CountDigits(iNo);

        while(iNo!=0)
        {
            iDigit=iNo % 10;

            iRet=Power(iDigit,iCount);

            iSum=iSum + iRet;
            iNo=iNo / 10;
        }
        if(iSum==iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////

class chkArmstrong 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int iNo=sobj.nextInt();

        Digits dobj=new Digits();
        boolean bRet=dobj.checkArmstrong(iNo);

        if(bRet==true)
        {
            System.out.println(iNo+":is a Armstrong Number");
        }
        else
        {
            System.out.println(iNo+"is a notp Armstrong Number");
        }
    }
}
