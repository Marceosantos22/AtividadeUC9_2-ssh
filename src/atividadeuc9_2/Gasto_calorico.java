
package atividadeuc9_2;

import javax.swing.JOptionPane;


public class Gasto_calorico extends javax.swing.JFrame {

    
    public Gasto_calorico() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupobuttonSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jrb_mulher = new javax.swing.JRadioButton();
        jrb_homem = new javax.swing.JRadioButton();
        jl_peso = new javax.swing.JLabel();
        jl_altura = new javax.swing.JLabel();
        jl_idade = new javax.swing.JLabel();
        jl_nivelDeAtividade = new javax.swing.JLabel();
        jbt_calcular_gastoCalorico = new javax.swing.JButton();
        jcb_nivelDeAtividade = new javax.swing.JComboBox<>();
        jtf_idadeGastoCalorico = new javax.swing.JTextField();
        jtf_pesoGastoCalorico = new javax.swing.JTextField();
        jtf_alturaGastoCalorico = new javax.swing.JTextField();
        jl_altura1 = new javax.swing.JLabel();
        jl_altura2 = new javax.swing.JLabel();
        jl_altura3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jl_gastoBasal = new javax.swing.JLabel();
        jl_gastoTotal = new javax.swing.JLabel();
        jtf_calBasal = new javax.swing.JTextField();
        jtf_calTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gasto Calórico");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrb_mulher.setBackground(new java.awt.Color(153, 153, 153));
        grupobuttonSexo.add(jrb_mulher);
        jrb_mulher.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jrb_mulher.setForeground(new java.awt.Color(0, 0, 0));
        jrb_mulher.setText("Mulher");
        jrb_mulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_mulherActionPerformed(evt);
            }
        });
        jPanel2.add(jrb_mulher, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jrb_homem.setBackground(new java.awt.Color(153, 153, 153));
        grupobuttonSexo.add(jrb_homem);
        jrb_homem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jrb_homem.setForeground(new java.awt.Color(0, 0, 0));
        jrb_homem.setText("Homem");
        jrb_homem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_homemActionPerformed(evt);
            }
        });
        jPanel2.add(jrb_homem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jl_peso.setBackground(new java.awt.Color(153, 153, 153));
        jl_peso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_peso.setForeground(new java.awt.Color(0, 0, 0));
        jl_peso.setText("Peso (kg):");
        jPanel2.add(jl_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jl_altura.setBackground(new java.awt.Color(153, 153, 153));
        jl_altura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_altura.setForeground(new java.awt.Color(0, 0, 0));
        jl_altura.setText("Altura (cm):");
        jPanel2.add(jl_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jl_idade.setBackground(new java.awt.Color(153, 153, 153));
        jl_idade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_idade.setForeground(new java.awt.Color(0, 0, 0));
        jl_idade.setText("Idade:");
        jPanel2.add(jl_idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jl_nivelDeAtividade.setBackground(new java.awt.Color(153, 153, 153));
        jl_nivelDeAtividade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_nivelDeAtividade.setForeground(new java.awt.Color(0, 0, 0));
        jl_nivelDeAtividade.setText("Nivel de Atividade:");
        jPanel2.add(jl_nivelDeAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jbt_calcular_gastoCalorico.setBackground(new java.awt.Color(255, 255, 255));
        jbt_calcular_gastoCalorico.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbt_calcular_gastoCalorico.setForeground(new java.awt.Color(0, 0, 0));
        jbt_calcular_gastoCalorico.setText("Calcular");
        jbt_calcular_gastoCalorico.setAutoscrolls(true);
        jbt_calcular_gastoCalorico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbt_calcular_gastoCalorico.setContentAreaFilled(false);
        jbt_calcular_gastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_calcular_gastoCaloricoActionPerformed(evt);
            }
        });
        jPanel2.add(jbt_calcular_gastoCalorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 98, -1));

        jcb_nivelDeAtividade.setBackground(new java.awt.Color(255, 255, 255));
        jcb_nivelDeAtividade.setForeground(new java.awt.Color(0, 0, 0));
        jcb_nivelDeAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um opção:", "Sedentário", "Leve (exercício leve 1 a 3 dias/semana)", "Moderado (exercício moderado 3 a 5 dias/semana)", "Ativo (exercício pesado 5 a 6 dias/semana)", "Extremamente ativo (exercício pesado diário)" }));
        jcb_nivelDeAtividade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcb_nivelDeAtividade.setFocusTraversalPolicyProvider(true);
        jcb_nivelDeAtividade.setInheritsPopupMenu(true);
        jPanel2.add(jcb_nivelDeAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 310, -1));

        jtf_idadeGastoCalorico.setBackground(new java.awt.Color(255, 255, 255));
        jtf_idadeGastoCalorico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtf_idadeGastoCalorico.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jtf_idadeGastoCalorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, -1));

        jtf_pesoGastoCalorico.setBackground(new java.awt.Color(255, 255, 255));
        jtf_pesoGastoCalorico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtf_pesoGastoCalorico.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jtf_pesoGastoCalorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));

        jtf_alturaGastoCalorico.setBackground(new java.awt.Color(255, 255, 255));
        jtf_alturaGastoCalorico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtf_alturaGastoCalorico.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jtf_alturaGastoCalorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, -1));

        jl_altura1.setBackground(new java.awt.Color(153, 153, 153));
        jl_altura1.setForeground(new java.awt.Color(0, 0, 0));
        jl_altura1.setText("Ex: 65");
        jPanel2.add(jl_altura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        jl_altura2.setBackground(new java.awt.Color(153, 153, 153));
        jl_altura2.setForeground(new java.awt.Color(0, 0, 0));
        jl_altura2.setText("Ex: 20");
        jPanel2.add(jl_altura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 30));

        jl_altura3.setBackground(new java.awt.Color(153, 153, 153));
        jl_altura3.setForeground(new java.awt.Color(0, 0, 0));
        jl_altura3.setText("Ex: 1.75");
        jPanel2.add(jl_altura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 30));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jl_gastoBasal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jl_gastoBasal.setForeground(new java.awt.Color(0, 0, 0));
        jl_gastoBasal.setText("Gasto Basal:");

        jl_gastoTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jl_gastoTotal.setForeground(new java.awt.Color(0, 0, 0));
        jl_gastoTotal.setText("Gasto Total:");

        jtf_calBasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_calBasalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jl_gastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_calTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jl_gastoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_calBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_gastoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_calBasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_gastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_calTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Cálculo de Gastro Calórico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_mulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_mulherActionPerformed
        
    }//GEN-LAST:event_jrb_mulherActionPerformed

    private void jbt_calcular_gastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_calcular_gastoCaloricoActionPerformed

        ValidaInput();        
        
        /*if (ValidaInput()) {
        
        double calBasal = CalculoBasal();
        Double calTotal = CalculoBasalTotal();
        jtf_calBasal.setText(String.format("%.2f", calBasal));
        jtf_calTotal.setText(String.format("%.2f", calTotal));
        
        }*/
        
    }//GEN-LAST:event_jbt_calcular_gastoCaloricoActionPerformed

    private void jrb_homemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_homemActionPerformed

    }//GEN-LAST:event_jrb_homemActionPerformed

    private void jtf_calBasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_calBasalActionPerformed
       
    }//GEN-LAST:event_jtf_calBasalActionPerformed
    private Double CalculoBasal() {

        Double peso;
        Double altura;
        double idade;
        Double calBasal = null;

        peso = Double.parseDouble(jtf_pesoGastoCalorico.getText());
        altura = Double.parseDouble(jtf_alturaGastoCalorico.getText());
        idade = Double.parseDouble(jtf_idadeGastoCalorico.getText());
        
        

        if (jrb_mulher.isSelected()) {

            calBasal = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade);

        } else if (jrb_homem.isSelected()) {

            calBasal = 66 + (13.7 * peso) + (5 * altura) - (6.8 * idade);

        } else {

            JOptionPane.showMessageDialog(null, "Necessário selecionar (Mulher / Homem)!");
               return null;
        }
        return calBasal;
        
    }
    private Double CalculoBasalTotal() {

        Double calTotal = 0.0;
        double calBasal = CalculoBasal();

        int selecao = jcb_nivelDeAtividade.getSelectedIndex();

        if (selecao == 0) {
            JOptionPane.showMessageDialog(null, "Necessário informar o seu nivel de atividade");
        } else {

            switch (selecao) {
                case 1:
                    calTotal = calBasal * 1.2;
                    break;
                case 2:
                    calTotal = calBasal * 1.375;
                    break;
                case 3:
                    calTotal = calBasal * 1.55;
                    break;
                case 4:
                    calTotal = calBasal * 1.725;
                    break;
                default:
                    break;
            }
        }
        return calTotal;

    }

    private boolean ValidaInput() {

        String alturaText = jtf_alturaGastoCalorico.getText();
        if (alturaText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Altura precisa ser preenchido: ");
            return false;
        }
        try {
            double altura = Double.parseDouble(alturaText);
            if (altura <= 0) {
                JOptionPane.showMessageDialog(null, "A altura precisa ser um número positivo: ");
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor da altura deve ser um número válido: ");
            return false;
        }

        String pesoText = jtf_pesoGastoCalorico.getText();
        if (pesoText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Peso precisa ser preenchido: ");
            return false;
        }
        try {
            double peso = Double.parseDouble(pesoText);
            if (peso <= 0) {
                JOptionPane.showMessageDialog(null, "O peso precisa ser um número positivo: ");
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor do peso deve ser um número válido: ");
            return false;
        }

        String idadeText = jtf_idadeGastoCalorico.getText();
        if (idadeText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Idade precisa ser preenchido: ");
            return false;
        }
        try {
            double idade = Double.parseDouble(idadeText);
            if (idade <= 0) {
                JOptionPane.showMessageDialog(null, "A idade precisa ser um número positivo: ");
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O valor da idade deve ser um número válido: ");
            return false;
        }

        if (!jrb_mulher.isSelected() && !jrb_homem.isSelected()) {
            JOptionPane.showMessageDialog(null, "Necessário selecionar (Mulher / Homem)!");
            return false;
        }

        if (CalculoBasal() == null) {
            JOptionPane.showMessageDialog(null, "Necessário selecionar (Mulher / Homem)!");
            return false;
        }

        if (jcb_nivelDeAtividade.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Necessário informar o seu nivel de atividade");
            return false;
        }

        double calBasal = CalculoBasal();
        double calTotal = CalculoBasalTotal();
        jtf_calBasal.setText(String.format("%.2f", calBasal));
        jtf_calTotal.setText(String.format("%.2f", calTotal));

        return true;

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
            java.util.logging.Logger.getLogger(Gasto_calorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gasto_calorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gasto_calorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gasto_calorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gasto_calorico().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupobuttonSexo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbt_calcular_gastoCalorico;
    private javax.swing.JComboBox<String> jcb_nivelDeAtividade;
    private javax.swing.JLabel jl_altura;
    private javax.swing.JLabel jl_altura1;
    private javax.swing.JLabel jl_altura2;
    private javax.swing.JLabel jl_altura3;
    private javax.swing.JLabel jl_gastoBasal;
    private javax.swing.JLabel jl_gastoTotal;
    private javax.swing.JLabel jl_idade;
    private javax.swing.JLabel jl_nivelDeAtividade;
    private javax.swing.JLabel jl_peso;
    private javax.swing.JRadioButton jrb_homem;
    private javax.swing.JRadioButton jrb_mulher;
    private javax.swing.JTextField jtf_alturaGastoCalorico;
    private javax.swing.JTextField jtf_calBasal;
    private javax.swing.JTextField jtf_calTotal;
    private javax.swing.JTextField jtf_idadeGastoCalorico;
    private javax.swing.JTextField jtf_pesoGastoCalorico;
    // End of variables declaration//GEN-END:variables
}
