# Design Patterns Study
This project is a study into object oriented and functional design patterns, implemented in Scala. It is for my own study 
and future reference but if you find the subject matter interesting and if the information here helps you in your study
then I would be glad! :)

[![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

I'm confident in having a good understanding of design patterns, and enough insight / experience when to apply them
is key into creating agile software and therefor supporting the goals of agile software development like [Disciplined
Agile Delivery](http://www.disciplinedagiledelivery.com/).

> Patterns always have two parts: the how and the when. Not just do you need to know how to implement them, you also have to know when to use them and when to leave them alone. <quote>Martin Fowler</quote>

# Core design principles
- [Core Design Principles for Software Developers by Venkat Subramaniam](https://www.youtube.com/watch?v=llGgO74uXMI)

# What are Patterns?
There are different categories of software patterns:
* Architectural patterns: big broad things that can describe an entire computer system. They are programming language
 agnostic, but talk about how all the different subsystems and components fit together,
* Design patterns: patterns that describe how things happen in a single component, how a program is structured, how the data flows, 
how the execution flows, etc..
* Idioms: (pattern oriented software); specific to a single programming language; examples of a design pattern 
implemented in a programming language, or smaller localized patterns that are seen in a particular programming language

# What are anti-patterns?
An anti-pattern is the opposite of a pattern; while it too describes a recurring solution to a commonly encountered problem, the solution is typically dysfunctional or ineffective, and has negative impacts on the “health” of the software (in terms of maintainability, extensibility, robustness, etc.). Anti-patterns serve a similar purpose to patterns; the description of the anti-pattern might illustrate a typical implementation of the anti-pattern, explain the context it generally occurs in, and show how the implementation results in problems for the software.

A potential problem with the concept of a design anti-pattern is that it might discourage `critical thought` about the applicability of the pattern. A design that may be inappropriate in some contexts may be a sensible decision in others; a solution might be discarded after being recognised as an anti-pattern, even though it would be a good fit for the problem at hand.

# Why do we need patterns?
- We need to know design patterns to find solutions for frequently occurring problems. And we want to reuse these 
solutions whenever we face a similar situation in the future.
- These are one kind of template to address solutions in many different situations.
- In other words, these are the descriptions of how different objects and their respective classes 
solve a design problem in a specific context.

# Object Oriented Design Patterns
The following (23) patterns describe creational, structural and behavioral patterns are fully described in the Gang of Four
book 'Design Patterns: Elements of Reusable Object-Oriented Software'

## Creational (5)
Creational patterns are patterns that create object for you; hence creational. The goal here is, rather than having your 
code instant object directly and therefor having all the logic about how to create (sometimes complex initialization 
logic surrounding objects), the creational pattern will do that for you. This has a second benefit, in that having all
the creational logic in one place, changes to that logic will propagate to where the new object is needed. 

Creational patterns provide guidance on the creation of objects. They help hide the details of the object instantiation 
from the code that uses those objects. That is they make an application independent of how its objects are created, 
composed and represented. This leads to high cohesion between the objects and their users, but low couple between the 
users and the way the objects are created. For example, if I have a Java interface that is implemented by three different 
classes, then using a Factory pattern I might instantiate one of the three classes depending on the current situation. 
All the user of the object returned needs to know is what interface they all implement. The actual implementation may change 
each time the factory is used, but this detail is hidden.

There are 5 different patterns within the creational patterns category. They are `Factory Method`, `Abstract Factory`, 
`Builder`, `Prototype` and `Singleton`. These patterns are presented below:

* __Factory method pattern__: The `factory method pattern` provides a pattern that describes the use of a factory class (or method) 
for constructing objects. The methods on the factory return objects that implement a given interface. The user of the factory only knows about the interface. 
Thus different objects can be created depending on the current situation (as long as they implement the interface). creates objects without specifying the 
exact class to create.
* Abstract factory pattern: The `abstract factory pattern` describes a pattern for creating families of related or dependent objects.
* Builder pattern: The `builder pattern` separates out the construction of a complex object from its use. Thus the client can specify what 
type of object is required and what its content might be, but never need to know about how that object is constructed and initialised.
* Prototype pattern: The `prototype pattern` allows a user object to create a customized object, based on a prototype of what is required. That is, 
the pattern describes how a new object can be created based on a customisation of an existing object.
* __Singleton pattern__: The `singleton pattern` describes a class that can only have one object constructed for it. That is, unlike other objects 
it should not be possible to obtain more than one instance within the same virtual machine. Thus the Singleton pattern ensures that only one instance 
of a class is created. All objects that use an instance of that class use the same instance. The motivation behind this pattern is that some classes, 
typically those classes that involve the central management of a resource, should have exactly one instance. For example, a object that managements 
the reuse of database connections (i.e. a connection pool) could be a singleton.

## Structural (7)
Structural patterns describe the `organization of objects`. That is how classes and objects are composed to form larger structures. 
For example a large department store near where I live, appears form the outside to be a single entity with a very grand frontage. 
However, behind this frontage is a completely new shop containing various independent stores. This means that as a customer I see 
form the outside a single and quite grand whole. But form the inside there are multiple smaller shops/brands all working together. 
This is the essence of the `Facade` pattern.

Structural patterns concern class and object composition; hence structural. They use `inheritance` to `compose` interfaces 
and define ways to compose objects to obtain new functionality.

* __Proxy pattern:__  provides a placeholder for another object to control access, reduce cost, and reduce complexity.
* Flyweight pattern: reduces the cost of creating and manipulating a large number of similar objects.
* Bridge pattern: decouples an abstraction from its implementation so that the two can vary independently.
* __Facade pattern:__ provides a simplified interface to a large body of code.
* __Decorator pattern:__ dynamically adds/overrides behaviour in an existing method of an object.
* __Adapter pattern:__ allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
* __Composite pattern:__ composes zero-or-more similar objects so that they can be manipulated as one object.

## Behavioral (11)
Behavioral patterns are specifically concerned with `communication` between objects, hence behavioral. Here our concentration is 
on algorithms and the assignment of the critical responsibilities among the objects. We also need to focus on the communication 
between them. We need to take a closer look at the way those objects are interconnected. 

Behavioural patterns are concerned with organizing, managing and assigning responsibilities to objects `during execution`. 
That is, the focus of the behavioral patterns are on the communication between objects during the execution of some task. 
Typically, these patterns characterize complex control flows that are difficult to follow at runtime. They therefore help to 
shift the emphasis away from the low level flow of control to the higher level object interactions.

* Chain of responsibility pattern: delegates commands to a chain of processing objects.
* __Command pattern:__ creates objects which encapsulate actions and parameters.
* Interpreter pattern: implements a specialized language.
* __Iterator pattern:__ accesses the elements of an object sequentially without exposing its underlying representation.
* [Mediator pattern](https://sourcemaking.com/design_patterns/mediator): allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
* Memento pattern: provides the ability to restore an object to its previous state (undo).
* __Observer pattern:__ is a publish/subscribe pattern which allows a number of observer objects to see an event.
* __State pattern:__ allows an object to alter its behavior when its internal state changes.
* Strategy pattern:  allows one of a family of algorithms to be selected on-the-fly at runtime.
* __Template method pattern:__ defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
* Visitor pattern: separates an algorithm from an object structure by moving the hierarchy of methods into one object.

# Replacing Object Oriented Patterns with Functional Patterns

* Replacing Functional Interface
* Replacing state-carrying functional interface
* Replacing command
* Replacing Builder for Immutable Objects
* Replacing Iterator
* Replacing Template Method
* Replacing Strategy
* Replacing Null Object
* Replcing Decorator
* Replacing Visitor
* Replacing Dependency Injection

# Functional Patterns

* Monoid Pattern
* Functor Pattern
* Applicative Functor Pattern
* Type Class Pattern
* Tail Recursion
* Mutual Recursion
* Filter-Map-Reduce
* Chain of operations
* Function Builder
* Memoization
* Lazy Sequence
* Focused Mutability
* Customized Control Flow
* Domain-Specific Language

# Polymorphism

* [Parameteric polymorphism](http://eed3si9n.com/learning-scalaz/polymorphism.html#Subtype+polymorphism), 
* [Subtype polymorphism](http://eed3si9n.com/learning-scalaz/polymorphism.html#Ad-hoc+polymorphism),
* [Ad-hoc polymorphism](http://eed3si9n.com/learning-scalaz/polymorphism.html#Ad-hoc+polymorphism) [Debasish Ghosh - Scala Implicits : Type Classes Here I Come](http://debasishg.blogspot.com/2010/06/scala-implicits-type-classes-here-i.html),

# Registry
 A `registry` is a list of items with pointers for where to find the items, like the index on a database table or the 
card catalog for a library. If you lose a `registry`, the items still exist; you just may need to reindex them. 

# Repository
A `repository` is an abstraction of a collection of objects. A `repository` stores the actual items (objects), 
like a database table itself or a library's shelves of books. If you lose a `repository`, the items are gone.
 
The repository is closer to the domain. It acts on aggregate roots (domain objects/entity) and would use multiple
DAOs to build a single entity. 

# Spring repository
[Documentation](http://docs.spring.io/spring-data/data-commons/docs/current/reference/html/#repositories)

# CQRS Domain Repository
The CQRS domain repository gets an aggregate root by its id, and loads/saves the generated events.  

# DAO pattern
[DAO Pattern](http://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm)
 
The Data Access Object pattern is used to separate low level data accessing API operations from high level business services. 
Following are the participants in Data Access Object Pattern.

* __Data Access Object Interface__:  an `interface` defines the standard operations to be performed on a model object(s).
* __Data Access Object concrete class__: concrete class that implements the above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.
* __Model Object or Value Object__: the object that is managed by the DAO. It is usually a simple value object like eg. case classes.

The DAO makes sure that the specific implementation is abstracted away behind an `interface` so that the implementation can 
be switched. It also ensures the correct modularization and cohesion of functionality.

A DAO returns `data` in the broadest sense of the word and is the very definition (a data access object). How the DAO 
accesses the data, whether it be by accessing a queue, an XML file, or by querying one or more tables is not defined.

So, the DAO deals with persistence issues and is an abstraction of data persistence. Its also closer to the database / persistency
than the `repository` would be. A `repository` only deals with `domain objects`
 
In the trenches, DAOs are sometimes called `providers` and Martin Fowler defines them as [Table Data Gateway pattern](http://martinfowler.com/eaaCatalog/tableDataGateway.html).

# Facade pattern
The facade pattern is used to hide the `call complexity` of a system. It provides a simple abstraction, a single method,
that abstracts away all the `call complexity` to several subsystems. For example, a client does not have to know that, in 
order to return a result, a number of subsystems (local or remote) are involved. 

So, facade deals with control and workflow.

# Service
From: [StackExchange](http://programmers.stackexchange.com/questions/218011/how-accurate-is-business-logic-should-be-in-a-service-not-in-a-model)

It is not easy to define what the responsibilities of a `service` are. `Service` is not a canonical or generic software term. 
In fact, the suffix `Service` on a class name is a lot like the much-maligned `Manager`: It tells you almost nothing about what 
the object actually does.

In reality, what a `service` ought to do is highly architecture-specific, so first you have to specify the `architecture` and then the 
`service`'s responsibility will become clear.

## Traditional Layered Architecture
In a traditional layered architecture, `service` is literally synonymous with `business logic layer`. It's the layer between UI 
and Data. Therefore, all business rules go into services. The data layer should only understand basic CRUD operations, and the 
UI layer should deal only with the mapping of presentation Data Transfer Objects (DTOs) to and from the business objects.

## RPC style
In an RPC-style distributed architecture (SOAP, UDDI, BPEL, etc.), the `service` is the logical version of a physical endpoint. 
It is essentially a collection of operations that the maintainer wishes to provide as a public API. Various best practices guides 
explain that a `service` operation should in fact be a business-level operation (capabilities) and not CRUD, and I tend to agree.

However, because routing everything through an actual remote service can seriously hurt performance, it's normally best not to have 
these services actually implement the business logic themselves; instead, they should wrap an "internal" set of business objects. 
A single service might involve one or several business objects.

## Model-View-Controller (MVC)
In an MVP/MVC/MVVM/MV* architecture, services don't exist at all. Or if they do, the term is used to refer to any generic object 
that can be injected into a controller or view model. The business logic is in your model. If you want to create "service objects" 
to orchestrate complicated operations, that's seen as an implementation detail. A lot of people, sadly, implement MVC like this, but 
it's considered an anti-pattern ([Anemic Domain Model](http://en.wikipedia.org/wiki/Anemic_domain_model)) because the model itself does nothing, it's just a bunch of properties for the UI.

Some people mistakenly think that taking a 100-line controller method and shoving it all into a service somehow makes for a better architecture. 
It really doesn't; all it does is add another, probably unnecessary layer of indirection. Practically speaking, the controller is still doing 
the work, it's just doing so through a poorly named `helper` object. I highly recommend [Jimmy Bogard's Wicked Domain Models presentation](http://vimeo.com/43598193) 
for a clear example of how to turn an [anemic domain model](http://en.wikipedia.org/wiki/Anemic_domain_model) into a useful one. It involves 
careful examination of the models you're exposing and which operations are actually valid in a business context.

For example, if your database contains Orders, and you have a column for Total Amount, your application probably shouldn't be allowed 
to actually change that field to an arbitrary value, because (a) it's history and (b) it's supposed to be determined by what's in the 
order as well as perhaps some other time-sensitive data/rules. Creating a service to manage Orders does not necessarily solve this problem, 
because user code can still grab the actual Order object and change the amount on it. Instead, the order itself should be responsible for 
ensuring that it can only be altered in safe and consistent ways.

## Domain Driven Design (DDD)
In DDD, `services` are meant specifically for the situation [when you have an operation that doesn't properly belong to __any__ aggregate root](http://gorodinski.com/blog/2012/04/14/services-in-domain-driven-design-ddd/). 
You have to be careful here, because often the need for a `service` can imply that you didn't use the correct roots. But assuming you did, 
a `service` is used to coordinate operations across multiple roots, or sometimes to handle concerns that don't involve the domain model at all 
(such as, perhaps, writing information to a BI/OLAP database).

One notable aspect of the DDD service is that it is allowed to use [transaction scripts](http://martinfowler.com/eaaCatalog/transactionScript.html). 
When working on large applications, you're very likely to eventually run into instances where it's just way easier to accomplish something with a 
T-SQL or PL/SQL procedure than it is to fuss with the domain model. This is OK, and it belongs in a `service`.

This is a radical departure from the layered-architecture definition of services. A `service layer` encapsulates domain objects; a `DDD service` 
encapsulates whatever isn't in the domain objects and doesn't make sense to be.

## SOA
In a Service-Oriented Architecture, a `service` is considered to be the technical authority for a business capability. That means that it is the 
exclusive owner of a certain subset of the business data and nothing else is allowed to touch that data - not even to just read it.

By necessity, `services` are actually an end-to-end proposition in an SOA. Meaning, a `service` isn't so much a specific component as an 
entire stack, and your entire application (or your entire business) is a set of these services running side-by-side with no intersection 
except at the messaging and UI layers. Each service has its own data, its own business rules, and its own UI. They don't need to orchestrate 
with each other because they are supposed to be business-aligned - and, like the business itself, each `service` has its own set of 
responsibilities and operates more or less independently of the others.

So, by the SOA definition, every piece of business logic anywhere is contained within the `service`, but then again, so is the entire system. 
Services in an SOA can have components, and they can have endpoints, but it's fairly dangerous to call any piece of code a `service` because it 
conflicts with what the original "S" is supposed to mean.

Since SOA is generally pretty keen on messaging, the operations that you might have packaged in a `service` before are generally encapsulated 
in handlers, but the multiplicity is different. Each handler handles one message type, one operation. It's a strict interpretation of the 
[Single Responsibility Principle](http://en.wikipedia.org/wiki/Single_responsibility_principle), but makes for great maintainability because 
every possible operation is in its own class. So you don't really need centralized business logic, because commands represents business operations 
rather than technical ones.

## Conclusion 
Ultimately, in any architecture you choose, there is going to be some component or layer that has most of the business logic. After all, 
if business logic is scattered all over the place then you just have spaghetti code. But whether or not you call that component a `service`, 
and how it's designed in terms of things like number or size of operations, depends on your architectural goals.

There's no right or wrong answer, only what applies to your situation.

To add to the discussion, services can be:

- Stateless, Stateful or ,
- Be `local` or `remote`
- Will be used by clients (local or remote clients) by means of a `Service Contract` ie. `interface`
- Dependent on the technology (stack), can be supplied with container services like security and transactions.

# Where to put business logic
In JavaEE the place to put business logic is in the `business logic` layer or simply `logic`. These are objects that
communicate with each other, optionally receiving services like security and transactions.

As we are using Actors, the place to put business logic are in traits. When using functional style of programming, 
the Actor can manage the state and the business logic can be mixed in and thus reused where appropriate.

# Anemic Domain Model
[Anemic domain model](https://en.wikipedia.org/wiki/Anemic_domain_model) is the use of a software domain model where the 
domain objects contain little or no business logic (validations, calculations, business rules etc.). This pattern was first 
[described by Martin Fowler](https://en.wikipedia.org/wiki/Anemic_domain_model), who considers the practice an anti-pattern,
which doesn't mean that it is an anti-pattern, it is the opinion of Martin Fowler.

In an anemic domain design, business logic is typically implemented in separate classes which transform the state of the 
domain objects. Fowler calls such external classes [transaction scripts](http://martinfowler.com/eaaCatalog/transactionScript.html). 

This pattern is a common approach in Java applications, possibly encouraged by technologies such as early versions of EJB's Entity Beans, as well as in .NET applications following the Three-Layered Services Application architecture where such objects fall into the category of "Business Entities" (although Business Entities can also contain behavior).

## Reasons why models are anemic
* Near-total absence of business logic, as in an application which is primarily an assemblage of CRUD screens?
* Service-oriented architecture in which the 'domain objects' are in fact data transfer objects?
* Political or pragmatic considerations such as code ownership or forward/backward compatibility that excessively impede refactoring?
* Applying procedural/relational design in an otherwise object-oriented language?

In any case, if [I]((http://stackoverflow.com/questions/1156644/anemic-domain-models-vs-domain-model-in-a-simple-domain-driven-design)) were to pick a simple rule of thumb for the boundary between domain model logic and service logic, it would be that interacting with related objects is fine within the domain, while accessing the "outside world" (user interface, web services, etc) probably doesn't belong in the domain model.

## Another point of view
* Anemic domain model = database tables mapped to objects (only field values, no real behavior)
* Rich domain model = a collection of objects that expose behavior

If you want to create a simple CRUD application, maybe an anemic model with a classic MVC framework is enough. But if you want to implement some kind of logic, __anemic model means that you will not do object oriented programming__.

__Note:__ Object behavior has nothing to do with persistence. A different layer (Gateways/DAO's, Data Mappers, Repositories etc.) is responsible for persisting domain objects. The key point is that the domain model implements the logic and operates on the state.

## Tiers vs Layers
A tier is a module boundary that exists to provide isolation between major components of a system.
A presentation tier that is visible to the user is separate from the application tier which encompasses
business logic. In turn the data tier is another separate system that can manage, persist and provide access to data.
Components grouped in a tier can physically reside on different infrastructure.

Layers are logical slices that carry our specific responsibilities in an application.
Each tier can have multiple layers within it responsible for different elements of functionality such as domain services.

## DTO’S, DDD & The Anemic Domain Model
[I](http://elegantcode.com/2009/11/13/dtos-ddd-the-anemic-domain-model/) agree that an anemic domain model is bad, if there is no behavior then what’s the point right?

__DTO:__ To me, a DTO moves data between ‘tiers’. They are the packaged data ready for transport. A JSON object is also a DTO.

__Read model:__ This would be a different model than your real Domain model.  A Read model is very lightweight, `thin` and anemic.  Its purpose is to serve aggregated data to a specific screen or message. A DTO, to me, can be a read model, as too could be a View Model.

__The domain model:__ rich and full of behavior. This model is most valuable when performing complex business rules during the saving and updating of data within a given transaction. It can also be used to read data too.

Splitting the models allows the reads & writes to fluctuate independently, so which leads to higher maintainability. These models can also run on different tiers/nodes to increase scalability (read/cache tier, write tier), which are all choices.

At some point, whether off a view or an inbound DTO, there will be mapping back into the domain model. This ‘friction’ or ‘impedance’ is pretty easy to manage using an assembler/translator, or a tool like AutoMapper.

Greg Young & Udi Dahan take this concept further and apply a programming principle called [Command-Query Responsibility Separation/Seggregation](http://martinfowler.com/bliki/CQRS.html) with distributed programming and SOA.

## The Anaemic Domain Model (ADM) is no Anti-Pattern
[I](https://blog.inf.ed.ac.uk/sapm/2014/02/04/the-anaemic-domain-model-is-no-anti-pattern-its-a-solid-design/) contend that such an anti-pattern is the `Anaemic Domain Model (ADM)`. The ADM is considered by these authors __as a failure to model a solution in an Object-Oriented manner__, instead relying on a procedural design to express business logic (which is a perfect definition of the ADM). This approach is contrasted with the Rich Domain Model (RDM), in which classes representing domain entities encapsulate all business logic and data. While the ADM may certainly be a poor design choice in some systems, it is not obvious that this is the case for all systems. 

In some scenarios, the ADM appears be an reasonable choice of design, in terms of adherence to the 
[SOLID principles of Object-Oriented design](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design). 
The SOLID principles are guidelines which seek to balance implementation simplicity, scalability, and robustness. 
Specifically, by contrasting an ADM design with an RDM design for a hypothetical problem.

I will attempt to show that ADM is a better fit for the SOLID principles than the RDM solution.

An ADM consists of a set of  behaviour-free classes containing business data required to model the domain. These classes typically contain little or no business logic (validations, calculations, business rules etc..), instead, business logic is implemented by a domain service/logic layer. The domain service/logic layer consists of a set of types and functions which process the domain models as dictated by business rules. The argument against this approach is that the data and methods are divorced, violating a fundamental principle of Object-Oriented design by removing the capability of the domain model to enforce its own invariants. 

In contrast, while an RDM consists of the same set of types containing necessary business data, the domain logic is also entirely resident on these domain entities, expressed as methods. The RDM then aligns well with the related concepts of encapsulation and information hiding; as Michael L. Scott states, `Encapsulation mechanisms enable the programmer to group data and the subroutines that operate on them together in one place, and to hide irrelevant details from the users of an abstraction`.

In an RDM, the domain service/logic layer is either extremely thin or non-existent, and all domain rules are implemented via domain models. The contention is that domain entities in a RDM are then entirely capable of enforcing their invariants, and therefore the system is sound from an Object-Oriented design perspective.

However, the capability of a domain entity to enforce local data constraints is only a single property in a set of desirable qualities in a system; while the ADM sacrifices this ability at the granularity of the individual domain entities, it does so in exchange for greater potential `flexibility` and `maintainability` of the overall implementation by allowing the domain logic to be implemented in dedicated classes (and exposed via interfaces).

### My personal opinion
Distributing logic all over the place, does not make for a good maintainable product. However, this is very implementation specific. 
Using Akka with Persistence, the persistence responsibility is delegated to the Akka runtime and therefor transparant to the implementation. 
The Actor handles messages, which makes for better testability, and the best encapsulation / loose coupling I have ever seen in a runtime. 
Handling these messages with event handlers can still make for good testable software by modulizing code eg. using facade or services. 
Akka makes a Rich Data Model viable and can be used anywhere.

## Benefits
* Clear separation between logic and data; (Procedural programming). Each procedure operates on the data.
* Works well for simple applications.
* Results in stateless logic, which facilitates scaling out
* Avoids the need for a complex OO-Database mapping layer.
* It follows the Single Responsibility principle giving a class no more than one reason to change (the data changes).

## Liabilities
* Logic __cannot__ be implemented in a truly object-oriented way, because logic and data is separated.
* Violation of the encapsulation and information hiding principles (an object operates upon its state via methods/messages)
* Needs a separate business layer to contain the logic otherwise located in a domain model. It also means that domain model's 
objects cannot guarantee their correctness at any moment, because their validation and mutation logic is placed somewhere outside 
(most likely in multiple places).
* Needs a service layer when sharing domain logic across differing consumers of an object model (clients of the domain, local
or remote, communicate with the domain by means of a __service__)
*  Makes a model less expressive.

# SOLID Principles of Object Oriented Design
[SOLID principles of Object-Oriented design](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design). The SOLID principles are 
guidelines which seek to balance implementation simplicity, scalability, and robustness. Mark Nijhof has written a great book about the SOLID principles, and its available for free so go and get it [SOLID - Software Development is not a Jenga Game - Mark Nijhof](https://leanpub.com/solid).

The first five principles are principles of class design. They are:
- [Single Reponsibility Principle](https://leanpub.com/solid/read#leanpub-auto-single-responsibility-principle---srp): “A class should have one, and only one, reason to change”. => There should never be more than one reason for a class to change.
- [Open-Closed Principle](https://leanpub.com/solid/read#leanpub-auto-open-closed-principle---ocp):  “You should be able to extend a class’s behavior, without modifying it” => Software entities, (classes, modules, functions etc), should be open for extension for closed for modification.
- [Liskov Substitution Principle](https://leanpub.com/solid/read#leanpub-auto-liskov-substitution-principle---lsp): “Derived classes must be substitutable for their base classes.” => Functions that use object references to base classes must be able to use objects of derived classes without knowing it.
- [Interface Segregation Principle](https://leanpub.com/solid/read#leanpub-auto-interface-segregation-principle---isp): “Make fine grained interfaces that are client specific.” => Clients should not be forced to depend upon interfaces that they do not use.
- [Dependency Inversion Principle](https://leanpub.com/solid/read#leanpub-auto-dependency-inversion-principle---dip): “Depend on abstrations, not on concretions.” => A high level module should not depend upon low level modules. Both should depend upon abstractions. Abstractions should not depend upon details. Details should depend upon abstractions.

The next six principles are about packages. In this context a package is a binary deliverable like a .jar file, or a dll as 
opposed to a namespace like a java package or a C++ namespace.

The first three package principles are about package cohesion, they tell us what to put inside packages:

- __REP:__ The Release Reuse Equivalency Principle: The granule of reuse is the granule of release.
- __CCP:__ The Common Closure Principle: Classes that change together are packaged together.
- __CRP:__ The Common Reuse Principle: Classes that are used together are packaged together.

The last three principles are about the couplings between packages, and talk about metrics that evaluate the 
package structure of a system.

- __ADP:__ The Acyclic Dependencies Principle: The dependency graph of packages must have no cycles.
- __SDP:__ The Stable Dependencies Principle: Depend in the direction of stability.
- __SAP:__ The Stable Abstractions Principle: Abstractness increases with stability.

## Manage Dependency
[Dependency Management](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod) is an issue that most of us have faced. 
Whenever we bring up on our screens a nasty batch of tangled legacy code, we are experiencing the results of poor dependency management. 
Poor dependency managment leads to code that is hard to change, fragile, and non-reusable. Indeed, I talk about several different design 
smells in the PPP book, all relating to dependency management. On the other hand, when dependencies are well managed, the code remains 
flexible, robust, and reusable. So dependency management, and therefore these principles, are at the foudation of the -ilities that 
software developers desire.

Solid principles:
- Help manage dependency,
- Improved maintainability, flexibility, robustness, and reusability.

## SOLID Resources
- [Bob Martin - SOLID Principles of Object Oriented and Agile Design](https://www.youtube.com/watch?v=TMuno5RZNeE)
- [Robert C Martin - The Single Responsibility Principle](https://www.youtube.com/watch?v=Gt0M_OHKhQE)
- [Robert C. Martin ("Uncle Bob"): Agility and Architecture](https://www.youtube.com/watch?v=0oGpWmS0aYQ)
- [Applying S.O.L.I.D. Principles in Microsoft .NET/C#](https://www.youtube.com/watch?v=Whhi1C2PpaA)

## Transaction script pattern
Organizes business logic by procedures where each procedure handles a single request from the presentation.

Most business applications can be thought of as a series of transactions. A transaction may view some information as 
organized in a particular way, another will make changes to it. Each interaction between a client system and a server 
system contains a certain amount of logic. In some cases this can be as simple as displaying information in the database. 
In others it may involve many steps of validations and calculations. 

A Transaction Script organizes all this logic primarily as a single procedure, making calls directly to the database 
or through a thin database wrapper. Each transaction will have its own Transaction Script, although common subtasks can 
be broken into subprocedures." In his book "Enterprise Application Patterns", Fowler noted that the transaction script 
pattern is OK for many simple business applications, and avoids the need for a complex OO-database mapping layer.

# Serverless architecture
The word _serverless_ is a bit of a misnomer. Whether you use a compute service such as AWS Lambda to execute your code
or interact with an API, there are still servers running in the background. The difference is that these servers are
hidden from us. There is no infrastructure for us to think about. No way to tweak the underlying operating system.
Someone else takes care of the nitty-gritty detail of infrastructure management, freeing our time for other things.
Serverless is about running code in a compute service and interacting with services and APIs to get the job done.

There are 5 principles of serverless architecture that describe how an ideal serverless system should be built.
Use these principles to help guide your decisions when you create serverless architecture.

1. Use a compute service to execute code on demand (no servers),
2. Write single-purpose stateless functions (Single Responsibility Principle (SRP)- SOLID design ie. Nano-Compute),
3. Design push-based, event-driven pipelines,
4. Create thicker, more powerful front ends,
5. Embrace third-party services

There are two notable architectures when going serverless, _compute as back end_ which are back ends for web and mobile applications
and _compute as glue_ which are pipelines built to carry out workflows. These two architectures are complimentary and
it is likely that you will build and combine these architectures if you end up working on any kind of real-world serverless system.

The _compute-as-back-end_ architecture describes an approach where a serverless compute service such as Lambda and third-party
services are used to build a back end for web, mobile, and desktop applications.

Good serverless systems try to minimize the scope and the footprint of Lambda functions so that these functions only do
the bare minimum (Nano-Compute) and primarily focus on the tasks that must not be done in the front end due to privacy or security concerns.

The _compute as glue_ architecture describes the idea that we can use Lambda functions to create powerful execution pipelines
and workflows. This often involves using Lambda as glue between different services, coordinating, and invoking them.
With this style of architecture, the main focus of the developer is on the design of their pipeline, coordination, and flow of data.
The parallelism of serverless compute services like Lambda helps to make these architectures appealing.

# Nano-Compute
[According to Paul Johnston](https://medium.com/@PaulDJohnston/when-not-to-use-serverless-jeff-6d054d0e7098#.3t6hpwewi),
not all use cases are appropriate for running in a Lambda (Nano Compute). Lets listen to him.

When using AWS Lambda and similar you are essentially running a nano-container with a single function.
There is a startup cost in terms of time and load, and there is also the fact you don’t know how fast the solution will
run compared with, say, a piece of hardware that you own.

Once loaded a Lambda will be _warm_ and so will work faster, so that’s ok, but you still don’t have a guarantee of
availability of resources in the same way when you own a server.

So you have a problem with speed of response, but not reliability or even scalability.

The whole idea of the single function is the lack of dependencies, which makes it quicker, but doesn’t mean it
necessarily is easier to develop or provide you with an easy way of expanding the function to do more (you might need another function!).

Basically, the small amount of compute is great for small amounts of load, but for something which is larger, or longer running is probably a little more complex.

With Lambda, you have __5 minutes maximum__, which is really useful, but the problem is that for a long running task you
have to store data and restart a new function. Basically, split up the task into multiple Lambdas.

This means that any large scale data task or long running processing task is probably better off a Serverless infrastructure,
or at least, developed in such a way as to be appropriate (which can be done).

Serverless is primarily an asynchronous solution although it isn’t inherently asynchronous. Therefore you should approach
the majority of tasks as things that you should consume, but not necessarily respond to. So long as you have a mechanism
to respond (push) then the user of an app/mobile/web solution shouldn’t need to worry about anything.

The exception is when you need real-time (or near real-time) solutions. Under this scenario you have to be confident in
your services and solutions to be fault tolerant but to be honest, the best solution is probably a third party that provides
this for you rather than developing your own serverless nano-compute solution.

If you need to do something complex with a computer program, then that may not be appropriate. The reference implementation
for a Lambda function is image processing, but imagine it was a video processing function. It might need more memory and
compute than can be garnered from a Lambda compute function, so this might be problematic.

The problem is amount of available memory and compute, rather than whether the language can handle the complexity itself.
This is a per-function call rather than an architecture call. If you can offload complexities into multiple functions it’s probably fine.

I would suggest that there are a number of times that Serverless isn’t appropriate:

- Whenever you need real time that matters at the business level (you can do asynchronous),
- Whenever you need a long running task that can’t be split into multiple compute cycles,
- Whenever you need complex compute with high memory/compute requirements,
- Whenever you need a really good speed of response
- Whenever you need reliability where you can’t guarantee service availability to a high enough level.

# Serverless Data Processing
A common use for serverless technologies is data processing, conversion, manipulation, and transcoding.
Lambda functions can be used for processing of CSV, JSON, and XML files; collation and aggregation of data;
image resizing; and format conversion. Lambda and AWS services are well suited for building event-driven pipelines
for data-processing tasks: many of them have been designed to integrate and run together
(for example, push a file to an S3 bucket and let a Lambda function run automatically and transform the file).

Data Processing is an excellent use case for serverless technologies, especially when you use a Lambda function in concert with other services.

# Serverless Real Time Analytics
Ingestion of data—such as logs, system events, transactions, or user clicks—can be accomplished using services such
as Amazon Kinesis. Lambda functions can react to new records in a stream and process, save, or discard data quickly.
A Lambda function can be configured to run when there is a specific number (batch size) of records available for processing,
so that it doesn’t have to execute for every individual record added to the stream.

Kinesis streams and Lambda functions are a good fit for applications that generate a lot of data that need to be analyzed,
aggregated, and stored. When it comes to Kinesis, the number of functions spawned to process messages off a stream is the same
as the number of shards (therefore, there is one Lambda function per shard). Furthermore, if a Lambda function fails to process
a batch it will retry again. This can keep going for up to 24 hours (which is how long Kinesis will keep data around before it expires)
if processing fails each time. However, even with these little gotchas, the combination of Kinesis streams and Lambda is powerful if
you want to do real-time processing and analytics.

# Serverless Legacy API Wrapper
One innovative use case of the AWS API Gateway and Lambda is the legacy API wrapper. Here, developers use API Gateway
and Lambda to create a new API layer over legacy APIs and services to make them easier to use. The API Gateway is used
to create a RESTful interface, and Lambda functions are used to transpose request/response and marshal data to formats
that legacy services can understand. This approach makes legacy services easier to consume for modern clients that
may not support older protocols and data formats.

# Serverless Scheduled Services
Lambda functions can run on a schedule, which makes them effective for repetitive tasks like data backups, imports and exports,
reminders, and alerts. Lambda functions can be run on a schedule, eg. to periodically ping websites to see if they are online
and send an email or a text message if they are not. There are Lambda blueprints available for this specific use case.
A blueprint is a template with sample code that can be selected when creating a new Lambda function.

Lambda functions can also be scheduled to perform nightly downloads of files off servers and send daily account statements to users.
Repetitive tasks such as file backup and file validation can also be done easily with Lambda thanks to the scheduling capability that
you can set and forget.

# AWS Lambda
[AWS Lambda](http://docs.aws.amazon.com/lambda/latest/dg/welcome.html) is a compute service that executes code written
in JavaScript [node.js](https://nodejs.org/en/), [Python](https://www.python.org/downloads/), Java or Scala on AWS infrastructure.

Source code is deployed to an isolated container that has its own allocation of memory, disk space, and CPU.
The combination of your code, configuration and depedencies, is typically referred to as a Lambda function.

The Lambda runtime can invoke a function multiple times in parallel. Lambda supports push and pull event models of
operation and integrates with a large number of AWS services. Functions can be invoked by an HTTP request
through the [AWS API Gateway](https://aws.amazon.com/api-gateway/), or run on a scheduler.

AWS is not the only vendor that provides a lambda architecture runtime. [Microsoft Azure Functions](https://azure.microsoft.com/nl-nl/services/functions/),
[IBM Bluemix OpenWhisk](http://www.ibm.com/cloud-computing/bluemix/openwhisk/), and [Google Cloud Functions](https://cloud.google.com/functions/docs/)
are other providers of lambda architecture runtimes (which may or may not be inter-compatible).

# AWS API Gateway
[AWS API Gateway](https://aws.amazon.com/api-gateway/) is a service that you can use to create an API layer between the front end and back end services.
The lifecycle management of the API Gateway allows multiple versions of the API to be run at the same time and it supports multiple release stages
such as development, staging, and production. API Gateway also comes with useful features like caching and throttling of requests.

# AWS Simple Notification Service (SNS)
[AWS Simple Notification Service (SNS)](https://aws.amazon.com/sns/) is a scalable pub-sub service designed to deliver messages.
Producers or publishers create and send messages to a topic. Subscribers or consumers subscribe to a topic and receive messages
over one of the supported protocols. SNS stores messages across multiple servers and data centers for redundancy and guarantees
__at-least-once delivery__. At-least-once delivery stipulates that a message will be delivered at least once to a subscriber but,
on a rare occasion due to the distributed nature of SNS, it may be delivered multiple times.

At least once means that a message can be received multiple times which also means that your lambda must handle processing
the same message multiple times, implying idempotency.

In cases when messages cannot be delivered by SNS to HTTP endpoints, it can be configured to retry deliveries at a later time.
SNS can also retry failed deliveries to Lambda in cases where throttling is applied. SNS supports message payloads of up to 256KB.

# AWS Simple Storage Service (S3)
[AWS Simple Storage Service (S3)](https://aws.amazon.com/documentation/s3/) is Amazon’s scalable storage solution.
Data in S3 is stored redundantly across multiple facilities and servers. The event notifications system allows S3 to
send events to SNS, SQS, or Lambda when objects are created or deleted. S3 is secure by default, with only owners having
access to the resources they create; however, it is possible to set more granular and flexible access permissions using
Access Control Lists (ACL) and bucket policies. 

S3 uses the concept of buckets and objects. Buckets are high-level directories or containers for objects. Objects are a
combination of data, metadata, and a key. A key is a unique identifier for an object in a bucket. S3 also supports the
concept of a folder as a means of grouping objects in the S3 console. Folders work by using key name prefixes.
A forward slash character “/” in the key name delineates a folder. For example, an object with a key name documents/personal/myfile.txt
is represented as a folder called documents containing a folder called personal containing the file myfile.txt in the S3 console.

# AWS Simple Queue Service (SQS)
[AWS Simple Queue Service (SQS)](https://aws.amazon.com/documentation/sqs/) is Amazon’s distributed and fault-tolerant queuing service.
It ensures __at-least-once delivery__ of messages similar to SNS and supports message payloads of up to 256KB. SQS allows multiple
publishers and consumers to interact with the same queue, and it has a built-in message lifecycle that automatically expires and deletes
messages after a preset retention period. As with most AWS products, there are access controls to help control access to the queue.
SQS integrates with SNS to automatically receive and queue messages.

# AWS Simple Email Service (SES)
[AWS Simple Email Service (SES)](https://aws.amazon.com/documentation/ses/) is a service designed to send and receive email.
SES handles email-receiving operations such as scanning for spam and viruses, and rejection of email from untrusted sources.
Incoming email can be delivered to an S3 bucket, used to invoke a Lambda notification, or create an SNS notification.
These actions can be configured as part of the receipt rule, which tells SES what to do with the email once it arrives.

Sending emails with SES is straightforward but there are limits, which are in place to regulate the rate and the number
of messages being sent out. SES will automatically increase the quota as long as high-quality email, and not spam, is being sent.

# AWS Relational Database Service (RDS)
[AWS Relational Database Service (RDS)](https://aws.amazon.com/documentation/rds/) is a web service that helps with the set up
and operation of a relational database in the AWS infrastructure. RDS supports Amazon Aurora, MySQL, MariaDB, Oracle, MS-SQL,
and PostgreSQL database engines. It takes care of routine tasks such as provisioning, backup, patching, recovery, repair, and failure detection.
Monitoring and metrics, database snapshots, and multiple Availability Zone (AZ) support are provided out of the box. RDS uses SNS to deliver
notifications when an event occurs. This makes it easy to respond to database events such as creation, deletion, failover, recovery, and restoration when they happen.

# AWS DynamoDB
[AWS DynamoDB](https://aws.amazon.com/documentation/dynamodb/) is Amazon’s NoSQL solution. Tables, items, and attributes are Dynamo’s main concepts.
A table stores a collection of items. An item is made up of a collection of attributes. Each attribute is a simple piece of data such as a person’s
name or phone number. Every item is uniquely identifiable. Lambda integrates with DynamoDB tables and can be triggered by a table update.

# AWS CloudSearch
[AWS CloudSearch](https://aws.amazon.com/documentation/cloudsearch/) is a search solution from AWS that supports structured data and plain text.
CloudSearch takes snippets of data as JSON or XML and generates an index that can be queried. This service supports boolean, prefix, and range searches,
full-text search, faceting, highlighting, and auto-complete. Every document provided to CloudSearch is supplied with an ID, generated by the user,
that makes the document uniquely identifiable. Search requests can be carried out using GET requests. Results can be returned as JSON or XML,
and they can be sorted, paginated, and include useful metadata such as a relevance score.

# AWS CloudFront
[AWS CloudFront](https://aws.amazon.com/documentation/cloudfront/) is a web service that speeds up distribution of your
static and dynamic web content, for example, .html, .css, .php, image, and media files, to end users.

# AWS Route 53
[AWS Route 53](https://aws.amazon.com/documentation/route53/) is a highly available and scalable Domain Name System (DNS) web service.

# AWS Virtual Private Cloud (VPC)
[AWS Virtual Private Cloud (Amazon VPC)](https://aws.amazon.com/documentation/vpc/) enables you to launch Amazon Web Services (AWS)
resources into a virtual network that you've defined. This virtual network closely resembles a traditional network that you'd operate
in your own data center, with the benefits of using the scalable infrastructure of AWS.

# AWS Elastic Transcoder
[AWS Elastic Transcoder](https://aws.amazon.com/documentation/elastic-transcoder/) is an AWS service for transcoding media to other formats,
resolutions, and bitrates. This service is useful if you need to have versions of your media playable on different devices. Elastic Transcoder
comes with a number of presets or templates that define how a video should be transcoded, but you can define your own.

It integrates with S3 and SNS, which it uses for notifications when a job is completed or an error condition is raised.
Elastic Transcoder also has additional features such as watermarking, transcoding of captions, and DRM support.

# AWS Kinesis
[AWS Kinesis](https://aws.amazon.com/documentation/kinesis/) is a service for real-time processing of streaming big data.
It is typically used for quick log and data intake, metrics, analytics, and reporting. It is different from SQS in that
Amazon recommends that Kinesis Streams be used primarily for streaming big data, whereas SQS is used as a reliable hosted
queue especially if more fine-grained control over messages, such as visibility timeouts or individual delays, is required.

In AWS Kinesis, shards specify the throughput capacity of a stream. The number of shards needs to be stipulated when the
stream is created; however, resharding is possible if throughput needs to be increased or reduced. In comparison, SQS makes
scaling much more transparent. Lambda can integrate with Kinesis to read batches of records from a stream as soon as they are detected.

# AWS Internet of Things (IoT)
[AWS IoT](https://aws.amazon.com/documentation/iot/) enables secure, bi-directional communication between Internet-connected
things (such as sensors, actuators, embedded devices, or smart appliances) and the AWS cloud over [MQTT](http://mqtt.org/) and HTTP.

AWS IoT combines the following:

- authentication and authorization,
- communications gateway,
- registry (a way to assign a unique identity to each device),
- device shadowing (persistent device state),
- a rules engine (a service to transform and route device messages to AWS services).

The rules engine, for example, can save files to Amazon’s Simple Storage Service (S3), push data to an Amazon Simple Queue Service (SQS) queue, and invoke AWS Lambda
functions. Amazon’s IoT platform makes it easy to build scalable IoT back ends for devices without having to run a server.

# AWS Cognito
[AWS Cognito](https://aws.amazon.com/documentation/cognito/) is an identity management service. It integrates with public
identity providers such as Google, Facebook, Twitter, and Amazon, or with your own system. Cognito supports synchronization
of user application data across different devices and has offline support that allows mobile devices to function even when there
is no Internet access.

# Auth0
[Auth0](https://auth0.com/) is a non-AWS identity management product that has a few features that Cognito doesn’t.
Auth0 integrates with more than 30 identity providers, including Google, Facebook, Twitter, Amazon, LinkedIn, and Windows Live.
It provides a way to register new users, through the use of its own user database, without having to integrate with an identity provider.
In addition, it has a facility to import users from other databases.

As expected, Auth0 supports standard industry protocols including SAML, OpenID Connect, OAuth 2.0, OAuth 1.0, and JSON Web Tokens.
It is dead simple to integrate with AWS Identity & Access Management, and with Cognito.

# GraphQL
[GraphQL](http://graphql.org/) is a popular data query language developed by Facebook in 2012 and released publicly in 2015.
It was designed as an alternative to REST (Representational State Transfer) due to REST’s perceived weaknesses
(multiple round-trips, over-fetching, and problems with versioning). GraphQL attempts to solve these problems by providing a
hierarchical, declarative way of performing queries from a single end point.

GraphQL gives power to the client. Instead of specifying the structure of the response on the server, it is defined on the client.
The client can specify what properties and relationships to return. GraphQL aggregates data from multiple sources and returns it to the
client in a single round trip (which makes it an efficient system for retrieving data). According to Facebook, GraphQL serves millions
of requests per second from nearly 1000 different versions of their application.

In serverless architectures, GraphQL is usually hosted and run from a single Lambda function which can be connected to an API Gateway
GraphQL can query and write to multiple data sources (such as DynamoDB tables) and assemble a response that matches the request.
A serverless GraphQL is a rather interesting approach you might want to look at the next time you need to design an interface for your API and query data.

There is a [reference implementation available on Github](https://github.com/graphql/graphql-js/) which is implemented in JavaScript _GraphQL.js_.

There is only one viable GraphQL implementation for Scala available: [Sangria](http://sangria-graphql.org/).

For a list of GraphQL implementations see [Awesome GraphQl overview by C. T. Lin](https://github.com/chentsulin/awesome-graphql#lib-scala).

# Reactive Design Patterns

## Video's
* [Youtube - Stuart Sierra - Functional Design Patterns](https://www.youtube.com/watch?v=etr08mExAI0)

# Links
* [Design Pattern in Simple Examples](http://www.go4expert.com/articles/design-pattern-simple-examples-t5127)
* [Scala Best Practices](https://github.com/alexandru/scala-best-practices)

# TypeTags
A [TypeTag](http://www.scala-lang.org/api/2.11.7/scala-reflect/#scala.reflect.api.TypeTags) encapsulates the runtime 
type representation of some type `T`. The prime use case of `TypeTag`s is to give access to erased types.

There are three different [TypeTags](http://docs.scala-lang.org/overviews/reflection/typetags-manifests.html):

- scala.reflect.api.TypeTags#TypeTag: A full type descriptor of a Scala type. For example, a TypeTag[List[String]] contains all type information, in this case, of type scala.List[String].
- scala.reflect.ClassTag: A partial type descriptor of a Scala type. For example, a ClassTag[List[String]] contains only the erased class type information, in this case, of type scala.collection.immutable.List. ClassTags provide access only to the runtime class of a type. Analogous to scala.reflect.ClassManifest
* [StackOverflow - Scala: What is a TypeTag and how do I use it?](http://stackoverflow.com/questions/12218641/scala-what-is-a-typetag-and-how-do-i-use-it)

# Functional Programming
- [Youtube - Robert C Martin - Functional Programming; What? Why? When?](https://www.youtube.com/watch?v=7Zlp9rKHGD4)
- [Youtube - Robert C Martin - Clean Architecture and Design](https://www.youtube.com/watch?v=Nsjsiz2A9mg)
- [Youtube - Robert C. Martin - The Land that Scrum Forgot](https://www.youtube.com/watch?v=hG4LH6P8Syk)

# Books
* [Software Architecture For Developers](https://leanpub.com/software-architecture-for-developers) - [Simon Brown](https://twitter.com/simonbrown) (2016)

# My notes on Software Architecture for Developers
The book [Software Architecture for Developers](https://leanpub.com/software-architecture-for-developers) is great! 
It demystifies Software Architecture by continuously asking questions and where appropriate putting definitions in 
place when no clear answer could be found based on common sense. Simon Brown did a great job clearing the fog of war that exists in 
software development. It is a must read for everyone creating software. Now let's give [Simon Brown](https://twitter.com/simonbrown) a lot of money, 
buy the book and go read!

Below are my notes and excerpt from the book:
 
## What is software architecture?

 * The software architect is a role, preferably shared and fulfilled by the whole development team, if possible,
 * When the architect's role is fulfilled by a single person, the approach should be `coding`, `coaching` and `collaborative design`,
 * Software architecture is about `structure` and `vision`,
 * Software architecture is about `the high-level structure` of a `software system` and how one gets to an `understanding` of it,
 * Software architecture is about `the significant decisions` that `influence the shape` of a software system,
 * Software architecture is about `the things that are hard or expensive to change`,
 * When a team does not consider software architecture, bad things tend to happen; one could end up with a poorly structured, internal inconsistent software system that are hard to understand, hard to maintain and potentially don't satisfy one or more of the important non-functional requirements such as performance, scalability or security.
 * One should explicitly think about software architecture, it provides a way to introduce technical leadership and stack the odds of a successful delivery in your favor,  
 * Software architecture is `not` about `big design up front`,  

# My notes on The Art of Visualizing Software Architecture
The book [The Art of Visualizing Software Architecture](https://leanpub.com/visualising-software-architecture) teaches a method how to visually
communicate the software architecture which is the static structure of a software system. Below are my notes and excerpt from the book:

## Shared Vocabulary
First of all, it is very important to share the vocabulary that you will be using in the diagrams. We will be using the vocabulary that
consists of `containers`, `components` and `classes/code`. With this shared vocabulary we can draw diagrams at varying levels of abstraction.

 * A software system is a hierarchy of simple building blocks,
 * A software system is made up of one or more `containers` each of which contains one or more `components` which in turn are implemented by one or more `classes`,
 * A `container` can be a web applications, mobile apps, standalone applications, databases, file systems, Microservice, shell script, etc,
 * A `component` is a grouping or `related functionality` encapsulated behind a well defined `interface`,
 * A `component` will be implemented by one or more `classes` so a component contains one or more classes,
 * In OO: a component is made up of classes and interfaces,
 * In FP: A component could be a module which is a logical grouping of related functions, types, etc,
 * In JS: A component could be a JavaScript module, which is made up of a number of objects and functions,
 * In a RDBMS: A component could be a logical grouping of functionality; based upon a number of tables, views, stored procedures, functions, triggers, etc,
 
![Shared Vocabulary](https://leanpub.com/site_images/visualising-software-architecture/shared-vocabulary-1.png) 
 
## The Context Diagram - People and Software Systems
The `context diagram` is useful to get the big picture. It does not show much detail but it does help to set the scene and
is a starting point for other diagrams. The diagram should show how a software system fits in to the overall environment. 
All software systems `should have` a context diagram. The context diagram is usually the starting point for diagramming and 
documenting a software system. 

The context diagram is often drawn during a requirements gathering workshop, to ensure that everybody understands the scope of 
what will be build. The focus should be on `people` (actors, roles, personas, etc) and `software systems` rather than technologies, 
protocols and other low-level details. It is the diagram that you would show non-technical people. 
The diagram should show `people` and `software systems`.

The context diagram helps to answer the questions:
 
 - What is the software system that we are building?
 - Who is using it?
 - How does it fit in with the existing environment?
 
The context diagram shows the following:

 * It makes the context and scope explicit, so that there are no assumptions,
 * It shows what is being added to an existing environment,
 * It is a high-level diagram that technical and non-technical people can use as a starting point for discussions,
 * It provides a starting point for identifying who you potentially need to go and talk to as far as understanding inter-system interfaces is concerned.
 
![Context Diagram](https://leanpub.com/site_images/visualising-software-architecture/context-2.png)
 
## The Container Diagram - High Level Technology Choices
The `container diagram` illustrates the high-level technology choices. It shows the high-level shape of the software architecture
(the static structure) and how responsibilities are distributed across it. It shows the major technology choices and how the containers
communicate with each other. It is a simple `technology-focused` diagram that is useful for `software developers` and `support/operations staff`.
 
The container diagram helps answer the questions:

 - What is the overal shape of the software system?
 - What are the high-level technology decisions?
 - How are responsibilities distributed across the system?
 - How do containers communicate with each other?
 - As a developer, where do I need to write code in order to implement features? 

![Container Diagram](https://leanpub.com/site_images/visualising-software-architecture/containers-1.png)

## CAP theorem
In theoretical computer science, the [CAP theorem](https://en.wikipedia.org/wiki/CAP_theorem), also named Brewer's theorem
after computer scientist Eric Brewer, states that it is impossible for a __distributed computer system__ to _simultaneously_ provide
all three of the following guarantees:

1: __Consistency:__	Every read receives the most recent write or an error
2: __Availability:__ Every request receives a response, without guarantee that it contains the most recent version of the information
3: __Partition tolerance:__	The system continues to operate despite an arbitrary number of messages being dropped by the network between nodes

No distributed system is safe from network failures, thus network partitioning generally has to be tolerated. In the presence of a
partition, one is then left with two options: consistency or availability.

__Choosing consistency over availability:__
When choosing consistency over availability, the system will return an error or a time out if particular information cannot be
guaranteed to be up to date due to network partitioning.

__Choosing availability over consistency:__
When choosing availability over consistency, the system will always process the query and try to return the most recent available
version of the information, even if it cannot guarantee it is up to date due to network partitioning.

In the absence of network failure, that is, when the distributed system is running normally, both availability and consistency
can be satisfied (in case of some database systems, a consistency level can be requested with a query).

CAP is frequently misunderstood as if one had to choose to abandon one of the three guarantees at all times. In fact,
the choice is really between consistency and availability for when a partition happens only; at all other times,
no trade-off has to be made.

Database systems designed with traditional [ACID](https://en.wikipedia.org/wiki/ACID) (Atomicity, Consistency, Isolation, Durability) guarantees in mind such as RDBMS
choose consistency over availability, whereas systems designed around the [BASE](https://en.wikipedia.org/wiki/Eventual_consistency)
philosophy (Eventual Consistency), common in the NoSQL movement for example, choose availability over consistency.

The [PACELC](https://en.wikipedia.org/wiki/PACELC_theorem) theorem builds on CAP by stating that even in the absence of 
partitioning, another trade-off between latency and consistency occurs.

## PACELC theorem
In theoretical computer science, the [PACELC](https://en.wikipedia.org/wiki/PACELC_theorem) theorem is an extension to the
[CAP theorem](https://en.wikipedia.org/wiki/CAP_theorem). It states that in case of network partitioning (P)
in a distributed computer system, one has to choose between availability (A) and consistency (C) (as per the CAP theorem),
but else (E), even when the system is running normally in the absence of partitions, one has to choose between latency (L)
and consistency (C).

PACELC builds on the CAP theorem. Both theorems describe how distributed databases have limitations and tradeoffs regarding
consistency, availability, and partition tolerance. PACELC however goes further and states that a trade-off also exists,
this time between latency and consistency, even in absence of partitions, thus providing a more complete portray of the
potential consistency tradeoffs for distributed systems.

A high availability requirement implies that the system must replicate data. As soon as a distributed system replicates data,
a tradeoff between consistency and latency arises.
