import java.util.Scanner;
class nameageaddress {
    public static void main(String args[])
    {
    Scanner she=new Scanner(System.in);
    String name=she.nextLine();
    int age=she.nextInt();
    she.nextLine();
    String address=she.nextLine();
    System.out.println("MY name is"+name);
    System.out.println("My age is"+age);
    System.out.println("my address is"+address);
}
}