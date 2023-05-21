/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Le Thanh Kiet
 */
public class frmMainAdmin extends javax.swing.JFrame {
    public static String nameLogin;
    public static Date today = new Date();
    public static Locale local = new Locale("vi", "VI");
    public static DateFormat d = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
    public static String date = d.format(today);
    
    
    /**
     * Creates new form frmMainAdmin
     */
    public frmMainAdmin() {
        initComponents();
        this.setTitle("Hệ thống quản lí đào tạo EPU");
        this.setIconImage(new ImageIcon(getClass().getResource("/Icon/EPUlogo.png")).getImage());
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
        panelTrangChu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGio = new javax.swing.JTextField();
        labelNgay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuItemTrangChu = new javax.swing.JMenuItem();
        menuItemDMK = new javax.swing.JMenuItem();
        menuItemDangXuat = new javax.swing.JMenuItem();
        menuItemThoat = new javax.swing.JMenuItem();
        menuItem = new javax.swing.JMenu();
        menuItemQLK = new javax.swing.JMenuItem();
        menuItemQLCN = new javax.swing.JMenuItem();
        menuItemQLL = new javax.swing.JMenuItem();
        menuItemQLLHP = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemQLSV = new javax.swing.JMenuItem();
        menuItemGV = new javax.swing.JMenuItem();
        menuItemDiem = new javax.swing.JMenuItem();
        menuItemMH = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTrangChu.setBackground(new java.awt.Color(43, 122, 121));
        panelTrangChu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/EPU.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelTrangChuLayout = new javax.swing.GroupLayout(panelTrangChu);
        panelTrangChu.setLayout(panelTrangChuLayout);
        panelTrangChuLayout.setHorizontalGroup(
            panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
        );
        panelTrangChuLayout.setVerticalGroup(
            panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        tabContent.addTab("Trang Chủ", panelTrangChu);

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        labelUser.setText("User");

        jLabel2.setText("Giờ:");

        labelNgay.setText("Today");

        jLabel3.setText("Ngày:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(labelNgay))
                .addGap(32, 32, 32))
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/taikhoan.png"))); // NOI18N
        jMenu3.setText("Tài Khoản");

        menuItemTrangChu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Trangchu.png"))); // NOI18N
        menuItemTrangChu.setText("Trang Chủ");
        menuItemTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTrangChuActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemTrangChu);

        menuItemDMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemDMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/doimatkhau.png"))); // NOI18N
        menuItemDMK.setText("Đổi Mật Khẩu");
        menuItemDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDMKActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemDMK);

        menuItemDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dangxuat.png"))); // NOI18N
        menuItemDangXuat.setText("Đăng Xuất");
        menuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDangXuatActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemDangXuat);

        menuItemThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thoat.png"))); // NOI18N
        menuItemThoat.setText("Thoát");
        menuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThoatActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemThoat);

        jMenuBar2.add(jMenu3);

        menuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/quanlycoban.png"))); // NOI18N
        menuItem.setText("Quản Lý Cơ Bản");

        menuItemQLK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemQLK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        menuItemQLK.setText("Quản Lý Khoa");
        menuItemQLK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQLKActionPerformed(evt);
            }
        });
        menuItem.add(menuItemQLK);

        menuItemQLCN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemQLCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        menuItemQLCN.setText("Quản Lý Chuyên Ngành");
        menuItemQLCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQLCNActionPerformed(evt);
            }
        });
        menuItem.add(menuItemQLCN);

        menuItemQLL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemQLL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        menuItemQLL.setText("Quản Lý Lớp");
        menuItemQLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQLLActionPerformed(evt);
            }
        });
        menuItem.add(menuItemQLL);

        menuItemQLLHP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemQLLHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        menuItemQLLHP.setText("Quản Lý Lớp Học Phần");
        menuItemQLLHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQLLHPActionPerformed(evt);
            }
        });
        menuItem.add(menuItemQLLHP);

        jMenuBar2.add(menuItem);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/quanlydaotao .png"))); // NOI18N
        jMenu1.setText("Quản Lý Đào Tạo");

        menuItemQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next2.png"))); // NOI18N
        menuItemQLSV.setText("Quản Lý Sinh Viên");
        menuItemQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQLSVActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemQLSV);

        menuItemGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next2.png"))); // NOI18N
        menuItemGV.setText("Quản Lý Giảng Viên");
        menuItemGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGVActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemGV);

        menuItemDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next2.png"))); // NOI18N
        menuItemDiem.setText("Quản Lý Điểm");
        menuItemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDiemActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemDiem);

        menuItemMH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next2.png"))); // NOI18N
        menuItemMH.setText("Quản Lý Môn Học");
        menuItemMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMHActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemMH);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

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

    private void menuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThoatActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không ?", "Thông báo", JOptionPane.OK_CANCEL_OPTION) == 0) {
            System.exit(EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_menuItemThoatActionPerformed

    private void menuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDangXuatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_menuItemDangXuatActionPerformed

    private void menuItemDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDMKActionPerformed
        // TODO add your handling code here:
        new frmDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_menuItemDMKActionPerformed

    private void menuItemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDiemActionPerformed
        // TODO add your handling code here:
        panelQuanLyDiem diem = new panelQuanLyDiem();
        tabContent.removeAll();
        tabContent.add("Quản lý điểm", diem);
    }//GEN-LAST:event_menuItemDiemActionPerformed

    private void menuItemQLKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQLKActionPerformed
        // TODO add your handling code here:
        panelQuanLyKhoa khoa = new panelQuanLyKhoa();
        tabContent.removeAll();
        tabContent.add("Quản lý khoa", khoa);
        
    }//GEN-LAST:event_menuItemQLKActionPerformed

    private void menuItemTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTrangChuActionPerformed
        // TODO add your handling code here:
//        panelTrangChu trangChu = new panelTrangChu();
//        tabContent.removeAll();
//        tabContent.add("Trang Chủ", trangChu);
          tabContent.removeAll();
          tabContent.add("Trang chủ", panelTrangChu);
    }//GEN-LAST:event_menuItemTrangChuActionPerformed

    private void menuItemQLCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQLCNActionPerformed
        // TODO add your handling code here:
        panelQuanLyChuyenNganh cn = new panelQuanLyChuyenNganh();
        tabContent.removeAll();
        tabContent.add("Quản lý chuyên ngành", cn);
    }//GEN-LAST:event_menuItemQLCNActionPerformed

    private void menuItemQLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQLLActionPerformed
        // TODO add your handling code here:
        panelQuanLyLop lop = new panelQuanLyLop();
        tabContent.removeAll();
        tabContent.add("Quản lý lớp", lop);
    }//GEN-LAST:event_menuItemQLLActionPerformed

    private void menuItemQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQLSVActionPerformed
        // TODO add your handling code here:
        panelQuanLySinhVien sinhVien = new panelQuanLySinhVien();
        tabContent.removeAll();
        tabContent.add("Quản lý sinh viên", sinhVien);
    }//GEN-LAST:event_menuItemQLSVActionPerformed

    private void menuItemGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGVActionPerformed
        // TODO add your handling code here:
        panelQuanLyGiangVien giangVien = new panelQuanLyGiangVien();
        tabContent.removeAll();
        tabContent.add("Quản lý giảng viên", giangVien);
    }//GEN-LAST:event_menuItemGVActionPerformed

    private void menuItemMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMHActionPerformed
        // TODO add your handling code here:
        panelQuanLyMonHoc monHoc = new panelQuanLyMonHoc();
        tabContent.removeAll();
        tabContent.add("Quản lý môn học", monHoc);
    }//GEN-LAST:event_menuItemMHActionPerformed

    private void menuItemQLLHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQLLHPActionPerformed
        // TODO add your handling code here:
        panelQuanLyLopHP lopHP = new panelQuanLyLopHP();
        tabContent.removeAll();
        tabContent.add("Quản lý lớp học phần", lopHP);
    }//GEN-LAST:event_menuItemQLLHPActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNgay;
    private javax.swing.JLabel labelUser;
    private javax.swing.JMenu menuItem;
    private javax.swing.JMenuItem menuItemDMK;
    private javax.swing.JMenuItem menuItemDangXuat;
    private javax.swing.JMenuItem menuItemDiem;
    private javax.swing.JMenuItem menuItemGV;
    private javax.swing.JMenuItem menuItemMH;
    private javax.swing.JMenuItem menuItemQLCN;
    private javax.swing.JMenuItem menuItemQLK;
    private javax.swing.JMenuItem menuItemQLL;
    private javax.swing.JMenuItem menuItemQLLHP;
    private javax.swing.JMenuItem menuItemQLSV;
    private javax.swing.JMenuItem menuItemThoat;
    private javax.swing.JMenuItem menuItemTrangChu;
    private javax.swing.JPanel panelTrangChu;
    private javax.swing.JTabbedPane tabContent;
    private javax.swing.JTextField txtGio;
    // End of variables declaration//GEN-END:variables
}
