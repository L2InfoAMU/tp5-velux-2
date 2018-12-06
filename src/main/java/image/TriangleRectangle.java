package image;

import javafx.scene.paint.Color;

public class TriangleRectangle implements Shape {
    private int x;
    private int y;
    private int side1;
    private int side2;
    Color color;

    public TriangleRectangle(int x, int y, int side1, int side2, Color color) {
        this.x = x;
        this.y = y;
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public boolean contains(Point point) {
        double a;
        double b;
        double z;
        a = side1;
        b = side2;
        if (point.x > x && point.y >= y && point.x <= x + side1 && point.y <= y + side2) {
            if (a > b) {
                z=a/b;
                for (int i = x; i < side2; i++) {
                    a = a - z;
                    if (point.x <= a && point.y == i) return true;
                }
            }
            else {
                z=b/a;
                for (int i = x; i < side1; i++) {
                    b = b - z;
                    if (point.x == i && point.y <= b) return true;
                }
            }
        }
        return false;
    }


    public Color getColor() {
        return color;
    }
}