import java.sql.Connection;
import java.sql.DriverManager;

public class MiniProjectConnectMysql {
    public static void main(String[] args) {
        // Mysql 열기 -> mysql-connector J
        // Connect to database 클릭
        // Connection Method, hostname, port, username을 맞춘후
        // 들어갈 Default Schema 를 작성후 Connection
        // Hostname : localhost, port : 3306 
        // Username : root, default schema : world, passworld : tbrs00002b
        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/world";
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        // access to 'World' DB, edit창 띄우기
        // mysql 명령어 입력후,  실행후 조회(결과 확인)
        return ;
    }
}
