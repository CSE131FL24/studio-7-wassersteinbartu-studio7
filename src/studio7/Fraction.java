package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 0;
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public Fraction add(Fraction f1) {
		if (denominator == f1.getDenominator()) {
			this.numerator = this.numerator + f1.getNumerator();
		} else {
			this.numerator = (this.numerator*f1.getDenominator()) + (f1.getNumerator()*this.denominator);
			this.denominator = this.denominator*f1.getDenominator();
		}
		return this;
	}
	
	public void reciprocal() {
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;
	}
	
	public Fraction multiply(Fraction f1) {
		this.numerator = this.numerator*f1.getNumerator();
		this.denominator = this.denominator*f1.getDenominator();
		return this;
	}
	
	public void simplify() {
		for (int i = this.denominator; i > 0; i--) {
			if (this.denominator%i == 0 && this.numerator%i == 0)  {
				this.denominator = this.denominator/i;
				this.numerator = this.numerator/i;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(40, 100);
		Fraction f2 = new Fraction(1, 4);
		
		f1.add(f2);
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
		
		f1.multiply(f2);
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
		
		f1.reciprocal();
		f1.simplify();
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
	}

}
