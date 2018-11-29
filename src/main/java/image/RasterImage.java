package image;

public abstract class RasterImage {
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
}
