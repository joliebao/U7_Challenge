import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {20, 10, 10, 15};

        int i = 0;
        while (i < 9999999) {
            Rectangle r = new Rectangle();
            int l = r.getLength();
            int w = r.getWidth();
            int x = r.getX();
            int y = r.getY();

            int[] other = {l, w, x, y};

            Percentage p = new Percentage(first, other);
            p.overLap();
            i++;
        }

        int colliding = Percentage.getCounter();
        System.out.println(colliding);
        double percent = (double) colliding / (i+1) * 100;

        System.out.println("Percent: " + percent + "%");
    }
}