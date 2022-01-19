package DesignPattern;

public class Plus extends BinaryOperator{
	
	public Plus(Term obj1, Term obj2) {
		super(obj1, obj2);
	}

	@Override
	public int getValue() {		
		return super.getLeft() + super.getRight();
	}
	
	
}
