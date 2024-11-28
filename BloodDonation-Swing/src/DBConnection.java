import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/blooddonation";
    private static final String USER = "root";
    private static final String PASSWORD = "1973";

    private Connection conn;

    public Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}