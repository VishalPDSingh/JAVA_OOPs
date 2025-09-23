# Object-Oriented Programming ✨

## Programming Paradigm in Java ☕
Programming paradigm is a way or an  
approach to solve any problem or to achieve any task  
using any programming language.  
Programming paradigms are a way to classify  
programming languages based on their features.  

There are 2 classifications of programming  
paradigms:  
1. Imperative Programming Paradigm 🖥️  
2. Declarative Programming Paradigm 📜  

# Difference between Imperative & Declarative Programming Paradigm ⚡

## 1. Programming Style 🎯
- **Imperative**: We have to specify every task step by step.  
- **Declarative**: We only define the problem to achieve the task.

## 2. Task 📝
- **Imperative**: User makes the decisions and commands to the compiler.  
- **Declarative**: Compiler is allowed to make decisions.

## 3. Smartness 🧠
- **Imperative**: User is more smart compared to the system.  
- **Declarative**: System is more smart compared to the user.

## 4. Programming Focus 🔍
- **Imperative**: Focuses on **"How"** to achieve the result.  
- **Declarative**: Focuses on **"What"** result is required.

## 5. Primary Flow Control 🔄
- **Imperative**: Loops, conditionals, functions/methods, etc.  
- **Declarative**: Function calls (including recursion).

## 6. Examples 💻
- **Imperative**: FORTRAN, Assembly, COBOL, C, C++, Java, Python, etc.  
- **Declarative**: SQL, Haskell, Prolog, etc.

# Diagram for Programming Paradigm 🌐

| Imperative ⚙️ | Declarative 📜 |
|---------------|----------------|
| Unstructured Programming Languages | Logic-Based Languages (Prolog) |
| Structured Programming Languages   | Functional Languages (Haskell) |
| Procedural Programming Languages   | Domain-Specific Languages |
| Object-Oriented Programming Languages | etc... |
| etc... |  |

# Unstructured Programming Paradigm 🏗️

1. These were the first programming language categories introduced at the early stage of computers.  
2. Examples: **FORTRAN, COBOL, BASIC** etc.  
3. These languages had no fixed structure or standard way to achieve a task or solve a problem.  
4. Mnemonic codes were used for instructions.  
5. Flow control was achieved using the **`goto`** statement.  
6. Hard to learn and difficult to achieve tasks because the number of lines of code increased significantly. 🚧  

# Structured Programming Paradigm 🏛️

1. Introduced after the **Unstructured Programming Paradigm** and still in use today.  
2. Examples: **PASCAL, C** etc.  
3. Provides a **fixed structure** to achieve any task.  
4. Does not use mnemonic codes — instead uses **high-level language syntax**, making it easier to learn.  
5. Introduced many flow control statements such as **if, else, for, while** etc.  
6. Easier to learn and achieve tasks due to improved code readability and structure. ✅  

---

### Limitations of Structured Programming ⚠️
- Less modularity  
- Poor abstraction  
- Low security  
- Limited code reusability  
- Weak sharability  

👉 Because of these issues, **Object-Oriented Programming (OOP)** was introduced. 🚀  

# Procedural Approach 📝

- Programs were written as a **sequence of instructions** (step-by-step).  
- **Data and functions were separate** — functions operated on data, but there was no binding between them.  

### Problems with Procedural Approach ⚠️
- Hard to manage large projects 🏗️  
- Poor reusability 🔄  
- Less secure 🔒  
- Tough to scale and maintain ⚙️  

👉 Before OOP, most programs followed a **procedural approach** where functions and data were written separately.  
This caused issues like poor code reusability, weak security, and difficulty in maintaining large projects.  

---

# Procedural Programming Paradigm ⚙️

1. In **POP (Procedural Oriented Programming)**, tasks are divided into small parts known as **functions/methods**.  
2. Follows a **top-down approach**.  
3. **No access specifiers** are used.  
4. Strongly deals with **algorithms**.  
5. Uses relatively **less memory**.  
6. Examples: **FORTRAN, PASCAL, C** etc.  

---

### Limitations of POP ⚠️
- Less security 🔒  
- Limited modularity 🧩  
- Weak code reusability 🔄  

👉 Because of these issues, developers mostly adopted **Object-Oriented Programming (OOP)**. 🚀  

# Object-Oriented Programming (OOP) in Java ☕✨

Java is built around **OOP principles**, which organize code into **classes** and **objects**. This makes programs:  
- Structured into **classes and objects** 🏗️  
- Keep related **data and methods** together 📦  
- More **modular, reusable, and scalable** 🔄⚡  
- Able to **prevent unauthorized access** of data 🔒  
- Follow the **DRY (Don't Repeat Yourself)** principle 🔁  

---

## What is OOP? 🤔
OOP stands for **Object-Oriented Programming System**.  
It is a programming approach that organizes code into **objects** and **classes**, making it more structured and easier to manage. ✅  

- A **Class** is a **blueprint** that defines properties (attributes) and behaviors (methods). 📜  
- An **Object** is an **instance of a class**, representing real-world entities. 🌍  

## Advantages of OOP ✅

The main advantages of **Object-Oriented Programming (OOP)** are:  
- **Reusability** 🔄 – Code can be reused through inheritance and objects.  
- **Modularity** 🧩 – Programs are divided into classes and objects, making them well-structured.  
- **Flexibility** 🔧 – Easy to modify and extend existing code.  
- **Easy Maintenance** 🛠️ – Errors are easier to find and fix due to better organization.  

## Procedural Programming vs OOP ⚔️

- **Procedural Programming** 📝 = Hard to manage, less reusability 🔄  
- **OOP (Object-Oriented Programming)** ☕ = Classes + Objects = Organized 🏗️ and Secure 🔒  

# OOP Principles in Java ☕✨

Java supports the following **OOP principles**:

### 1. Encapsulation 🔒  
- Keeps **data and methods together** in a single unit (class).  
- Provides **security** by restricting direct access to data (using access modifiers like `private`, `public`, etc.).  

### 2. Inheritance 🧬  
- Allows one **class to inherit properties and behaviors** from another class.  
- Promotes **code reusability** and reduces redundancy.  

### 3. Polymorphism 🎭  
- The ability of an **object to take many forms**.  
- Example: Method **overloading** (compile-time) and **overriding** (runtime).  

### 4. Abstraction 🎨  
- **Hides complex implementation details** and shows only the necessary features.  
- Achieved using **abstract classes** and **interfaces** in Java.  

# Classes and Objects 🏗️

In Java, **classes** and **objects** are the basic concepts of Object-Oriented Programming used to represent real-world concepts and entities. 🌍  

---

## Class 📜
- A **class** is a **template** or **blueprint** to create objects having similar properties and behaviors.  
- A class in Java is a **prototype** from which we create real-world entities known as **objects** that share common properties and behaviors.  
- A class is **not a real-world entity**; it is just a template or blueprint from which objects are created.  
- A class itself does **not occupy memory** for its attributes and methods until an object is instantiated.  
- A class in Java can contain:  
  - **Data members (fields/attributes)**  
  - **Methods (functions/behaviors)**  
  - **Constructors**  
  - **Nested classes**  
  - **Interfaces**  
# Class Declaration in Java ☕  

The general syntax of declaring a **class** in Java is:  

```java
access_modifier class ClassName {
    // Data members (fields/attributes)
    type variableName;

    // Constructor
    ClassName() {
        // constructor body
    }

    // Methods
    returnType methodName(parameters) {
        // method body
    }

    // Nested class
    class NestedClass {
        // nested class body
    }

    // Interface
    interface NestedInterface {
        // interface body
    }
}
```
# Components of a Class in Java ☕  

### 1. Modifiers 🔑  
- A class can be **`public`** or have **default access**.  
- (Refer to Java documentation for more details on access modifiers).  

### 2. Class Keyword 🏷️  
- The **`class`** keyword is used to create a class.  

### 3. Class Name 📝  
- The class name should begin with an **initial capital letter** (by convention in Java).  

### 4. Body 📦  
- The class body is surrounded by **curly braces `{ }`**.  

### 5. Fields (Data Members) 📊  
- Variables defined within a class that hold the **data/state of an object**.  

### 6. Constructors 🛠️  
- A **special method** in a class that is automatically called when an object is created.  
- The **constructor name must be the same as the class name**.  

# Objects 🌍  

The world is surrounded by **objects**, and every object belongs to some **class**.  
An **object** is a **real-world entity** that **has parts (attributes)** and **does parts (behaviors)**.  

---

## Characteristics of an Object 🔎  

1. **State** 🗄️ – Represents the data (values) of an object.  
2. **Behavior** ⚙️ – Represents the functionality (what the object does).  
3. **Identity** 🆔 – Represents the unique ID of an object, which is created automatically by the **JVM**.  

# Points to Remember 📌  

- We can only use **`public`** or **default** access modifiers with an **outer class** (not `private` or `protected`).  
- For an **inner class**, we can use **all access modifiers**:  
  - `public` ✅  
  - `protected` ✅  
  - `default` ✅  
  - `private` ✅  

## Object Instantiation (Declaring Objects) 🛠️

When an object of a class is created, the class is said to be **instantiated**. All the instances share the **attributes** and the **behavior** of the class. But the values of those attributes, i.e., the **state**, are unique for each object. A single class may have any number of **instances**. ✨

Object instantiation is the process of creating an actual **instance** of a class so that we can use its **data** and **methods**. 🚀

```java
ClassName ObjectRef; // Declaration
```
Instance: Highlights that the object is a specific occurrence of a particular class. 🌟

## Instantiating Object 🏗️

To create the actual object in memory, we use the **`new`** keyword.  
The **`new`** operator instantiates a class by allocating memory for a new object and returning a **reference** to that memory. ✨

```java
ObjectRef = new ClassName();

// Example
Car myCar = new Car(); // Instantiation 🚗
```


```java
Car myCar = new Car();
```
All instances share the same method but hold unique data. 🗂️
We can create multiple objects from a single class definition. 📋

Declartion: Car myCar; create a references but not an object.

Instatiaton: new Car(); creates the actual object.
Every intance is an object.
Every object is an instance of some class. 
