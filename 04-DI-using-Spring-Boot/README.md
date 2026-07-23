# Dependency Injection using Spring Boot

## Objective

Learn how Spring Boot automatically creates and injects objects (beans) using annotations instead of manually creating them with the `new` keyword.

## What is Dependency Injection?

Dependency Injection (DI) is a design pattern where Spring provides the required objects (dependencies) to a class instead of the class creating them itself.

## How Spring Boot Performs DI

1. Spring scans classes marked with `@Component`.
2. It creates objects (beans) and stores them in the IoC Container.
3. When another bean requires a dependency, Spring injects it automatically.

## Annotations Used

### @SpringBootApplication
Marks the main class of a Spring Boot application.

### @Component
Registers a class as a Spring Bean.

## Advantages

- Loose coupling
- Easy maintenance
- Better testing
- Cleaner code

## What I Learned

- How Spring Boot manages beans.
- How dependencies are injected automatically.
- Why Dependency Injection is better than creating objects manually.



Autowiring using Spring Boot.
