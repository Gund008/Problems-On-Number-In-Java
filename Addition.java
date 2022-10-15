import java.lang.*;

import java.util.*;

////////////////////////////////////////////////////////////////////////////////

class Addtion
{
    public static void main(String arg[])
    {

        Scanner sobj=new Scanner(System.in); 
        System.out.println("Enter the first number:");   
        int  iNo1=sobj.nextInt();
        System.out.println("Enter the second number:");
        int  iNo2=sobj.nextInt();
        Addtion aobj=new Addtion();
        int iRet=aobj.addtion(iNo1,iNo2);
        
        System.out.println("Addtion of two Number:"+iRet);
    
    }
}
class Addtion1
{
  int addtion(int iValue1,int ivalue2)
  {
    int iAns=0;
    int iAns1=iValue1;
    int iAns2=ivalue2;
    iAns=iValue1 + ivalue2;
    return iAns;
  }
}

