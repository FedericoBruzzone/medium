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

# Consequences

# Implementation

# Sample Code

# Known Uses

# Related Patterns
