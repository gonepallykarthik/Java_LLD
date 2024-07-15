package OOP_LLD.Practice;

public class GameMain {
    public static void main(String[] args) {
//        Game g1 = new Game(3);
//        g1.Start();

        DBConn d1 = DBConn.getObject();
        System.out.println(d1);

        DBConn d2 = DBConn.getObject();
        System.out.println(d2);



    }
}
