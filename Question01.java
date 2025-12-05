import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float  radius = scanner.nextFloat();
        System.out.printf("The area of the circle is: %.2f", radius*radius*3.14);
    }
}
