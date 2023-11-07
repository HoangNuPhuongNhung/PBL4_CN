/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.M_Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DAOnv {
    private Connection con;
    public DAOnv() {
    
        try {
        String url = "jdbc:mysql://localhost:3309/pbl4";
        String root = "root";
        String pass = "123456789";
         con = DriverManager.getConnection(url,root,pass);

        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "loi"+e);
        }
    }
    
    public ArrayList<M_Nhanvien> getListNV(){
        ArrayList<M_Nhanvien> list = new ArrayList<>();
        String sql = "SELECT * FROM nhanvien ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
            while (rs.next()){
                M_Nhanvien n = new M_Nhanvien();
                n.setID(rs.getInt("ID"));
                n.setMaNV(rs.getString("Manhanvien"));
                n.setTen(rs.getString("Hoten"));              
                n.setChucvu(rs.getString("Chucvu"));
                n.setDate(rs.getDate("Ngaysinh"));
                n.setGioitinh(rs.getString("Gioitinh"));
                n.setDiachi(rs.getString("Diachi"));
                n.setEmail(rs.getString("Email"));
                n.setLuong(rs.getInt("Luong"));
                list.add(n);
            }
        }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "loi "+e);
    }
        return list;
    }
    public void AddNV(M_Nhanvien n){
        String sql="insert into nhanvien values(null,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,n.getMaNV());
            ps.setString(2,n.getTen());
            ps.setString(3,n.getChucvu());
            ps.setObject(4,n.getDate());
            ps.setString(5,n.getGioitinh());
            ps.setString(6,n.getDiachi());
            ps.setString(7, n.getEmail());
            ps.setInt(8, n.getLuong());
            ps.executeUpdate();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "loi "+e);
        }
    }
    public void DeleteNV(int id){
        String sql="delete from nhanvien where Id=?";
        try{
            PreparedStatement ps=con.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "loi "+e);
        }
    }
     public ArrayList<M_Nhanvien> findbyName(String Name)
    {
        ArrayList<M_Nhanvien> list=new ArrayList<>();
        String sql="SELECT * FROM nhanvien where Hoten like ?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,"%"+Name+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Nhanvien n=new M_Nhanvien();
                n.setID(rs.getInt("ID"));
                n.setMaNV(rs.getString("Manhanvien"));  
                n.setTen(rs.getString("Hoten"));
                n.setChucvu(rs.getString("Chucvu"));
                n.setDate(rs.getDate("Ngaysinh"));
                n.setGioitinh(rs.getString("Gioitinh"));
                n.setDiachi(rs.getString("Diachi"));
                n.setEmail(rs.getString("Email"));
                n.setLuong(rs.getInt("Luong"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 

    
    
    
    public static void main(String[] args) {
             new DAOnv();

    }

}
