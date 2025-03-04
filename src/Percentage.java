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
        // left side
        if (newOne[2] <= original[2] && original[2] <= (newOne[2] + newOne[1])){ // if x is in range
             if (newOne[3] >= original[3] && original[3] >= (newOne[3] - newOne[0])) { // if y is in range
                 counter++;
             }
        // right side
        } else if (newOne[2] <= (original[2] + original[1])){
            if ((original[2] + original[1]) <= (newOne[2] + newOne[1])) {
                if (newOne[3] >= (original[3] - original[0])){
                    if ((original[3] - original[0]) >= (newOne[3] - newOne[0])){ // if y is in range
                        counter++;
                    }
                }
            }
        }
    }

    public static int getCounter() {
        return counter;
    }
}
