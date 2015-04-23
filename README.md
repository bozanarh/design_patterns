# design_patterns 
Bozana's examples of the most common design patterns

# State Pattern - Behavioral Pattern (see statePattern folder)

**State Pattern** - an object changes beahviour when its internal state changes. So, it appears like the object class has changed. 

We implement this pattern by creationg concrete objects for each state. All of them implement the same interface. So, when behavoir needs to change, we just swap one concrete instance (state) with another.

# Command Pattern -Behavioral Pattern (see cmdPattern folder)

**Command Pattern** - encapsulates request (methods) as an object which lets you parametrize clients with different requests.

We implement this pattern by creating comamnd interface and concrete class that implements this interface. Then we bind (associate) this class with the final receiver and we map Concrete Command methods to corresponding final reciver methods.


# Strategy Pattern - Behavioural Pattern (see strategyPattern folder)

**Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangable

We implement this pattern by extracting things that vary from common code. Then for each thing that vary we define behaviour. We make those bahaviour enterchangable by defining common interface.


