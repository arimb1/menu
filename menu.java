/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Komang
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        makanan = new javax.swing.JLabel();
        hargamakanan = new javax.swing.JLabel();
        jumlahmakanan = new javax.swing.JLabel();
        bakso = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jumlahbakso = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        sate = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        batagor = new javax.swing.JCheckBox();
        jumlahsate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jumlahgado = new javax.swing.JTextField();
        mie = new javax.swing.JCheckBox();
        jumlahbatagor = new javax.swing.JTextField();
        gado = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jumlahmie = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jumlahair = new javax.swing.JTextField();
        soda = new javax.swing.JCheckBox();
        jumlahteh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        air = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jus = new javax.swing.JCheckBox();
        jumlahsoda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jumlahjus = new javax.swing.JTextField();
        jeruk = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        teh = new javax.swing.JCheckBox();
        jumlahjeruk = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesanan = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnpesan = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jLabel7.setText("Rp12.000");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        makanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        makanan.setText("Menu Makanan");

        hargamakanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hargamakanan.setText("Harga");

        jumlahmakanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahmakanan.setText("Jumlah");

        bakso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bakso.setText("Bakso");
        bakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baksoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Rp15.000");

        jumlahbakso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahbakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahbaksoActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("MENU");

        sate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sate.setText("Sate Ayam");
        sate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("RP10.000");

        batagor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        batagor.setText("Batagor");
        batagor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batagorActionPerformed(evt);
            }
        });

        jumlahsate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahsate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Rp8.000");

        jumlahgado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahgadoActionPerformed(evt);
            }
        });

        mie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mie.setText("Mie Ayam");
        mie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mieActionPerformed(evt);
            }
        });

        jumlahbatagor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahbatagor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahbatagorActionPerformed(evt);
            }
        });

        gado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gado.setText("Gado-gado");
        gado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Rp12.000");

        jumlahmie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahmie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahmieActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Rp6.000");

        jumlahair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahairActionPerformed(evt);
            }
        });

        soda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soda.setText("Soda");
        soda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodaActionPerformed(evt);
            }
        });

        jumlahteh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahteh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahtehActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Menu Minuman");

        air.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        air.setText("Air Mineral");
        air.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Harga");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Rp4.000");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Jumlah");

        jus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jus.setText("Jus Buah");
        jus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusActionPerformed(evt);
            }
        });

        jumlahsoda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahsoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsodaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Rp10.000");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Rp8.000");

        jumlahjus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahjus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahjusActionPerformed(evt);
            }
        });

        jeruk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jeruk.setText("Jeruk Hangat/Dingin");
        jeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jerukActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Rp5.000");

        teh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teh.setText("Teh Hangat/Dingin");
        teh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tehActionPerformed(evt);
            }
        });

        jumlahjeruk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahjeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahjerukActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Rp4.000");

        pesanan.setColumns(20);
        pesanan.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        pesanan.setRows(5);
        jScrollPane1.setViewportView(pesanan);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Pesanan : ");

        btnpesan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnpesan.setText("Pesan");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(makanan)
                            .addComponent(bakso)
                            .addComponent(sate)
                            .addComponent(batagor)
                            .addComponent(gado)
                            .addComponent(mie))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(hargamakanan)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahmakanan)
                            .addComponent(jumlahbakso, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahsate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahbatagor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahgado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahmie, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jeruk)
                            .addComponent(jLabel5)
                            .addComponent(jus)
                            .addComponent(teh)
                            .addComponent(air)
                            .addComponent(soda))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jumlahjus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahteh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahair, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jumlahsoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(title))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(btnpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(makanan)
                                .addComponent(hargamakanan)
                                .addComponent(jumlahmakanan))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bakso)
                                .addComponent(jLabel4)
                                .addComponent(jumlahbakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jumlahsate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(sate))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jumlahbatagor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(batagor))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jumlahgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(gado)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jumlahmie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(mie))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jus)
                                            .addComponent(jumlahjus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jumlahjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jeruk)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jumlahteh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(teh)
                                            .addComponent(jLabel21))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jumlahair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(air)
                                            .addComponent(jLabel15)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jumlahsoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(soda)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baksoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baksoActionPerformed

    private void jumlahbaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahbaksoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahbaksoActionPerformed

    private void sateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sateActionPerformed

    private void batagorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batagorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batagorActionPerformed

    private void jumlahsateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsateActionPerformed

    private void jumlahgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahgadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahgadoActionPerformed

    private void mieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mieActionPerformed

    private void jumlahbatagorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahbatagorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahbatagorActionPerformed

    private void gadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gadoActionPerformed

    private void jumlahmieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahmieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahmieActionPerformed

    private void jumlahairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahairActionPerformed

    private void sodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sodaActionPerformed

    private void jumlahtehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahtehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahtehActionPerformed

    private void airActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airActionPerformed

    private void jusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusActionPerformed

    private void jumlahsodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsodaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsodaActionPerformed

    private void jumlahjusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahjusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahjusActionPerformed

    private void jerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jerukActionPerformed

    private void tehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tehActionPerformed

    private void jumlahjerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahjerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahjerukActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        // TODO add your handling code here:
        String tampil;
        tampil ="";
        int bayar = 0;
        if(bakso.isSelected()){
            int jumlah=Integer.parseInt(jumlahbakso.getText());
            int total;
            total=jumlah*15000;
            bayar=bayar+total;
            tampil+=bakso.getText()+" Rp15.000"+" x "+jumlah+" = "+total+"\n";
        }if(sate.isSelected()){
            int jumlah=Integer.parseInt(jumlahsate.getText());
            int total;
            total=jumlah*10000;
            bayar=bayar+total;
            tampil +=sate.getText()+" Rp10.000"+" x "+jumlah+" = "+total+"\n";
        }if(batagor.isSelected()){
            int jumlah=Integer.parseInt(jumlahbatagor.getText());
            int total;
            total=jumlah*8000;
            bayar=bayar+total;
            tampil+=batagor.getText()+" Rp8.000"+" x "+jumlah+" = "+total+"\n";
        }if(gado.isSelected()){
            int jumlah=Integer.parseInt(jumlahgado.getText());
            int total;
            total=jumlah*12000;
            bayar=bayar+total;
            tampil+=gado.getText()+" Rp12.000"+" x "+jumlah+" = "+total+"\n";
        }if(mie.isSelected()){
            int jumlah=Integer.parseInt(jumlahmie.getText());
            int total;
            total=jumlah*6000;
            bayar=bayar+total;
            tampil+=mie.getText()+" Rp6.000"+" x "+jumlah+" = "+total+"\n";
        }if(jus.isSelected()){
            int jumlah=Integer.parseInt(jumlahjus.getText());
            int total;
            total=jumlah*10000;
            bayar=bayar+total;
            tampil+=jus.getText()+" Rp10.000"+" x "+jumlah+" = "+total+"\n";
        }if(jeruk.isSelected()){
            int jumlah=Integer.parseInt(jumlahjeruk.getText());
            int total;
            total=jumlah*5000;
            bayar=bayar+total;
            tampil+=jeruk.getText()+" Rp5.000"+" x "+jumlah+" = "+total+"\n";
        }if(teh.isSelected()){
            int jumlah=Integer.parseInt(jumlahteh.getText());
            int total;
            total=jumlah*4000;
            bayar=bayar+total;
            tampil+=teh.getText()+" Rp4.000"+" x "+jumlah+" = "+total+"\n";
        }if(air.isSelected()){
            int jumlah=Integer.parseInt(jumlahair.getText());
            int total;
            total=jumlah*4000;
            bayar=bayar+total;
            tampil+=air.getText()+" Rp4.000"+" x "+jumlah+" = "+total+"\n";
        }if(soda.isSelected()){
            int jumlah=Integer.parseInt(jumlahsoda.getText());
            int total;
            total=jumlah*8000;
            bayar=bayar+total;
            tampil+=soda.getText()+" Rp8.000"+" x "+jumlah+" = "+total+"\n";
        }    
        pesanan.setText(tampil+"========================"+"\n"+"Total Bayar = "+bayar);
    }//GEN-LAST:event_btnpesanActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here
        jumlahbakso.setText("");
        jumlahsate.setText("");
        jumlahbatagor.setText("");
        jumlahgado.setText("");
        jumlahmie.setText("");
        jumlahjus.setText("");
        jumlahjeruk.setText("");
        jumlahteh.setText("");
        jumlahair.setText("");
        jumlahsoda.setText("");
        pesanan.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox air;
    private javax.swing.JCheckBox bakso;
    private javax.swing.JCheckBox batagor;
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBox gado;
    private javax.swing.JLabel hargamakanan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jeruk;
    private javax.swing.JTextField jumlahair;
    private javax.swing.JTextField jumlahbakso;
    private javax.swing.JTextField jumlahbatagor;
    private javax.swing.JTextField jumlahgado;
    private javax.swing.JTextField jumlahjeruk;
    private javax.swing.JTextField jumlahjus;
    private javax.swing.JLabel jumlahmakanan;
    private javax.swing.JTextField jumlahmie;
    private javax.swing.JTextField jumlahsate;
    private javax.swing.JTextField jumlahsoda;
    private javax.swing.JTextField jumlahteh;
    private javax.swing.JCheckBox jus;
    private javax.swing.JLabel makanan;
    private javax.swing.JCheckBox mie;
    private javax.swing.JTextArea pesanan;
    private javax.swing.JCheckBox sate;
    private javax.swing.JCheckBox soda;
    private javax.swing.JCheckBox teh;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}