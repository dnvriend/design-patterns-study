# Design Patterns Study
This project is a study into object oriented and functional design patterns, implemented in Scala. It is for my own study 
and future reference but if you find the subject matter interesting and if the information here helps you in your study
then I would be glad! :)

[![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

I'm confident in having a good understanding of design patterns, and enough insight / experience when to apply them
is key into creating agile software and therefor supporting the goals of agile software development like [Disciplined
Agile Delivery](http://www.disciplinedagiledelivery.com/).

> Patterns always have two parts: the how and the when. Not just do you need to know how to implement them, you also have to know when to use them and when to leave them alone. <quote>Martin Fowler</quote>

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

# Object Oriented Design Patterns
The following (23) patterns describe creational, structural and behavioral patterns are fully described in the Gang of Four
book 'Design Patterns: Elements of Reusable Object-Oriented Software'

## Creational (5)
Creational patterns are patterns that create object for you; hence creational. The goal here is, rather than having your 
code instant object directly and therefor having all the logic about how to create (sometimes complex initialization 
logic surrounding objects), the creational pattern will do that for you. This has a second benefit, in that having all
the creational logic in one place, changes to that logic will propagate to where the new object is needed. 

* Abstract factory pattern: groups object factories that have a common theme.
* Builder pattern: constructs complex objects by separating construction and representation.
* __Factory method pattern__: creates objects without specifying the exact class to create.
* Prototype pattern: creates objects by cloning an existing object.
* __Singleton pattern__: restricts object creation for a class to only one instance.

## Structural (7)
Structural patterns concern class and object composition; hence structural. They use inheritance to compose interfaces 
and define ways to compose objects to obtain new functionality.

* __Adapter pattern:__ allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
* Bridge pattern: decouples an abstraction from its implementation so that the two can vary independently.
* __Composite pattern:__ composes zero-or-more similar objects so that they can be manipulated as one object.
* __Decorator pattern:__ dynamically adds/overrides behaviour in an existing method of an object.
* __Facade pattern:__ provides a simplified interface to a large body of code.
* Flyweight pattern: reduces the cost of creating and manipulating a large number of similar objects.
* __Proxy pattern:__  provides a placeholder for another object to control access, reduce cost, and reduce complexity.

## Behavioral (11)
Behavioral patterns are specifically concerned with communication between objects, hence behavioral.

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

## DTO’S, DDD & THE ANEMIC DOMAIN MODEL
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
The first five principles are principles of class design. They are:
- __SRP:__ [Single Reponsibility Principle](https://drive.google.com/file/d/0ByOwmqah_nuGNHEtcU5OekdDMkk/view): “A class should have one, and only one, reason to change”. => THERE SHOULD NEVER BE MORE THAN ONE REASON FOR A CLASS TO CHANGE.
- __OCP:__ Open-Closed Principle:  “You should be able to extend a class’s behavior, without modifying it” => SOFTWARE ENTITIES (CLASSES, MODULES, FUNCTIONS, ETC.) SHOULD BE OPEN FOR EXTENSION BUT CLOSED FOR MODIFICATION. 
- __LSP:__ Liskov Substitution Principle: “Derived classes must be substitutable for their base classes.” => FUNCTIONS THAT USE ... REFERENCES TO BASE CLASSES MUST BE ABLE TO USE OBJECTS OF DERIVED CLASSES WITHOUT KNOWING IT.
- __ISP:__  Interface Segregation Principle: “Make fine grained interfaces that are client specific.” => CLIENTS SHOULD NOT BE FORCED TO DEPEND UPON INTERFACES THAT THEY DO NOT USE
- __DIP:__ Dependency Inversion Principle: “Depend on abstrations, not on concretions.” => A. HIGH LEVEL MODULES SHOULD NOT DEPEND UPON LOW LEVEL MODULES. BOTH SHOULD DEPEND UPON ABSTRACTIONS B. ABSTRACTIONS SHOULD NOT DEPEND UPON DETAILS. DETAILS SHOULD DEPEND UPON ABSTRACTIONS.

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

Abstraction is important
  [SOLID principles of Object-Oriented design](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design). 
  The SOLID principles are guidelines which seek to balance implementation simplicity, scalability, and robustness. 
  Specifically, by contrasting an ADM design with an RDM design for a hypothetical problem.


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

# Reactive Design Patterns

## Video's
* [Stuart Sierra - Functional Design Patterns](https://www.youtube.com/watch?v=etr08mExAI0)

# Links
* [Design Pattern in Simple Examples](http://www.go4expert.com/articles/design-pattern-simple-examples-t5127)
* [Scala Best Practices](https://github.com/alexandru/scala-best-practices)

# Books
* Pattern oriented software architecture
