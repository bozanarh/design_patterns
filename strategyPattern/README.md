# Strategy Design Pattern

## Recipe:

1. Create abstract Context class (see: Character)
2. Extract things that vary into Strategy interface (see: WeponBehaviour)
3. Provide concrete implementations for the Strategy (see: SwordBehavior, AxeBehavior, BowBehavior)
4. Create concrete implementations of Context class (see: King, Knight, Troll) and associate them with the Strategy you want to use. 

## Example
Create Troll, King and Knight objects and associate weapon: axe, bow and award to then such way that weapon are interchangeable (they can easily swap weapon they have).

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/strategyPattern/strategyPatternClass.jpg)
