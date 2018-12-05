package image;

import javafx.scene.paint.Color;

public class Triangle implements Shape {

    Point a;
    Point b;
    Point c;
    Color color;

    public Triangle (Point a, Point b, Point c, Color color){
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public boolean contains(Point point) {
        if(point.x<Math.abs(a.x-b.x) && point.y<Math.abs(a.y-b.y)
                && point.x<Math.abs(c.x-b.x) && point.y<Math.abs(c.y-b.y)
                && point.x<Math.abs(a.x-c.x) && point.y<Math.abs(a.y-c.y)) return true;
        return false;
    }

    public Color getColor() {
        return color;
    }
}
