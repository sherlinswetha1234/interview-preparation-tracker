import java.util.Scanner;

public class ternary {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num1:");
        int num1=scan.nextInt();
        System.out.print("Enter the num2:");
        int num2=scan.nextInt();
        String a=num1>num2?"yes":"no";
        System.out.println(a);

        
    }
}
