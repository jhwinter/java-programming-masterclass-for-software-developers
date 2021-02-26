package academy.learnprogramming;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.getReal() + real;
        this.imaginary = this.getImaginary() + imaginary;
    }

    public void add(ComplexNumber other) {
        this.add(other.getReal(), other.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real = this.getReal() - real;
        this.imaginary = this.getImaginary() - imaginary;
    }

    public void subtract(ComplexNumber other) {
        this.subtract(other.getReal(), other.getImaginary());
    }
}
