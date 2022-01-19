package DesignPattern;

public class UnaryOperator implements Term{

	private int one;
	
	public UnaryOperator(Term obj) {
		if (obj == null) {
			throw new IllegalArgumentException("Term cannot be null");
		}
		this.one = obj.getValue();
		
	}
	
	public int getTerm() {
		return this.one;
	}

	@Override
	public int getValue() {		
		return 0;
	}

}
