
package Model;

/**
 *
 * @author admin
 */
public class M_SanphamCT {
    private int id;
    private String Masp;
    private int Soluong;
    private int gia;
    
    public M_SanphamCT(){}
    public M_SanphamCT(String Masp, int Soluong, int gia) {
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.gia = gia;
    }

    public M_SanphamCT(int id, String Masp, int Soluong, int gia) {
        this.id = id;
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
            
           
}
