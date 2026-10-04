package bridge;

public class RasterRenderer implements Renderer {

    @Override
    public void render(String shapeName, String parameters) {
        System.out.println(
                "Raster rendering: " + shapeName + " [" + parameters + "]"
        );
    }
}