/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Controller.controllerSinhVien;
import static GUI.frmMainAdmin.date;
import static GUI.frmMainAdmin.nameLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Le Thanh Kiet
 */
public class frmMainSV extends javax.swing.JFrame {
    public static String nameLogin;
    public static Date today = new Date();
    public static Locale local = new Locale("vi", "VI");
    public static DateFormat d = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
    public static String date = d.format(today);
    /**
     * Creates new form frmMainAdmin
     */
    public frmMainSV() {
        initComponents();
        this.setTitle("Cổng thông tin sinh viên EPU");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUser();
        
        Timer time = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar lich = Calendar.getInstance();
                int gio = lich.get(Calendar.HOUR);
                int phut = lich.get(Calendar.MINUTE);
                int giay = lich.get(Calendar.SECOND);
                txtGio.setText(" " + gio + " : " + phut + " : " + giay);
            }
        });
        time.start();
    }
    
    private void setUser() {
        nameLogin = frmLogin.nameLogin;
        labelUser.setText(nameLogin);
        labelNgay.setText(date); 
        labelName.setText(new controllerSinhVien().getSinhVienbyMa(frmLogin.nameLogin).getTenSV());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabContent = new javax.swing.JTabbedPane();
        panelContent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGio = new javax.swing.JTextField();
        labelNgay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        ThongTin = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuItemTrangChu = new javax.swing.JMenuItem();
        MenuItemThongTin = new javax.swing.JMenuItem();
        menuItemDMK = new javax.swing.JMenuItem();
        menuItemDangXuat = new javax.swing.JMenuItem();
        menuItemThoat = new javax.swing.JMenuItem();
        menuItemXemDiem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContent.setBackground(new java.awt.Color(43, 122, 121));
        panelContent.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/EPU.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        tabContent.addTab("Trang Chủ", panelContent);

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");

        labelUser.setText("User");

        jLabel2.setText("Giờ:");

        labelNgay.setText("Today");

        jLabel3.setText("Ngày:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Xin Chào:");

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 255, 51));
        labelName.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelNgay)
                    .addComponent(jLabel5)
                    .addComponent(labelName))
                .addGap(32, 32, 32))
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/taikhoan.png"))); // NOI18N
        jMenu3.setText("Tài Khoản");

        menuItemTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Trangchu.png"))); // NOI18N
        menuItemTrangChu.setText("Trang Chủ");
        menuItemTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTrangChuActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemTrangChu);

        MenuItemThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Thongtin.png"))); // NOI18N
        MenuItemThongTin.setText("Thông Tin Sinh Viên");
        MenuItemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemThongTinActionPerformed(evt);
            }
        });
        jMenu3.add(MenuItemThongTin);

        menuItemDMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/doimatkhau.png"))); // NOI18N
        menuItemDMK.setText("Đổi Mật Khẩu");
        menuItemDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDMKActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemDMK);

        menuItemDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dangxuat.png"))); // NOI18N
        menuItemDangXuat.setText("Đăng Xuất");
        menuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDangXuatActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemDangXuat);

        menuItemThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thoat.png"))); // NOI18N
        menuItemThoat.setText("Thoát");
        menuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThoatActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemThoat);

        ThongTin.add(jMenu3);

        menuItemXemDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/seach.png"))); // NOI18N
        menuItemXemDiem.setText("Xem Điểm");
        menuItemXemDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemXemDiemMouseClicked(evt);
            }
        });
        ThongTin.add(menuItemXemDiem);

        setJMenuBar(ThongTin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabContent)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemXemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemXemDiemMouseClicked
        // TODO add your handling code here:
        try {
            frmXemDiem xemDiem = new frmXemDiem();
            xemDiem.show();
        } catch (Exception e) {
            Logger.getLogger(frmXemDiem.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Điểm trống !", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuItemXemDiemMouseClicked

    private void menuItemDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDMKActionPerformed
        // TODO add your handling code here:
        new frmDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_menuItemDMKActionPerformed

    private void menuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDangXuatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_menuItemDangXuatActionPerformed

    private void menuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThoatActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không ?", "Thông báo", JOptionPane.OK_CANCEL_OPTION) == 0) {
            System.exit(EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_menuItemThoatActionPerformed

    private void menuItemTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTrangChuActionPerformed
        // TODO add your handling code here:
        tabContent.removeAll();
        tabContent.add("Trang Chủ", panelContent);
    }//GEN-LAST:event_menuItemTrangChuActionPerformed

    private void MenuItemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemThongTinActionPerformed
        // TODO add your handling code here:
        panelThongTinSinhVien thongTin = new panelThongTinSinhVien();
        tabContent.removeAll();
        tabContent.add("Thông tin sinh viên", thongTin);
    }//GEN-LAST:event_MenuItemThongTinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemThongTin;
    private javax.swing.JMenuBar ThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNgay;
    private javax.swing.JLabel labelUser;
    private javax.swing.JMenuItem menuItemDMK;
    private javax.swing.JMenuItem menuItemDangXuat;
    private javax.swing.JMenuItem menuItemThoat;
    private javax.swing.JMenuItem menuItemTrangChu;
    private javax.swing.JMenu menuItemXemDiem;
    private javax.swing.JPanel panelContent;
    private javax.swing.JTabbedPane tabContent;
    private javax.swing.JTextField txtGio;
    // End of variables declaration//GEN-END:variables
}