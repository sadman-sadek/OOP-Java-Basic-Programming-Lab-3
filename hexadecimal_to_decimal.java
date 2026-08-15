import java.util.Scanner;

public class hexadecimal_to_decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = input.next();

        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Equivalent decimal number is: " + decimal);
    }
}