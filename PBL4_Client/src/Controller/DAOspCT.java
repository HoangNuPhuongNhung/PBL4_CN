
package Controller;

import Model.M_DBconnect;
import Model.M_SanphamCT;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAOspCT {
        public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
    public ArrayList<M_SanphamCT> getListSPCT()
    {
        ArrayList<M_SanphamCT> list=new ArrayList<>();
        String sql="SELECT * FROM sanpham";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_SanphamCT n=new M_SanphamCT();
//                n.setId(rs.getInt("ID"));
//                n.setMasp(rs.getString("Masanpham"));
//                n.setTensp(rs.getString("Tensanpham"));
//                n.setLoai(rs.getString("Loai"));
//                n.setSoluong(rs.getString("Soluong"));
//                n.setGia(rs.getInt("Gia"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 

    private static class M_SanphamT {

        public M_SanphamT() {
        }
    }
}
