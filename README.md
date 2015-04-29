# Builder Design Pattern

## Recipe:

1. Create class that needs builder (Pizza)
2. Create static inner class (PizzaBuilder), so we can instantiate this class without outer class.
3. In the inner class (PizzaBuilder), define all paramters it needs (e.g. dough, souce, etc). For each parameter define the same method. The method should save the parameter and sreturn 'this' (this of PizzaBuilder).
4. In the inner class (PizzaBuilder) create build method. This method should create outer class and call its constructor (Pizza(PizzaBuilder builder);
5. In the main function, create PizzaBuilder, and call its method to collect all parameters.
6. When all parameters are collected, call build() method on PizzaBuilder. It will return Pizza object
7. Now, Pizza object is ready.
