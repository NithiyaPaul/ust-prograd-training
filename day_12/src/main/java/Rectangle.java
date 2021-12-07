public class Rectangle {
    private double length,width;
    Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length can't be negative or zero value");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Breadth can't be negative or zero value");
        }
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
