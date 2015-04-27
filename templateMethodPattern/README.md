# Template Method Design Pattern

## Recipe:

1. Create abstract class (Template method class)
    1. Define template method in it.
    2. Template method provides recipe for the functionality you want to offer. It contains other method calls.
    3. Methods that should never change should be define in base class as final. 
    4. Methods that must be overwritten in subclasses, should be defined as abstract.
    5. Hook serves to provide default implementation. Superclass may it re-define

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/templateMethodPattern/templateMethodPatternClass.jpg)
