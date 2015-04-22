# State Design Pattern

## How to do it?

1. Create abstract State class
    1. For each action define abstract method [APIs]
    2. Define StateContext property in it and its setters/getters
2. Create concrete state classes (subclasses) that implement State API methods. (Some methods will have empty body), some will do a work. When done, they should call StateContext to transition to another state.
3. Create StateContext class.
    1. Define currentState in it.
    2. Define the same method APIs that you have defined in State class and in their implementation call corresponding State API.

## State transition diagram:
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/statePattern/stateTransitions.jpg)

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/statePattern/statePatternClass.jpg)
