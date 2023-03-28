package atividadeuc9_2;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Imc extends javax.swing.JFrame {

    public Imc() {
        initComponents();
	
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jl_alturaImc = new javax.swing.JLabel();
                jl_pesoImc = new javax.swing.JLabel();
                jbt_calcular_Imc = new javax.swing.JButton();
                jtf_pesoImc = new javax.swing.JTextField();
                jtf_alturaImc = new javax.swing.JTextField();
                jPanel3 = new javax.swing.JPanel();
                resultado = new javax.swing.JLabel();
                interpretacao = new javax.swing.JLabel();
                jtf_resultado = new javax.swing.JTextField();
                jtf_interpretacao = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Cálculo de IMC");
                setPreferredSize(new java.awt.Dimension(675, 430));
                setResizable(false);
                setSize(new java.awt.Dimension(675, 418));

                jPanel1.setBackground(new java.awt.Color(204, 204, 204));
                jPanel1.setPreferredSize(new java.awt.Dimension(645, 394));

                jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(153, 153, 153));
                jLabel4.setText("Cálculo de IMC");

                jPanel2.setBackground(new java.awt.Color(153, 153, 153));

                jl_alturaImc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jl_alturaImc.setForeground(new java.awt.Color(0, 0, 0));
                jl_alturaImc.setText("Altura (m):");

                jl_pesoImc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jl_pesoImc.setForeground(new java.awt.Color(0, 0, 0));
                jl_pesoImc.setText("Peso (kg):");

                jbt_calcular_Imc.setBackground(new java.awt.Color(255, 255, 255));
                jbt_calcular_Imc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jbt_calcular_Imc.setForeground(new java.awt.Color(0, 0, 0));
                jbt_calcular_Imc.setText("Calcular");
                jbt_calcular_Imc.setAutoscrolls(true);
                jbt_calcular_Imc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jbt_calcular_Imc.setContentAreaFilled(false);
                jbt_calcular_Imc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jbt_calcular_ImcActionPerformed(evt);
                        }
                });

                jtf_pesoImc.setBackground(new java.awt.Color(255, 255, 255));
                jtf_pesoImc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jtf_pesoImc.setForeground(new java.awt.Color(102, 102, 102));
                jtf_pesoImc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtf_pesoImcActionPerformed(evt);
                        }
                });

                jtf_alturaImc.setBackground(new java.awt.Color(255, 255, 255));
                jtf_alturaImc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jtf_alturaImc.setForeground(new java.awt.Color(102, 102, 102));
                jtf_alturaImc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtf_alturaImcActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbt_calcular_Imc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jl_pesoImc)
                                                        .addComponent(jl_alturaImc))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jtf_alturaImc, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                                        .addComponent(jtf_pesoImc))
                                                .addGap(65, 65, 65)))
                                .addContainerGap(137, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jl_alturaImc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_alturaImc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jl_pesoImc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_pesoImc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbt_calcular_Imc)
                                .addContainerGap(12, Short.MAX_VALUE))
                );

                jPanel3.setBackground(new java.awt.Color(153, 153, 153));

                resultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                resultado.setForeground(new java.awt.Color(0, 0, 0));
                resultado.setText("Resultado:");

                interpretacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                interpretacao.setForeground(new java.awt.Color(0, 0, 0));
                interpretacao.setText("Interpretação:");

                jtf_resultado.setBackground(new java.awt.Color(153, 153, 153));
                jtf_resultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jtf_resultado.setForeground(new java.awt.Color(0, 0, 0));
                jtf_resultado.setBorder(null);
                jtf_resultado.setCaretColor(new java.awt.Color(153, 153, 153));
                jtf_resultado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtf_resultadoActionPerformed(evt);
                        }
                });

                jtf_interpretacao.setBackground(new java.awt.Color(153, 153, 153));
                jtf_interpretacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jtf_interpretacao.setForeground(new java.awt.Color(0, 0, 0));
                jtf_interpretacao.setBorder(null);
                jtf_interpretacao.setCaretColor(new java.awt.Color(153, 153, 153));
                jtf_interpretacao.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtf_interpretacaoActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(interpretacao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jtf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 118, Short.MAX_VALUE))
                                        .addComponent(jtf_interpretacao))
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_resultado))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(interpretacao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_interpretacao))
                                .addContainerGap(36, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jbt_calcular_ImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_calcular_ImcActionPerformed

        ValidarDadosImc( );
       
    }//GEN-LAST:event_jbt_calcular_ImcActionPerformed

    private void jtf_pesoImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_pesoImcActionPerformed

    }//GEN-LAST:event_jtf_pesoImcActionPerformed

    private void jtf_alturaImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_alturaImcActionPerformed

    }//GEN-LAST:event_jtf_alturaImcActionPerformed

    private void jtf_interpretacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_interpretacaoActionPerformed

    }//GEN-LAST:event_jtf_interpretacaoActionPerformed

    private void jtf_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_resultadoActionPerformed

    }//GEN-LAST:event_jtf_resultadoActionPerformed
    private void ValidarDadosImc() {

        if (jtf_alturaImc.getText().contains(",")) {

            JOptionPane.showMessageDialog(null, "Digite sua altura separado por ponto ex: (1.75)");

        } else if (jtf_pesoImc.getText().contains(",")) {

            JOptionPane.showMessageDialog(null, "Digite sua Peso separado por ponto ex: (60.1)");

        } else if (!jtf_alturaImc.getText().matches("\\d+(\\.\\d+)?")) {

            JOptionPane.showMessageDialog(null, "Este campo só recebe números, preencha sua Altura com números");

        } else if (!jtf_pesoImc.getText().matches("\\d+(\\.\\d+)?")) {

            JOptionPane.showMessageDialog(null, "Este campo só recebe números, preencha seu Peso com números");

        } else if (jtf_alturaImc.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Altura precisa ser preenchido: ");

        } else if (jtf_pesoImc.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "O campo Peso precisa ser preenchido: ");

        } else {

            CalculoImc();
        }

    }

    private void CalculoImc() {

        Double imc;
        Double peso;
        Double altura;
        Double resultado;
        

        peso = Double.parseDouble(jtf_pesoImc.getText());
        altura = Double.parseDouble(jtf_alturaImc.getText());

        resultado = peso / (altura * altura);

        jtf_resultado.setText(String.format("%.2f", resultado));

        if (resultado < 18.5) {
            jtf_interpretacao.setForeground(Color.BLACK);
            jtf_interpretacao.setText("Magreza");
        } else if (resultado >= 18.5 && resultado <= 24.9) {
            jtf_interpretacao.setForeground(Color.BLACK);
            jtf_interpretacao.setText("Normal");
        } else if (resultado >= 25 && resultado <= 29.9) {
            jtf_interpretacao.setForeground(Color.YELLOW);
            jtf_interpretacao.setText("Sobrepeso");
        } else if (resultado >= 30 && resultado <= 39.9) {
            jtf_interpretacao.setForeground(Color.RED);
            jtf_interpretacao.setText("Obesidade");
        } else if (resultado >= 40) {
            jtf_interpretacao.setForeground(Color.red);
            jtf_interpretacao.setText("Obesidade grave");
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel interpretacao;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JButton jbt_calcular_Imc;
        private javax.swing.JLabel jl_alturaImc;
        private javax.swing.JLabel jl_pesoImc;
        private javax.swing.JTextField jtf_alturaImc;
        private javax.swing.JTextField jtf_interpretacao;
        private javax.swing.JTextField jtf_pesoImc;
        private javax.swing.JTextField jtf_resultado;
        private javax.swing.JLabel resultado;
        // End of variables declaration//GEN-END:variables


}
