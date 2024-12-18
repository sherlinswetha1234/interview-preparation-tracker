import java.util.Scanner;
class leapyear {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int year=scanner .nextInt();
        if ((year%4==0 && year%100!=0 )|| year%400==0){
            System.out.println("leap year"+year);
        }
            else
            {
            System.out.println("not an leap year");
            }

        }
    }
    

