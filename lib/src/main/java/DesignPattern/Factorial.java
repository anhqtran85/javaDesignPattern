package DesignPattern;

public class Factorial extends UnaryOperator {
		
	public Factorial(Term obj) {
		super(obj);
		if (super.getTerm() <= 0) {
			throw new IllegalArgumentException("negative value: " + super.getTerm());
		}
	}
	
	public int getValue() {
		
		int result = 1;
		for (int i = 2; i<= super.getTerm(); i++) {
			result *= i;
		}
		return result;
	}	
	
}




