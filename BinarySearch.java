import java.util.ArrayList;

public class BinarySearch {

    private long maxNum;


    public BinarySearch(long maxNum) {
        this.maxNum = maxNum;

    }

    public int findNum(long searchedNum) {
        int c = 0;
        ArrayList<Long> setOfNums = new ArrayList<>();
        for(long i = 0; i <= this.maxNum; i++) {
            setOfNums.add(i);
        }
        try {
            while (searchedNum != (long) Math.ceil(setOfNums.get(setOfNums.size()/2))) {
                if (searchedNum < (long) Math.ceil(setOfNums.get(setOfNums.size()/2))) {
                    long end = setOfNums.size()/2;
                    setOfNums.clear();
                    c += 1;
                    for(long i = 0; i <= end; i++) {
                        setOfNums.add(i);
                    }
                } else if (searchedNum > (long) Math.ceil(setOfNums.get(setOfNums.size()/2))) {
                    long start = setOfNums.size()/2;
                    setOfNums.clear();
                    c += 1;
                    for(long i = start; i <= setOfNums.size(); i++) {
                        setOfNums.add(i);
                    }
                }
            }
        }
        catch (Exception IndexOutOfBoundsException) {
            ;
        }


        return c;
    }


}
