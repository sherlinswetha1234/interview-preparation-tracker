import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
        { 
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the num:");
            int num=scan.nextInt();
            int rev=0;
            int backup=num;

            while(num!=0)
            {
                rev=rev*10+num%10;
                num=num/10;
            }
            System.out.println(rev);
            System.out.println(num);
            if(backup==rev){
                System.out.print("Its a palindrome");
            }
            else{
                System.out.print("It's not a palindrome");
            }
        }
    
}
