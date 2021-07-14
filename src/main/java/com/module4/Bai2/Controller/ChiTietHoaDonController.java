/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Controller;

import com.module4.Bai2.Connection.ConnectMySQL;
import com.module4.Bai2.Model.ChiTietHoaDon;
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
public class ChiTietHoaDonController {

    static Connection conn = null;

    static ConnectMySQL connectMySQl = new ConnectMySQL();

    static PreparedStatement preparedStatement = null;

    public static List<ChiTietHoaDon> getChiTietHoaDon() {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            conn = connectMySQl.getConnect();
            String sql = "select * from chitiethoadon";
            preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                String mahoadon = resultSet.getString("mahoadon");
                String masp = resultSet.getString("masp");
                Long soluong = resultSet.getLong("soluong");
                Long dongia = resultSet.getLong("dongia");
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(mahoadon, masp, soluong, dongia);
                list.add(chiTietHoaDon);
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
        return list;
    }
}
