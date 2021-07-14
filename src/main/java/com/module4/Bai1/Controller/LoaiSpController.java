/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai1.Controller;

import com.module4.Bai1.Connection.ConnectMySQL;
import com.module4.Bai1.Model.LoaiSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Trong Cuong
 */
public class LoaiSpController {

    Connection conn = null;

    ConnectMySQL connectMySQl = new ConnectMySQL();

    PreparedStatement preparedStatement = null;

    public void insertLoaiSP(LoaiSP loaisp) {
        try {
            conn = connectMySQl.getConnect();
            String sql = "insert into loaisanpham values(?,?)";
            preparedStatement = conn.prepareCall(sql);
            preparedStatement.setString(1, loaisp.getMaLoaiSP());
            preparedStatement.setString(2, loaisp.getTenLoaiSP());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
