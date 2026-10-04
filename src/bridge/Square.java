package bridge;

public class Square extends Shape {

    private final double side;

    public Square(Renderer renderer, double side) {
        super(renderer);

        if (side <= 0) {
            throw new IllegalArgumentException(
                    "Side must be greater than zero."
            );
        }

        this.side = side;
    }

    @Override
    public void draw() {
        renderer.render(
                "Square",
                "side = " + side
        );
    }
}