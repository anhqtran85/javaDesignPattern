package DesignPattern;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TopFiveCities implements Observer{
	private List<City> cities = new ArrayList<City>();
	
	@Override
	public void update(Observable observable) {
		if(observable instanceof CensusOffice) {
			CensusOffice office = (CensusOffice) observable;
			this.cities.add(office.getReported());
		}

	}

	public List<City> getTopFive() {
		Collections.sort(cities, new Comparator<City>() {
			public int compare(City c1, City c2) {
				if(c1.population < c2.population) {
					return 1;
				} else if(c1.population > c2.population) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		List<City> topFive = new ArrayList<City>();
		int top = cities.size() < 5 ? cities.size() : 5;
		for(int i = 0; i < top; i++) {
			topFive.add(cities.get(i));
		}
		return topFive;
	}

}
