import java.util.Scanner;

public class Decimal_to_Binary_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int number = input.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary number is: " + binary);
    }
}