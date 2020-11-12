package CreateTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        Scanner ip=new Scanner(System.in);
        BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));

        Create_Table create_table=new Create_Table();
        Create_Database create_database=new Create_Database();

        System.out.printf("Create Table Press t,Create Database Press d=");
        char ch=ip.next().charAt(0);
        if(ch=='t'){
            create_table.Table();
        }
        else if(ch=='d'){
            create_database.Database_();
        }



    }
}
