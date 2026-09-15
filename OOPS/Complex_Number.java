package OOPS;

class Complex {
    int real;
    int img;
    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }
    static Complex add(Complex c1, Complex c2) {
        Complex result = new Complex(0,0);
        result.real = c1.real + c2.real;
        result.img = c1.img + c2.img;
        return result;
    }
    static Complex sub(Complex c1, Complex c2) {
        Complex result = new Complex(0,0);
        result.real = c1.real - c2.real;
        result.img = c1.img - c2.img;
        return result;
    }
    static Complex product(Complex c1, Complex c2) {
        Complex result = new Complex(0,0);
        result.real = (c1.real * c2.real) - (c1.img * c2.img);
        result.img = (c1.real * c2.img) + (c1.img * c2.real);
        return result;
    }
    public void printResult() {
        if (real == 0 && img != 0) {
            System.out.println(img+"i");
        }
        else if (real != 0 && img == 0) {
            System.out.println(real);
        }
        else {
            System.out.println(real+" "+img+"i");
        }
    }
}
public class Complex_Number {
    public static void main(String[] args) {
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(5,4);

        Complex result1 = Complex.add(c1,c2);
        Complex result2 = Complex.sub(c1,c2);
        Complex result3 = Complex.product(c1,c2);

        result1.printResult();
        result2.printResult();
        result3.printResult();
    }
}
