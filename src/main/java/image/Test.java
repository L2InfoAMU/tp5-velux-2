package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Test implements ImageFactory {
    @Override
    public Image makeImage() {
        List<Shape> list = new ArrayList<>();
        list.add(new TriangleRectangle(10,10,250,400,Color.RED));

        return new VectorImage(list, 860, 340);
    }
}
