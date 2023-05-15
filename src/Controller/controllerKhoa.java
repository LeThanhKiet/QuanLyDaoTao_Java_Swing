    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBConnect.DBConnect;
import Entity.Khoa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I'm Fall
 */
public class controllerKhoa {
    public List<Khoa> getKhoa() {
        String query = "select * from tblKhoa";
        List<Khoa> khoa =  new ArrayList<Khoa>();
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                Khoa obj = new Khoa();
                obj.setMaKhoa(rs.getString("MaKhoa"));
                obj.setTenKhoa(rs.getString("TenKhoa"));
                obj.setSDT(rs.getString("SDT"));
                
                khoa.add(obj);
            }
            prSt.close();
            db.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return khoa;
    }
    
    public Khoa getKhoa(String maKhoa) {
        String query = "select * from tblKhoa where MaKHoa = ? ";
        Khoa obj = new Khoa();
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, maKhoa);
            ResultSet rs = prSt.executeQuery();
            
            rs.next();
            obj.setMaKhoa(rs.getString("MaKhoa"));
            obj.setTenKhoa(rs.getString("TenKhoa"));
            obj.setSDT(rs.getString("SDT"));
            
            prSt.close();
            db.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return obj;
    }
    
    public boolean insertData(Khoa obj) {
        String query = "insert into tblKhoa values(?, ?, ?)";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, obj.getMaKhoa());
            prSt.setString(2, obj.getTenKhoa());
            prSt.setString(3, obj.getSDT());
            
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean updateData(Khoa obj) {
        String query = "update tblKhoa set TenKhoa = ?, SDT = ? where MaKhoa = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            
            prSt.setString(1, obj.getTenKhoa());
            prSt.setString(2, obj.getSDT());
            prSt.setString(3, obj.getMaKhoa());
            
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean deteleData(String mk) {
        String query = "delete tblKhoa where MaKhoa = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(query);
            prSt.setString(1, mk);
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
      public String getTenKhoaTheoMa(String maKhoa) {
        String sql = "select TenKhoa from tblKhoa where MaKhoa = ?";
        try {
            Connection db = new DBConnect().connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, maKhoa);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            Khoa obj = new Khoa();
            obj.setTenKhoa(rs.getString("TenKhoa"));
            
            return obj.getTenKhoa();
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return null;
    }
}
