# Strategy Design Pattern
## Design Pattern
    there are recurring problems for which the expertise people has identified or computed solution that can be applied in solving the problem, under the give context/circumstances is called design pattern
## Strategy design pattern
The strategy design pattern has provided 3 standard rules/guidelines that should be followed in writing classes in our application so that our classes will become better
- Favour composition over inheritance 
- Always design to interfaces, never design to concreate classes 
- code should be open for extension and should be closed for modification

1. favor composition over inheritance
   A class can reuse the functionality of another class in 2 ways
   1. inheritance
   2. composition

i. Inheritance

    Inheritance is a mechanism through which a class can acquire/reuse the functionality of another class. When we use inheritance all the traits of another class will become part of our class. Inheritance always established IS-A relationship between the classes.
    
    There are #2 thumb rules based on which we need to decide whether a class can reuse the functionality of another class via Inheritance or not
    
    if we want to use all the traits of another class in our class
    if we can express or represent our class onbehalf the another classthen we can establish inheritance relationship between the classes
    
 ii. Composition
 
    If we want to use partially the functionality of other class within our class then we need to use Composition.
    For eg..
    A Radio class will use the functionality of an Transmitter, but a Radio cannot be substituted in place of Transmitter so a Radio should use the functionality of a Transmitter using composition Radio has a Transmittor, but Radio is not an Transmitter

### Limitation of Inheritance 
1. Most of the realtime usecases are solvable through composition rather than inheritance, because a class wants to use only few of the functionalities of another class, very rarely a class wants to reuse all the functionalities of another class. So in such case we need to use composition only

2. Many programming languages doesnt support multiple inheritance, due to which if a class has to use functionality of multiple other class, we need to must and should use composition only

3. inheritance makes the classes more fragile whereas if we use composition the class will become less fragile
   In case of inheritance if there is a change in super class, it not only affects the sub-class, along with that it affects all the other classes which are using the subclass as well.
   In case of composition if there is a change in dependent class, it only affects the class using which is using the functionality, but will not affect or atleast can be controllable to not to affect other class of our application.

4. Inheritance doesnt support testability of the code, where as composition makes the classes easily testable