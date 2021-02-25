import database.DBConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String sql = """
        INSERT INTO info(data)VALUES 
        ('test1'),
        ('test2'),
        ('test3'),
        ('test4'),
        ('test5'),
        ('test6');
        """;
        try (Connection connection = DBConnect.openConnect();
             Statement statement = connection.createStatement()) {
        statement.execute(sql);
            System.out.println(statement.getUpdateCount());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
