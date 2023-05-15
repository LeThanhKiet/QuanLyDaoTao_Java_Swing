/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author I'm Fall
 */
public class LopHocPhan {
    private String maLopHocPhan;
    private String maMH;
    private String maChuyenNganh;
    private String maGiangVien;
    private int siSo;
    private int hocKy;
    private String NamHoc;

    public LopHocPhan() {
    }

    public LopHocPhan(String maLopHocPhan, String maMH, String maChuyenNganh, String maGiangVien, int siSo, int hocKy, String NamHoc) {
        this.maLopHocPhan = maLopHocPhan;
        this.maMH = maMH;
        this.maChuyenNganh = maChuyenNganh;
        this.maGiangVien = maGiangVien;
        this.siSo = siSo;
        this.hocKy = hocKy;
        this.NamHoc = NamHoc;
    }

    public String getMaLopHocPhan() {
        return maLopHocPhan;
    }

    public void setMaLopHocPhan(String maLopHocPhan) {
        this.maLopHocPhan = maLopHocPhan;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }

    
    
}
