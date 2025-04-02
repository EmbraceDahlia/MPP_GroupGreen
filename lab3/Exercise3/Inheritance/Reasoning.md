In this case inheritance is excessive for couple reasons:
1) Extending circle is not correct, since it violates IS-A principle. Cylinder is NOT a Circle
2) Inheritance in example probably was done only to reuse radius functionality of a circle. But it might bring errors in a future.
3) We might expect ripple effect problems in a future from the Circle class
