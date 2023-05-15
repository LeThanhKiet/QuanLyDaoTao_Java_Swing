/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author I'm Fall
 */
public class Lop {
    private String maLop;
    private String tenLop;
    private String maChuyenNganh;
    long siSo;
    private String khoaHoc;

    public Lop() { }

    public Lop(String maLop, String tenLop, String maChuyenNganh, long siSo, String khoaHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maChuyenNganh = maChuyenNganh;
        this.siSo = siSo;
        this.khoaHoc = khoaHoc;
    }
    

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public long getSiSo() {
        return siSo;
    }

    public void setSiSo(long siSo) {
        this.siSo = siSo;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
    
}
