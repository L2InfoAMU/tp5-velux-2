package image;

import javafx.scene.paint.Color;

public class Rectangle extends AbstractShape {

    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        if(point.x >= x && point.y >= y && point.x <= x+width && point.y <= y+height)
            return true;
        return false;
    }
}
