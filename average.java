import java.util.Scanner;
class average{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the mark of sub1:");
        int sub1=scan.nextInt();
        System.out.print("Enter the mark of sub2:");
        int sub2=scan.nextInt();
        System.out.print("Enter the mark of sub3:");
        int sub3=scan.nextInt();
        System.out.print("Enter the mark of sub4:");
        int sub4=scan.nextInt();
        System.out.print("Enter the mark of sub5:");
        int sub5=scan.nextInt();
        int add=(sub1+sub2+sub3+sub4+sub5);
        System.out.println(add);
         int average=add/5;
         if (average<35){
            System.out.println("Additional class is required");
         }
         else{
            System.out.println("YOU are good to go");
         }
 }

}