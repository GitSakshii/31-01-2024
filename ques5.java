import java.util.Scanner;

public class ques5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        String ans=str.charAt(0)+"";
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i-1)==str.charAt(i))
            {
               continue;
            }
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}
