package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {
    Map<Point,Color> pixelsMap;

    public SparseRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                if(color != Color.WHITE) setPixelColor(color,i,j);
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){
        height = Matrices.getColumnCount(pixels);
        width = Matrices.getRowCount(pixels);
        createRepresentation();
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                if(pixels[i][j] != Color.WHITE) setPixelColor(pixels[i][j],i,j);
            }
        }
    }

    public void createRepresentation() {
        pixelsMap = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y){
        pixelsMap.put(new Point(x,y),color);
    }
}
