# Autowiring using Spring Boot

## Objective

Learn how Spring automatically injects required dependencies using the `@Autowired` annotation.

## What is Autowiring?

Autowiring is a feature of Spring that automatically injects the required bean into another bean.

Instead of manually creating objects, Spring finds the appropriate bean and injects it.

## Annotation Used

### @Autowired

Automatically injects the required dependency from the Spring IoC Container.

## Types of Dependency Injection

- Field Injection
- Constructor Injection (Recommended)
- Setter Injection

## When Multiple Beans Exist

If multiple beans of the same type are available, Spring may become confused.

To resolve this, we can use:

- `@Qualifier`
- `@Primary`

## Advantages

- Less boilerplate code
- Loose coupling
- Easier maintenance
- Better readability

## What I Learned

- How `@Autowired` works.
- Different ways to inject dependencies.
- How Spring resolves bean dependencies.


Spring Boot Web.
