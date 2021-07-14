/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai1.Model;

/**
 *
 * @author Trong Cuong
 */
public class SanPham {
    private String maSp;
    private String tenSp;
    private String maLoaiSp;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, String maLoaiSp) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.maLoaiSp = maLoaiSp;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMaLoaiSp() {
        return maLoaiSp;
    }

    public void setMaLoaiSp(String maLoaiSp) {
        this.maLoaiSp = maLoaiSp;
    }
    
    
}
