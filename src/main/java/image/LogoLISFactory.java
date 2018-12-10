package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class LogoLISFactory implements ImageFactory{
    @Override
    public Image makeImage() {
        Color dark = Color.rgb(35,31,32);
        Color greenblue = Color.rgb(113,208,199);

        int[] xCoordinates = {60,  720, 660, 400, 0,   400, 660};
        int[] yCoordinates = {0,   60,  140, 0,   0,   140, 0};
        int[] widths =       {140, 140, 140, 60,  200, 60,  200};
        int[] heights =      {280, 80,  140, 80,  340, 200, 340};
        Color[] colors = {Color.WHITE, Color.WHITE, Color.WHITE, greenblue, dark, dark, dark};

        List<Shape> list = new ArrayList<>();
/*
        for (int i = 0; i<colors.length; i++)
            list.add(new Rectangle(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i]));*/
        list.add(new Circle(427,50,50,greenblue));
        list.add(new TriangleRectangle(60,0,140,280,dark));
        list.add(new TriangleRectangle(60,280,280,140,dark));
        list.add(new Rectangle(400,140,60,200,dark));
        list.add(new Polygon(false,dark,new Point(660,0),new Point(850,0),new Point(660,150),new Point(780,40),new Point(850,40)));
        list.add(new Polygon(false,dark,new Point(660,350),new Point(850,350),new Point(660,300),new Point(780,300),new Point(850,200)));
        return new VectorImage(list, 860, 340);
    }
}