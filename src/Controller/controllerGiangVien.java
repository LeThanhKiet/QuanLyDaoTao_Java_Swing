/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DBConnect.DBConnect;
import Entity.GiangVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Le Thanh Kiet
 */
public class controllerGiangVien {
    public List<GiangVien> getGiangVien() {
        List<GiangVien> listGV = new ArrayList<GiangVien>();
        String query = "select * from tblGiangVien";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setMaGV(rs.getString("MaGV"));
                gv.setTenGV(rs.getString("TenGV"));
                gv.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                gv.setNgaySinh(rs.getDate("NgaySinh"));
                gv.setGioiTinh(rs.getString("GioiTinh"));
                gv.setEmail(rs.getString("Email"));
                gv.setDiaChi(rs.getString("DiaChi"));
                gv.setSDT(rs.getString("SDT"));
                
                listGV.add(gv);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        return listGV;
    }
    
    public GiangVien getGiangVienbyMa(String maGV) {
        String query = "select * from tblGiangVien where MaGV = ?";
        GiangVien gv = new GiangVien();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            
            prSt.setString(1, maGV);
            ResultSet rs = prSt.executeQuery();
            rs.next();
                           
            gv.setMaGV(rs.getString("MaGV"));
            gv.setTenGV(rs.getString("TenGV"));
            gv.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
            gv.setNgaySinh(rs.getDate("NgaySinh"));
            gv.setGioiTinh(rs.getString("GioiTinh"));
            gv.setEmail(rs.getString("Email"));
            gv.setDiaChi(rs.getString("DiaChi"));
            gv.setSDT(rs.getString("SDT"));
            
            prSt.close();
            conn.close();
        } catch (Exception e) {
        }
        
        return gv;
    }
    
    public String TenGiangVienTheoMa(String maGV) {
        String query = "select TenGV from tblGiangVien where MaGV = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, maGV);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            GiangVien gv = new GiangVien();
            gv.setTenGV(rs.getString("TenGV"));
            
            return gv.getTenGV();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return null;
    }
    
    
    public boolean insertData(GiangVien gv){
        String query = "insert into tblGiangVien values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, gv.getMaGV());
            prSt.setString(2, gv.getTenGV());
            prSt.setString(3, gv.getMaChuyenNganh());
            prSt.setString(4, gv.getNgaySinh().toString());
            prSt.setString(5, gv.getGioiTinh());
            prSt.setString(6, gv.getEmail());
            prSt.setString(7, gv.getDiaChi());
            prSt.setString(8, gv.getSDT());
                
            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            
            return r == 1;
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean deleteData(String maGV){
        String query = "delete tblGiangVien where MaGV = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, maGV);

            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            
            return r == 1;
       
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public boolean updateData(GiangVien gv){
        String query = "update tblGiangVien set TenGV = ?, MaChuyenNganh = ?, NgaySinh = ?, GioiTinh = ?, Email = ?, DiaChi = ?, SDT = ? where MaGV = ?";
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(8, gv.getMaGV());
            prSt.setString(1, gv.getTenGV());
            prSt.setString(2, gv.getMaChuyenNganh());
            prSt.setString(3, gv.getNgaySinh().toString());
            prSt.setString(4, gv.getGioiTinh());
            prSt.setString(5, gv.getEmail());
            prSt.setString(6, gv.getDiaChi());
            prSt.setString(7, gv.getSDT());

            int r = prSt.executeUpdate();
            prSt.close();
            conn.close();
            
            return r == 1;
       
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    public List<GiangVien> searchGiangVienByTenChuyenNganh(String tenChuyenNganh) {
        String query = "select tblGiangVien.* from tblGiangVien inner join tblChuyenNganh on tblGiangVien.MaChuyenNganh = tblChuyenNganh.MaChuyenNganh where tblChuyenNganh.TenChuyenNganh like ?";
        List<GiangVien> listGV = new ArrayList<GiangVien>();
        try {
            Connection conn = new DBConnect().connect();
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, "%" + tenChuyenNganh + "%");
            
            ResultSet rs = prSt.executeQuery();
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setMaGV(rs.getString("MaGV"));
                gv.setTenGV(rs.getString("TenGV"));
                gv.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                gv.setNgaySinh(rs.getDate("NgaySinh"));
                gv.setGioiTinh(rs.getString("GioiTinh"));
                gv.setEmail(rs.getString("Email"));
                gv.setDiaChi(rs.getString("DiaChi"));
                gv.setSDT(rs.getString("SDT"));
                
                listGV.add(gv);
            }
            prSt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return listGV;
    }
}
