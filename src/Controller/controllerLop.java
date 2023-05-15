/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBConnect.DBConnect;
import Entity.Lop;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author I'm Fall
 */
public class controllerLop {
    public List<Lop> getLop() {
        String query = "select * from tblLop";
        List<Lop> lop = new ArrayList<Lop>();
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                Lop obj = new Lop();
                obj.setMaLop(rs.getString("MaLop"));
                obj.setTenLop(rs.getString("TenLop"));
                obj.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                obj.setSiSo(rs.getLong("SiSo"));
                obj.setKhoaHoc(rs.getString("KhoaHoc"));
                
                lop.add(obj);
            }
            prSt.close();
            db.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return lop;
    }
    
    public Lop getLop(String maLop) {
        String query = "select * from tblLop where MaLop = ?";
        Lop obj = new Lop();
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, maLop);
            ResultSet rs = prSt.executeQuery();
            
            rs.next();
            obj.setMaLop(rs.getString("MaLop"));
            obj.setTenLop(rs.getString("TenLop"));
            obj.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
            obj.setSiSo(rs.getLong("SiSo"));
            obj.setKhoaHoc(rs.getString("KhoaHoc"));
            
            prSt.close();
            db.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return obj;
    }
    
    public boolean insertData(Lop l) {
        String query = "insert into tblLop values(?, ?, ?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, l.getMaLop());
            prSt.setString(2, l.getTenLop());
            prSt.setString(3, l.getMaChuyenNganh());
            prSt.setLong(4, l.getSiSo());
            prSt.setString(5, l.getKhoaHoc());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean updateData(Lop l) {
        String query = "update tblLop set TenLop = ?, MaChuyenNganh = ?, SiSo = ?, KhoaHoc = ? where MaLop = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1, l.getTenLop());
            prSt.setString(2, l.getMaChuyenNganh());
            prSt.setLong(3, l.getSiSo());
            prSt.setString(4, l.getKhoaHoc());
            prSt.setString(5, l.getMaLop());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maLop) {
        String query = "delete tblLop where MaLop = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maLop);
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public List<Lop> searchData(String tenChuyenNganh) {
        List<Lop> listLop = new ArrayList<Lop>();
        try {
            String query = "select tblLop.* from tblLop inner join tblChuyenNganh on tblLop.MaChuyenNganh = tblChuyenNganh.MaChuyenNganh where TenChuyenNganh like ?";
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1, "%" + tenChuyenNganh + "%");
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                Lop obj = new Lop();
                obj.setMaLop(rs.getString("MaLop"));
                obj.setTenLop(rs.getString("TenLop"));
                obj.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                obj.setSiSo(rs.getLong("SiSo"));
                obj.setKhoaHoc(rs.getString("KhoaHoc"));
                
                listLop.add(obj);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return listLop;
    }
    
    public String TenLopTheoMa(String maLop) {
        String query = "select TenLop from tblLop where MaLop = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, maLop);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            Lop l = new Lop();
            l.setTenLop(rs.getString("TenLop"));
            
            return l.getTenLop();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return null;
    }
}
