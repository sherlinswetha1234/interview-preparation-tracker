import java.util.Scanner; 

class oddeven {
    public static void main(String[] args) {
        Scanner odd = new Scanner(System.in); 
        System.out.println("Enter the number: ");
        int a = odd.nextInt(); 
        if (a % 2 == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }
        odd.close();
    }
}

