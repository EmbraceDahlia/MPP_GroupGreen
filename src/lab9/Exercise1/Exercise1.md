- A) Java's ArrayList extends AbstractList and implements List, RandomAccess, Cloneable, Serializable, Collection and Iterable
- B) The problem is that Employee class doesn't override equals() function. The one we found there is just an overload method since the parameter is Employee type instead of Object type.
- C) The problem is in removeDuplicates function. containsKey of a Hashmap depends on objects hashcode in addition to equals. Apparently, Employee class don't override hashCode function. Therefore two Employee instance with the same data have different hashcode and comparison fails
- D) The problem is in removeDuplicates function. Employee class have dynamic field isVisited which is modified by removeDuplicates during object comparison. This leads to inconsistencies and some duplicates remain in the filtered list.
- E) 
It is not possible for one class extend multiple classes. Java not allow this
If a class implements two interfaces that provide the same default method, the class must override the method and explicitly decide which to call. The class implementation wins.
If an interface extends two interfaces, like interface D extends interfaces B and C, the interface D must also resolve ambiguity explicitly using B.super.method() or C.super.method().