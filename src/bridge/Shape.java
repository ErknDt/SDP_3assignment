package bridge;

import java.util.Objects;

public abstract class Shape {

    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer);
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer);
    }

    public abstract void draw();
}