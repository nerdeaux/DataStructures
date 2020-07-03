package Big_O_Notation;

public class Arrays {
    public static void main(String[] args) {
        int[] myIntArray = new int[7];
        int index = -1;

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] =55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
