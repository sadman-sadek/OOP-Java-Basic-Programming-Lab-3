import java.util.Scanner;

public class binary_to_hexadecimal_convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binary = input.next();

        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("HexaDecimal value: " + hexadecimal);
    }
}