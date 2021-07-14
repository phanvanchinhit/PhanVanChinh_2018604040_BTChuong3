/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Controller;

import com.module4.Bai2.Connection.ConnectMySQL;
import com.module4.Bai2.Model.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Trong Cuong
 */
public class HoaDonController {

    static Connection conn = null;

    static ConnectMySQL connectMySQl = new ConnectMySQL();

    static PreparedStatement preparedStatement = null;

    public static List<HoaDon> getHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        try {
            conn = connectMySQl.getConnect();
            String sql = "select * from hoadon";
            preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                String mahoadon = resultSet.getString("mahoadon");
                String manv = resultSet.getString("manv");
                String loai = resultSet.getString("loai");
                Date ngaylap = resultSet.getDate("ngaylap");
                Date ngaygiao = resultSet.getDate("ngaygiao");
                HoaDon hoaDon = new HoaDon(mahoadon, manv, loai, ngaylap, ngaygiao);
                list.add(hoaDon);
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
