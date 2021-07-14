/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Controller;

import com.module4.Bai2.Connection.ConnectMySQL;
import com.module4.Bai2.Model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trong Cuong
 */
public class SanPhamController {

    static Connection conn = null;

    static ConnectMySQL connectMySQl = new ConnectMySQL();

    static PreparedStatement preparedStatement = null;

    public static List<SanPham> getSanPham() {
        List<SanPham> listSanPham = new ArrayList<>();
        try {
            conn = connectMySQl.getConnect();
            String sql = "select * from sanpham";
            preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                String maSP = resultSet.getString("maSP");
                String tenSP = resultSet.getString("tenSP");
                String dvTinh = resultSet.getString("dvtinh");
                Long gia = resultSet.getLong("gia");
                SanPham sanpham = new SanPham(maSP, tenSP, dvTinh, gia);
                listSanPham.add(sanpham);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return listSanPham;
    }
    
    
    
}
