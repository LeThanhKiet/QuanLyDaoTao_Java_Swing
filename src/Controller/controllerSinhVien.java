/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBConnect.DBConnect;
import Entity.SinhVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author I'm Fall
 */
public class controllerSinhVien {
    public List<SinhVien> getSinhVien() {
        List<SinhVien> sinhVien = new ArrayList<SinhVien>();
        String query = "select * from tblSinhVien";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                SinhVien obj = new SinhVien();
                obj.setMaSV(rs.getString("MaSV"));
                obj.setTenSV(rs.getString("TenSV"));
                obj.setNgaySinh(rs.getDate("NgaySinh"));
                obj.setGioiTinh(rs.getString("GioiTinh"));
                obj.setDiaChi(rs.getString("DiaChi"));
                obj.setSDT(rs.getString("SDT"));
                obj.setMaLop(rs.getString("MaLop"));
                obj.setHeDaoTao(rs.getString("HeDaoTao"));
                
                sinhVien.add(obj);
            }
            prSt.close();
            db.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return sinhVien;
    }
    
    public SinhVien getSinhVienbyMa(String maSV) {
        String query = "select * from tblSinhVien where Masv = ?";
        SinhVien sv = new SinhVien();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1, maSV);
            ResultSet rs = prSt.executeQuery();
            rs.next();
                           
            sv.setMaSV(rs.getString("MaSV"));
            sv.setTenSV(rs.getString("TenSV"));
            sv.setNgaySinh(rs.getDate("NgaySinh"));
            sv.setGioiTinh(rs.getString("GioiTinh"));
            sv.setDiaChi(rs.getString("DiaChi"));
            sv.setSDT(rs.getString("SDT"));
            sv.setMaLop(rs.getString("Malop"));
            sv.setHeDaoTao(rs.getString("HeDaoTao"));
            
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return sv;
    }
    
    public String TenSinhVienTheoMa(String maSV) {
        String query = "select TenSV from tblSinhVien where MaSV = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, maSV);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            SinhVien sv = new SinhVien();
            sv.setTenSV(rs.getString("TenSV"));
            
            return sv.getTenSV();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return null;
    }
    
    public boolean insertData(SinhVien sv) {
        String query = "insert into tblSinhVien values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, sv.getMaSV());
            prSt.setString(2, sv.getTenSV());
            prSt.setString(3, sv.getNgaySinh().toString());
            prSt.setString(4, sv.getGioiTinh());
            prSt.setString(5, sv.getDiaChi());
            prSt.setString(6, sv.getSDT());
            prSt.setString(7, sv.getMaLop());
            prSt.setString(8, sv.getHeDaoTao());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean updateData(SinhVien sv) {
        String query = "update tblSinhVien set TenSV = ?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, SDT = ?, MaLop = ?, HeDaoTao = ? where MaSV = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(8, sv.getMaSV());
            prSt.setString(1, sv.getTenSV());
            prSt.setString(2, sv.getNgaySinh().toString());
            prSt.setString(3, sv.getGioiTinh());
            prSt.setString(4, sv.getDiaChi());
            prSt.setString(5, sv.getSDT());
            prSt.setString(6, sv.getMaLop());
            prSt.setString(7, sv.getHeDaoTao());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maSV) {
        String query = "delete tblSinhVien where MaSV = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maSV);
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public List<SinhVien> searchData(String tenLop) {
        String query = "select tblSinhVien.* from tblSinhVien inner join tblLop on tblSinhVien.MaLop = tblLop.MaLop where TenLop like ?";
        List<SinhVien> sinhVien = new ArrayList<SinhVien>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, "%" + tenLop + "%");
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                SinhVien obj = new SinhVien();
                obj.setMaSV(rs.getString("MaSV"));
                obj.setTenSV(rs.getString("TenSV"));
                obj.setNgaySinh(rs.getDate("NgaySinh"));
                obj.setGioiTinh(rs.getString("GioiTinh"));
                obj.setDiaChi(rs.getString("DiaChi"));
                obj.setSDT(rs.getString("SDT"));
                obj.setMaLop(rs.getString("MaLop"));
                obj.setHeDaoTao(rs.getString("HeDaoTao"));
                
                sinhVien.add(obj);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return sinhVien;
    }
    
    public List<SinhVien> getSVbyMaLop(String maLop) {
        String query = "select * from tblSinhVien where MaLop = ?";
        List<SinhVien> sinhVien = new ArrayList<SinhVien>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maLop);
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                SinhVien obj = new SinhVien();
                obj.setMaSV(rs.getString("MaSV"));
                obj.setTenSV(rs.getString("TenSV"));
                obj.setNgaySinh(rs.getDate("NgaySinh"));
                obj.setGioiTinh(rs.getString("GioiTinh"));
                obj.setDiaChi(rs.getString("DiaChi"));
                obj.setSDT(rs.getString("SDT"));
                obj.setMaLop(rs.getString("MaLop"));
                obj.setHeDaoTao(rs.getString("HeDaoTao"));
                
                sinhVien.add(obj);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return sinhVien;
    }
    
    
    public List<String> getMaSVbyMaLopHocPhan(String maLopHocPhan) {
        String query = "select MaSV from tblDiem where MaLopHocPhan = ?";
        List<String> listMaSV = new ArrayList<String>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maLopHocPhan);
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                listMaSV.add(rs.getString("MaSV"));
            }
            
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        return listMaSV;
    }
}
 