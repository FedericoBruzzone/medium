# Factory Method - Class Creational

## A summary of GoF Design Patters

![](https://github.com/FedericoBruzzone/medium/blob/main/Factory%20Method%20-%20Class%20Creational/img/cover.png)

By **Dmitry Zhart** ([refactoring.guru](https://refactoring.guru/))

# Intent

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

# Also Known As

Virtual Constructor

# Motivation

![](https://github.com/FedericoBruzzone/medium/blob/main/Factory%20Method%20-%20Class%20Creational/img/1.png)


Framework use abstract classes to define and maintain relationship between objects. A framework is often responsible for creating these objects as well. 

Consider a framework for applications that can present multiple documents to the user. Two key abstractions in this framework are the classes Application and the Document. Both classes are abstract, and clients have to subclass them to realize their application-specific implementations. The Application class is responsible for managing Documents and will create them as required.

Because the particular Document subclass to instantiate is application-specific, the Application class can't predict the subclass of Document to instantiate - the Application class only knows *when* a new document should be created, not *what kind* of Document to create.

The Factory Method pattern offers a solution. It encapsulates the knowledge of which Document subclass to create and moves this knowledge out of the framework.

Application subclass redefine an abstract CreateDocument operation on Application to return the appropriate Document subclass. Once an Application subclass is instantiated, it can then instantiate application-specific Documents without knowing their class. We call CreateDocument a **factory method** because it is responsible for "manufacturing" an object.

# Applicability

Use the Factory Method pattern when

- a class can't anticipate the class of obejcts it must create.

- a class wants its subclasses to specify the objects it creates.

- classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate.

# Structure

![](https://github.com/FedericoBruzzone/medium/blob/main/Factory%20Method%20-%20Class%20Creational/img/2.png)

# Participants

## Product

*(Document)*

- defines the interface of objects the factory method creates. 

## ConcreteProduct

*(MyDocument)*

- implements the Product interface

## Creator

*(Application)*

- declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.

- may call the factory method to create a Product object.

## ConcreteCreator

*(MyApplication*)

- overrides the factory method to return an instance of a ConcreteProduct.

# Collaborations

- Creator relies on its subclasses to define the factory method so that it returns an instance of the appropriate ConcreteProduct.

# Consequences

Factory methods eliminate the need to bind application-specific classes into your code. The code only deals with the Product interface; therefore it can wok with any user-defined ConcreteProduct classes.

A potential disadvantage of factory methods is that clients might have to subclass a Creator classes just to create a particular ConcreteProduct object.

Here are two additional consequences of the Factory Method pattern:

1. *Provides hooks for subclasses*. Creating objects inside a class with a factory method is always more flexible than crating an object directly. Factory method gives subclasses a hook for providing an extend version of an object.

2. *Connects parallel class hierarchies*. Parallel class hierarchies result when a class delegates some of its responsibilities to a separate class. Consider graphical figures that can be manipulated interactively; that is, thay can be stretched, moved, or rotated using the mouse. Implementing suh interactions ins't always easy. It often requires storing and updating information records the state of the manipulation. This state is needed only during manipulation.

With this constraints, it's better to use separate Manipulator object that implements the interaction and keeps track of any manipulation-specific state that's needed.

![](https://github.com/FedericoBruzzone/medium/blob/main/Factory%20Method%20-%20Class%20Creational/img/3.png)

The Figure class provides a CreateManipulator factory method that lets client create a Figure's corresponding Manipulator. Figure subclasses override this method to return an instance of the Manipulator subclass that's right for them. Alternatively, the Figure class may implement CreateManipulator to return a default Manipulator instance, and Figure subclasses may simply inherit default. 

Notice how the factory method defines the connection between the two class hierarchies. It localize knowledge of which classes belong together.

