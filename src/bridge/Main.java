package bridge;

public class Main {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0);
        Shape square = new Square(vectorRenderer, 4.0);

        System.out.println("=== Vector Rendering ===");

        circle.draw();
        square.draw();

        System.out.println();

        System.out.println("=== Switching Renderer at Runtime ===");

        circle.setRenderer(rasterRenderer);
        square.setRenderer(rasterRenderer);

        circle.draw();
        square.draw();
    }
}