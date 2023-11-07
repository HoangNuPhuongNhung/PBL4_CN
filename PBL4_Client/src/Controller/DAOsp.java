
package Controller;

import Model.M_DBconnect;
import Model.M_Sanpham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOsp {
    public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
    public ArrayList<M_Sanpham> getListSP()
    {
        ArrayList<M_Sanpham> list=new ArrayList<>();
        String sql="SELECT * FROM sanpham";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Sanpham n=new M_Sanpham();
                n.setId(rs.getInt("ID"));
                n.setMasp(rs.getString("Masanpham"));
                n.setTensp(rs.getString("Tensanpham"));
                n.setLoai(rs.getString("Loai"));
                n.setSoluong(rs.getInt("Soluong"));
                n.setGia(rs.getInt("Gia"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 
    public void AddSP(M_Sanpham s){
        String sql="insert into sanpham values(null,?,?,?,?,?)";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setString(1,s.getMasp());
            ps.setString(2,s.getTensp());
            ps.setString(3,s.getLoai());
            ps.setInt(4,s.getSoluong());
            ps.setInt(5,s.getGia());
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void DeleteSP(int id){
        String sql="delete from sanpham where Id=?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<M_Sanpham> findbyMasp(String Masp)
    {
        ArrayList<M_Sanpham> list=new ArrayList<>();
        String sql="SELECT * FROM sanpham where Masanpham like ?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setString(1,"%"+Masp+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Sanpham n=new M_Sanpham();
                n.setId(rs.getInt("ID"));
                n.setMasp(rs.getString("Masanpham"));  
                n.setTensp(rs.getString("Tensanpham"));
                n.setLoai(rs.getString("Loai"));
                n.setSoluong(rs.getInt("Soluong"));
                n.setGia(rs.getInt("Gia"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 
}


