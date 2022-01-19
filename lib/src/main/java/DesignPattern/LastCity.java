package DesignPattern;



public class LastCity implements Observer {

	private City city;
	private CensusOffice office;
	
	@Override
	public void update(Observable observable) {
		if (observable instanceof CensusOffice) {
			this.office = (CensusOffice)observable;
			this.city = this.office.getReported();
		}
		

	}

	public City getLastCity() {		
		return this.city;
	}

	public CensusOffice getLastOffice() {	
		return this.office;
	}

}
