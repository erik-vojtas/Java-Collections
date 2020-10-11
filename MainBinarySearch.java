import java.util.ArrayList;
import java.util.Collections;

public class MainBinarySearch {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch(1000);
        System.out.println(bs.findNum(1));

        System.out.println(binarySearch(10, 1000));

    }


    static public boolean binarySearch(int searchedNum, int maxNum) { ;
        ArrayList<Integer> setOfNums = new ArrayList<>();
        for (int i = 0; i <= maxNum; i++) {
            setOfNums.add(i);
        }

        int a = Collections.binarySearch(setOfNums, searchedNum, null);
        if (a >=0 && a <= maxNum) {
            return true;
        }
        return false;

    }

}