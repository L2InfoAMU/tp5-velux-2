package image;

import javafx.scene.paint.Color;

public class TriangleRectangle extends AbstractShape {

    private int x;
    private int y;
    private int side1;
    private int side2;

    public TriangleRectangle(int x, int y, int side1, int side2, Color color) {
        this.x = x;
        this.y = y;
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public boolean contains(Point point) {

        Point a = new Point(x,y);
        Point b = new Point(x+side1,y);
        Point c = new Point(x,y+side2);

        if(new Triangle(a,b,c,color).contains(point)) return true;
        return false;
    }
}