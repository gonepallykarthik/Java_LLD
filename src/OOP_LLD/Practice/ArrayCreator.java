package OOP_LLD.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    public int size;
    public List<Integer> arr;

    public ArrayCreator(int n) {
        this.size = n;
        this.arr = new ArrayList<>();
    }


    @Override
    public List<Integer> call() throws Exception {
        for (int i = 1; i <= this.size; i++) {
            this.arr.add(i);
        }
        return this.arr;
    }
}
