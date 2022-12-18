# Design Patterns - Introduction
## A summary of GoF Design Patterns

![Cover art © 1994 M.C. Escher / Cordon Art - Baarn - Holland. All right reserved.](https://github.com/FedericoBruzzone/medium/blob/main/Design%20Patterns%20%E2%80%8A-%E2%80%8A%20Introduction/img/1.jpeg)

<sup>Cover art © 1994 M.C. Escher / Cordon Art - Baarn - Holland. All right reserved.</sup>

Before I start talking about what are the design patterns I would like to dedicate a few words to this picture that you can see in the official cover of **Design Pattern - Elements of Reusable Object-Oriented Software.**

If you did not know who **Maurits Cornelis Escher** was, he was an one of the greatest artist of the twentieth century who made mathematically inspired woodcuts, lithographs, and mezzotints.

> His work features mathematical objects and operations including impossible objects, explorations of infinity, reflection, symmetry, perspective, truncated and stellated polyhedra, hyperbolic geometry, and tessellations.

Joking, the description above is extremely consistent with the thought you have when you are a beginner to design patterns.  I could talk for hours about what I think about this masterpiece but it is better to move on to the concrete, or rather to the abstract …

---

# Contents

- **What Is a Design Pattern?**
- **Describing Design Patterns**
- **The Catalog of Design Patterns**
- **Organizing the Catalog**
- **How Design Patterns Solve Design Problems**

---

# What is a Design Pattern?

Christofer Alexander says,

> "Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such way that you can use this solution a million times over, without ever doing it the same way twice" [AIS+77, page x]

Probably the best way to classify design patterns is to talk about their four main elements:

1. The **Pattern name** is simply the name that describe the pattern. Usually it is one or two word in relationship with their **Solution** and **Consequences**. Attributing a **Pattern name** we can use this to talk with our colleagues, write a documentation and many other thing without  ambiguity.

2. The **Problem** describes when we apply the pattern. It might be a representation such as how to implements an algorithm or data structure as an Object.

3. The **Solution** describes the elements that we should use to implements the design pattern. These elements could be related to themselves and the collaboration and responsibilities are more important.

4. The **Consequences** are the result and trade-off that the design patter should returns.

---

# Describing Design Pattern

**Design Pattern - Elements of Reusable Object-Oriented Software** book describe design patterns using a consistent format. Each pattern is divided into section according to the following template.

## Pattern Name and Classification

A good name is vital, because it will become part of your design vocabulary. The pattern's classification reflects the scheme I introduce in section **Organizing the Catalog.**

## Intent

Following question: What does the design pattern do? What is its rationale and intent? What particular design issue or problem does is address?

## Also Known As

Other well-known names for the pattern, if any.

## Motivation

A scenario that illustrate a design problem and how the class and object structures in the pattern solve the problem.

## Applicability

What are the situations in which the design pattern can be applied? What are example of poor designs that the pattern can address? How can you recognize these situations?

## Structure

A graphical representation of the classes in the pattern using a notation based on the Object Modeling Technique (OMT) [RBP+91]. I also use interaction diagrams [JCJO92, Boo94] to illustrate sequences of request and collaborations between object. 

## Participants

The classes and / or objects participating in the design pattern and their responsibilities.

## Collaborations

How the participants collaborate to carry out their responsibilities.

## Consequences

How does the pattern support its objectives? Whar are trade-offs and results of using pattern?

## Implementation

What pitfalls, hints, or techniques should you be aware of when implementing the pattern?

## Sample Code

Code fragments that illustrate how you might implement the pattern in C++ or Smalltalk.

## Known Uses

Example of the pattern found in real system.

## Related Patterns

When design pattern are closely related to this one?

---

# The Catalog of Design Patterns

- **Abstract Factory** - Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

- **Adapter** - Convert the interface of a class into another interface clients expect. Adapter lets classes work together that could not otherwise because of incompatible interfaces.

- **Bridge** - Decouple an abstraction from its implementation so that the two can very independently.

- **Builder** - Separate the construction of a complex object from its representation so that the same construction process can create different representations.

- **Chain of Responsibility** - Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving object and pass the request along the chain until an object handles it.

- **Command** - Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undo able operations.

- **Composite** - Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly

- **Decorator** - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

- **Facade** - Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

- **Factory Method** - Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

- **Flyweight** - Use sharing to support large numbers of fine-grained objects efficiently.

- **Interpreter** - Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

- **Iterator** - Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

- **Mediator** - Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

- **Memento** - Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

- **Observer** - Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

- **Prototype** - Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

- **Proxy** - Provide a surrogate or placeholder for another object to control access to it.

- **Singleton** - Ensure a class only has one instance, and provide a global point of access to it.

- **State** - Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

- **Strategy** - Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

- **Template Method** - Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

- **Visitor** - Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

---

# Organizing the Catalog

![Table 1.1: Design pattern space](https://github.com/FedericoBruzzone/medium/blob/main/Design%20Patterns%20%E2%80%8A-%E2%80%8A%20Introduction/img/2.png)

<sup>Table 1.1: Design pattern space</sup>

Design pattern vary in their granularity and level of abstraction. The classification helps you to learn the patterns in the catalog faster.

The book classify design pattern by two criteria (Table 1.1). The first criterion, called **purpose** reflects what a pattern does. Patterns can have either **creational**, **structural**, or **behavioral** purpose. Creational patterns concern the process of object creation. Structural patterns deal with the composition of classes or object. Behavioral patterns characterize the ways in which classes or objects interact and distribute responsibility.

The second criterion, called **scope**, specifies whether the pattern applies primarily to classes or to objects. Class patterns deal with relationship between classes and their subclasses. Object patterns deal with object relationship, which can be changed at run-time and are more dynamic.

---

# How Design Patterns Solve Design Problems

![Figure 1.1: Design pattern relationship](https://github.com/FedericoBruzzone/medium/blob/main/Design%20Patterns%20%E2%80%8A-%E2%80%8A%20Introduction/img/3.png)

<sup>Figure 1.1: Design pattern relationship</sup>