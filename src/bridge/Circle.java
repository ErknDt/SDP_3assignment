package bridge;

public class Circle extends Shape {

    private final double radius;

    public Circle(Renderer renderer, double radius) {
        super(renderer);

        if (radius <= 0) {
            throw new IllegalArgumentException(
                    "Radius must be greater than zero."
            );
        }

        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.render(
                "Circle",
                "radius = " + radius
        );
    }
}