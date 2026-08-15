import java.util.Scanner;

public class binary_to_octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binary = input.next();

        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number: " + octal);
    }
}