package Lab8;

import java.sql.*;

public class Database {
    public static void main (String[] args) throws ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Connected!");

        String url = "jdbc:sqlserver://localhost;database=JavaDB;integratedSecurity=true;trustServerCertificate=true";

        try {
            Connection con = DriverManager.getConnection(url);
            System.out.println("Connected to Database successfully!");

            String query = "select * from employee";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("empID");
                String name = rs.getString("empName");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
