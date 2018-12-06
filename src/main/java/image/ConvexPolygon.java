package image;

import javafx.scene.paint.Color;


public class ConvexPolygon implements Shape{

    Point[] points;
    Color color;

    public ConvexPolygon(Color color, Point...points){
        this.points = points;
        this.color = color;
        if(points.length<=2){
            throw new NotSupportedException("Missing few Points");
        }
        sortPoints();
    }

    public boolean contains(Point point){
        for(int i = 0;i<points.length-2;i++){
            if(new Triangle(points[0],points[i+1],points[i+2],this.color).contains(point)) return true;
        }
    return false;
    }

    public Color getColor() {
        return color;
    }

    private void sortPoints(){
        Boolean sort = false;
        while(!sort) {
            sort = true;
            for (int i = 1; i < points.length - 1; i++) {
                if (points[i].x < points[i + 1].x) {
                    Point temp = points[i];
                    points[i] = points[i + 1];
                    points[i + 1] = temp;
                    sort = false;
                }
            }
        }
    }

}

