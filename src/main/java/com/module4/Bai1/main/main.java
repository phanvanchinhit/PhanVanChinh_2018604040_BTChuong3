/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai1.main;

import com.module4.Bai1.Connection.ConnectMySQL;
import com.module4.Bai1.Controller.SanPhamController;
import com.module4.Bai1.Model.SanPham;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Trong Cuong
 */
public class main {
    
    SanPhamController sanPhamController = new SanPhamController();    
    
    public static void main(String[] args) {
        List<SanPham> listSanpham = SanPhamController.getSanPham();
        for (SanPham sanPham : listSanpham) {
            System.out.println(sanPham.getMaSp());
        }
    }
}
