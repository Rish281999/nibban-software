/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nibbannews;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TdsMaster extends javax.swing.JFrame {

    /**
     * Creates new form TdsMaster
     */
    public TdsMaster() {
        initComponents();
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
        lbl_tdsCode = new javax.swing.JLabel();
        txt_TDSCode = new javax.swing.JTextField();
        lbl_tdsName = new javax.swing.JLabel();
        lbl_tdsSection = new javax.swing.JLabel();
        lbl_tdsRate = new javax.swing.JLabel();
        txt_TDSRate = new javax.swing.JTextField();
        lbl_isTDSDeducted = new javax.swing.JLabel();
        cb_isTDSDeducted = new javax.swing.JComboBox<>();
        lbl_basicExemptionLimit = new javax.swing.JLabel();
        txt_basicExemption = new javax.swing.JTextField();
        btn_createTDS = new javax.swing.JButton();
        btn_findTDS = new javax.swing.JButton();
        btn_updateTDS = new javax.swing.JButton();
        btn_deleteTDS = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        cb_TDSName = new javax.swing.JComboBox<>();
        cb_TDSSection = new javax.swing.JComboBox<>();
        checkBox_panHolder = new javax.swing.JCheckBox();
        checkBox_nonPanHolder = new javax.swing.JCheckBox();
        lbl_applicableForPersonCategory = new javax.swing.JLabel();
        checkBox_indivisual = new javax.swing.JCheckBox();
        checkBox_huf = new javax.swing.JCheckBox();
        checkBox_partnershipFirm = new javax.swing.JCheckBox();
        checkBox_companyPvtLtd = new javax.swing.JCheckBox();
        checkBox_boi = new javax.swing.JCheckBox();
        checkBox_trust = new javax.swing.JCheckBox();
        checkBox__localAuthority = new javax.swing.JCheckBox();
        checkBox_artificialJudicialBody = new javax.swing.JCheckBox();
        checkBox_aop = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TDS Master");

        jPanel1.setBackground(new java.awt.Color(52, 51, 52));

        lbl_tdsCode.setBackground(new java.awt.Color(255, 255, 255));
        lbl_tdsCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_tdsCode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tdsCode.setText("TDS Code");

        txt_TDSCode.setBackground(new java.awt.Color(52, 51, 52));
        txt_TDSCode.setForeground(new java.awt.Color(255, 255, 255));
        txt_TDSCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_TDSCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TDSCodeActionPerformed(evt);
            }
        });

        lbl_tdsName.setBackground(new java.awt.Color(255, 255, 255));
        lbl_tdsName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_tdsName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tdsName.setText("TDS Name");

        lbl_tdsSection.setBackground(new java.awt.Color(255, 255, 255));
        lbl_tdsSection.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_tdsSection.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tdsSection.setText("TDS section");

        lbl_tdsRate.setBackground(new java.awt.Color(255, 255, 255));
        lbl_tdsRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_tdsRate.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tdsRate.setText("TDS rate");

        txt_TDSRate.setBackground(new java.awt.Color(52, 51, 52));
        txt_TDSRate.setForeground(new java.awt.Color(255, 255, 255));
        txt_TDSRate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_TDSRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TDSRateActionPerformed(evt);
            }
        });

        lbl_isTDSDeducted.setBackground(new java.awt.Color(255, 255, 255));
        lbl_isTDSDeducted.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_isTDSDeducted.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isTDSDeducted.setText("Is TDS deducted");

        cb_isTDSDeducted.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Yes", "No" }));

        lbl_basicExemptionLimit.setBackground(new java.awt.Color(255, 255, 255));
        lbl_basicExemptionLimit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_basicExemptionLimit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_basicExemptionLimit.setText("Basic exemption limit, if any for TDS");

        txt_basicExemption.setBackground(new java.awt.Color(52, 51, 52));
        txt_basicExemption.setForeground(new java.awt.Color(255, 255, 255));
        txt_basicExemption.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_basicExemption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_basicExemptionActionPerformed(evt);
            }
        });

        btn_createTDS.setBackground(new java.awt.Color(52, 51, 52));
        btn_createTDS.setForeground(new java.awt.Color(255, 255, 255));
        btn_createTDS.setText("Create TDS");
        btn_createTDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_createTDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createTDSActionPerformed(evt);
            }
        });

        btn_findTDS.setBackground(new java.awt.Color(52, 51, 52));
        btn_findTDS.setForeground(new java.awt.Color(255, 255, 255));
        btn_findTDS.setText("Find TDS");
        btn_findTDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_findTDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findTDSActionPerformed(evt);
            }
        });

        btn_updateTDS.setBackground(new java.awt.Color(52, 51, 52));
        btn_updateTDS.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateTDS.setText("Update TDS");
        btn_updateTDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateTDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateTDSActionPerformed(evt);
            }
        });

        btn_deleteTDS.setBackground(new java.awt.Color(52, 51, 52));
        btn_deleteTDS.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteTDS.setText("Delete TDS");
        btn_deleteTDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteTDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteTDSActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(52, 51, 52));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        cb_TDSName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Yes", "No" }));

        cb_TDSSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Yes", "No" }));

        checkBox_panHolder.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_panHolder.setText("For PAN Holder");
        checkBox_panHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_panHolderActionPerformed(evt);
            }
        });

        checkBox_nonPanHolder.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_nonPanHolder.setText("For non PAN Holder");

        lbl_applicableForPersonCategory.setBackground(new java.awt.Color(255, 255, 255));
        lbl_applicableForPersonCategory.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_applicableForPersonCategory.setForeground(new java.awt.Color(255, 255, 255));
        lbl_applicableForPersonCategory.setText("Applicable for person category as per Income Tax");

        checkBox_indivisual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_indivisual.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_indivisual.setText("lndivisual/proprietorship");

        checkBox_huf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_huf.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_huf.setText("HUF");

        checkBox_partnershipFirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_partnershipFirm.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_partnershipFirm.setText("Partnership firm");

        checkBox_companyPvtLtd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_companyPvtLtd.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_companyPvtLtd.setText("Company Pvt Ltd");

        checkBox_boi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_boi.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_boi.setText("BOI");

        checkBox_trust.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_trust.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_trust.setText("Trust");

        checkBox__localAuthority.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox__localAuthority.setForeground(new java.awt.Color(255, 255, 255));
        checkBox__localAuthority.setText("Local Authority");

        checkBox_artificialJudicialBody.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_artificialJudicialBody.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_artificialJudicialBody.setText("Artificial Judicial Body");

        checkBox_aop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox_aop.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_aop.setText("AOP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_tdsName)
                                    .addComponent(lbl_tdsCode)
                                    .addComponent(lbl_isTDSDeducted)
                                    .addComponent(lbl_basicExemptionLimit)
                                    .addComponent(lbl_tdsSection)
                                    .addComponent(lbl_tdsRate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_basicExemption, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_isTDSDeducted, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_TDSCode, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_TDSName, javax.swing.GroupLayout.Alignment.LEADING, 0, 111, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_TDSRate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_TDSSection, javax.swing.GroupLayout.Alignment.LEADING, 0, 111, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkBox_panHolder)
                                .addGap(39, 39, 39)
                                .addComponent(checkBox_nonPanHolder))
                            .addComponent(lbl_applicableForPersonCategory)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkBox_indivisual)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox_huf)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox_partnershipFirm)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox_companyPvtLtd))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkBox_aop)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox_boi)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox_trust)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox__localAuthority)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox_artificialJudicialBody))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_createTDS)
                        .addGap(18, 18, 18)
                        .addComponent(btn_findTDS)
                        .addGap(18, 18, 18)
                        .addComponent(btn_updateTDS)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteTDS)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tdsCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TDSCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tdsName)
                    .addComponent(cb_TDSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tdsSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_TDSSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tdsRate)
                    .addComponent(txt_TDSRate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_isTDSDeducted)
                    .addComponent(cb_isTDSDeducted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_basicExemptionLimit)
                    .addComponent(txt_basicExemption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox_panHolder)
                    .addComponent(checkBox_nonPanHolder))
                .addGap(24, 24, 24)
                .addComponent(lbl_applicableForPersonCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox_indivisual)
                    .addComponent(checkBox_huf)
                    .addComponent(checkBox_partnershipFirm)
                    .addComponent(checkBox_companyPvtLtd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox_boi)
                    .addComponent(checkBox_trust)
                    .addComponent(checkBox__localAuthority)
                    .addComponent(checkBox_artificialJudicialBody)
                    .addComponent(checkBox_aop))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_updateTDS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_findTDS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteTDS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createTDS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TDSCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TDSCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TDSCodeActionPerformed

    private void txt_TDSRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TDSRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TDSRateActionPerformed

    private void txt_basicExemptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_basicExemptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_basicExemptionActionPerformed

    private void btn_createTDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createTDSActionPerformed
        // TODO add your handling code here:
        String TDSCode = txt_TDSCode.getText();
        String TDSName = cb_TDSName.getSelectedItem().toString();
        String TDSSection = cb_TDSSection.getSelectedItem().toString();
        String TDSRate = txt_TDSRate.getText();
        String isTDSDeducted = cb_isTDSDeducted.getSelectedItem().toString();
        String BasicExemtionLimit = txt_basicExemption.getText();
        String PANHolder = "";
        String applicableForPersonCategory = "";
        
        if (checkBox_panHolder.isSelected()) {
            PANHolder = "forPANHolder";
        }else if(checkBox_nonPanHolder.isSelected()){
            PANHolder = "forNonPANHolder";
        }
        
        if(checkBox_indivisual.isSelected()){
            applicableForPersonCategory = "indivisual";
        }else if(checkBox_huf.isSelected()){
            applicableForPersonCategory = "huf";
        }else if(checkBox_partnershipFirm.isSelected()){
            applicableForPersonCategory = "partnershipFirm";
        }else if(checkBox_companyPvtLtd.isSelected()){
            applicableForPersonCategory = "companyPvtLtd";
        }else if(checkBox_aop.isSelected()){
            applicableForPersonCategory = "aop";
        }else if(checkBox_boi.isSelected()){
            applicableForPersonCategory = "boi";
        }else if(checkBox_trust.isSelected()){
            applicableForPersonCategory = "trust";
        }else if(checkBox__localAuthority.isSelected()){
            applicableForPersonCategory = "localAuthority";
        }else if(checkBox_artificialJudicialBody.isSelected()){
            applicableForPersonCategory = "artificialJudicialBody";
        }
        
        if(TDSCode.equals("") || TDSName.equals("select") || TDSSection.equals("select") || TDSRate.equals("") || isTDSDeducted.equals("Select") || BasicExemtionLimit.equals("") || PANHolder.equals("") || applicableForPersonCategory.equals("")){
            JOptionPane.showMessageDialog(rootPane, "All feilds are required");
        }
        else{
            try {
                DBConnection dbc = new DBConnection();
                Connection con = dbc.dbconnect();
                String queryCheck = "select * from tds_master where tdsCode=?";
                PreparedStatement stmt = con.prepareStatement(queryCheck);
                stmt.setString(1, txt_TDSCode.getText());
                final ResultSet rs = stmt.executeQuery();
                // if this ID already exists, we quit
                if(rs.next()) {
                    con.close();
                    JOptionPane.showMessageDialog(this, "TDS Code already exit");
                    return;
                }else{
                String str = "insert into tds_master values(?,?,?,?,?,?,?,?)";
                stmt = con.prepareStatement(str);
                stmt.setString(1, txt_TDSCode.getText());
                String TDSName_value = cb_TDSName.getSelectedItem().toString();
                stmt.setString(2, TDSName_value);
                String TDSSection_value = cb_TDSSection.getSelectedItem().toString();
                stmt.setString(3, TDSSection_value);
                stmt.setString(4, txt_TDSRate.getText());
                String isTDSDeducted_value = cb_isTDSDeducted.getSelectedItem().toString();
                stmt.setString(5, isTDSDeducted_value);
                stmt.setString(6, txt_basicExemption.getText());
                stmt.setString(7, PANHolder);
                stmt.setString(8, applicableForPersonCategory);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "TDS record created Successfully");
                }
//                txt_empid.setText("");
//    //            txt_username.setText("");
//                txt_fullname.setText("");
//                cb_userRoll.setSelectedIndex(0);
//                txt_age.setText("");
//                cb_gender.setSelectedIndex(0);
//                txt_email.setText("");
//                txt_phone.setText("");
//                txt_password.setText("");
                } 
                catch (SQLException ex) {
                    Logger.getLogger(TdsMaster.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_createTDSActionPerformed

    private void btn_findTDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findTDSActionPerformed
        // TODO add your handling code here:
        String TDSCode = txt_TDSCode.getText();
        if(TDSCode.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Enter TDS code to search");
        }
        else{
        try {
            DBConnection dbc = new DBConnection();
            Connection con = dbc.dbconnect();
            String str = "select * from tds_master where tdsCode=?";
            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setString(1, txt_TDSCode.getText());
            ResultSet rs =  stmt.executeQuery();
            if(rs.next()){
                String TDSName_value = rs.getString("tdsName");
                cb_TDSName.addItem(TDSName_value);
                String TDSSection_value = rs.getString("tdsSection");
                cb_TDSSection.addItem(TDSSection_value);
                txt_TDSRate.setText(rs.getString("tdsRate"));
                String isTDSDeducted_value = rs.getString("isTdsDeducted");
                cb_isTDSDeducted.addItem(isTDSDeducted_value);
                txt_basicExemption.setText(rs.getString("basicExemtionLimit"));
//                String PANHolder = checkBox_panHolder.isSelected();
//                    if(PANHolder ){
//                       checkBox_panHolder.setSelected(false);
//                    } else {
//                       checkBox_panHolder.setSelected(true);
//                    }
//                isSelected = checkBox_indivisual.isSelected();
//                    if(isSelected ){
//                       checkBox_indivisual.setSelected(false);
//                    } else {
//                       checkBox_indivisual.setSelected(true);
//                    }
            }
            else{
                JOptionPane.showMessageDialog(this, "NO Data found!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TdsMaster.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btn_findTDSActionPerformed

    private void btn_updateTDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateTDSActionPerformed
        // TODO add your handling code here:
        String TDSCode = txt_TDSCode.getText();
        String TDSName = cb_TDSName.getSelectedItem().toString();
        String TDSSection = cb_TDSSection.getSelectedItem().toString();
        String TDSRate = txt_TDSRate.getText();
        String isTDSDeducted = cb_isTDSDeducted.getSelectedItem().toString();
        String BasicExemtionLimit = txt_basicExemption.getText();
        String PANHolder = "";
        String applicableForPersonCategory = "";
        
        if (checkBox_panHolder.isSelected()) {
            PANHolder = "forPANHolder";
        }else if(checkBox_nonPanHolder.isSelected()){
            PANHolder = "forNonPANHolder";
        }
        
        if(checkBox_indivisual.isSelected()){
            applicableForPersonCategory = "indivisual";
        }else if(checkBox_huf.isSelected()){
            applicableForPersonCategory = "huf";
        }else if(checkBox_partnershipFirm.isSelected()){
            applicableForPersonCategory = "partnershipFirm";
        }else if(checkBox_companyPvtLtd.isSelected()){
            applicableForPersonCategory = "companyPvtLtd";
        }else if(checkBox_aop.isSelected()){
            applicableForPersonCategory = "aop";
        }else if(checkBox_boi.isSelected()){
            applicableForPersonCategory = "boi";
        }else if(checkBox_trust.isSelected()){
            applicableForPersonCategory = "trust";
        }else if(checkBox__localAuthority.isSelected()){
            applicableForPersonCategory = "localAuthority";
        }else if(checkBox_artificialJudicialBody.isSelected()){
            applicableForPersonCategory = "artificialJudicialBody";
        }
        
        if(TDSCode.equals("") || TDSName.equals("select") || TDSSection.equals("select") || TDSRate.equals("") || isTDSDeducted.equals("Select") || BasicExemtionLimit.equals("") || PANHolder.equals("") || applicableForPersonCategory.equals("")){
            JOptionPane.showMessageDialog(rootPane, "All feilds are required");
        }
        else{
            try {
                DBConnection dbc = new DBConnection();
                Connection con = dbc.dbconnect();
                String str = "Update tds_master set tdsName='"+cb_TDSName.getSelectedItem()+"',"
                        + "tdsSection='"+cb_TDSSection.getSelectedItem()+"',"
                        + "tdsRate='"+txt_TDSRate.getText()+"',"
                        + "isTdsDeducted='"+cb_isTDSDeducted.getSelectedItem()+"',"
                        + "basicExemtionLimit='"+txt_basicExemption.getText()+"'where tdsCode='"+txt_TDSCode.getText()+"'";
                PreparedStatement stmt = con.prepareStatement(str);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "TDS record updated successfully");
                txt_TDSCode.setText("");
                cb_TDSName.setSelectedIndex(0);
                cb_TDSSection.setSelectedIndex(0);
                txt_TDSRate.setText("");
                cb_isTDSDeducted.setSelectedIndex(0);
                txt_basicExemption.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(TdsMaster.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btn_updateTDSActionPerformed

    private void btn_deleteTDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteTDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteTDSActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        //        new AccountMaster().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void checkBox_panHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_panHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBox_panHolderActionPerformed

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
            java.util.logging.Logger.getLogger(TdsMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TdsMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TdsMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TdsMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TdsMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_createTDS;
    private javax.swing.JButton btn_deleteTDS;
    private javax.swing.JButton btn_findTDS;
    private javax.swing.JButton btn_updateTDS;
    private javax.swing.JComboBox<String> cb_TDSName;
    private javax.swing.JComboBox<String> cb_TDSSection;
    private javax.swing.JComboBox<String> cb_isTDSDeducted;
    private javax.swing.JCheckBox checkBox__localAuthority;
    private javax.swing.JCheckBox checkBox_aop;
    private javax.swing.JCheckBox checkBox_artificialJudicialBody;
    private javax.swing.JCheckBox checkBox_boi;
    private javax.swing.JCheckBox checkBox_companyPvtLtd;
    private javax.swing.JCheckBox checkBox_huf;
    private javax.swing.JCheckBox checkBox_indivisual;
    private javax.swing.JCheckBox checkBox_nonPanHolder;
    private javax.swing.JCheckBox checkBox_panHolder;
    private javax.swing.JCheckBox checkBox_partnershipFirm;
    private javax.swing.JCheckBox checkBox_trust;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_applicableForPersonCategory;
    private javax.swing.JLabel lbl_basicExemptionLimit;
    private javax.swing.JLabel lbl_isTDSDeducted;
    private javax.swing.JLabel lbl_tdsCode;
    private javax.swing.JLabel lbl_tdsName;
    private javax.swing.JLabel lbl_tdsRate;
    private javax.swing.JLabel lbl_tdsSection;
    private javax.swing.JTextField txt_TDSCode;
    private javax.swing.JTextField txt_TDSRate;
    private javax.swing.JTextField txt_basicExemption;
    // End of variables declaration//GEN-END:variables
}
