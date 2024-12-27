import java.util.Scanner;

public class mark {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark>35){
        System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
