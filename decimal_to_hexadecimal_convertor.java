import java.util.Scanner;

public class decimal_to_hexadecimal_convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int number = input.nextInt();

        String hexadecimal = Integer.toHexString(number).toUpperCase();

        System.out.println("Hexadecimal number is: " + hexadecimal);
    }
}