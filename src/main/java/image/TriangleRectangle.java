package image;

import javafx.scene.paint.Color;

public class TriangleRectangle extends AbstractShape {

    private int x;
    private int y;
    private int side1;
    private int side2;

    public TriangleRectangle(TriangleRotation rotation,int x, int y, int side1, int side2, Color color) {
        this.x = x;
        this.y = y;
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;

        if(rotation == TriangleRotation.SOUTH_LEFT)
            this.side1 = 0-this.side1;
        else if(rotation == TriangleRotation.EAST_DOWN)
            exchangeSide();
        else if(rotation == TriangleRotation.EAST_UP){
            exchangeSide();
            this.side2 = 0-this.side2;
        }
        else if(rotation == TriangleRotation.WEST_DOWN){
            exchangeSide();
            this.side1 = 0-this.side1;
        }
        else if(rotation == TriangleRotation.WEST_UP){
            exchangeSide();
            this.side1 = 0-this.side1;
            this.side2 = 0-this.side2;
        }
        else if(rotation == TriangleRotation.NORTH_LEFT)
            this.side2 = 0-this.side2;
        else if(rotation == TriangleRotation.NORTH_RIGHT) {
            this.side2 = 0 - this.side2;
            this.side1 = 0-this.side1;
        }
    }

    public boolean contains(Point point) {

        Point a = new Point(x,y);
        Point b = new Point(x+side1,y);
        Point c = new Point(x,y+side2);

        if(new Triangle(a,b,c,color).contains(point)) return true;
        return false;
    }

    private void exchangeSide(){
        int temp;
        temp = side1;
        side1 = side2;
        side2 = temp;
    }
}