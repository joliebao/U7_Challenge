public class Rectangle {
    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle(){
        length = (int) (Math.random() * 40) + 10;
        width = (int) (Math.random() * 5) + 5;
        x = (int) (Math.random() * 50) + 1;
        y = (int) (Math.random() * 50) + 1;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        System.out.println();
        return "Length: " + length + "\n" + "Width: " + width + "\n" + x + "," + y;
    }

}
