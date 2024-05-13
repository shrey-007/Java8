Generics is most important for type safety.
```java
// in this list we can insert any object
 List list1=new ArrayList();
// in this list we can only insert Integer object
List<Integer> list2=new ArrayList<>();

```
If we try to insert String object in list2 then it will give compile time error, which can be easily resolved.  

Suppose there is a software in production environment. There is a method1 which accepts a integer list from method2. If we dont use generics and method2 generates list of String then it will give runtime error which will crash our software. So it is advisable to use generics. If we use generics then it will give compile time error which developer can solve easily before sending the software to production environment.   