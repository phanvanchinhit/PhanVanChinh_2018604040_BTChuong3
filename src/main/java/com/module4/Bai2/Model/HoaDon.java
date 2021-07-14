/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4.Bai2.Model;

import java.util.Date;

/**
 *
 * @author Trong Cuong
 */
public class HoaDon {
    private String mahoadon;
    private String manv;
    private String loai;
    private Date ngayLap;
    private Date ngayGiao;

    public HoaDon() {
    }

    public HoaDon(String mahoadon, String manv, String loai, Date ngayLap, Date ngayGiao) {
        this.mahoadon = mahoadon;
        this.manv = manv;
        this.loai = loai;
        this.ngayLap = ngayLap;
        this.ngayGiao = ngayGiao;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }
    
    
}
