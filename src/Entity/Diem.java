/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author I'm Fall
 */
public class Diem {
    private String maSV;
    private String maLopHocPhan;
    private double diemTP;
    private double diemCK;
    private double diemTK;
    private String xepLoai;

    public Diem() { }

    public Diem(String maSV, String maLopHocPhan, double diemTP, double diemCK, double diemTK, String xepLoai) {
        this.maSV = maSV;
        this.maLopHocPhan = maLopHocPhan;
        this.diemTP = diemTP;
        this.diemCK = diemCK;
        this.diemTK = diemTK;
        this.xepLoai = xepLoai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaLopHocPhan() {
        return maLopHocPhan;
    }

    public void setMaLopHocPhan(String maLopHocPhan) {
        this.maLopHocPhan = maLopHocPhan;
    }

    public double getDiemTP() {
        return diemTP;
    }

    public void setDiemTP(double diemTP) {
        this.diemTP = diemTP;
    }

    public double getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(double diemCK) {
        this.diemCK = diemCK;
    }

    public double getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(double diemTK) {
        this.diemTK = diemTK;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    
}
