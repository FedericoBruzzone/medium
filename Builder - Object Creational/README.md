# Builder - Object Creational

## A summary of GoF Design Patters

![](https://github.com/FedericoBruzzone/medium/blob/main/Builder%20-%20Object%20Creational/img/cover.png)

By **Dmitry Zhart** ([refactoring.guru](https://refactoring.guru/))

---

# Intent

Separate the construction of a complex object from its representation so that the same construction process can create different representation.

# Also Known As

...

# Motivation

![](https://github.com/FedericoBruzzone/medium/blob/main/Builder%20-%20Object%20Creational/img/1.png)

A reader for the RTF (Rich Text Format) document exchange format should be able to convert RTF to many text formats. The problem is the number of possible conversions is open-ended.

A solution is to configure the RTFReader class with TextConverter object that converts RTF to another textual representation. As the RTFReader perses the RTF document, it uses the TextConverter to perform the conversion. Whenever the RTFReader recognizes an RTF token, it issues a request to the TextConverter to convert the token.

Subclasses of TextConverter specialize in different conversions and formats. For example, ASCIIConverter ignores requests to convert anything except plain text.

Each kind of converter class takes the mechanism for creating and assembling a complex object and puts it behind an abstract interface. The converter is separate from the reader.

The Builder pattern captures all these relationships. Each converter is called a **builder** in the pattern, and the reader is called the **director**. The Builder pattern separates the algorithm for interpreting a textual format from how a converted format gets created and represented.
:w

# Applicability 

Use the Builder pattern when

- the algorithm for creating a complex object should be independent of the parts that make up the object and how they are assembled.

- the construction process must allow different representations for the object that is constructed.

# Structure

![](https://github.com/FedericoBruzzone/medium/blob/main/Builder%20-%20Object%20Creational/img/2.png)

# Participants

## Builder

*(TextConverter)*

- specifies an abstract interface for creating parts of a Product object.

## ConcreteBuilder

*(ASCIIConverter, TeXConverter, TextWidgetConverter)*

- constructs and assembles parts of the product by implementing the Builder interface.

- defines and keeps track of the representation it creates.

- provides an interface for retrieving the product.

## Director

*(RTFReader)*

- constructs an object using the Builder interface.

## Product

*(ASCIIText, TeXText, TextWidget)*

- represents the complex object under construction. ConcreteBuilder builds the product's internal representation and defines the process by which it is assembled.

- includes classes that define the constituent parts, including interface for assembling the parts into the final result.

# Collaborations

- The client creates the Director object and configures it with the desired Builder object.

- Director norifies the builder whenever a part of the product should be built.

- Builder handles requests from the director and adds parts to the product.

- The client retrieves the product from the builder.

![](https://github.com/FedericoBruzzone/medium/blob/main/Builder%20-%20Object%20Creational/img/3.png)

# Consequences

Here are key consequences of the Builder pattern:

1. *It lets you vary a product's internal representation.* The Builder object provides the director with an abstract interface for constructing the product. The interface lets the builder hide the representation and internal structure of the product.

2. *It isolates code for construction and representation.* The Builder pattern improves modularity by encapsulating the way a complex object is constructed and represented. Clients needn't know anything about the classes that define the product's internal structure.

3. *It gives you finer control over the construction process.* Unlike creational patterns that constructed products in one shot, the Builder pattern constructs the product step by step under the director's control.

# Implementation

Typically there is an abstract Builder class that defines an operation for each component that a directory may ask it to create.

Here are other implementation issues to consider:

1. *Assemply and construction interface.* Builders construct their products in step-by-step fashion. A key design issue concerns the model for the construction and assembly process. A model where the results of construction requests are simply appended to the product is usually sufficient. But sometimes you might need access to part of the product constructed earlier.

2. *Why no abstract class for products?* In common case, the product produced by the concrete builders differ so greatly in their representation that there is little to gain form giving different products a common parent class.

3. *Empty methods as default in Builder.* They are defined as empty methods instead, letting clients override only the operation they are interested in.

# Sample Code

To better understand the following code and the classes used look 

[**>>> here🔗! <<<**](https://github.com/FedericoBruzzone/medium/tree/main/commoncode)

We will define a variant of the [*CreateMaze*](https://github.com/FedericoBruzzone/medium/tree/main/commoncode) member function that takes a builder of class *MazeBuilder* as an argument.

The *MazeBuilder* class defines the following interface for building mazes:

```Java
public class MazeBuilder {
    
  protected MazeBuilder() {}
    
  public void BuildMaze() {}

  public void BuildRoom(int room) {}

  public void BuildDoor(int roomFrom, int roomTo) {}
 
  public Maze GetMaze() { return null; }

}
```

# Known Uses

# Related Patterns
