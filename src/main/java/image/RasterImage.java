package image;

import util.Matrices;

public abstract class RasterImage implements Image {
    int width;
    int height;

    public int getWidth(){return width;}

    public int getHeight(){return height;}

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

    public  void EnsureNoException(Object[][] matrix){
        Matrices.requiresNonNull(matrix);
        Matrices.requiresNonZeroDimensions(matrix);
        Matrices.requiresRectangularMatrix(matrix);
    }
}
