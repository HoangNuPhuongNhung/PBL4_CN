/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectSocket;

import Model.M_Nhanvien;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class CSocket {
    private Socket soc ;
    private int port;
    private String Username = "";
    private int dem;
    private boolean  check;
    
    public CSocket() {
        port = 1234;
        Connect();
    }
    private void Connect() {
       try {
        soc = new Socket("localhost", port);
        soc.setReceiveBufferSize(2000);
        // Bắt đầu kết nối thành công
        // ...

        // Tạo luồng lắng nghe dữ liệu từ server
        Thread listenThread = new Thread(() -> {
            // Xử lý dữ liệu nhận được từ server
            // ...

        });
        listenThread.setDaemon(true);
        listenThread.start();
    } catch (UnknownHostException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Lỗi kết nối", "Lỗi", JOptionPane.WARNING_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Lỗi kết nối", "Lỗi", JOptionPane.WARNING_MESSAGE);
    }
    }
    // dong ket noi
     public void Close()
    {
        try{
            soc.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void Receive(Object obj) throws IOException, SQLException, ClassNotFoundException
    {
      Socket cSoc = (Socket) obj;
    try {
        while (true) {
            // Khởi tạo mảng byte để nhận dữ liệu
            byte[] data = new byte[1000 * 1000];
            cSoc.getInputStream().read(data);
            
            // Chuyển data từ dạng byte sang dạng đối tượng
            DefaultTableModel model =  (DefaultTableModel) Deserialization(data);
            Object receivedObject = Deserialization(data);
            
            if (model.getValueAt(0,0).toString().equals("add")) {
                List<?> dataList = (List<?>) receivedObject;
                
                for (Object rowObject : dataList) {
                    if (rowObject instanceof List<?>) {
                        List<?> row = (List<?>) rowObject;
                        
                        if (row.get(0).toString().equals("add")) {
                            M_Nhanvien nv=new M_Nhanvien();
                            ///
                            //Thực hiện lưu trữ dữ liệu vào cơ sở dữ liệu của bạn
                            ///
                        } else if (row.get(0).toString().equals("edit")) {
                            M_Nhanvien nv=new M_Nhanvien();
                            ///
                            // Thực hiện cập nhật dữ liệu trong cơ sở dữ liệu của bạn
                            ///...

                        } else if (row.get(0).toString().equals("delete")) {
                            String masv = row.get(1).toString();

                            // Thực hiện xóa dữ liệu trong cơ sở dữ liệu của bạn
                            // ...
                        }
                    }
                }
            }
        }
    } catch (Exception e) {
            cSoc.close();
        
    }
    }
    
    // gui data
        public void SendDATA(DefaultTableModel dtm)
    {
          try{
               ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
               out.writeObject("DATA: "+serialize(dtm));
               out.flush();
               
           }catch(IOException e)
           {
               e.printStackTrace();
           }
    }
    //gui mess
    public void SendMess(String mess){
        
          
            System.out.println("ConnectSocket.CSocket.SendMess() " + soc.toString());
           try{
               
               ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
               String Str = "TEXT: " + mess;
               // byte[] array = Str.getBytes();
               out.writeObject(Str);
               out.flush();
               
           }catch(IOException e)
           {
               System.out.println("io exception .....");
              e.printStackTrace();
           }
        
    }
    
   
    // chuyển  obj thàng mảng
       public byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
        objectStream.writeObject(obj);
        objectStream.flush();
        byte[] byteArray = byteStream.toByteArray();
        objectStream.close();
        byteStream.close();
        return byteArray;
    }
    private byte[] serialize(DefaultTableModel dtm) throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dtm);
        oos.flush();
        return baos.toByteArray();
    }
    
//    public byte[] serialize(String Str) throws IOException {
//        
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(baos);
//        oos.writeObject(Str);
//        oos.flush();
//        return baos.toByteArray();
//    }

    
       //chuyển mảng thàng Obj
    public Object Deserialization(byte[] data) {
         try {
            ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
            ObjectInputStream objectStream = new ObjectInputStream(byteStream);
            Object obj = objectStream.readObject();
            objectStream.close();
            byteStream.close();
            return obj; // Trả về đối tượng sau khi phân giải ngược
             
         }catch(IOException| ClassNotFoundException e){
            e.printStackTrace();
            return null;            
         }
        }


}
