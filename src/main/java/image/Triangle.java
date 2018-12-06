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
        if((a.x-point.x)*(b.y-point.y)-(a.y-point.y)*(b.x-point.x) >0
                && (b.x-point.x)*(c.y-point.y)-(b.y-point.y)*(c.x-point.x)>0
                && (c.x-point.x)*(a.y-point.y)-(c.y-point.y)*(a.x-point.x)>0
                ||(a.x-point.x)*(b.y-point.y)-(a.y-point.y)*(b.x-point.x)<0
                && (b.x-point.x)*(c.y-point.y)-(b.y-point.y)*(c.x-point.x)<0
                && (c.x-point.x)*(a.y-point.y)-(c.y-point.y)*(a.x-point.x)<0
                ||(a.x-point.x)*(b.y-point.y)-(a.y-point.y)*(b.x-point.x)==0
                && (b.x-point.x)*(c.y-point.y)-(b.y-point.y)*(c.x-point.x)==0
                && (c.x-point.x)*(a.y-point.y)-(c.y-point.y)*(a.x-point.x)==0) return true;
        return false;
    }

    public Color getColor() {
        return color;
    }
}