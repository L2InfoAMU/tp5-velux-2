package image;


import javafx.scene.paint.Color;

public class Circle implements Shape {
    private int x;
    private int y;
    private int rayon;
    Color color;

    public Circle(int x, int y, int rayon, Color color){
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        if (point.x<x-rayon || point.x>x+rayon && point.y<y-rayon || point.y>y+rayon) return false;
        return true;
    }
    public Color getColor() {
        return color;
    }

}
