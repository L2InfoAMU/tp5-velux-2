package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class ShapesLISFactory implements ImageFactory {

    public Image makeImage() {
        Color dark = Color.rgb(35, 31, 32);
        Color greenblue = Color.rgb(113, 208, 199);

        List<Shape> list = new ArrayList<>();

        list.add(new Circle(427, 50, 50, greenblue));
        list.add(new TriangleRectangle(60, 0, 140, 280, dark));
        list.add(new TriangleRectangle(60, 280, 280, 140, dark));
        list.add(new Rectangle(400, 140, 60, 200, dark));
        list.add(new Polygon(false, dark, new Point(660, 0), new Point(850, 0), new Point(660, 150), new Point(780, 40), new Point(850, 40)));
        list.add(new Polygon(false, dark, new Point(660, 350), new Point(850, 350), new Point(660, 300), new Point(780, 300), new Point(850, 200)));
        
        return new VectorImage(list, 860, 340);
    }
}
