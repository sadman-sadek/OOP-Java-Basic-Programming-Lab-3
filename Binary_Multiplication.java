import java.util.Scanner;

public class Binary_Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String binary1 = input.next();

        System.out.print("Input the second binary number: ");
        String binary2 = input.next();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int product = num1 * num2;

        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
    }
}