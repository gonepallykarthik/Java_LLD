package design_pattern.creational.Singleton;

// singleton design pattern
public class DBConn {
    String url;
    String user_name;
    String password;
    private static DBConn obj;

    private DBConn(){
        this.url = "https://...";
        this.user_name = "user@root";
        this.password = "123456";
    }

    public static DBConn getObject(){
        if(obj == null){
            obj = new DBConn();
        }
        return obj;
    }

}
