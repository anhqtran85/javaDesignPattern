package DesignPattern;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CensusOffice implements Observable {

	private int num;
	private LinkedList<City> cities = new LinkedList<City>();
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	public CensusOffice(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("office number must greater that 0 "
					+ "[" + i + "]");
		}
		this.num = i;
	}

	@Override
	public boolean addObserver(Observer observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean removeObserver(Observer observer) {
		
		return observers.remove(observer);
	}

	@Override
	public boolean hasObservers() {		
		return !observers.isEmpty();
	}
	

	public void report(City city) {
		this.cities.add(city);
		for (Observer o : observers) {
			o.update(this);
		}
	}

	public int getNumber() {
		return this.num;
	}

	public City getReported() {		
		return this.cities.isEmpty() ? null : cities.getLast();
	}

}
