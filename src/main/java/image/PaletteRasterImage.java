package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {
    int width;
    int height;
    List<Color> palette;
    int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        setPixelsColor(pixels);
    }

    private void createRepresentation() {
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color)) palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    private void setPixelsColor(Color[][] pixels) {
        height = Matrices.getColumnCount(pixels);
        width = Matrices.getRowCount(pixels);
        createRepresentation();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++)
                setPixelColor(pixels[i][j],i,j);
        }
    }
    private void setPixelsColor(Color color){
        palette.add(color);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) indexesOfColors[i][j] = palette.indexOf(color);
        }
    }

    public int getWidth(){return width;}

    public int getHeight(){return height;}

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}
