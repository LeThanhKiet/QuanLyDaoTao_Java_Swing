/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBConnect.DBConnect;
import Entity.MonHoc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author I'm Fall
 */
public class controllerMonHoc {
    public List<MonHoc> getMonHoc() {
        List<MonHoc> listMonHoc = new ArrayList<MonHoc>();
        String query = "select * from tblMonHoc";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                MonHoc mh = new MonHoc();
                
                mh.setMaMH(rs.getString("MaMH"));
                mh.setTenMH(rs.getString("TenMH"));
                mh.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                mh.setHocKy(rs.getString("HocKy"));
                mh.setSoTinChi(rs.getInt("SoTinChi"));
                mh.setSoTiet(rs.getInt("SoTiet"));
                mh.setHinhThucThi(rs.getString("HinhThucThi"));
                
                listMonHoc.add(mh);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return listMonHoc;
    }
    
    public boolean insertData(MonHoc mh) {
        String query = "insert into tblMonHoc values(?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, mh.getMaMH());
            prSt.setString(2, mh.getTenMH());
            prSt.setString(3, mh.getMaChuyenNganh());
            prSt.setString(4, mh.getHocKy());
            prSt.setInt(5, mh.getSoTinChi());
            prSt.setInt(6, mh.getSoTiet());
            prSt.setString(7, mh.getHinhThucThi());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public String TenMonHocTheoMa(String maMH) {
        String query = "select TenMH from tblMonHoc where MaMH = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, maMH);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            MonHoc mh = new MonHoc();
            mh.setTenMH(rs.getString("TenMH"));
            
            return mh.getTenMH();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return null;
    }
    
    public boolean updateData(MonHoc mh) {
        String query = "update tblMonHoc set MaMH = ?, MaChuyenNganh = ?, HocKy = ?, SoTinChi = ?, SoTiet = ?, HinhThucThi = ? where MaMH = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(7, mh.getMaMH());
            prSt.setString(1, mh.getTenMH());
            prSt.setString(2, mh.getMaChuyenNganh());
            prSt.setString(3, mh.getHocKy());
            prSt.setInt(4, mh.getSoTinChi());
            prSt.setInt(5, mh.getSoTiet());
            prSt.setString(6, mh.getHinhThucThi());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maMH) {
        String query = "delete tblMonHoc where MaMH = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maMH);
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public List<MonHoc> searchData(String tenChuyenNganh) {
        List<MonHoc> MonHoc = new ArrayList<MonHoc>();
        String query = "select tblMonHoc.* from tblMonHoc inner join tblChuyenNganh on tblMonHoc.MaChuyenNganh = tblChuyenNganh.MaChuyenNganh where TenChuyenNganh like ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, "%" + tenChuyenNganh + "%");
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                MonHoc mh = new MonHoc();
                
                mh.setMaMH(rs.getString("MaMH"));
                mh.setTenMH(rs.getString("TenMH"));
                mh.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                mh.setHocKy(rs.getString("HocKy"));
                mh.setSoTinChi(rs.getInt("SoTinChi"));
                mh.setSoTiet(rs.getInt("SoTiet"));
                mh.setHinhThucThi(rs.getString("HinhThucThi"));
                
                MonHoc.add(mh);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return MonHoc;
    }
}
