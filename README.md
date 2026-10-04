# SDP Assignment 3 — Bridge Pattern

This project demonstrates the **Bridge Design Pattern** using a `Shape` and `Renderer` example.

## Structure

### Abstraction
- `Shape`
- `Circle`
- `Square`

### Implementation
- `Renderer`
- `VectorRenderer`
- `RasterRenderer`

`Shape` contains a reference to `Renderer`, which connects the two hierarchies using composition.

## Features

- Bridge Pattern implemented in Java
- Two refined abstractions: `Circle`, `Square`
- Two concrete implementations: `VectorRenderer`, `RasterRenderer`
- Runtime switching between renderers
- Clean separation between abstraction and implementation

## Example

```java
Shape circle = new Circle(new VectorRenderer(), 5.0);

circle.draw();

circle.setRenderer(new RasterRenderer());

circle.draw();
```

## Technologies

- Java 17
- IntelliJ IDEA
- Git
- GitHub

## Run

Run:

```text
src/bridge/Main.java
```
