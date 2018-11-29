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

    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        palette.add(color);
        for(int i=0;i<width;i++){
            for(int j = 0; j<height;j++)indexesOfColors[i][j]=1;
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        height = Matrices.getColumnCount(pixels);
        width = Matrices.getRowCount(pixels);
        createRepresentation();
        for(int i=0;i<width;i++){
            for(int j = 0; j<height;j++){
                if(!palette.contains(pixels[i][j])) palette.add(pixels[i][j]);
                indexesOfColors[i][j] = palette.indexOf(pixels[i][j]);
            }
        }
    }

    private void createRepresentation() {
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
    }

}
