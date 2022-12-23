# Abstract Factory - Object Creational

## Intent

Provide an interface for creating families of related or dependent objects without specifying their concrete class.

## Motivation

![](https://github.com/FedericoBruzzone/medium/blob/main/Abstract%20Factory%20-%20Object%20Creational/img/1.png)

Consider a user interface toolkit that supports multiple look-and-feel standards. Different look-and-feel define different appearances and behaviors for user interface "widgets" like scroll vars, windows, and buttons. Instantiating look-and-feel-specific classes of widgets throughout the application makes it hard to change the look and feel later.

We can solve this problem by defining an abstract WidgetFactory class that declares an interface for creating each basic kind of widget. There is also an abstract class for each kind of widget, and concrete subclasses implement widgets for specific look-and-feel standards. WidgetFactory's interface has an operation that returns a new widget object for each abstract widget class. Clients call these operations to obtain widget instances.

There is a concrete subclass of WidgetFactory for each look-and-feel standard. Client create widgets solely through the WidgetFactory interface and have no knowledge of the classes that implement widget for a particular look and feel.

A WidgetFactory also enforces dependencies between the concrete widget classes. A **Dummy** scroll bar should be used with a **Dummy** button and a **Dummy** text editor, and that constraint is enforced automatically as a consequence of using a **DummyWidgetFactory**.