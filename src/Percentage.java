public class Percentage {
    private static int counter;
    private int[] original;
    private int[] newOne;

    public Percentage(int[] og, int[] n){
        original = og;
        newOne = n;
    }
    // l, w, x, y
    public void overLap() {
        if (original[2] <= newOne[2] && newOne[2] <= (original[2] + original[1])){
            if (original[3] <= newOne[3] && newOne[3] <= (original[3] + original[0])) { // if x and y are in range
                counter++;
            }
        }
    }

    public static int getCounter() {
        return counter;
    }
}
