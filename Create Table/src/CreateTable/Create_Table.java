package CreateTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Create_Table extends Create_Database{
    Scanner ip=new Scanner(System.in);
    BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));
    String Table_Name="My_Table";
    String user = "root";
    String password = null;
    String url = "jdbc:mysql://localhost/"+Database_Name;
    Connection connection= DriverManager.getConnection(url,user,password);
    Statement statement=connection.createStatement();

    public Create_Table() throws SQLException {
    }

    void Table() throws IOException, SQLException {
        String sql = "CREATE TABLE "+Table_Name +
                "(id INTEGER not NULL, " +
                " Name VARCHAR(255) not NULL, " +
                " Age int not NULL, " +
                " Gender VARCHAR(255) not NULL, " +
                " CGPA double(3,2) not NULL," +
                " Department VARCHAR(255) not NULL, " +
                " Address VARCHAR(255) not NULL, " +
                " Phone_Number VARCHAR(255) not NULL, " +
                " Amount DOUBLE not NULL, " +
                " Status VARCHAR(255) not NULL, " +
                " Loan DOUBLE not NULL, " +
                " Paid DOUBLE not NULL, " +
                " Loan_Remain DOUBLE not NULL, " +
                " PRIMARY KEY ( id ))";
        statement.executeUpdate(sql);
        System.out.println("Table Created");


    }
}
