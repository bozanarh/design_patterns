# State Design Pattern

## Recipe:

1. Create abstract State class
    1. For each action define abstract method (see: aFunc(), bFunc(), cFunc())
    2. Define StateContext property in the State (context)
2. Create concrete state classes (see StateOne, StateTwo, StateThree) that implement State API methods. (Some methods will have empty body), some will do some work. If an action transition object from one state to a new state, then call StateContext to transition the object into new state. Otherwise, to nothing.
3. Create StateContext class.
    1. Define currentState property in it. It points always to the current state.
    2. Define the same method APIs you have defined in State class and in their implementation call corresponding State API.

## State transition diagram:
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/statePattern/stateTransitions.jpg)

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/statePattern/statePatternClass.jpg)
