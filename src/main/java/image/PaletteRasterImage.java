package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public class PaletteRasterImage implements Image {
    int width;
    int height;
    List<Color> palette;
    byte[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height){

    }

    public PaletteRasterImage(Color[][] pixels){

    }

    private void createRepresentation() {

    }

}
