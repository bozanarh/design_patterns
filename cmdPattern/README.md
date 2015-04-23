# Command Design Pattern

## Recipe:

1. Create Command interface with one method only: *execute()*
2. Create concrete command classes (see *HotTubOnCommand*, *MusicPlayerOnCommand*, *RoomLightOnCommand*, etc.)
3. In each concrete class, define a property that points to the real receiver. For example: In *RoomLightOnCommand* have a property that points to *Light*.
4. Implement *execute()* method in concrete command classes so the it calls corresponding APIs on the receiver(s).
4. Create command invoker (see: RemoteController) and in it associate each concrete command implementation with the action. 

##Example:

I want to implement remote controller that has bunch of buttons to remotely control my room light, music player, hot-tub. Those object might be 3rd party objects whose implementation I may not know or understand and the only thing I know is interface I can call. I may not have 1-to-1 mapping between 3rd party APIs and buttons on my remote player. So, I need to map those APIs to my command API in my command implementations (RoomLightOnCommand, HotTubOnCommand, MusicPlayerOnCommand).

## Class diagram
![alt tag](https://github.com/bozanarh/design_patterns/blob/master/cmdPattern/cmdPatternClass.jpg)
