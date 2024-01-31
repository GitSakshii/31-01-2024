import java.util.Scanner;

public class ques6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        System.out.println("Enter character to be removed");
        char x=sc.next().charAt(0);
        String ans="";
        for(int i=0;i<n;i++)
        {
          if(str.charAt(i)!=x)
          {
              ans+=str.charAt(i);
          }
        }
        System.out.println(ans);
    }
}
