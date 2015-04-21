# design_patterns 
Bozana'a examples of the most common design patterns

# cmdPattern: command pattern
* HotTub, MusicPlayer, RoomLight - are imaginary 3rd party classes whose functinality 
    we want to invoke and which might have very different interface
* Command -> common interface around which we wrap 3rd party classes by implementing
    HotTubOnCommand, HotTubOffCommand, MusicPlayerOnCommand, MusicPlayerOffCommand,
    RoomLightOnCommand, RoomLightOffCommand, etc.
* RemoteController -> represents remote controller with a couple of buttons used to regulate
(turn on/off) liight, hottub, music
* MacroCommand -> MyMacroWhenIComeHomeCommand - wrapps around a couple of commands together:
    It turn on lights, turns on hot tub and plays music
* Main - entry point

# strategyPettern: strategy pattern 
* Character - abstract class; represents a game character
* King, Troll, Knight - implementation of Character. Each one implements fight method()
* Weapon - interface; prints whihc weapon is used
* AxeBehavoor, BowBehaviour, SwordBehviour - implementation of Weapon interface. 
* Wireing s done in spring integration file. Currently, King is wired to use sward, knight to use bow and troll to use axe.
