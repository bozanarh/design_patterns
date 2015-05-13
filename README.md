##Bozana's examples of the most common design patterns

### [State Pattern - Behavioral Pattern](https://github.com/bozanarh/design_patterns/blob/master/statePattern)

**State Pattern** - an object changes behavior when its internal state changes. So, it appears like the object class has changed. 

We implement this pattern by creating concrete objects for each state. All of them implement the same interface. So, when behavior needs to change, we just swap one concrete instance (state) with another.

### [Command Pattern -Behavioral Pattern](https://github.com/bozanarh/design_patterns/blob/master/cmdPattern)

**Command Pattern** - encapsulates request (methods) as an object which lets you parametrize clients with different requests.

We implement this pattern by creating command interface and concrete class that implements this interface. Then we bind (associate) this class with the final receiver and we map Concrete Command methods to corresponding final receiver methods.


### [Strategy Pattern - Behavioral Pattern](https://github.com/bozanarh/design_patterns/blob/master/strategyPattern)

**Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable

We implement this pattern by extracting things that vary from common code. Then for each thing that vary we define behavior. We make those behavior interchangeable by defining common interface.

### Singleton Pattern - Creational Pattern

**Singleton Pattern** ensures that class has only one instance and it provides a global entry point of access to the instance

### [ Template Method Pattern - Behavioral Pattern](https://github.com/bozanarh/design_patterns/blob/master/templateMethodPattern)

**Template Method Pattern** defines skeleton of an algorithm, but lets subclasses to implement or redefine some steps.

### [ Builder Pattern - Creational Pattern ](https://github.com/bozanarh/design_patterns/blob/master/builderPattern)

**Builder Pattern** is used to construct complex objects which would otherwise require too many constructor arguments to be passed, or too many setter methods to be invoked.

### [ Decorator Pattern - Structural Pattern ](https://github.com/bozanarh/design_patterns/blob/master/decoratorPattern)

**Decorator Pattern** is used to attach additional responsibilities to an object dynamically. It achieves this through Decorator class which mirrors type of components it decorates.

