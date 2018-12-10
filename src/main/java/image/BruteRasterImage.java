package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage{

    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        EnsureNoException(colors);
        setPixelsColor(colors);
    }

    private void createRepresentation() {
        pixels= new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y]=color;
    }

    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        setHeight(Matrices.getColumnCount(pixels));
        setWidth(Matrices.getRowCount(pixels));
        createRepresentation();
        this.pixels = pixels;
    }

    private void setPixelsColor(Color color){
        for(int i=0;i<width;i++) {
            for (int j = 0; j < height; j++) setPixelColor(color,i,j);
        }
    }

}
