import java.util.Arrays;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("String1");
        String str1=sc.next();
        System.out.println("String2");
        String str2=sc.next();
        int n=str1.length();
        int m=str2.length();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(n!=m) System.out.println("False");

        else {
            String s1=String.valueOf(arr1);
            String s2=String.valueOf(arr2);
            if(s1.equals(s2)) System.out.println("True");

            else {
                System.out.println("False");
                System.out.println(2);
            }
        }
    }
}
