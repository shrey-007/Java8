Sequence of reading-:
lambda &rarr; streamAPI &rarr; defaultAndStatic &rarr; methodReferences

Java has forever remained an Object-Oriented Programming languageThere are no solely functions present in a programming language called Java. Functions in the Java programming language are part of a class, and if someone wants to use them, they have to use the class or object of the class to call any function.  
From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface(Interface with one abstract method and any number of default and static methods)  
Some examples of Functional Interface-:
1) Runnable &rarr; This interface only contains the run() method.
2) Comparable &rarr; This interface only contains the compareTo() method.

Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations as mentioned below:
1) Consumer-: Accepts only one argument and returns nothing.
2) Predicate-: Accepts a single value or argument and does some sort of processing on it, and returns a boolean (True/ False) answer
3) Function-: A function is a type of functional interface in Java that receives only a single argument and returns a value after the required processing
4) Supplier-: The Supplier functional interface is also a type of functional interface that does not take any input or argument and yet returns a single output. This type of functional interface is generally used in the lazy generation of values. Supplier functional interfaces are also used for defining the logic for the generation of any sequence. For example – The logic behind the Fibonacci Series can be generated with the help of the Stream. generate method, which is implemented by the Supplier functional Interface. 

