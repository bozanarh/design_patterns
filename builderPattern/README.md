# Builder Design Pattern

## Recipe:

1. Create class that needs builder
2. Define static Builder class in the class which requires builder
3. For each parameter that builder needs to collect define setter method, but instead of void, let is always return Builder class.
4. define build() method. This method creates the object you need by calling its ctr and passing Build in it.
5. Define c-tor

## State transition diagram:
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/statePattern/stateTransitions.jpg)

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/statePattern/statePatternClass.jpg)
