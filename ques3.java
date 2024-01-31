import java.util.Scanner;

public class ques3 {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        String g="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
              g=g+str.charAt(j);
                System.out.println(g);
            }
            g="";
        }
    }
}
