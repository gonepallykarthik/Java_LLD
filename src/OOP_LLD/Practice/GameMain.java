package OOP_LLD.Practice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GameMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Game g1 = new Game(3);
//        g1.Start();

        DBConn d1 = DBConn.getObject();
        System.out.println(d1);

        DBConn d2 = DBConn.getObject();
        System.out.println(d2);

        ExecutorService exe = Executors.newSingleThreadExecutor();
        Future<List<Integer>> nums = exe.submit(new ArrayCreator(10));
        System.out.println(nums.get());

        exe.shutdown();
        String name = "demo";
        

//        [1 2 3 4]
//        [5 6 7 8]
//        [9 10 11 2]
//        [1 2 3 4]
    }
}
