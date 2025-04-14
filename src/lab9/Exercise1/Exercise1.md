- A) List, RandomAccess, Cloneable, Serializable, Collection, Iterable
- B) The problem is in listsAreEqual funnction. Since Employee don't override equals() and hashCode() functions homarison happends only by the hashcode. For each Employee hashcode is different, therefore comparison would always return false
- C) The problem is in removeDuplicates function. containsKey of a Hashmap depends on objects hashcode. Apparently, Employee class don't overrite hashCode function. Therefore two Employee istances with the same data have different hashcode and comparison fails
- D) The problem in in removeDuplicates function. Employee class have dynamic field isVisited which is modified by removeDuplicates during object comparison. This leads to incosistencies and some dublicates remain in the filtered list.
- E) 
- 1. It is not possible for one class extend multiple classes. Java not allow this
- 2. If a class implements two interfaces that provide the same default method, the class must override the method and explicitly decide which to call.

