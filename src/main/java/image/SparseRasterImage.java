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
        setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels){
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        pixelsMap = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y){
        pixelsMap.put(new Point(x,y),color);
    }

    public Color getPixelColor(int x, int y){
        return pixelsMap.get(new Point(x,y));
    }

    private void setPixelsColor(Color[][] pixels){
        height = Matrices.getColumnCount(pixels);
        width = Matrices.getRowCount(pixels);
        createRepresentation();
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                if(pixels[i][j] != Color.WHITE) setPixelColor(pixels[i][j],i,j);
            }
        }
    }

    private void setPixelsColor(Color color){
        createRepresentation();
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                if(color != Color.WHITE) setPixelColor(color,i,j);
            }
        }
    }
}
