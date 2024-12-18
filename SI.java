import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter principal amount (P): ");
        int p = scanner.nextInt(); 
        System.out.print("Enter rate of interest (R): ");
        int r = scanner.nextInt(); 
        System.out.print("Enter time (T in years): ");
        int t = scanner.nextInt(); 
        int simple = (p * r * t) / 100; 
        System.out.println("Simple Interest (SI): " + simple); 
    }
}
