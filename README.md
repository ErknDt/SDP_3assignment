# Assignment 3 — Bridge Pattern

## Course

Software Design Patterns

## Topic

Bridge Design Pattern

## Project Description

This project demonstrates the **Bridge structural design pattern** using a `Shape` and `Renderer` example.

The purpose of the Bridge pattern is to separate an abstraction from its implementation so that both can vary independently.

In this project, there are two independent hierarchies:

### Abstraction hierarchy

- `Shape`
- `Circle`
- `Square`

### Implementation hierarchy

- `Renderer`
- `VectorRenderer`
- `RasterRenderer`

The `Shape` class contains a reference to a `Renderer` object. This creates the bridge between the abstraction and implementation hierarchies.

---

## Project Structure

```text
src/
