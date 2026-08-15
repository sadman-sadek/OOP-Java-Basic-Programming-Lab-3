import java.util.Scanner;

public class octal_to_hexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a octal number : ");
        String octal = input.next();

        int decimal = Integer.parseInt(octal, 8);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Equivalent hexadecimal number: " + hexadecimal);
    }
}