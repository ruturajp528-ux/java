import java.util.Scanner;

class OddNumberException extends Exception {

    OddNumberException(String message) {

        super(message);
    }
}

public class Experiment10 {

    static void calculateSquare(int num) throws OddNumberException {

        if (num % 2 != 0) {

            throw new OddNumberException(
                "Input number must be an even number."
            );
        }

        int square = num * num;

        System.out.println("Square of " + num + " = " + square);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EVEN NUMBER SQUARE =====");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {

            calculateSquare(num);

        } catch (OddNumberException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
