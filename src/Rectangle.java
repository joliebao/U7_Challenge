public class Rectangle {
    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle(){
        length = (int) (Math.random() * 39) + 10;
        width = (int) (Math.random() * 4) + 5;
        x = (int) (Math.random() * 51);
        y = (int) (Math.random() * 51);
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
