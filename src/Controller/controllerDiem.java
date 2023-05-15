/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBConnect.DBConnect;
import Entity.Diem;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author I'm Fall
 */
public class controllerDiem {
    public List<Diem> getDiem(){
        String query = "select * from tblDiem";
        List<Diem> diem = new ArrayList<Diem>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                Diem obj = new Diem();
                
                obj.setMaSV(rs.getString("MaSV"));
                obj.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
                obj.setDiemTP(rs.getDouble("DiemTP"));
                obj.setDiemCK(rs.getDouble("DiemCK"));
                obj.setDiemTK(rs.getDouble("DiemTK"));
                obj.setXepLoai(rs.getString("XepLoai"));
                
                diem.add(obj);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return diem;
    }
    
    public boolean insertData(Diem diem) {
        String query = "insert into tblDiem values(?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1, diem.getMaSV());
            prSt.setString(2, diem.getMaLopHocPhan());
            prSt.setDouble(3, diem.getDiemTP());
            prSt.setDouble(4, diem.getDiemCK());
            prSt.setDouble(5, diem.getDiemTK());
            prSt.setString(6, diem.getXepLoai());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean updateData(Diem diem) {
        String query = "update tblDiem set DiemTP = ?, DiemCK = ?, DiemTK = ?, XepLoai = ? where MaSV = ? and MaLopHocPhan = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(5, diem.getMaSV());
            prSt.setString(6, diem.getMaLopHocPhan());
            prSt.setDouble(1, diem.getDiemTP());
            prSt.setDouble(2, diem.getDiemCK());
            prSt.setDouble(3, diem.getDiemTK());
            prSt.setString(4, diem.getXepLoai());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maSV, String maMH) {
        String query = "delete tblDiem where MaSV = ? and MaLopHocPhan = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1, maSV);
            prSt.setString(2, maMH);
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    
    public ResultSet getDiem(String maSV){
        ResultSet diem = null;
        String query = "select tblDiem.MaSV, TenSV, tblDiem.MaLopHocPhan, TenMH, DiemTP, DiemCK, DiemTK, XepLoai, tblLopHocPhan.HocKy from tblSinhVien, tblMonHoc, tblDiem , tblLopHocPhan where tblSinhVien.MaSV = tblDiem.MaSV and tblDiem.MaLopHocPhan = tblLopHocPhan.MaLopHocPhan and tblLopHocPhan.MaMH = tblMonHoc.MaMH and tblDiem.MaSV = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maSV);
            diem = prSt.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return diem;
    }
    
    public List<Diem> getDiemByMaLopHocPhan(String maLopHocPhan) {
        List<Diem> listDiem = new ArrayList<Diem>();
        String query = "select * from tblDiem where MaLopHocPhan = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maLopHocPhan);
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                Diem diem = new Diem();
                
                diem.setMaSV(rs.getString("MaSV"));
                diem.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
                diem.setDiemTP(rs.getDouble("DiemTP"));
                diem.setDiemCK(rs.getDouble("DiemCK"));
                diem.setDiemTK(rs.getDouble("DiemTK"));
                diem.setXepLoai(rs.getString("XepLoai"));
                
                listDiem.add(diem);               
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        return listDiem;
    }
    
    public Diem getDiemMonHocbyMaSV(String maSV, String maLopHocPhan) {
        String query = "select * from tblDiem where MaSV = ? and MaLopHocPhan = ?";
        Diem diem = new Diem();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maSV);
            prSt.setString(2, maLopHocPhan);
            ResultSet rs = prSt.executeQuery();
            rs.next();
            
            diem.setMaSV(rs.getString("MaSV"));
            diem.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
            diem.setDiemTP(rs.getDouble("DiemTP"));
            diem.setDiemCK(rs.getDouble("DiemCK"));
            diem.setDiemTK(rs.getDouble("DiemTK"));
            diem.setXepLoai(rs.getString("XepLoai"));
            
            prSt.close();
            conn.close();
            
            return diem;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return null;
        }
    }
}
