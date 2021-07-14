/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Controller;


import com.module4.Bai2.Connection.ConnectMySQL;
import com.module4.Bai2.Model.NhanVien;
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
public class NhanVienController {
    static Connection conn = null;

    static ConnectMySQL connectMySQl = new ConnectMySQL();

    static PreparedStatement preparedStatement = null;

    public static List<NhanVien> getNhanVien() {
        List<NhanVien> list = new ArrayList<>();
        try {
            conn = connectMySQl.getConnect();
            String sql = "select * from nhanvien";
            preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                String manv = resultSet.getString("manv");
                String tennv = resultSet.getString("tennv");
                Date birthday = resultSet.getDate("birthday");
                Long sdt = resultSet.getLong("sodienthoai");
                String diachi = resultSet.getString("diachi");
                NhanVien nhanVien = new NhanVien(manv, tennv, birthday, sdt,diachi);
                list.add(nhanVien);
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
