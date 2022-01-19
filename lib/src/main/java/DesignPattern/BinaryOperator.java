package DesignPattern;

public class BinaryOperator implements Term{

	private int left;
	private int right;
	public BinaryOperator(Term obj1, Term obj2) {
		if (obj1 == null) {
			throw new IllegalArgumentException("Left term cannot be null");
		}
		if (obj2 == null) {
			throw new IllegalArgumentException("Right term cannot be null");
		}
		this.left = obj1.getValue();
		this.right = obj2.getValue();
	}
	public int getLeft() {
		return this.left;
	}
	public int getRight() {
		return this.right;
	}
	@Override
	public int getValue() {		
		return 0;
	}

}
