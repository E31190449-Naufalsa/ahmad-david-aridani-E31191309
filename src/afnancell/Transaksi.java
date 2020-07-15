/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afnancell;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Trans
     */
    Connection con;
    Statement stat;
    ResultSet rs;
    Object row = new Object[5];
    PreparedStatement pst;

    public Transaksi() {
        initComponents();
        renderTable();
        comboBox();
        generateID();
        txtBayar.setText("0");
        txtTotal.setText("0");
        txtKembali.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisBayar = new javax.swing.ButtonGroup();
        memDis = new javax.swing.ButtonGroup();
        tablePop = new javax.swing.JPopupMenu();
        hapus = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jOperator = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtHarga = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        hapus.setText("hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        tablePop.add(hapus);

        edit.setText("edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        tablePop.add(edit);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI TRANSAKSI PULSA AFNAN CELL");
        setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FORM TRANSAKSI PULSA");

        txtIdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTransaksiActionPerformed(evt);
            }
        });
        txtIdTransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdTransaksiKeyTyped(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID TRANSAKSI", "OPERATOR", "JUMLAH", "HARGA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        table.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tableCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table);

        jOperator.setBackground(new java.awt.Color(102, 255, 102));
        jOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPERATOR" }));
        jOperator.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jOperatorItemStateChanged(evt);
            }
        });
        jOperator.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jOperatorFocusGained(evt);
            }
        });
        jOperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOperatorMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jOperatorMouseReleased(evt);
            }
        });
        jOperator.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jOperatorComponentShown(evt);
            }
        });
        jOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOperatorActionPerformed(evt);
            }
        });
        jOperator.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jOperatorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jOperatorKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 5, 3));

        btnSave.setBackground(new java.awt.Color(204, 0, 204));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Tambah.png"))); // NOI18N
        btnSave.setText("Tambah");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);

        btnSimpan.setBackground(new java.awt.Color(255, 0, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Simpan.png"))); // NOI18N
        btnSimpan.setText("Ubah");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimpan);

        btnHapus.setBackground(new java.awt.Color(204, 0, 204));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Hapus2.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnHapus);

        btnExit.setBackground(new java.awt.Color(204, 0, 204));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Keluar2.png"))); // NOI18N
        btnExit.setText("Keluar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit);

        txtHarga.setText(" ");
        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });

        jLabel6.setText("Jumlah");

        jLabel5.setText("Harga");

        jLabel3.setText("Operator");

        jLabel2.setText("Kode transaksi");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel7.setText("Total");

        jLabel9.setText("Bayar");

        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBayarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBayarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBayarKeyTyped(evt);
            }
        });

        txtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembaliActionPerformed(evt);
            }
        });

        jLabel10.setText("Kembali");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69)
                                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10))
                            .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox() {
        String sql = "select menu from tb_menu";
        try {
            DB DB = new DB();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                String kode = rs.getString(1);
                jOperator.addItem(kode);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void renderTable() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID TRANSAKSI");
        tabel.addColumn("ID MENU");
        tabel.addColumn("JUMLAH");
        tabel.addColumn("HARGA");
        try {
            DB DB = new DB();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            rs = stat.executeQuery("Select * from tb_penjualan");
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                });
                table.setModel(tabel);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    
    private void selectData(){
        int baris = table.getSelectedRow();
        txtIdTransaksi.setText(table.getValueAt(baris, 0).toString());
        jOperator.setSelectedItem(table.getValueAt(baris, 1).toString());
        txtJumlah.setText(table.getValueAt(baris, 2).toString());
        txtHarga.setText(table.getValueAt(baris, 3).toString());
        int valTotal = Integer.parseInt(txtJumlah.getText()) * Integer.parseInt(txtHarga.getText());
        txtTotal.setText(String.valueOf(valTotal));
    }
    
    private void setTotalHarga(){
        try {
            int total = Integer.parseInt(txtJumlah.getText()) * Integer.parseInt(txtHarga.getText());
            txtTotal.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            jLabel6.setForeground(Color.BLACK);
        }
    }
    
    private void setHarga(){
        String provider = jOperator.getSelectedItem().toString();
        try {
            DB DB = new DB();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            rs = stat.executeQuery(String.format("Select harga from tb_menu where menu = '%s'", provider));
            while (rs.next()){
                txtHarga.setText(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void showInvalidNumberErrorMsg() {
        JOptionPane.showMessageDialog(this, "Masukkan hanya angka. Coba lagi.", "Error", 0);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            DB DB = new DB();
            DB.config();
            con = DB.con;
            String DetailBarang = String.format("Insert into tb_penjualan values ('%s', '%s', %s, %s)",
                    txtIdTransaksi.getText(), jOperator.getSelectedItem().toString(), txtJumlah.getText(), txtHarga.getText());
            pst = con.prepareStatement(DetailBarang);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data transaksi berhasil disimpan", "Success", JOptionPane.INFORMATION_MESSAGE);
            hapusAll();
            renderTable();
            generateID();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTransaksiActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        selectData();
    }//GEN-LAST:event_tableMouseReleased

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        int selectRow = table.getSelectedRow();
        model.removeRow(selectRow);
        setTotal();
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        
    }//GEN-LAST:event_editActionPerformed

    private void hapusAll() {
        txtIdTransaksi.setText("");
        jOperator.setSelectedIndex(0);
        txtHarga.setText("");
        txtJumlah.setText("");
        jenisBayar.clearSelection();
    }
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            DB DB = new DB();
            DB.config();
            con = DB.con;
            String DetailBarang = String.format("delete from tb_penjualan where id_transaksi = '%s'",
                    txtIdTransaksi.getText());
            pst = con.prepareStatement(DetailBarang);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data transaksi berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
            hapusAll();
            renderTable();
            generateID();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtIdTransaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdTransaksiKeyTyped
        // only number

    }//GEN-LAST:event_txtIdTransaksiKeyTyped

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        // only number

    }//GEN-LAST:event_txtHargaKeyTyped

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // only number

    }//GEN-LAST:event_txtJumlahKeyTyped

    private void jOperatorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jOperatorKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jOperatorKeyPressed
    private void clear() {
        txtIdTransaksi.setText("");
    }
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            DB DB = new DB();
            DB.config();
            con = DB.con;
            String DetailBarang = String.format("update tb_penjualan set id_menu = '%s', jumlah = %s, harga = %s where id_transaksi = '%s'",
                    jOperator.getSelectedItem().toString(), txtJumlah.getText(), txtHarga.getText(), txtIdTransaksi.getText());
            pst = con.prepareStatement(DetailBarang);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data transaksi berhasil diedit", "Success", JOptionPane.INFORMATION_MESSAGE);
            hapusAll();
            renderTable();
            generateID();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jOperatorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jOperatorKeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jOperatorKeyReleased

    private void jOperatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOperatorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jOperatorMouseClicked

    private void txtBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBayarKeyPressed

    private void txtBayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBayarKeyTyped

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliActionPerformed

    private void jOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOperatorActionPerformed
        // TODO add your handling code here:
        setHarga();
        setTotalHarga();
    }//GEN-LAST:event_jOperatorActionPerformed

    private void jOperatorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOperatorMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jOperatorMouseReleased

    private void jOperatorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jOperatorFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jOperatorFocusGained

    private void jOperatorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jOperatorItemStateChanged
        // TODO add your handling code here:
        


    }//GEN-LAST:event_jOperatorItemStateChanged

    private void jOperatorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jOperatorComponentShown
        // TODO add your handling code here:
//        selectOperator();
    }//GEN-LAST:event_jOperatorComponentShown

    private void tableCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tableCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCaretPositionChanged

    private void txtJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyReleased
        // TODO add your handling code here:
        setTotalHarga();
    }//GEN-LAST:event_txtJumlahKeyReleased

    private void txtBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyReleased
        // TODO add your handling code here:
        try {
            int kembali = Integer.parseInt(txtBayar.getText()) - Integer.parseInt(txtTotal.getText());
            txtKembali.setText(String.valueOf(kembali));
        } catch (NumberFormatException e) {
            jLabel6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtBayarKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JMenuItem edit;
    private javax.swing.JMenuItem hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jOperator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.ButtonGroup jenisBayar;
    private javax.swing.ButtonGroup memDis;
    private javax.swing.JTable table;
    private javax.swing.JPopupMenu tablePop;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    int i;

    private void generateID() {
        try {
            String sql = "Select * FROM tb_penjualan ORDER BY id_transaksi DESC LIMIT 1";
            rs = stat.executeQuery(sql);
            rs.next();
            String kode = rs.getString("id_transaksi");
            String subKode = kode.substring(3, 5);
            i = Integer.parseInt(subKode);
            i++;
            int no = i;
            String tambahan = "000";
            String Id = Integer.toString(no);
            int length = tambahan.length() - Id.length();
            String SubString = tambahan.substring(0, length);
            txtIdTransaksi.setText("TR" + SubString + Id);
        } catch (Exception e) {
            System.err.println(e);
            i++;
            int no;
            no = i;
            String id = Integer.toString(no);
            txtIdTransaksi.setText(id);
        }
    }

    private void setTotal() {
        int total = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            int Amount = Integer.parseInt(table.getValueAt(i, 4) + "");
            total = Amount + total;
        }
        txtTotal.setText(Integer.toString(total));
    }
}
