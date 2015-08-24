# Iterator Design Pattern

## Purpose:
- To encapsulate iteration, so if you have one or more Objects you need to iterrate through that you can create common functianality to do it

## Recipe:

1. Create common interface for classes whose elements need to be iterrated (e.g. Menu is common interafface for PancakeHouseMenu and DinerMenu).
2. Define createIterator() method in the interface. The method return Iterator.
3. Create Iterator interface and define methods next() and hasNext()
4. Create concreate Iterator classes for each concreate class you defined in (1). For example: PancakeHouseMenuIterator and DinerMenuIterator
5. In each concreate implementation of (1) implement createIterator() interface. The method creates concreate instances of (4)

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/iteratorPattern/iteratorPatternClass.jpg)
