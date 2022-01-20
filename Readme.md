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
- Term is the super-type of class Number which holds an integer and composite classes UnaryOperator and BinaryOperator, which hold one and two Term objects, respectively. Factorial is a concrete UnaryOperator class and Times and Plus are concrete BinaryOperator classes
- UnaryOperator receives a Term object. Throw illegal argument exception if the term is null 
- BinaryOperator receive two Term objects. Throw illegal argument exception if either term is null or both appropriate
- Factorial receives term object. Throw illegal argument exception if the term is negative. Return the factorial component object it holds
- Number receive an integer number and return the value of the number it holds 
- Plus and Time receive two term objects and return the addition and multiplication (respectively) of the component objects they hold
- All files need to pass TermTest.java

### Iterator
- Given FibinacciTest.java
- Write an iterable class Fibonacci which generate the Fibonacci sequence. The class implements one method iterator() return an iterator object when requested through its method next()
- Can not use any arrays and collections for this class (ArrayList). This program should calculate the next result when the method next() is invoked
