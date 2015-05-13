# Decorator Design Pattern

## Recipe:

1. Create abstract class that represents Component
2. Create concrete class that implements Comment's interface
3. Create Decorator abstract class that 'HAS-A' Component and 'IS-A' Component. (Will have the same interface as Component)
4. Create concrete decorators. Pass component to their c-tor. In their API, each decorator, needs to call API of the component *before* doing own job.
5. In the main(), you can define as many decorators as you want and you 'link' them by passing previous decorator in the c-tor of the current one. The end results: api of all 'linked' decorators will be invoked.