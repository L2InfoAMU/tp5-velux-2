package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    int height;
    int width;
    Color[][] color;
    public BruteRasterImage(Color color, int width, int height){
        this.height=height;
        this.width=width;
        this.color= new Color[width][height];
        for(int i=0;i<width;i++){
            for(int j = 0; j<height;j++)this.color[i][j]=color;
        }
    }
}
