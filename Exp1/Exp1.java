import java.util.Scanner;

class Experiment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            switch (marks / 10) {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("Fail");
                    break;

                case 4:
                    System.out.println("Pass");
                    break;

                case 5:
                    System.out.println("Second Class");
                    break;

                case 6:
                    System.out.println("First Class");
                    break;

                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Distinction");
                    break;
            }
        }

        sc.close();
    }
}
