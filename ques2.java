import java.util.Scanner;

public class ques2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int isp=0;
        for(int i=0;i<n;i++){
           if( str.charAt(i)!=str.charAt(n-i-1))
           {
               System.out.println("False");
               isp=1;
               break;
           }
        }
        if(isp==0)
        {
            System.out.println("True");
        }
    }
}
