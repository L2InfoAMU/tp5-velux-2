package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Test implements ImageFactory {
    @Override
    public Image makeImage() {
        List<Shape> list = new ArrayList<>();
        list.add(new TriangleRectangle(250,250,250,500,Color.INDIANRED));

        return new VectorImage(list, 860, 340);
    }
}
