package ejercicio.pkg02.empresa;
public class Empresa extends javax.swing.JFrame {
    public Empresa() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ruc = new javax.swing.JTextField();
        cant2 = new javax.swing.JTextField();
        Nombre_in = new javax.swing.JTextField();
        Direccion_in = new javax.swing.JTextField();
        cant3 = new javax.swing.JTextField();
        cant4 = new javax.swing.JTextField();
        cant5 = new javax.swing.JTextField();
        cant6 = new javax.swing.JTextField();
        subt = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        cant1 = new javax.swing.JTextField();
        vt1 = new javax.swing.JTextField();
        vt2 = new javax.swing.JTextField();
        vt3 = new javax.swing.JTextField();
        vt4 = new javax.swing.JTextField();
        vt5 = new javax.swing.JTextField();
        vt6 = new javax.swing.JTextField();
        v1 = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        v3 = new javax.swing.JTextField();
        v4 = new javax.swing.JTextField();
        v5 = new javax.swing.JTextField();
        v6 = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        iva = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("EMPRESA S.A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Ruc:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setText("Detalle");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel7.setText("V/Voluntarios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel8.setText("V/Total");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 190, -1));

        ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rucKeyTyped(evt);
            }
        });
        getContentPane().add(ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, -1));

        cant2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant2KeyTyped(evt);
            }
        });
        getContentPane().add(cant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, -1));

        Nombre_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_inKeyTyped(evt);
            }
        });
        getContentPane().add(Nombre_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));
        getContentPane().add(Direccion_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, -1));

        cant3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant3KeyTyped(evt);
            }
        });
        getContentPane().add(cant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 40, -1));

        cant4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant4KeyTyped(evt);
            }
        });
        getContentPane().add(cant4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, -1));

        cant5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant5KeyTyped(evt);
            }
        });
        getContentPane().add(cant5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 40, -1));

        cant6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant6KeyTyped(evt);
            }
        });
        getContentPane().add(cant6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, -1));

        subt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        subt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtActionPerformed(evt);
            }
        });
        getContentPane().add(subt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 60, 30));

        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 60, -1));

        cant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant1KeyTyped(evt);
            }
        });
        getContentPane().add(cant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 40, -1));

        vt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vt1ActionPerformed(evt);
            }
        });
        getContentPane().add(vt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 60, -1));
        getContentPane().add(vt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 60, -1));
        getContentPane().add(vt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 60, -1));
        getContentPane().add(vt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 60, -1));
        getContentPane().add(vt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 60, -1));
        getContentPane().add(vt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 60, -1));

        v1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                v1KeyTyped(evt);
            }
        });
        getContentPane().add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 40, -1));
        getContentPane().add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 40, -1));

        v3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                v3KeyTyped(evt);
            }
        });
        getContentPane().add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, -1));

        v4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                v4KeyTyped(evt);
            }
        });
        getContentPane().add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 40, -1));

        v5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                v5KeyTyped(evt);
            }
        });
        getContentPane().add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 40, -1));

        v6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                v6KeyTyped(evt);
            }
        });
        getContentPane().add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, -1));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 60, -1));

        iva.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivaActionPerformed(evt);
            }
        });
        getContentPane().add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 60, 30));

        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField27KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, -1));

        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField28KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 190, -1));

        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField29KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 190, -1));

        jTextField30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField30KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 190, -1));

        jTextField33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField33KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, -1));

        jButton4.setText("TOTAL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Subtotal:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Iva:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Descuento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador.jpg"))); // NOI18N
        getContentPane().add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void vt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vt1ActionPerformed
           
         
            
    }//GEN-LAST:event_vt1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double cnt1,cnt2,cnt3,cnt4,cnt5,cnt6,vu1,vu2,vu3,vu4,vu5,vu6,vt_1,vt_2,vt_3,vt_4,vt_5,vt_6,
                 sbt,iba,des,ttal;
        try {
         cnt1=Double.parseDouble(cant1.getText());
         cnt2=Double.parseDouble(cant2.getText());
         cnt3=Double.parseDouble(cant3.getText());
         cnt4=Double.parseDouble(cant4.getText());
         cnt5=Double.parseDouble(cant5.getText());
         cnt6=Double.parseDouble(cant6.getText());
         vu1=Double.parseDouble(v1.getText());
         vu2=Double.parseDouble(v2.getText());
         vu3=Double.parseDouble(v3.getText());
         vu4=Double.parseDouble(v4.getText());
         vu5=Double.parseDouble(v5.getText());
         vu6=Double.parseDouble(v6.getText());
         vt_1 = cnt1*vu1;
         vt_2 = cnt2*vu2;
         vt_3 = cnt3*vu3;
         vt_4 = cnt4*vu4;
         vt_5 = cnt5*vu5;
         vt_6 = cnt6*vu6;
         String vtt1 = vt_1+ "";
         String vtt2 = vt_2+ "";
         String vtt3 = vt_3+ "";
         String vtt4 = vt_4+ "";
         String vtt5 = vt_5+ "";
         String vtt6 = vt_6+ "";
         vt1.setText(vtt1);
         vt2.setText(vtt2);
         vt3.setText(vtt3);
         vt4.setText(vtt4);
         vt5.setText(vtt5);
         vt6.setText(vtt6);
         
         sbt=vt_1+vt_2+vt_3+vt_4+vt_5+vt_6;
         
         String sbtt = sbt +"";
         subt.setText(sbtt);
         
         iba=Math.round(sbt*0.12);
         String ibba = iba+"";
         iva.setText(ibba);
         
         des=Double.parseDouble(subt.getText());
         des=sbt-0.10;
         if(sbt>100){
             ttal=Math.round((sbt+iba)-des);
             String dssc=des+"";
             desc.setText(dssc);
             String tttal=ttal+"";
             total.setText(tttal);
             
         }else{       
         ttal= sbt+iba;
         String tttal=ttal+"";
         total.setText(tttal);}
          } catch (Exception e) {
        }
         
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Nombre_inKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_inKeyTyped
        char a = evt.getKeyChar();
           // if(Character.isDigit(a))evt.consume();
            if((a<'a'||a>'z')&&(a<'A'||a>'Z')&&(a!=evt.VK_SPACE))evt.consume();
    }//GEN-LAST:event_Nombre_inKeyTyped

    private void cant1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant1KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_cant1KeyTyped

    private void rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucKeyTyped
        char s = evt.getKeyChar();
        //if(Character.isLetter(s))evt.consume();
        if(s<'0'||s>'9')evt.consume();
        //if(Character.isLetter(s))evt.consume();
       if(ruc.getText().length()>12)evt.consume();
    }//GEN-LAST:event_rucKeyTyped

    private void cant2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant2KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_cant2KeyTyped

    private void cant3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant3KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_cant3KeyTyped

    private void cant4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant4KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_cant4KeyTyped

    private void cant5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant5KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_cant5KeyTyped

    private void cant6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant6KeyTyped
        char d  = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_cant6KeyTyped

    private void v1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v1KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_v1KeyTyped

    private void v3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v3KeyTyped
       char d =evt.getKeyChar();
       if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_v3KeyTyped

    private void v4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v4KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_v4KeyTyped

    private void v5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v5KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_v5KeyTyped

    private void v6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v6KeyTyped
        char d = evt.getKeyChar();
        if(Character.isLetter(d))evt.consume();
    }//GEN-LAST:event_v6KeyTyped

    private void jTextField33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField33KeyTyped
        char l = evt.getKeyChar();
        if(Character.isDigit(l))evt.consume();
        if(Character.isWhitespace(l))evt.consume();
        
    }//GEN-LAST:event_jTextField33KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char l = evt.getKeyChar();
        if(Character.isDigit(l))evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyTyped
        char l = evt.getKeyChar();
        if(Character.isDigit(l))evt.consume();
    }//GEN-LAST:event_jTextField27KeyTyped

    private void jTextField28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyTyped
        char l=evt.getKeyChar();
        if(Character.isDigit(l))evt.consume();
    }//GEN-LAST:event_jTextField28KeyTyped

    private void jTextField29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyTyped
        char l=evt.getKeyChar();
        if(Character.isDigit(l))evt.consume();
    }//GEN-LAST:event_jTextField29KeyTyped

    private void jTextField30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField30KeyTyped
        char l=evt.getKeyChar();
        if(Character.isDigit(l))evt.consume();
    }//GEN-LAST:event_jTextField30KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Nombre_in.setText("");
        Direccion_in.setText("");
        ruc.setText("");
        vt1.setText("");
         vt2.setText("");
         vt3.setText("");
         vt4.setText("");
         vt5.setText("");
         vt6.setText("");
         v1.setText("");
         v2.setText("");
         v3.setText("");
         v4.setText("");
         v4.setText("");
         v5.setText("");
         subt.setText("");
         iva.setText("");
         desc.setText("");
         total.setText("");
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ivaActionPerformed

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
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Direccion_in;
    private javax.swing.JTextField Nombre_in;
    private javax.swing.JTextField cant1;
    private javax.swing.JTextField cant2;
    private javax.swing.JTextField cant3;
    private javax.swing.JTextField cant4;
    private javax.swing.JTextField cant5;
    private javax.swing.JTextField cant6;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JLabel jfondo;
    private javax.swing.JTextField ruc;
    private javax.swing.JTextField subt;
    private javax.swing.JTextField total;
    private javax.swing.JTextField v1;
    private javax.swing.JTextField v2;
    private javax.swing.JTextField v3;
    private javax.swing.JTextField v4;
    private javax.swing.JTextField v5;
    private javax.swing.JTextField v6;
    private javax.swing.JTextField vt1;
    private javax.swing.JTextField vt2;
    private javax.swing.JTextField vt3;
    private javax.swing.JTextField vt4;
    private javax.swing.JTextField vt5;
    private javax.swing.JTextField vt6;
    // End of variables declaration//GEN-END:variables
}
