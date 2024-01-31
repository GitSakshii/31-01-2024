import java.util.Scanner;

public class ques7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int [] arr=new int[26];
        int max=0;
        char ans=' ';
        for(int i=0;i<n;i++)
        {
            arr[str.charAt(i)-97]++;
            if(arr[str.charAt(i)-97]>max)
            {
                max=arr[str.charAt(i)-97];
                ans=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
