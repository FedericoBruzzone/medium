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

Application subclass redefine an abstract CreateDocument operation on Application to return the appropriate Document subclass. Once an Application subclass is instantiated, it can then instantiate application-specific Documents without knowing their class. We call CreateDocument a factory method because it is responsible for "manufacturing" an object.

# Applicability

