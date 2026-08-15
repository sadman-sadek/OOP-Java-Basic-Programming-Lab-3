import java.util.Scanner;

public class binary_to_decimal_convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binary = input.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal Number: " + decimal);
    }
}