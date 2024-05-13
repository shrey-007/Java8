### Default Methods
Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.
```java
// A simple program to Test Interface default 
// methods in java 
interface TestInterface 
{ 
	// abstract method 
	public void square(int a); 

	// default method 
	default void show() 
	{ 
	System.out.println("Default Method Executed"); 
	} 
} 

class TestClass implements TestInterface 
{ 
	// implementation of square abstract method 
	public void square(int a) 
	{ 
		System.out.println(a*a); 
	} 

	public static void main(String args[]) 
	{ 
		TestClass d = new TestClass(); 
		d.square(4); 

		// default method executed 
		d.show(); 
	} 
} 

```
The default methods were introduced to provide backward compatibility so that existing interfaces can use the lambda expressions without implementing the methods in the implementation class. Default methods are also known as defender methods or virtual extension methods.

### Static Methods
The interfaces can have static methods as well which is similar to static method of classes.

```java 
// A simple Java program to TestClassnstrate static 
// methods in java 
interface TestInterface 
{ 
	// abstract method 
	public void square (int a); 

	// static method 
	static void show() 
	{ 
		System.out.println("Static Method Executed"); 
	} 
} 

class TestClass implements TestInterface 
{ 
	// Implementation of square abstract method 
	public void square (int a) 
	{ 
		System.out.println(a*a); 
	} 

	public static void main(String args[]) 
	{ 
		TestClass d = new TestClass(); 
		d.square(4); 

		// Static method executed 
		TestInterface.show(); 
	} 
} 

```
