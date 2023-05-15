/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.LopHocPhan;
import DBConnect.DBConnect;
import Entity.ChuyenNganh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Le Thanh Kiet
 */
public class controllerLopHocPhan {
    public List<LopHocPhan> getLopHP() {
        String query = "select * from tblLopHocPhan";
        List<LopHocPhan> listLHP = new ArrayList<LopHocPhan>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                LopHocPhan lhp = new LopHocPhan();
                lhp.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
                lhp.setMaMH(rs.getString("MaMH"));
                lhp.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                lhp.setMaGiangVien(rs.getString("MaGV"));
                lhp.setSiSo(rs.getInt("SiSo"));
                lhp.setHocKy(rs.getInt("HocKy"));
                lhp.setNamHoc(rs.getString("NamHoc"));
                listLHP.add(lhp);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        return listLHP;
    }
    
    
    public List<LopHocPhan> getLopHocPhanbyMaGV(String maGV) {
        String query = "select * from tblLopHocPhan where maGV = ?";
        List<LopHocPhan> listLHP = new ArrayList<LopHocPhan>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maGV);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                LopHocPhan lhp = new LopHocPhan();
                lhp.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
                lhp.setMaMH(rs.getString("MaMH"));
                lhp.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                lhp.setMaGiangVien(rs.getString("MaGV"));
                lhp.setSiSo(rs.getInt("SiSo"));
                lhp.setHocKy(rs.getInt("HocKy"));
                lhp.setNamHoc(rs.getString("NamHoc"));
                listLHP.add(lhp);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        return listLHP;
    }
    
    public LopHocPhan getLopHocPhanbyMaLopHocPhan(String maLopHocPhan) {
        String query = "select * from tblLopHocPhan where MaLopHocPhan = ?";
        LopHocPhan lhp = new LopHocPhan();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maLopHocPhan);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();

            lhp.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
            lhp.setMaMH(rs.getString("MaMH"));
            lhp.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
            lhp.setMaGiangVien(rs.getString("MaGV"));
            lhp.setSiSo(rs.getInt("SiSo"));
            lhp.setHocKy(rs.getInt("HocKy"));
            lhp.setNamHoc(rs.getString("NamHoc"));
            
            prSt.close();
            conn.close();
            return lhp;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return null;
        }
    }
        
    public boolean insertData(LopHocPhan lopHP) {
        String query = "insert into tblLopHocPhan values(?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, lopHP.getMaLopHocPhan());
            prSt.setString(2, lopHP.getMaMH());
            prSt.setString(3, lopHP.getMaChuyenNganh());
            prSt.setString(4, lopHP.getMaGiangVien());
            prSt.setInt(5, lopHP.getSiSo());
            prSt.setInt(6, lopHP.getHocKy());
            prSt.setString(7, lopHP.getNamHoc());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean updateData(LopHocPhan lopHP) {
        String query = "update tblLopHocPhan set MaMH = ?, MaChuyenNganh = ?, MaGV = ?, SiSo = ?, HocKy = ?, NamHoc = ? where MaLopHocPhan = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(7, lopHP.getMaLopHocPhan());
            prSt.setString(1, lopHP.getMaMH());
            prSt.setString(2, lopHP.getMaChuyenNganh());
            prSt.setString(3, lopHP.getMaGiangVien());
            prSt.setInt(4, lopHP.getSiSo());
            prSt.setInt(5, lopHP.getHocKy());
            prSt.setString(6, lopHP.getNamHoc());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maLopHP) {
        String query = "delete tblLopHocPhan where MaLopHocPhan = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maLopHP);
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public List<LopHocPhan> searchData(String tenMonHoc) {
        List<LopHocPhan> listLHP = new ArrayList<LopHocPhan>();
        String query = "select tblLopHocPhan.* from tblLopHocPhan inner join tblMonHoc on tblMonHoc.MaMH = tblLopHocPhan.MaMH where TenMH like ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, "%" + tenMonHoc + "%");
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                LopHocPhan lopHocPhan = new LopHocPhan();
                
                lopHocPhan.setMaLopHocPhan(rs.getString("MaLopHocPhan"));
                lopHocPhan.setMaMH(rs.getString("MaMH"));
                lopHocPhan.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                lopHocPhan.setMaGiangVien(rs.getString("MaGV"));
                lopHocPhan.setSiSo(rs.getInt("SiSo"));
                lopHocPhan.setHocKy(rs.getInt("HocKy"));
                lopHocPhan.setNamHoc(rs.getString("NamHoc"));
                
                listLHP.add(lopHocPhan);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return listLHP;
    }
}
