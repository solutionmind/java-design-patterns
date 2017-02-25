# java-design-patterns

List of Design Patterns - 

Creational Patterns
Creational design patterns abstract the instantiation process. They help make a system independent of how its objects are created, composed, and represented.

•	Abstract Factory
•	Builder
•	Factory Method
•	Prototype
•	Property
•	Singleton
•	Multiton
•	Object Pool

Structural Patterns
Structural patterns are concerned with how classes and objects are composed to form larger structures.
•	Adapter
•	Bridge
•	Composite
•	Decorator
•	Facade
•	Flyweight
•	Proxy
•	Service Locator
•	Servant
•	Event Aggregator

Behavioral Patterns
Behavioral patterns are concerned with algorithms and the assignment of responsibilites between objects.
•	Chain of responsibility
•	Command
•	Interpreter
•	Iterator
•	Mediator
•	Memento
•	Observer
•	State
•	Strategy
•	Template method
•	Visitor
•	Null Object
•	Intercepting Filter
•	Specification
•	Dependency Injection

Concurrency Patterns
Concurrency patterns are those types of design patterns that deal with the multi-threaded programming paradigm.
•	Double Checked Locking
•	Thread Pool

Presentation Tier Patterns
Presentation Tier patterns are the top-most level of the application, this is concerned with translating tasks and results to something the user can understand.
•	Model-View-Controller
•	Model-View-Presenter
•	Flux

Architectural Patterns
An architectural pattern is a general, reusable solution to a commonly occurring problem in software architecture within a given context.
•	Data Access Object
•	Service Layer



Integration Patterns
Integration patterns are concerned with how software applications communicate and exchange data.
•	Tolerant Reader
•	Idioms
A programming idiom is a means of expressing a recurring construct in one or more programming languages. Generally speaking, a programming idiom is an expression of a simple task, algorithm, or data structure that is not a built-in feature in the programming language being used, or, conversely, the use of an unusual or notable feature that is built into a programming language. What distinguishes idioms from patterns is generally the size, the idioms tend to be something small while the patterns are larger.
•	Execute Around
•	Poison Pill
•	Callback
•	Lazy Loading
•	Double Dispatch
•	Resource Acquisition Is Initialization
•	Private Class Data

Abstract Factory ↑
Intent: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
alt text

Applicability: Use the Abstract Factory pattern when

a system should be independent of how its products are created, composed and represented
a system should be configured with one of multiple families of products
a family of related product objects is designed to be used together, and you need to enforce this constraint
you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
Real world examples:

javax.xml.parsers.DocumentBuilderFactory

Builder ↑

Intent: Separate the construction of a complex object from its representation so that the same construction process can create different representations.

alt text

Applicability: Use the Builder pattern when

the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
the construction process must allow different representations for the object that's constructed
Real world examples:

java.lang.StringBuilder
Apache Camel builders
Factory Method ↑

Intent: Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

alt text

Applicability: Use the Factory Method pattern when

a class can't anticipate the class of objects it must create
a class wants its subclasses to specify the objects it creates
classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate
Prototype ↑

Intent: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

alt text

Applicability: Use the Prototype pattern when a system should be independent of how its products are created, composed and represented; and

when the classes to instantiate are specified at run-time, for example, by dynamic loading; or
to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state
Real world examples:

java.lang.Object#clone()
Singleton ↑

Intent: Ensure a class only has one instance, and provide a global point of access to it.

alt text

Applicability: Use the Singleton pattern when

there must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code
Typical Use Case:

the logging class
managing a connection to a database
file manager
Real world examples:

java.lang.Runtime#getRuntime()
Adapter ↑

Intent: Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

alt text

Applicability: Use the Adapter pattern when

you want to use an existing class, and its interface does not match the one you need
you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.
Real world examples:

java.util.Arrays#asList()
Bridge ↑

Intent: Decouple an abstraction from its implementation so that the two can vary independently.

alt text

Applicability: Use the Bridge pattern when

you want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example, when the implementation must be selected or switched at run-time.
both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern lets you combine the different abstractions and implementations and extend them independently
changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
you have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts. Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies
you want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden from the client. A simple example is Coplien's String class, in which multiple objects can share the same string representation.
Composite ↑

Intent: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

alt text

Applicability: Use the Composite pattern when

you want to represent part-whole hierarchies of objects
you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly
Real world examples:

java.awt.Container and java.awt.Component
Apache Wicket component tree, see Component and MarkupContainer
Decorator ↑

Intent: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

alt text

Applicability: Use Decorator

to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects
for responsibilities that can be withdrawn
when extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of sublasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing
Facade ↑

Intent: Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

alt text

Applicability: Use the Facade pattern when

you want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but it also becomes harder to use for clients that don't need to customize it. A facade can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the facade.
there are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
you want to layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent, the you can simplify the dependencies between them by making them communicate with each other solely through their facades
Flyweight ↑

Intent: Use sharing to support large numbers of fine-grained objects efficiently.

alt text

Applicability: The Flyweight pattern's effectiveness depends heavily on how and where it's used. Apply the Flyweight pattern when all of the following are true

an application uses a large number of objects
storage costs are high because of the sheer quantity of objects
most object state can be made extrinsic
many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
the application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.
Real world examples:

java.lang.Integer#valueOf(int)
Proxy ↑

Intent: Provide a surrogate or placeholder for another object to control access to it.

alt text

Applicability: Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. Here are several common situations in which the Proxy pattern is applicable

a remote proxy provides a local representative for an object in a different address space.
a virtual proxy creates expensive objects on demand.
a protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.
Typical Use Case:

Control access to another object
Lazy initialization
implement logging
facilitate network connection
to count references to an object
Real world examples:

java.lang.reflect.Proxy
Apache Commons Proxy
Service Locator ↑

Intent: Encapsulate the processes involved in obtaining a service with a strong abstraction layer.

alt text

Applicability: The service locator pattern is applicable whenever we want to locate/fetch various services using JNDI which, typically, is a redundant and expensive lookup. The service Locator pattern addresses this expensive lookup by making use of caching techniques ie. for the very first time a particular service is requested, the service Locator looks up in JNDI, fetched the relavant service and then finally caches this service object. Now, further lookups of the same service via Service Locator is done in its cache which improves the performance of application to great extent.

Typical Use Case:

When network hits are expensive and time consuming
lookups of services are done quite frequently
large number of services are being used
Chain of responsibility ↑

Intent: Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

alt text

Applicability: Use Chain of Responsibility when

more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically
you want to issue a request to one of several objects without specifying the receiver explicitly
the set of objects that can handle a request should be specified dynamically
Real world examples:

java.util.logging.Logger#log()
Apache Commons Chain
Command ↑

Intent: Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

alt text

Applicability: Use the Command pattern when you want to

parameterize objects by an action to perform. You can express such parameterization in a procedural language with a callback function, that is, a function that's registered somewhere to be called at a later point. Commands are an object-oriented replacement for callbacks.
specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there
support undo. The Command's execute operation can store state for reversing its effects in the command itself. The Command interface must have an added Unexecute operation that reverses the effects of a previous call to execute. Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards and forwards calling unexecute and execute, respectively
support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged commands from disk and re-executing them with the execute operation
structure a system around high-level operations build on primitive operations. Such a structure is common in information systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also makes it easy to extend the system with new transactions
Typical Use Case:

to keep a history of requests
implement callback functionality
implement the undo functionality
Real world examples:

java.lang.Runnable
Interpreter ↑

Intent: Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

alt text

Applicability: Use the Interpreter pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter pattern works best when

the grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax trees, which can save space and possibly time
efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable
Iterator ↑

Intent: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

alt text

Applicability: Use the Iterator pattern

to access an aggregate object's contents without exposing its internal representation
to support multiple traversals of aggregate objects
to provide a uniform interface for traversing different aggregate structures
Real world examples:

java.util.Iterator
Mediator ↑

Intent: Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

alt text

Applicability: Use the Mediator pattern when

a set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand
reusing an object is difficult because it refers to and communicates with many other objects
a behavior that's distributed between several classes should be customizable without a lot of subclassing
Memento ↑

Intent: Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

alt text

Applicability: Use the Memento pattern when

a snapshot of an object's state must be saved so that it can be restored to that state later, and
a direct interface to obtaining the state would expose implementation details and break the object's encapsulation
Real world examples:

java.util.Date
Observer ↑

Intent: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

alt text

Applicability: Use the Observer pattern in any of the following situations

when an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently
when a change to one object requires changing others, and you don't know how many objects need to be changed
when an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled
Typical Use Case:

changing in one object leads to a change in other objects
Real world examples:

java.util.Observer
State ↑

Intent: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

alt text

Applicability: Use the State pattern in either of the following cases

an object's behavior depends on its state, and it must change its behavior at run-time depending on that state
operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class. This lets you treat the object's state as an object in its own right that can vary independently from other objects.
Strategy ↑

Intent: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

alt text

Applicability: Use the Strategy pattern when

many related classes differ only in their behavior. Strategies provide a way to configure a class either one of many behaviors
you need different variants of an algorithm. for example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures
a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class
Template method ↑

Intent: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

alt text

Applicability: The Template Method pattern should be used

to implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary
when common behavior among subclasses should be factored and localized in a common class to avoid code duplication. This is good example of "refactoring to generalize" as described by Opdyke and Johnson. You first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations
to control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points
Visitor ↑

Intent: Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

alt text

Applicability: Use the Visitor pattern when

an object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes
many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the object structure is shared by many applications, use Visitor to put operations in just those applications that need them
the classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure classes change often, then it's probably better to define the operations in those classes
Real world examples:

Apache Wicket component tree, see MarkupContainer
Model-View-Presenter ↑

Intent: Apply a "Separation of Concerns" principle in a way that allows developers to build and test user interfaces.

alt text

Applicability: Use the Model-View-Presenter in any of the following situations

when you want to improve the "Separation of Concerns" principle in presentation logic
when a user interface development and testing is necessary.
Data Access Object ↑

Intent: Object provides an abstract interface to some type of database or other persistence mechanism.

alt text

Applicability: Use the Data Access Object in any of the following situations

when you want to consolidate how the data layer is accessed
when you want to avoid writing multiple data retrieval/persistence layers
Double Checked Locking ↑

Intent: Reduce the overhead of acquiring a lock by first testing the locking criterion (the "lock hint") without actually acquiring the lock. Only if the locking criterion check indicates that locking is required does the actual locking logic proceed.

alt text

Applicability: Use the Double Checked Locking pattern when

there is a concurrent access in object creation, e.g. singleton, where you want to create single instance of the same class and checking if it's null or not maybe not be enough when there are two or more threads that checks if instance is null or not.
there is a concurrent access on a method where method's behaviour changes according to the some constraints and these constraint change within this method.
Servant ↑

Intent: Servant is used for providing some behavior to a group of classes. Instead of defining that behavior in each class - or when we cannot factor out this behavior in the common parent class - it is defined once in the Servant.

alt text

Applicability: Use the Servant pattern when

When we want some objects to perform a common action and don't want to define this action as a method in every class.
Null Object ↑

Intent: In most object-oriented languages, such as Java or C#, references may be null. These references need to be checked to ensure they are not null before invoking any methods, because methods typically cannot be invoked on null references. Instead of using a null reference to convey absence of an object (for instance, a non-existent customer), one uses an object which implements the expected interface, but whose method body is empty. The advantage of this approach over a working default implementation is that a Null Object is very predictable and has no side effects: it does nothing.

alt text

Applicability: Use the Null Object pattern when

You want to avoid explicit null checks and keep the algorithm elegant and easy to read.
Event Aggregator ↑

Intent: A system with lots of objects can lead to complexities when a client wants to subscribe to events. The client has to find and register for each object individually, if each object has multiple events then each event requires a separate subscription. An Event Aggregator acts as a single source of events for many objects. It registers for all the events of the many objects allowing clients to register with just the aggregator.

alt text

Applicability: Use the Event Aggregator pattern when

Event Aggregator is a good choice when you have lots of objects that are potential event sources. Rather than have the observer deal with registering with them all, you can centralize the registration logic to the Event Aggregator. As well as simplifying registration, a Event Aggregator also simplifies the memory management issues in using observers.
Callback ↑

Intent: Callback is a piece of executable code that is passed as an argument to other code, which is expected to call back (execute) the argument at some convenient time.

alt text

Applicability: Use the Callback pattern when

When some arbitrary synchronous or asynchronous action must be performed after execution of some defined activity.
Real world examples:

CyclicBarrier constructor can accept callback that will be triggered every time when barrier is tripped.
Intercepting Filter ↑

Intent: Provide pluggable filters to conduct necessary pre-processing and post-processing to requests from a client to a target

alt text

Applicability: Use the Intercepting Filter pattern when

a system uses pre-processing or post-processing requests
a system should do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers
you want a modular approach to configuring pre-processing and post-processing schemes
Execute Around ↑

Intent: Execute Around idiom frees the user from certain actions that should always be executed before and after the business method. A good example of this is resource allocation and deallocation leaving the user to specify only what to do with the resource.

alt text

Applicability: Use the Execute Around idiom when

You use an API that requires methods to be called in pairs such as open/close or allocate/deallocate.
Property ↑

Intent: Create hierarchy of objects and new objects using already existing objects as parents.

alt text

Applicability: Use the Property pattern when

when you like to have objects with dynamic set of fields and prototype inheritance
Real world examples:

JavaScript prototype inheritance
Poison Pill ↑

Intent: Poison Pill is known predefined data item that allows to provide graceful shutdown for separate distributed consumption process.

alt text

Applicability: Use the Poison Pill idiom when

need to send signal from one thread/process to another to terminate
Real world examples:

akka.actor.PoisonPill
Lazy Loading ↑

Intent: Lazy loading is a design pattern commonly used to defer initialization of an object until the point at which it is needed. It can contribute to efficiency in the program's operation if properly and appropriately used.

alt text

Applicability: Use the Lazy Loading idiom when

eager loading is expensive or the object to be loaded might not be needed at all
Real world examples:

JPA annotations @OneToOne, @OneToMany, @ManyToOne, @ManyToMany and fetch = FetchType.LAZY
Service Layer ↑

Intent: Service Layer is an abstraction over domain logic. Typically applications require multiple kinds of interfaces to the data they store and logic they implement: data loaders, user interfaces, integration gateways, and others. Despite their different purposes, these interfaces often need common interactions with the application to access and manipulate its data and invoke its business logic. The Service Layer fulfills this role.

alt text

Applicability: Use the Service Layer pattern when

you want to encapsulate domain logic under API
you need to implement multiple interfaces with common logic and data
Specification ↑

Intent: Specification pattern separates the statement of how to match a candidate, from the candidate object that it is matched against. As well as its usefulness in selection, it is also valuable for validation and for building to order

alt text

Applicability: Use the Specification pattern when

You need to select a subset of objects based on some criteria, and to refresh the selection at various times
You need to check that only suitable objects are used for a certain role (validation)
Tolerant Reader ↑

Intent: Tolerant Reader is an integration pattern that helps creating robust communication systems. The idea is to be as tolerant as possible when reading data from another service. This way, when the communication schema changes, the readers must not break.

alt text

Applicability: Use the Tolerant Reader pattern when

The communication schema can evolve and change and yet the receiving side should not break
Model-View-Controller ↑

Intent: Separate the user interface into three interconnected components: the model, the view and the controller. Let the model manage the data, the view display the data and the controller mediate updating the data and redrawing the display.

alt text

Applicability: Use the Model-View-Controller pattern when

you want to clearly separate the domain data from its user interface representation
Flux ↑

Intent: Flux eschews MVC in favor of a unidirectional data flow. When a user interacts with a view, the view propagates an action through a central dispatcher, to the various stores that hold the application's data and business logic, which updates all of the views that are affected.

alt text

Applicability: Use the Flux pattern when

You want to focus on creating explicit and understandable update paths for your application's data, which makes tracing changes during development simpler and makes bugs easier to track down and fix.
Double Dispatch ↑

Intent: Double Dispatch pattern is a way to create maintainable dynamic behavior based on receiver and parameter types.

alt text

Applicability: Use the Double Dispatch pattern when

The dynamic behavior is not defined only based on receiving object's type but also on the receiving method's parameter type.
Real world examples:

ObjectOutputStream
Multiton ↑

Intent: Ensure a class only has limited number of instances, and provide a global point of access to them.

alt text

Applicability: Use the Multiton pattern when

there must be specific number of instances of a class, and they must be accessible to clients from a well-known access point
Resource Acquisition Is Initialization ↑

Intent: Resource Acquisition Is Initialization pattern can be used to implement exception safe resource management.

alt text

Applicability: Use the Resource Acquisition Is Initialization pattern when

You have resources that must be closed in every condition
Thread Pool ↑

Intent: It is often the case that tasks to be executed are short-lived and the number of tasks is large. Creating a new thread for each task would make the system spend more time creating and destroying the threads than executing the actual tasks. Thread Pool solves this problem by reusing existing threads and eliminating the latency of creating new threads.

alt text

Applicability: Use the Thread Pool pattern when

You have a large number of short-lived tasks to be executed in parallel
Private Class Data ↑

Intent: Private Class Data design pattern seeks to reduce exposure of attributes by limiting their visibility. It reduces the number of class attributes by encapsulating them in single Data object.

alt text

Applicability: Use the Private Class Data pattern when

You want to prevent write access to class data members
Object Pool ↑

Intent: When objects are expensive to create and they are needed only for short periods of time it is advantageous to utilize the Object Pool pattern. The Object Pool provides a cache for instantiated objects tracking which ones are in use and which are available.

alt text

Applicability: Use the Object Pool pattern when

The objects are expensive to create (allocation cost)
You need a large number of short-lived objects (memory fragmentation)
Dependency Injection ↑

Intent: Dependency Injection is a software design pattern in which one or more dependencies (or services) are injected, or passed by reference, into a dependent object (or client) and are made part of the client's state. The pattern separates the creation of a client's dependencies from its own behavior, which allows program designs to be loosely coupled and to follow the inversion of control and single responsibility principles.

alt text

Applicability: Use the Dependency Injection pattern when

When you need to remove knowledge of concrete implementation from object
To enable unit testing of classes in isolation using mock objects or stubs
Frequently asked questions

Q: What is the difference between State and Strategy patterns?

While the implementation is similar they solve different problems. The State pattern deals with what state an object is in - it encapsulates state-dependent behavior. The Strategy pattern deals with how an object performs a certain task - it encapsulates an algorithm.

Q: What is the difference between Strategy and Template Method patterns?

In Template Method the algorithm is chosen at compile time via inheritance. With Strategy pattern the algorithm is chosen at runtime via composition.

Q: What is the difference between Proxy and Decorator patterns?

The difference is the intent of the patterns. While Proxy controls access to the object Decorator is used to add responsibilities to the object.

Q: What is the difference between Chain of Responsibility and Intercepting Filter patterns?

While the implementations look similar there are differences. The Chain of Responsibility forms a chain of request processors and the processors are then executed one by one until the correct processor is found. In Intercepting Filter the chain is constructed from filters and the whole chain is always executed.

Q: What is the difference between Visitor and Double Dispatch patterns?

The Visitor pattern is a means of adding a new operation to existing classes. Double dispatch is a means of dispatching function calls with respect to two polymorphic types, rather than a single polymorphic type, which is what languages like C++ and Java support directly.

Q: What are the differences between Flyweight and Object Pool patterns?

They differ in the way they are used.

Pooled objects can simultaneously be used by a single "client" only. For that, a pooled object must be checked out from the pool, then it can be used by a client, and then the client must return the object back to the pool. Multiple instances of identical objects may exist, up to the maximal capacity of the pool.

In contrast, a Flyweight object is singleton, and it can be used simultaneously by multiple clients.

As for concurrent access, pooled objects can be mutable and they usually don't need to be thread safe, as typically, only one thread is going to use a specific instance at the same time. Flyweight must either be immutable (the best option), or implement thread safety.

As for performance and scalability, pools can become bottlenecks, if all the pooled objects are in use and more clients need them, threads will become blocked waiting for available object from the pool. This is not the case with Flyweight.
