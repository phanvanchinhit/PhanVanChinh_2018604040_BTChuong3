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
public class NhanVien {
    private String manv;
    private String tennv;
    private Date birthday;
    private Long sdt;
    private String diachi;

    public NhanVien() {
    }

    public NhanVien(String manv, String tennv, Date birthday, Long sdt, String diachi) {
        this.manv = manv;
        this.tennv = tennv;
        this.birthday = birthday;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getSdt() {
        return sdt;
    }

    public void setSdt(Long sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
}
