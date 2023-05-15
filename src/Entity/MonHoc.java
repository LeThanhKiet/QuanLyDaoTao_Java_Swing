/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author I'm Fall
 */
public class MonHoc {
    private String maMH;
    private String tenMH;
    private String maChuyenNganh;
    private String hocKy;
    private int soTinChi;
    private String hinhThucThi;
    private int soTiet;

    public MonHoc() { }

    public MonHoc(String maMH, String tenMH, String maChuyenNganh, String hocKy, int soTinChi, int soTiet, String hinhThucThi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.maChuyenNganh = maChuyenNganh;
        this.hocKy = hocKy;
        this.soTinChi = soTinChi;
        this.soTiet = soTiet;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
    
    
}
