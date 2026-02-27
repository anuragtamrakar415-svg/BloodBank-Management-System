
import Project.ConnectionProvider;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anura
 */
public class testdb  {
    public static void main(String[] args) {
        Connection con =  ConnectionProvider.getCon();
        if (con != null)
            System.out.println("DB Connected");
        else
            System.out.println("Connection Failed");
    }
}

