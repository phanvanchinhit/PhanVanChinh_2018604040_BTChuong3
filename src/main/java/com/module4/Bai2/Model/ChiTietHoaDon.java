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
public class ChiTietHoaDon {
    private String mahoadon;
    private String masp;
    private Long soluong;
    private Long dongia;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String mahoadon, String masp, Long soluong, Long dongia) {
        this.mahoadon = mahoadon;
        this.masp = masp;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public Long getSoluong() {
        return soluong;
    }

    public void setSoluong(Long soluong) {
        this.soluong = soluong;
    }

    public Long getDongia() {
        return dongia;
    }

    public void setDongia(Long dongia) {
        this.dongia = dongia;
    }
    
    
}
