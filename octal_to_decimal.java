import java.util.Scanner;

public class octal_to_decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an Octal Number: ");
        String octal = input.next();

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Decimal Number: " + decimal);
    }
}