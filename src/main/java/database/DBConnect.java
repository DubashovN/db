package database;

import util.PropertiesUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnect {
    private static final String USERNAME_KEY ="db.username";
    private static final String PASS_KEY = "db.password";
    private static final String URL_KEY = "db.url";

    public DBConnect() {

    }

    public static Connection openConnect(){
        try {
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL_KEY),
                    PropertiesUtil.get(USERNAME_KEY),
                    PropertiesUtil.get(PASS_KEY)
            );
        } catch (SQLException t) {
            throw  new RuntimeException(t);
        }
    }
}
