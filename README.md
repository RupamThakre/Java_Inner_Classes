# Inner classes in Java

In Java, 4 types of inner classes are there
1. Member Inner Class
2. Static Nested Class
3. Local Inner Class
4. Anonymous Inner Class

# Member Inner Class

- Inner Class is associated to the Outer class existence
- Inner Class would behave as a member of Outer class that's why called member inner class

Ex. Car & Engine
- Since engine is working as property for a car, so why maintain engine class separately

Without Inner Class
```java
Car car = new Car("fronx");
Engine engine = new Engine(car); //need to pass engine type
```

With Inner Class
```java
Car.Engine engine = car.new Engine();
```
