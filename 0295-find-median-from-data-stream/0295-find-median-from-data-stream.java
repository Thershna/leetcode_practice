import java.util.*;

class MedianFinder {

    ArrayList<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {

        int idx = Collections.binarySearch(list, num);

        if (idx < 0) {
            idx = -(idx + 1);
        }

        list.add(idx, num);
    }

    public double findMedian() {

        int n = list.size();

        if (n % 2 == 1) {
            return list.get(n / 2);
        }

        return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
    }
}