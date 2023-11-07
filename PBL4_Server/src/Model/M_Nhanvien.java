/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class M_Nhanvien {
    private int ID;
    private String MaNV, Ten, Chucvu  ,Gioitinh, Diachi, Email;
    private Date date;
    private int Luong;

    public M_Nhanvien() {
    }

    public M_Nhanvien(String MaNV, String Ten, String Chucvu, String Gioitinh, String Diachi, String Email, Date date, int Luong) {
        this.MaNV = MaNV;
        this.Ten = Ten;
        this.Chucvu = Chucvu;
        this.Gioitinh = Gioitinh;
        this.Diachi = Diachi;
        this.Email = Email;
        this.date = date;
        this.Luong = Luong;
    }

    public M_Nhanvien(int ID, String MaNV, String Ten, String Chucvu, String Gioitinh, String Diachi, String Email, Date date, int Luong) {
        this.ID = ID;
        this.MaNV = MaNV;
        this.Ten = Ten;
        this.Chucvu = Chucvu;
        this.Gioitinh = Gioitinh;
        this.Diachi = Diachi;
        this.Email = Email;
        this.date = date;
        this.Luong = Luong;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
    
    
}
