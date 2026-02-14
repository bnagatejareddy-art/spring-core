# Spring Core Examples

A comprehensive collection of Spring Core examples demonstrating various features and concepts.

## Overview

This project provides practical examples of Spring Core framework features including:
- Dependency Injection (DI)
- Bean Lifecycle Management
- Bean Scopes
- Different Configuration Approaches (XML, Java, Annotations)
- ApplicationContext vs BeanFactory

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Project Structure

```
spring-core-examples/
├── src/main/java/com/springcore/
│   ├── di/                    # Dependency Injection examples
│   │   ├── MessageService.java
│   │   ├── EmailService.java
│   │   ├── SMSService.java
│   │   ├── ConstructorInjectionExample.java
│   │   ├── SetterInjectionExample.java
│   │   └── FieldInjectionExample.java
│   ├── lifecycle/             # Bean Lifecycle examples
│   │   ├── BeanLifecycleExample.java
│   │   └── AnnotationLifecycleExample.java
│   ├── scopes/                # Bean Scopes examples
│   │   ├── SingletonBean.java
│   │   └── PrototypeBean.java
│   ├── config/                # Configuration classes
│   │   └── JavaConfig.java
│   └── app/                   # Application classes
│       ├── XmlConfigApp.java
│       ├── JavaConfigApp.java
│       └── BeanFactoryApp.java
└── src/main/resources/
    └── applicationContext.xml  # XML configuration
```

## Building the Project

```bash
mvn clean compile
```

## Running Examples

### 1. XML-Based Configuration

Demonstrates Spring configuration using XML files.

```bash
mvn exec:java -Dexec.mainClass="com.springcore.app.XmlConfigApp"
```

**Features demonstrated:**
- Constructor injection
- Setter injection
- Bean lifecycle with InitializingBean/DisposableBean
- Custom init/destroy methods
- Singleton and Prototype scopes

### 2. Java-Based Configuration

Demonstrates Spring configuration using Java annotations and @Configuration classes.

```bash
mvn exec:java -Dexec.mainClass="com.springcore.app.JavaConfigApp"
```

**Features demonstrated:**
- Field injection with @Autowired
- @PostConstruct and @PreDestroy annotations
- @Bean and @Configuration annotations
- Bean scopes with @Scope annotation

### 3. BeanFactory Example

Demonstrates the difference between BeanFactory and ApplicationContext.

```bash
mvn exec:java -Dexec.mainClass="com.springcore.app.BeanFactoryApp"
```

**Features demonstrated:**
- Lazy initialization with BeanFactory
- Basic container functionality

## Key Concepts Explained

### Dependency Injection (DI)

Spring supports three types of dependency injection:

1. **Constructor Injection** - Dependencies are provided through class constructor
   - Most recommended approach
   - Ensures immutability
   - Makes dependencies explicit

2. **Setter Injection** - Dependencies are provided through setter methods
   - Allows optional dependencies
   - Provides flexibility

3. **Field Injection** - Dependencies are injected directly into fields using @Autowired
   - Simplest syntax
   - Less testable

### Bean Lifecycle

Spring manages the complete lifecycle of beans:

1. **Instantiation** - Bean constructor is called
2. **Dependency Injection** - Dependencies are injected
3. **Initialization Callbacks**:
   - `@PostConstruct` method (if present)
   - `afterPropertiesSet()` from InitializingBean interface
   - Custom init method (specified in configuration)
4. **Bean Ready** - Bean is ready for use
5. **Destruction Callbacks** (when context closes):
   - `@PreDestroy` method (if present)
   - `destroy()` from DisposableBean interface
   - Custom destroy method (specified in configuration)

### Bean Scopes

1. **Singleton** (default) - One instance per Spring IoC container
   - Shared across the application
   - Same instance returned for all requests

2. **Prototype** - New instance created for each request
   - Not shared
   - Different instance for each getBean() call

### Configuration Approaches

1. **XML Configuration** - Traditional approach using XML files
   - Externalized configuration
   - Clear separation between code and configuration

2. **Java Configuration** - Modern approach using @Configuration classes
   - Type-safe
   - Refactoring-friendly
   - IDE support

3. **Annotation-based** - Using annotations like @Component, @Service, etc.
   - Minimal configuration
   - Convention over configuration

### ApplicationContext vs BeanFactory

- **BeanFactory** - Basic container with lazy initialization
- **ApplicationContext** - Advanced container with eager initialization and additional features
  - Event propagation
  - Declarative mechanisms
  - Internationalization

## Learn More

- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Spring Core Concepts](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html)

## License

This project is for educational purposes.