/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DBConnect.*;
import java.sql.*;

/**
 *
 * @author Le Thanh Kiet
 */
public class controllerNguoiDung {
    DBConnect dbcon = new DBConnect();
    
    public boolean checkDangNhap(String user, String pass) {
        try {
            Connection conn = dbcon.connect();
            String query = "select count(*) as SoLuong from tblNguoiDung where TenDangNhap = ? and MatKhau = ?";
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, user);
            prSt.setString(2, pass);
            ResultSet rs = prSt.executeQuery();
            rs.next();
             
            int soLuong = rs.getInt("SoLuong");
            prSt.close();
            conn.close();
            return soLuong == 1;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public boolean checkDoiMatKhau(String user, String pass) {
        try {
            Connection conn = dbcon.connect();
            String query = "update tblNguoiDung set MatKhau = ? where TenDangNhap = ?";
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, pass);
            prSt.setString(2, user);
            
            int row = prSt.executeUpdate();
            prSt.close();
            conn.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public boolean insertData(String user, String pass) {
        try {
            Connection conn = dbcon.connect();
            String query = "insert into tblNguoiDung values(?, ?)";
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(2, pass);
            prSt.setString(1, user);
            
            int row = prSt.executeUpdate();
            prSt.close();
            conn.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }   
    }
    
    public boolean deleteData(String user) {
        try {
            Connection conn = dbcon.connect();
            String query = "delete tblNguoiDung where TenDangNhap = ?";
            PreparedStatement prSt = conn.prepareStatement(query);
            prSt.setString(1, user);
            
            int row = prSt.executeUpdate();
            prSt.close();
            conn.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return false;
    }
}
