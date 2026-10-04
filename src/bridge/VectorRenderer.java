package bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void render(String shapeName, String parameters) {
        System.out.println(
                "Vector rendering: " + shapeName + " [" + parameters + "]"
        );
    }
}