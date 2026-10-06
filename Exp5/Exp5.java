class Complex {

    int real, imaginary;

    Complex() {
        real = 0;
        imaginary = 0;
    }

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void show() {
        System.out.println(real + " + " + imaginary + "i");
    }

    Complex sum(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    public static void main(String args[]) {

        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 4);
        Complex c3 = new Complex();

        System.out.print("Complex number A: ");
        c1.show();

        System.out.print("Complex number B: ");
        c2.show();

        c3 = c3.sum(c1, c2);

        System.out.print("Sum of A and B: ");
        c3.show();
    }
}
