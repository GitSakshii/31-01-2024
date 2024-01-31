import java.util.Scanner;

public class ques1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cnt=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')cnt++;
        }
        System.out.println("Output:"+cnt);

    }
}
