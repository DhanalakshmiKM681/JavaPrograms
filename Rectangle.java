public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public int getDisplay() {
        return length;
    }

    public int getDisplay1() {
        return width;
    }
    public int getSquare(){
        return (length*width*length*width) ;
    }

    public void setSquare(int length,int width){
        this.length=length;
        this.width=width;
    }
}