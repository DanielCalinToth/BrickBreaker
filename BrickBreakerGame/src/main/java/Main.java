import javax.swing.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", "root", "daniel180901");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from score");

        System.out.println(resultSet);

        Random random = new Random();

        int k= random.nextInt();

        JFrame obj = new JFrame();
        obj.setLocationRelativeTo(null);
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}