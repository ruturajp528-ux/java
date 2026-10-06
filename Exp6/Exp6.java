import java.util.Scanner;

class MatrixManipulator {

    static double[][] A, B;
    static int rowsA, colsA;

    static double[][] readMatrix(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        double[][] m = new double[r][c];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextDouble();
            }
        }

        return m;
    }

    static void displayMatrix(double[][] m) {

        System.out.println("\nMatrix:");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%.2f\t", m[i][j]);
            }
            System.out.println();
        }
    }

    static double[][] flipHorizontal(double[][] m) {

        int r = m.length, c = m[0].length;
        double[][] res = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = m[i][c - 1 - j];
            }
        }

        return res;
    }

    static double[][] flipVertical(double[][] m) {

        int r = m.length, c = m[0].length;
        double[][] res = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = m[r - 1 - i][j];
            }
        }

        return res;
    }

    static double[][] addMatrix(double[][] a, double[][] b) {

        int r = a.length, c = a[0].length;
        double[][] res = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        return res;
    }

    static double[][] multiplyMatrix(double[][] a, double[][] b) {

        int r = a.length;
        int c = b[0].length;
        int k = a[0].length;

        double[][] res = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int x = 0; x < k; x++) {
                    res[i][j] += a[i][x] * b[x][j];
                }
            }
        }

        return res;
    }

    static double[][] invertMatrix(double[][] m) {

        double det = m[0][0] * m[1][1]
                   - m[0][1] * m[1][0];

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    static void printMenu() {

        System.out.println("\n=================================");
        System.out.println("       MATRIX MANIPULATOR");
        System.out.println("=================================");
        System.out.println("1. Read Matrix A");
        System.out.println("2. Display Matrix A");
        System.out.println("3. Flip Matrix A Horizontally");
        System.out.println("4. Flip Matrix A Vertically");
        System.out.println("5. Add Matrix A and B");
        System.out.println("6. Multiply Matrix A and B");
        System.out.println("7. Invert Matrix A");
        System.out.println("8. Exit");
        System.out.println("=================================");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            printMenu();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    A = readMatrix(sc);
                    rowsA = A.length;
                    colsA = A[0].length;

                    System.out.println("\nMatrix A created successfully!");
                    displayMatrix(A);
                    break;

                case 2:
                    displayMatrix(A);
                    break;

                case 3:
                    System.out.println("\nMatrix A after horizontal flip:");
                    displayMatrix(flipHorizontal(A));
                    break;

                case 4:
                    System.out.println("\nMatrix A after vertical flip:");
                    displayMatrix(flipVertical(A));
                    break;

                case 5:
                    System.out.println("\nEnter Matrix B:");
                    B = readMatrix(sc);

                    System.out.println("\nMatrix A:");
                    displayMatrix(A);

                    System.out.println("\nMatrix B:");
                    displayMatrix(B);

                    System.out.println("\nA + B:");
                    displayMatrix(addMatrix(A, B));
                    break;

                case 6:
                    System.out.println("\nEnter Matrix B:");
                    B = readMatrix(sc);

                    System.out.println("\nMatrix A:");
                    displayMatrix(A);

                    System.out.println("\nMatrix B:");
                    displayMatrix(B);

                    System.out.println("\nA x B:");
                    displayMatrix(multiplyMatrix(A, B));
                    break;

                case 7:
                    System.out.println("\nMatrix A:");
                    displayMatrix(A);

                    System.out.println("\nInverse of Matrix A:");
                    displayMatrix(invertMatrix(A));
                    break;

                case 8:
                    System.out.println("\nProgram terminated. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);
    }
}
