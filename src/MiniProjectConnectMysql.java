import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String QUERY = "select ID, Name, Population " +
                "from city " +
                "where 1 = 1 " +
                "and Population >= 9230000";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement(); // sql파일 만드는 구문
            // 새로운 query생성, select 명령문 입력 후 test 해보기
            ResultSet rs = stmt.executeQuery(QUERY); // 결과 값이 담기는 집합
            // result grid, action output 확인
            // 갯수를 모를땐 while 안다면 for문을 사용
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("ID"));
                System.out.print(", Name: " + rs.getString("Name"));
                System.out.print(", Population: " + rs.getInt("Population"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
}
