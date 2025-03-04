public class Percentage {
    private static int counter;
    private int[] original;
    private int[] newOne;

    public Percentage(int[] og, int[] n){
        original = og;
        newOne = n;
    }
    // l, w, x, y
    // 0, 1, 2, 3
    public void overLap() {
        int origX1 = original[2];
        int origY1 = original[3];
        int origX2 = original[2] + original[1];
        int origY2 = original[3] - original[0];

        int newX1 = newOne[2];
        int newY1 = newOne[3];
        int newX2 = newOne[2] + newOne[1];
        int newY2 = newOne[3] - newOne[0];

        if (newX1 <= origX1 && origX1 <= newX2){
            if (newY2 <= origY1 && origY1 <= newY1){ // top left
                counter ++;
            } else if (newY2 <= origY2 && origY2 <= newY1) { // bottom left
                counter++;
            }
        } else if (newX1 <= origX2 && origX2 <= newX2) {
            if (newY2 <= origY1 && origY1 <= newY1) { // top right
                counter++;
            } else if (newY2 <= origY2 && origY2 <= newY1) { // bottom right
                counter++;
            }
        }
    }

    public static int getCounter() {
        return counter;
    }
}
