/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.M_Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAOclient {
    
    private Connection con;

    public DAOclient() {
    try {
        String url = "jdbc:mysql://localhost:3309/pbl4";
        String root = "root";
        String pass = "123456789";
         con = DriverManager.getConnection(url,root,pass);

        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "loi"+e);
        }
    }
    
    public ArrayList<M_Client> getListClients(){
        ArrayList<M_Client> list = new ArrayList<>();
        String sql = "SELECT * FROM client ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
            while(rs.next()){
                M_Client c =new M_Client();
                c.setID(rs.getInt("id"));
                c.setUsername(rs.getString("username"));
                c.setPassword(rs.getString("password"));
                c.setBlock(rs.getString("block"));
                list.add(c);
            }
        }catch(Exception e){JOptionPane.showMessageDialog(null, "loi "+e);}
        return list;
    }
    
    
    
    public static void main(String[] args) {
        new DAOclient();
    }
}
