import java.util.Scanner;

public class armstrong {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scan.nextInt();
        int sum=0;
        int backup=num;
        while(num!=0)
        {
            int digit=(num%10);
            sum=sum+digit*digit*digit;
            num=num/10;

        }
        if(backup==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
