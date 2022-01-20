## Design Pattern

### Observer
- Given files: Observable.java, Observer.java, City.java, CensusOfficeTest.java
- Write CensusOffice.java implement interface Observable 
- Write LastCity and TopFiveCities both implement interface Observer
- Each census office has a number grater than 0 and receives city population reports using objects of class City
- Census offices notify registered observers every time city data is reported when call report() method
- LastCity observers keep track of the last city reported and TopFiveCities keep track of the five cities with the highest population counts
- LastCity has getter methods getLastCity() return last city and getLastOffice() return the office that notified the last city data received
- TopFiveCities implements a getter method getTopFive() return a list of 5 top cities (in terms of population). The list need to be sorted from high to low. The return list need to be a copy of the list kept by observer
- CensusOffice has constructor receive its number (throw illegal argument exception if number is lower or equal to 0). Getter methods getNumber() to retrieve the office's number and getReported() to retrieve the most recently reported city, and setter method report() that receives a new reported City object
- All files need to pass CensusOfficeTest.java 

### Composite
- Given Term.java, TermTest.java
- 