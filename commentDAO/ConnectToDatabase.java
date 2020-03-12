package dao;

import java.sql.*;

public class ConnectToDatabase {
    public static Connection getConnect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/webbanhang1st","root","Dung1992");
            System.out.println("Success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(getConnect());
    }

    public void excuteSql(String sql) throws Exception {
        Connection connect = getConnect();
        Statement stmt = (Statement) connect.createStatement();
        stmt.executeUpdate(sql);
    }

    public ResultSet selectData(String sql) throws Exception{
        Connection connect=getConnect();
        Statement stmt=(Statement) connect.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        return rs;
    }

}
