package image;


import javafx.scene.paint.Color;

public class Circle extends AbstractShape {
    private int x;
    private int y;
    private int rayon;

    public Circle(int x, int y, int rayon, Color color){
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        if (Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2)) < rayon) return true;
        return false;
    }
}
