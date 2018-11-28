package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    int height;
    int width;
    Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        this.height=height;
        this.width=width;
        pixels= new Color[width][height];
        for(int i=0;i<width;i++){
            for(int j = 0; j<height;j++)pixels[i][j]=color;
        }
    }

    public BruteRasterImage(Color[][] colors){
        height = Matrices.getColumnCount(colors);
        width = Matrices.getRowCount(colors);
        pixels = new Color[width][height];

        for(int i=0;i<width;i++){
            for(int j = 0; j<height;j++)pixels[i][j]=colors[i][j];
        }
    }

}
