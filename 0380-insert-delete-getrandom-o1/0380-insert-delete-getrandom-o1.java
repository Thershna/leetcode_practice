import java.util.*;

class RandomizedSet {

    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {

        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {

        // already exists
        if(map.containsKey(val)) {
            return false;
        }

        // add to list
        list.add(val);

        // store value -> index
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        // value not present
        if(!map.containsKey(val)) {
            return false;
        }

        // index of value to remove
        int index = map.get(val);

        // last element in list
        int lastElement = list.get(list.size() - 1);

        // put last element at removed index
        list.set(index, lastElement);

        // update index of last element
        map.put(lastElement, index);

        // remove last element
        list.remove(list.size() - 1);

        // remove value from map
        map.remove(val);

        return true;
    }

    public int getRandom() {

        int randomIndex = rand.nextInt(list.size());

        return list.get(randomIndex);
    }
}