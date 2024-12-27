import java.util.Scanner;

public class reverse {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scan.nextInt();
        while(num!=0){
        System.out.print(num%10);
            num=num/10;
        }
    }
    
}
