/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Entity.ChuyenNganh;
import DBConnect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Le Thanh Kiet
 */
public class controllerChuyenNganh {
    public List<ChuyenNganh> getChuyenNganh() {
        String query = "select * from tblChuyenNganh";
        List<ChuyenNganh> listCN = new ArrayList<ChuyenNganh>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                ChuyenNganh cn = new ChuyenNganh();
                cn.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                cn.setTenChuyenNganh(rs.getString("TenChuyenNganh"));
                cn.setMaKhoa(rs.getString("MaKhoa"));
                
                listCN.add(cn);
            }
            prSt.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return listCN;   
    }
    
    public String TenChuyenNganhTheoMa(String macn) {
        String sql = "select TenChuyenNganh from tblChuyenNganh where MaChuyenNganh = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, macn);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            ChuyenNganh obj = new ChuyenNganh();
            obj.setTenChuyenNganh(rs.getString("TenChuyenNganh"));
            
            return obj.getTenChuyenNganh();
            
            
        } catch (Exception e) {
        }
        return null;
    }
    
    
    public boolean insertData(ChuyenNganh cn) {
        String query = "insert into tblChuyenNganh values(?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, cn.getMaChuyenNganh());
            prSt.setString(2, cn.getTenChuyenNganh());
            prSt.setString(3, cn.getMaKhoa());
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean updateData(ChuyenNganh cn) {
        String query = "update tblChuyenNganh set TenChuyenNganh = ?, MaKhoa = ? where MaChuyenNganh = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(3, cn.getMaChuyenNganh());
            prSt.setString(1, cn.getTenChuyenNganh());
            prSt.setString(2, cn.getMaKhoa());
            
            
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maChuyenNganh) {
        String query = "delete tblChuyenNganh where MaChuyenNganh = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maChuyenNganh);
                       
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            return r == 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public List<ChuyenNganh> searchDatabyTenKhoa(String tenKhoa) {
        List<ChuyenNganh> listCN = new ArrayList<ChuyenNganh>();
        try {
            String query = "select tblChuyenNganh.* from tblChuyenNganh inner join tblKhoa on tblChuyenNganh.MaKhoa = tblKhoa.MaKhoa where tblKhoa.TenKhoa like ?";
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1,"%" + tenKhoa + "%");
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                ChuyenNganh cn = new ChuyenNganh();
                cn.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                cn.setTenChuyenNganh(rs.getString("TenChuyenNganh"));
                cn.setMaKhoa(rs.getString("MaKhoa"));
                
                listCN.add(cn);     
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return listCN;
    }
}
