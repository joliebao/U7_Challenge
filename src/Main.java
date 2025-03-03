import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {20, 10, 10, 15};

        for (int i = 0; i < 99; i++) {
            Rectangle r = new Rectangle();
            int l = r.getLength();
            int w = r.getWidth();
            int x = r.getX();
            int y = r.getY();

            int[] other = {l, w, x, y};

            Percentage p = new Percentage();
            System.out.println(r);
        }
    }
}