package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    private int height;
    private int width;
    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        this.height=height;
        this.width=width;
        createRepresentation();
        for(int i=0;i<width;i++){
            for(int j = 0; j<height;j++)pixels[i][j]=color;
        }
    }

    public BruteRasterImage(Color[][] colors){
        height = Matrices.getColumnCount(colors);
        width = Matrices.getRowCount(colors);
        createRepresentation();
        pixels=colors;
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
        height = Matrices.getColumnCount(pixels);
        width = Matrices.getRowCount(pixels);
        createRepresentation();
        this.pixels = pixels;
    }

    private void setPixelsColor(Color color){
        for(int i=0;i<width;i++) {
            for (int j = 0; j < height; j++) pixels[i][j] = color;
        }
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

}
