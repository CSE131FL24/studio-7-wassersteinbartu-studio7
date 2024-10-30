package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex() {
		real = 0.0;
		imaginary = 0.0;
	}
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public double getImaginary() {
		return this.imaginary;
	}
	
	public Complex add(Complex c1) {
		this.real = this.real + c1.getReal();
		this.imaginary = this.imaginary + c1.getImaginary();
		return this;
	}
	
	public Complex multiply(Complex c1) {
		double temp = this.real;
		this.real = (this.real*c1.getReal())-(this.imaginary*c1.getImaginary());
		this.imaginary = (temp*c1.getImaginary())+(this.imaginary*c1.getReal());
		return this;
	}
	
	
	public static void main(String[] args) {
		Complex c1 = new Complex(2, 4);
		Complex c2 = new Complex(1, 3);
		
		c1.multiply(c2);
		System.out.println(c1.getReal() + " + " + c1.getImaginary() + "i");
	}

}
