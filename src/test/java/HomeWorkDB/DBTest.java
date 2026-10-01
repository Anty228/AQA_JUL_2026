package HomeWorkDB;

import lombok.SneakyThrows;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBTest {
    private String insertSQL =
            "INSERT INTO Phones (GoodsID, GoodsName, GoodsPrice) VALUES (?, ?, ?)";

    private Connection conn;

    @SneakyThrows
    @BeforeSuite
    public void connectDB() {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password");
    }

    @SneakyThrows
    public void savePhone(PhoneDto phone) {

        PreparedStatement stmt = conn.prepareStatement(insertSQL);


        stmt.setString(1, phone.getGoodsId());
        stmt.setString(2, phone.getGoodsName());
        stmt.setString(3, phone.getGoodsPrice());
        stmt.execute();
    }


    @SneakyThrows
    @AfterSuite
    public void closeDB() {
        if (conn != null) {
            conn.close();
        }

    }
}
