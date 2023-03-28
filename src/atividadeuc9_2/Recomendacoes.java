package atividadeuc9_2;

import javax.swing.JOptionPane;

public class Recomendacoes extends javax.swing.JFrame {

    public Recomendacoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbt_calcular_recomendacoes = new javax.swing.JButton();
        jl_caloriasDiarias1 = new javax.swing.JLabel();
        jtf_caloriasDiarias = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jl_gordura = new javax.swing.JLabel();
        jl_carboidratos1 = new javax.swing.JLabel();
        jl_proteina1 = new javax.swing.JLabel();
        jtf_gordura = new javax.swing.JTextField();
        jtf_carboidratos = new javax.swing.JTextField();
        jtf_proteina = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recomendações");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(567, 340));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Recomendações");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbt_calcular_recomendacoes.setBackground(new java.awt.Color(255, 255, 255));
        jbt_calcular_recomendacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbt_calcular_recomendacoes.setForeground(new java.awt.Color(0, 0, 0));
        jbt_calcular_recomendacoes.setText("Calcular");
        jbt_calcular_recomendacoes.setAutoscrolls(true);
        jbt_calcular_recomendacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbt_calcular_recomendacoes.setContentAreaFilled(false);
        jbt_calcular_recomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_calcular_recomendacoesActionPerformed(evt);
            }
        });
        jPanel2.add(jbt_calcular_recomendacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 98, -1));

        jl_caloriasDiarias1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_caloriasDiarias1.setForeground(new java.awt.Color(0, 0, 0));
        jl_caloriasDiarias1.setText("Calorias diárias (Kcal):");
        jPanel2.add(jl_caloriasDiarias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jtf_caloriasDiarias.setBackground(new java.awt.Color(255, 255, 255));
        jtf_caloriasDiarias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtf_caloriasDiarias.setForeground(new java.awt.Color(102, 102, 102));
        jtf_caloriasDiarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_caloriasDiariasActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_caloriasDiarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_gordura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_gordura.setForeground(new java.awt.Color(0, 0, 0));
        jl_gordura.setText("Gordura (25%):");
        jPanel3.add(jl_gordura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jl_carboidratos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_carboidratos1.setForeground(new java.awt.Color(0, 0, 0));
        jl_carboidratos1.setText("Carboidratos (50%):");
        jPanel3.add(jl_carboidratos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jl_proteina1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_proteina1.setForeground(new java.awt.Color(0, 0, 0));
        jl_proteina1.setText("Proteína (25%):");
        jPanel3.add(jl_proteina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jtf_gordura.setBackground(new java.awt.Color(153, 153, 153));
        jtf_gordura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jtf_gordura.setForeground(new java.awt.Color(0, 0, 0));
        jtf_gordura.setBorder(null);
        jtf_gordura.setCaretColor(new java.awt.Color(153, 153, 153));
        jtf_gordura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_gorduraActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_gordura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 104, 170, 20));

        jtf_carboidratos.setBackground(new java.awt.Color(153, 153, 153));
        jtf_carboidratos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jtf_carboidratos.setForeground(new java.awt.Color(0, 0, 0));
        jtf_carboidratos.setBorder(null);
        jtf_carboidratos.setCaretColor(new java.awt.Color(153, 153, 153));
        jtf_carboidratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_carboidratosActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_carboidratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 170, 20));

        jtf_proteina.setBackground(new java.awt.Color(153, 153, 153));
        jtf_proteina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jtf_proteina.setForeground(new java.awt.Color(0, 0, 0));
        jtf_proteina.setBorder(null);
        jtf_proteina.setCaretColor(new java.awt.Color(153, 153, 153));
        jtf_proteina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_proteinaActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_proteina, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 64, 170, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_calcular_recomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_calcular_recomendacoesActionPerformed

        ValidacaoRecomendacao();

    }//GEN-LAST:event_jbt_calcular_recomendacoesActionPerformed

    private void jtf_caloriasDiariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_caloriasDiariasActionPerformed

    }//GEN-LAST:event_jtf_caloriasDiariasActionPerformed

    private void jtf_gorduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_gorduraActionPerformed

    }//GEN-LAST:event_jtf_gorduraActionPerformed

    private void jtf_carboidratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_carboidratosActionPerformed

    }//GEN-LAST:event_jtf_carboidratosActionPerformed

    private void jtf_proteinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_proteinaActionPerformed

    }//GEN-LAST:event_jtf_proteinaActionPerformed
    private void CalculoRecomendacoes() {

        Double caloriasDiarias;

        caloriasDiarias = Double.parseDouble(jtf_caloriasDiarias.getText());

        Double carboidratos = caloriasDiarias * 0.5 / 4;
        Double proteina = caloriasDiarias * 0.25 / 4;
        Double caloria = caloriasDiarias * 0.25 / 9;

        jtf_carboidratos.setText(String.format("%.2fg", carboidratos));
        jtf_proteina.setText(String.format("%.2fg", proteina));
        jtf_gordura.setText(String.format("%.2fg", caloria));

    }

    private void ValidacaoRecomendacao() {

        if (jtf_caloriasDiarias.getText().contains(",")) {

            JOptionPane.showMessageDialog(null, "Digite as Calorias Diárias separado por ponto ex: (1000 mil ou 1500.50)");

        } else if (!jtf_caloriasDiarias.getText().matches("\\d+(\\.\\d+)?")) {

            JOptionPane.showMessageDialog(null, "Este campo é numérico, informe as Calorias com números!");

        } else if (jtf_caloriasDiarias.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Calorias Diarias precisa ser preenchido");

        } else {

            CalculoRecomendacoes();
        }

    }

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
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recomendacoes().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbt_calcular_recomendacoes;
    private javax.swing.JLabel jl_caloriasDiarias1;
    private javax.swing.JLabel jl_carboidratos1;
    private javax.swing.JLabel jl_gordura;
    private javax.swing.JLabel jl_proteina1;
    private javax.swing.JTextField jtf_caloriasDiarias;
    private javax.swing.JTextField jtf_carboidratos;
    private javax.swing.JTextField jtf_gordura;
    private javax.swing.JTextField jtf_proteina;
    // End of variables declaration//GEN-END:variables
}
