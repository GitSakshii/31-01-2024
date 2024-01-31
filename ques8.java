import java.util.Scanner;

public class ques8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        String ans=""+str.charAt(0);
        int cnt=1;
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                cnt++;
            }
            else {
                ans+=cnt;
                ans+=str.charAt(i);
                cnt=1;
            }
        }
        ans+=cnt;
        System.out.println(ans);
    }
}
