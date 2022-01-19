package DesignPattern;

import java.util.Iterator;

public class Fibonacci implements Iterable<Long>{
	public Fibonacci () {
	}

	@Override
	public Iterator<Long> iterator() {
		return new Iterator<Long>() {
			private Long currentValue = 1L;
			private Long previousValue = 0L;
			private int index = 0;
			
			@Override
			public boolean hasNext() {				
				return true;
			}

			@Override
			public Long next() {
				if(index == 0) {
					index++;
					return 1L;
				} else {
					Long tempValue = currentValue;
					currentValue = previousValue + currentValue;
					previousValue = tempValue;
					return currentValue;
				}					
			}
		};	
	
	}
}
