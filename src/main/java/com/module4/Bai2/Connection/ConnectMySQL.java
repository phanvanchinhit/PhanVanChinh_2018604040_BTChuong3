/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Trong Cuong
 */
public class ConnectMySQL {
    public static Connection getConnect(){
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/qlbanhang","root","030420");
        }catch(SQLException e){
          e.printStackTrace();
        }
        return conn;
    }
}
