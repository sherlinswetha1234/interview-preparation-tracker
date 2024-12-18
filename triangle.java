
import java.util.Scanner;

class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the isosceles triangle is: " + area);
    }
}
