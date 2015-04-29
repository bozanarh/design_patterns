# Builder Design Pattern

## Recipe:

1. Create outer class (Pizza) that needs builder
2. Create static builder class (PizzaBuilder) in the same file (Pizza.java). This way we can instantiate the inner class (PizzaBuilder) without outer class (Pizza.java)
3. For each parameter that builder needs to collect define setter method that has the same name as parameter, but instead of void, let is always return 'this'.
4. In static inner class (PizzaBuilder) define build() method. This method creates the outer class (Pizza) by calling its ctr and passing builder to it.
5. Create outer class c-tor and in it collect all data you need from the builder (PizzaBuilder).

