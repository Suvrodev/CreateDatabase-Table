package CreateTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Create_Database {
    Scanner ip=new Scanner(System.in);
    BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));
    String Database_Name="My_Database";
    String user = "root";
    String password = null;
    String url = "jdbc:mysql://localhost";
    Connection connection= DriverManager.getConnection(url,user,password);
    Statement statement=connection.createStatement();

    public Create_Database() throws SQLException {
    }

    void Database_() throws IOException, SQLException {
        /*System.out.printf("Name of Database=");
        DatabasName =ipp.readLine();*/
        String Database="CREATE DATABASE "+Database_Name;
        statement.executeUpdate(Database);
        System.out.println("Database Created");
    }
}
