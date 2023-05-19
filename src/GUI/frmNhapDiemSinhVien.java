/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.table.DefaultTableModel;
import Controller.controllerLopHocPhan;
import Controller.controllerDiem;
import Entity.Diem;
import Entity.LopHocPhan;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Le Thanh Kiet
 */
public class frmNhapDiemSinhVien extends javax.swing.JFrame {

    private DefaultTableModel tableModel = new DefaultTableModel();
    private controllerLopHocPhan ctlLHP = new controllerLopHocPhan();
    private controllerDiem ctlDiem = new controllerDiem();
    
    private static String tenGiangVien = frmLogin.nameLogin;
    /**
     * Creates new form frmNhapDiemSinhVien
     */
    public frmNhapDiemSinhVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        setEnabledComponent();
        getComboBoxMaLopHocPhan();
        String[] rows = {
               "Mã sinh viên",         
               "Mã Lớp Học Phần",
               "Điêm Thành Phần",
               "Điểm Cuối Kỳ",
               "Điểm Tổng Kết",
               "Xếp Loại",
        };
        tableModel.setColumnIdentifiers(rows);
        tblXemDiem.setModel(tableModel);
        clearDataTable();
        getDataTable(cboMaLopHP.getSelectedItem().toString());
        clearDataComboBoxMaSV();
        getComboBoxMaSV(cboMaLopHP.getSelectedItem().toString());
    }
    
    
    private void setEnabledComponent() {
        txtTenMH.setEnabled(false);
        txtTenSinhVien.setEnabled(false);
        txtDiemTK.setEnabled(false);
        txtXepLoai.setEnabled(false);
    }
    
    private void getComboBoxMaLopHocPhan() {
        List<LopHocPhan> listLHP;
        try {
            listLHP = ctlLHP.getLopHocPhanbyMaGV(tenGiangVien);
            for(int i = 0; i < listLHP.size(); i++) {
                cboMaLopHP.addItem(listLHP.get(i).getMaLopHocPhan());
            }
        } catch (Exception e) {
        }
    }
    
    private void clearDataComboBoxMaSV() {
        for (int i = cboMaSV.getItemCount() - 1; i >= 0; i--) {
            cboMaSV.removeItemAt(i);
        }
    }
    
    private void getComboBoxMaSV(String maLopHocPhan) {
        List<String> listMaSV;
        try {
            listMaSV = new Controller.controllerSinhVien().getMaSVbyMaLopHocPhan(maLopHocPhan);
            for(int i = 0; i < listMaSV.size(); i++) {
                cboMaSV.addItem(listMaSV.get(i));
            }
        } catch (Exception e) {
        }
    }
    
    private void clearDataTable() {
        int n = tableModel.getRowCount() - 1;
        for(int i = n; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }
    
    private void getDataTable(String maLopHocPhan) {
        try {
            List<Diem> listDiem = ctlDiem.getDiemByMaLopHocPhan(maLopHocPhan);
            for(int i = 0; i < listDiem.size(); i++) {
                Object[] rows = new Object[6];
                rows[0] = listDiem.get(i).getMaSV();
                rows[1] = listDiem.get(i).getMaLopHocPhan();
                rows[2] = listDiem.get(i).getDiemTP();
                rows[3] = listDiem.get(i).getDiemCK();
                rows[4] = listDiem.get(i).getDiemTK();
                rows[5] = listDiem.get(i).getXepLoai();
                tableModel.addRow(rows);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblXemDiem = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboMaLopHP = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTenMH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenSinhVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboMaSV = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDiemTP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiemCK = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiemTK = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtXepLoai = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        tblXemDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Mã Lớp Học Phần", "Điểm Thành Phần", "Điểm Cuối Kỳ", "Điểm Tổng Kết", "Xếp Loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblXemDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblXemDiemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblXemDiem);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NHẬP ĐIỂM SINH VIÊN");

        jLabel1.setText("Mã Lớp Học Phần:");

        cboMaLopHP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaLopHPItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tên môn học:");

        jLabel5.setText("Họ tên sinh viên:");

        jLabel6.setText("Lựa chọn sinh viên cần nhập:");

        cboMaSV.setMaximumRowCount(30);
        cboMaSV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaSVItemStateChanged(evt);
            }
        });

        jLabel4.setText("Điểm thành phần:");

        jLabel7.setText("Điểm cuối kì");

        jLabel8.setText("Điểm tổng kết");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel9.setText("Xếp loại:");

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(460, 460, 460)
                .addComponent(btnLuu)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMaLopHP, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiemTP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiemCK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMaLopHP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(txtDiemTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiemCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtXepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnLamMoi)
                    .addComponent(btnLuu))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cboMaLopHPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaLopHPItemStateChanged
        // TODO add your handling code here:
        String maLopHocPhan = cboMaLopHP.getSelectedItem().toString();
        String maMH = ctlLHP.getLopHocPhanbyMaLopHocPhan(maLopHocPhan).getMaMH();
        txtTenMH.setText(new Controller.controllerMonHoc().TenMonHocTheoMa(maMH));
        clearDataTable();
        getDataTable(maLopHocPhan);
        clearDataComboBoxMaSV();
        getComboBoxMaSV(maLopHocPhan); 
    }//GEN-LAST:event_cboMaLopHPItemStateChanged

    private void tblXemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblXemDiemMouseClicked
        // TODO add your handling code here:
        int r = tblXemDiem.getSelectedRow();
        if(r >= 0) {
            cboMaSV.setSelectedItem(tblXemDiem.getValueAt(r, 0));
            txtDiemTP.setText(tblXemDiem.getValueAt(r, 2).toString());
            txtDiemTP.setText(tblXemDiem.getValueAt(r, 3).toString());
            txtDiemTP.setText(tblXemDiem.getValueAt(r, 4).toString());
            txtXepLoai.setText(tblXemDiem.getValueAt(r, 5).toString());
        }
    }//GEN-LAST:event_tblXemDiemMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        try {
            String maSV = cboMaSV.getSelectedItem().toString();
            String tenSV = new Controller.controllerSinhVien().TenSinhVienTheoMa(maSV);
            txtTenSinhVien.setText(tenSV);
            String maLopHocPhan = cboMaLopHP.getSelectedItem().toString();
            
            String diemTP = txtDiemTP.getText();
            double diemThanhPhan = Double.parseDouble(diemTP);
            
            String diemCK = txtDiemCK.getText();
            double diemCuoiKy = Double.parseDouble(diemCK);
            
            double diemTongKet = Math.floor(diemThanhPhan * 0.3 + diemCuoiKy * 0.7);
            txtDiemTK.setText(Double.toString(diemTongKet));
            String diemTK = txtDiemTK.getText();
            
            if(diemTongKet >= 8.5 && diemTongKet <= 10) {
                txtXepLoai.setText("A");
            } else if (diemTongKet >= 8.0 && diemTongKet < 8.5) {
                txtXepLoai.setText("B+");
            } else if(diemTongKet >= 7.0 && diemTongKet < 8.0) {
                txtXepLoai.setText("B");
            } else if (diemTongKet >= 6.0 && diemTongKet < 7.0) {
                txtXepLoai.setText("C+");
            } else if (diemTongKet >= 5.5 && diemTongKet < 6.0) {
                txtXepLoai.setText("C");
            } else if(diemTongKet >= 4.5 && diemTongKet < 5.5) {
                txtXepLoai.setText("D+");
            } else if (diemTongKet >= 4.0 && diemTongKet < 4.5) {
                txtXepLoai.setText("D");
            } else {
                txtXepLoai.setText("F");
            }
            String xepLoai = txtXepLoai.getText();
            
            Diem diem = new Diem(maSV, maLopHocPhan, diemThanhPhan, diemCuoiKy, diemTongKet, xepLoai);
            
            boolean check = ctlDiem.updateData(diem);
            if(check) {
                JOptionPane.showMessageDialog(null, "Cập nhật điểm thành công", "Thông báo", 1);
                btnLamMoi.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật điểm thất bại", "Thông báo", 1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:    
        clearDataTable();
        getDataTable(cboMaLopHP.getSelectedItem().toString());
        cboMaSV.setSelectedIndex(0);   
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void cboMaSVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaSVItemStateChanged
        // TODO add your handling code here:
        try {
            String maSV = cboMaSV.getSelectedItem().toString();
            String tenSV = new Controller.controllerSinhVien().TenSinhVienTheoMa(maSV);
            txtTenSinhVien.setText(tenSV);


            Diem diem = ctlDiem.getDiemMonHocbyMaSV(maSV, cboMaLopHP.getSelectedItem().toString());
            double diemTP = diem.getDiemTP();
            double diemCK = diem.getDiemCK();
            double diemTK = diem.getDiemTK();

            txtDiemTP.setText(Double.toString(diemTP));
            txtDiemCK.setText(Double.toString(diemCK));
            txtDiemTK.setText(Double.toString(diemTK));

            txtXepLoai.setText(diem.getXepLoai());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }//GEN-LAST:event_cboMaSVItemStateChanged

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
            java.util.logging.Logger.getLogger(frmNhapDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhapDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhapDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhapDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhapDiemSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cboMaLopHP;
    private javax.swing.JComboBox<String> cboMaSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblXemDiem;
    private javax.swing.JTextField txtDiemCK;
    private javax.swing.JTextField txtDiemTK;
    private javax.swing.JTextField txtDiemTP;
    private javax.swing.JTextField txtTenMH;
    private javax.swing.JTextField txtTenSinhVien;
    private javax.swing.JTextField txtXepLoai;
    // End of variables declaration//GEN-END:variables
}