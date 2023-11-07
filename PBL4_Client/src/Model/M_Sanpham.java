
package Model;

public class M_Sanpham {
    private int id;
    private String Masp,Tensp,Loai;
    private int Soluong;
    private int gia;

    public M_Sanpham(){
    }

    public M_Sanpham(String Masp, String Tensp, String Loai, int Soluong, int gia) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.gia = gia;
    }

    public M_Sanpham(int id, String Masp, String Tensp, String Loai, int Soluong, int gia) {
        this.id = id;
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Loai = Loai;
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

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
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