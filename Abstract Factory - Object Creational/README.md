# Abstract Factory - Object Creational

## A summary of GoF Design Patters

---

# Intent

Provide an interface for creating families of related or dependent objects without specifying their concrete class.

# Also Known As

Kit

# Motivation

![](https://github.com/FedericoBruzzone/medium/blob/main/Abstract%20Factory%20-%20Object%20Creational/img/1.png)

Consider a user interface toolkit that supports multiple look-and-feel standards. Different look-and-feel define different appearances and behaviors for user interface "widgets" like scroll vars, windows, and buttons. Instantiating look-and-feel-specific classes of widgets throughout the application makes it hard to change the look and feel later.

We can solve this problem by defining an abstract WidgetFactory class that declares an interface for creating each basic kind of widget. There is also an abstract class for each kind of widget, and concrete subclasses implement widgets for specific look-and-feel standards. WidgetFactory's interface has an operation that returns a new widget object for each abstract widget class. Clients call these operations to obtain widget instances.

There is a concrete subclass of WidgetFactory for each look-and-feel standard. Client create widgets solely through the WidgetFactory interface and have no knowledge of the classes that implement widget for a particular look and feel.

A WidgetFactory also enforces dependencies between the concrete widget classes. A **Dummy** scroll bar should be used with a **Dummy** button and a **Dummy** text editor, and that constraint is enforced automatically as a consequence of using a **DummyWidgetFactory**.

# Applicability 

Use the Abstract Factory pattern when

- a system should be independent of how its product are created, composed, and represented.

- a system should be configured with one of multiple families of products.

- a family of related product objects is designed to be used together, and you need to enforce this constraint.

- you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.

# Structure

![](https://github.com/FedericoBruzzone/medium/blob/main/Abstract%20Factory%20-%20Object%20Creational/img/2.png)

# Participants

## AbstractFactory

*(WidgetFactory)*

- declares an interface for operations that create abstract product objects.

## ConcreteFactory

*(DummyWidgetFactory, TWidgetFactory)*

- implements the operations to create concrete product objects.

## AbstractProduct

*(Window, ScrollBar)*

- declares an interface for a type of product obejct.

## ConcreteProduct

*(DummyWindow, DummyScrollBar)*

- defines a product object to be created by the corrisponding concrete factory.

- implements the AbstractProduct interface.

## Client

- uses only interfaces declared by AbstractFactory and AbstractProduct classes.

# Collaborations

- Normally a single instance of a ConcreteFactory class is created at run-time. This concrete factory creates product objects having a particular implementation. To create different product objects, clients should use a different concrete factory.

- AbstractFactory defers creation of product objects to its ConcreteFactory subclass.

# Consequences

The Abstract Factory pattern has the following benefits and liabilities:

1. *It isolates concrete classes.* The abstract Factory pattern help you control the classes of object than an application creates. Clients manipulate instances through their abstract interfaces.

2. *It makes exchanging product families easy.* The class of concrete factory appears only once in an application - that is, where it's instantiated. This makes it easy to change the concrete factory an application uses.

3. *It promotes consistency among products.* When product objects in a family are designed to work together, it is important that an application use objects from only one family at a time. AbstractFactory makes this easy to enforce.

4. *Supporting new kind of products is difficult.* Extending abstract factories to produce new kinds of Products is not easy. Supporting new kinds of products requires extending the factory interface, which involves changing the AbstractFactory class and all of its subclasses. (Solution in the next section)

# Implementation

Here are some useful techniques for implementing the Abstract Factory pattern.

1. *Factories as singletons.* An application typically needs only one instance of a ConcreteFactory per product family.

2. *Creating the products.* AbstractFactory only declares an *interface* for creating products. It's up to ConcreteProduct subclasses to actually create them. The most common way to do this is to define a factory method for each product. A concrete factory will specify  its products by overriding the factory method for each. While this implementation is simple, it requires a new concrete factory subclass for each product even if the product families differ only slightly. In many product families are possible, the concrete factory can be implemented using Prototype pattern.

3. *Defining extensible factories.* AbstractFactory usually defines a different operation for each kind of product it can produce. Adding a new kind of product requires changing the AbstractFactory interface and all the classes that depends on it. A more flexible but less safe design is to add a parameter to operations that create objects. This parameter specifies the kind of object to be created.

An inherent problem remains: All products are returned to the client with the same abstract interface as given by the return type. The client will not be able to differentiate of make safe assumption about the class of a product. The client could perform a downcast, that is not always feasible of safe, because the downcasting can fail.

# Sample Code