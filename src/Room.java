public class Room {
    double height;
    double length;
    double width;

    public Room(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Room{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
