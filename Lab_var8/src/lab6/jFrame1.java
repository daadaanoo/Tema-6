package lab6;

import javax.swing.ImageIcon;

public class jFrame1 extends javax.swing.JFrame {

    public jFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jFrame4 = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jFrame5 = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jFrame2.setTitle("Юность");
        jFrame2.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame2.setMinimumSize(new java.awt.Dimension(357, 326));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);

        jButton5.setText("Назад");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton5);
        jButton5.setBounds(10, 260, 135, 23);

        jButton6.setText("Вперед");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton6);
        jButton6.setBounds(200, 260, 135, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Тетрис"},
                {"Тамагочи"},
                {"Сега"},
                {"Денди"}
            },
            new String [] {
                "Заголовок 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jFrame2.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 190, 140);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Какие гаджеты вы играли в детстве больще всего?");
        jLabel4.setToolTipText("");
        jFrame2.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 20, 390, 17);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.add(filler3);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Выбрано: Не могу выбрать");
        jToolBar3.add(jLabel8);

        jFrame2.getContentPane().add(jToolBar3);
        jToolBar3.setBounds(0, 230, 400, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6/s1.png")));
        jFrame2.getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 80, 170, 140);

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setTitle("Отрочество");
        jFrame3.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame3.setMinimumSize(new java.awt.Dimension(529, 339));
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton7.setText("Назад");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton7);
        jButton7.setBounds(120, 250, 135, 30);

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Добрый");
        jCheckBox1.setActionCommand("4");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(10, 70, 130, 23);

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("Вспыльчивый");
        jCheckBox2.setActionCommand("5");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(10, 100, 130, 23);

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setText("Целеустремленный");
        jCheckBox3.setActionCommand("6");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(10, 130, 180, 23);

        buttonGroup2.add(jCheckBox4);
        jCheckBox4.setText("Тихоня");
        jCheckBox4.setActionCommand("7");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(10, 160, 190, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Каким вы были подростком ?");
        jFrame3.getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 20, 450, 17);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.add(filler2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Выбрано: Добрый");
        jToolBar2.add(jLabel7);

        jFrame3.getContentPane().add(jToolBar2);
        jToolBar2.setBounds(0, 220, 400, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6/w1.png")));
        jLabel10.setMaximumSize(new java.awt.Dimension(553, 347));
        jLabel10.setMinimumSize(new java.awt.Dimension(553, 347));
        jFrame3.getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 70, 180, 150);

        jButton3.setText("Вперед");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton3);
        jButton3.setBounds(300, 250, 120, 30);

        jFrame3.setLocationRelativeTo(null);

        jFrame4.setMinimumSize(new java.awt.Dimension(512, 386));
        jFrame4.setResizable(false);
        jFrame4.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Любимый предмет в школьной программе?");
        jFrame4.getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 10, 380, 40);

        jLabel9.setText("Выбранно:");
        jFrame4.getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 260, 70, 30);
        jFrame4.getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 260, 130, 30);
        jFrame4.getContentPane().add(jLabel13);
        jLabel13.setBounds(230, 70, 260, 170);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Физика", "Математика", "Физра", "Биология", "Литература" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jFrame4.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 120, 160, 110);

        jButton4.setText("Назад");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton4);
        jButton4.setBounds(120, 290, 110, 30);

        jButton8.setText("Вперед");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton8);
        jButton8.setBounds(290, 290, 100, 30);

        jFrame4.setLocationRelativeTo(null);

        jFrame5.setTitle("Результаты");
        jFrame5.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame5.setMinimumSize(new java.awt.Dimension(832, 399));
        jFrame5.setResizable(false);
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame5WindowClosing(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jButton9.setText("Назад");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton9);
        jButton9.setBounds(200, 290, 135, 23);

        jButton10.setText("ВЫХОД");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton10);
        jButton10.setBounds(530, 290, 135, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<p align=\"center\">\nСпасибо что воспользовались\nнашей системой!\n</p>");
        jLabel5.setToolTipText("");
        jFrame5.getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 10, 250, 70);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jFrame5.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(80, 100, 710, 160);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Приветствие");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("<html> <p align=\"center\">  <h1>Быстрое анкетирование</h1>  <br> <br> <br> <h3><cite><p align=\"center\">Тема - Периоды жизни</cite></h3> </p> ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 310, 190);

        jButton1.setText("Начать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 230, 135, 23);

        jButton2.setText("ВЫХОД");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 230, 135, 23);

        setSize(new java.awt.Dimension(357, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
    }//GEN-LAST:event_formPropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame3.setVisible(false);
        jFrame2.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jFrame5.setVisible(false);
        jFrame4.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame2.setVisible(false);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosing

    private void jFrame5WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame5WindowClosing

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jLabel7.setText("Выбрано: Добрый");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w1.png")));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jLabel7.setText("Выбрано: Вспыльчивый");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w2.png")));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        jLabel7.setText("Выбрано: Целеустремленный");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w3.png")));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        jLabel7.setText("Выбрано: Тихоня");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w4.png")));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
         // Выдача результатов при открытии окна 
        jTextArea1.setText(""); // Очистка компонента
        jTextArea1.append("Вы выбрали:" + "\n");
        jTextArea1.append( "\n");
        jTextArea1.append("Любимый предмет в школьной программе? - " + jList1.getSelectedValue().toString() + "\n");
        jTextArea1.append("Какие гаджеты вы играли в детстве больще всего? -  " + jLabel8.getText().toString() + "\n");
        jTextArea1.append("Каким вы были подростком ? " +jLabel7.getText().toString()  + "\n");
        
    }//GEN-LAST:event_jFrame5WindowActivated

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        switch (jTable1.getSelectedRow()) {
            case 0: {
                jLabel8.setText("Выбрано: Тетрис");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s1.png")));
            }
            break;
            case 1: {
                jLabel8.setText("Выбрано: Тамагочи");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s2.png")));
            }
            break;
            case 2: {
                jLabel8.setText("Выбрано: Сега");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s3.png")));
            }
            break;
            case 3: {
                jLabel8.setText("Выбрано: Денди");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s4.png")));
            }
            break;
            default: {
                jLabel8.setText("Выбрано: Не могу выбрать");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s5.png")));
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        switch (jTable1.getSelectedRow()) {
            case 0: {
                jLabel8.setText("Выбрано: Тетрис");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s1.png")));
            }
            break;
            case 1: {
                jLabel8.setText("Выбрано: Тамагочи");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s2.png")));
            }
            break;
            case 2: {
                jLabel8.setText("Выбрано: Сега");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s3.png")));
            }
            break;
            case 3: {
                jLabel8.setText("Выбрано: Денди");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s4.png")));
            }
            break;
            default: {
                jLabel8.setText("Выбрано: Не могу выбрать");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("s5.png")));
            }
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        switch (jList1.getSelectedIndex()) {

            case 0:
            jLabel12.setText("Физика");
            jLabel13.setIcon(new ImageIcon(getClass().getResource("r1.png")));
            break;
            case 1:
            jLabel12.setText("Математика");
            jLabel13.setIcon(new ImageIcon(getClass().getResource("r2.png")));
            break;
            case 2:
            jLabel12.setText("Физра");
            jLabel13.setIcon(new ImageIcon(getClass().getResource("r3.png")));
            break;
            case 3:
            jLabel12.setText("Биология");
            jLabel13.setIcon(new ImageIcon(getClass().getResource("r4.png")));
            break;
            case 4:
            jLabel12.setText("Литература");
            jLabel13.setIcon(new ImageIcon(getClass().getResource("r5.png")));
            break;

        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jFrame3.setVisible(false);
        jFrame4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jFrame4.setVisible(false);
        jFrame5.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jFrame4.setVisible(false);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables
}
