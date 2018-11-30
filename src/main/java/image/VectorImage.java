package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage extends RasterImage{

    private List<Shape> shapes;

    public VectorImage(List<Shape> shapes, int width, int height){
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    public Color getPixelColor(int x, int y){
        for(int i=0;i<shapes.size();i++){
            if (shapes.get(i).contains(new Point(x,y)))return shapes.get(i).getColor();
        }
        return Color.WHITE;
    }
}
