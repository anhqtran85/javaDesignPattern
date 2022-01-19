package DesignPattern;

public class Number implements Term {
	private int number;
	public Number(int number) {
		this.number = number;
	}
	@Override
	public int getValue() {
		
		return this.number;
	}
	
}
