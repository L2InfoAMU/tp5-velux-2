package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Test implements ImageFactory {
    @Override
    public Image makeImage() {
        List<Shape> list = new ArrayList<>();
        list.add(new ConvexPolygon(Color.ROYALBLUE,new Point(250,20),new Point(25,250),new Point(500,20),new Point(450,250),new Point(200,300)));

        return new VectorImage(list, 860, 340);
    }
}
