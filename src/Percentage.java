public class Percentage {
    private static int counter;
    private int[] original;
    private int[] newOne;

    public Percentage(int[] og, int[] n){
        original = og;
        newOne = n;
    }

    public void overLap(){
        if (original[2] == newOne[2] && original[3] == newOne[3]){ // if x and ys are the same
            counter ++;
        } else if ((original[2] < newOne[2] && newOne[2] < original[2] + original[1])) { // if first corner of new rect is in range of original rect
            counter++;
        } else if (original[3] < newOne[3] && newOne[3] < original[3] + original[0]) { // if first corner of new rect is in range of original rect
            counter++;
        }
    }

    public static int getCounter() {
        return counter;
    }
}
