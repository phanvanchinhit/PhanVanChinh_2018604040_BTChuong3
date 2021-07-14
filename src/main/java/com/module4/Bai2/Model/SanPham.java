/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Model;

/**
 *
 * @author Trong Cuong
 */
public class SanPham {
    private String masp;
    private String tensp;
    private String dvTinh;
    private Long gia;

    public SanPham() {
    }

    public SanPham(String masp, String tensp, String dvTinh, Long gia) {
        this.masp = masp;
        this.tensp = tensp;
        this.dvTinh = dvTinh;
        this.gia = gia;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }

    public Long getGia() {
        return gia;
    }

    public void setGia(Long gia) {
        this.gia = gia;
    }
    
    
}
