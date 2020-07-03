
import javax.swing.SpinnerNumberModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * @author andreia
 */
public class Dividir extends javax.swing.JFrame {

    double Couvert = 0;
    double TotalPagar = 0;
    String botaoSim;
    double NmPessoas = 0;

    /**
     * Creates new form Dividir
     */
    public Dividir() {
        SpinnerNumberModel spnn_NmPessoas = new SpinnerNumberModel();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpl_InformacoesConsumo = new javax.swing.JPanel();
        lbl_ConsumoTotal = new javax.swing.JLabel();
        lbl_Couvert = new javax.swing.JLabel();
        ftf_ConsumoTotal = new javax.swing.JFormattedTextField();
        ftf_Couvert = new javax.swing.JFormattedTextField();
        lbl_TaxaServiço = new javax.swing.JLabel();
        rdb_Sim = new javax.swing.JRadioButton();
        rdb_Nao = new javax.swing.JRadioButton();
        lbl_NmPessoas = new javax.swing.JLabel();
        spnn_NmPessoas = new javax.swing.JSpinner();
        jpl_CustoFinal = new javax.swing.JPanel();
        lbl_CustoTotal = new javax.swing.JLabel();
        lbl_ValorPessoa = new javax.swing.JLabel();
        ftf_CustoTotal = new javax.swing.JFormattedTextField();
        ftf_ValorPessoa = new javax.swing.JFormattedTextField();
        btn_Calcular = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dividir Conta");
        setPreferredSize(new java.awt.Dimension(360, 335));

        jpl_InformacoesConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de Consumo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        lbl_ConsumoTotal.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_ConsumoTotal.setText("Consumo Total (R$)");

        lbl_Couvert.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_Couvert.setText("Couvert por Pessoa (R$)");

        ftf_ConsumoTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftf_ConsumoTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ftf_ConsumoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftf_ConsumoTotalActionPerformed(evt);
            }
        });

        ftf_Couvert.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftf_Couvert.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lbl_TaxaServiço.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_TaxaServiço.setText("Possui taxa de serviço (10%)?");

        buttonGroup1.add(rdb_Sim);
        rdb_Sim.setText("Sim");
        rdb_Sim.setActionCommand("btn1");
        rdb_Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_SimActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdb_Nao);
        rdb_Nao.setText("Não");
        rdb_Nao.setActionCommand("btn2");

        lbl_NmPessoas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_NmPessoas.setText("Dividir em quantas pessoas?");

        spnn_NmPessoas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jpl_InformacoesConsumoLayout = new javax.swing.GroupLayout(jpl_InformacoesConsumo);
        jpl_InformacoesConsumo.setLayout(jpl_InformacoesConsumoLayout);
        jpl_InformacoesConsumoLayout.setHorizontalGroup(
            jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_InformacoesConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpl_InformacoesConsumoLayout.createSequentialGroup()
                        .addComponent(lbl_NmPessoas)
                        .addGap(18, 18, 18)
                        .addComponent(spnn_NmPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpl_InformacoesConsumoLayout.createSequentialGroup()
                        .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_ConsumoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(ftf_ConsumoTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Couvert, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpl_InformacoesConsumoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(rdb_Nao))
                            .addComponent(ftf_Couvert, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpl_InformacoesConsumoLayout.createSequentialGroup()
                        .addComponent(lbl_TaxaServiço)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_Sim)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpl_InformacoesConsumoLayout.setVerticalGroup(
            jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_InformacoesConsumoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ConsumoTotal)
                    .addComponent(lbl_Couvert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftf_ConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftf_Couvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TaxaServiço)
                    .addComponent(rdb_Sim)
                    .addComponent(rdb_Nao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpl_InformacoesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnn_NmPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NmPessoas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpl_CustoFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Custo Final", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        lbl_CustoTotal.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_CustoTotal.setText("Custo Total (R$)");

        lbl_ValorPessoa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_ValorPessoa.setText("Valor por Pessoa (R$)");

        ftf_CustoTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftf_CustoTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ftf_CustoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftf_CustoTotalActionPerformed(evt);
            }
        });

        ftf_ValorPessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftf_ValorPessoa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jpl_CustoFinalLayout = new javax.swing.GroupLayout(jpl_CustoFinal);
        jpl_CustoFinal.setLayout(jpl_CustoFinalLayout);
        jpl_CustoFinalLayout.setHorizontalGroup(
            jpl_CustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_CustoFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpl_CustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CustoTotal)
                    .addComponent(ftf_CustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpl_CustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ValorPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ftf_ValorPessoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpl_CustoFinalLayout.setVerticalGroup(
            jpl_CustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_CustoFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpl_CustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CustoTotal)
                    .addComponent(lbl_ValorPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpl_CustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftf_ValorPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftf_CustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Calcular.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        btn_Limpar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Fechar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Fechar.setText("Fechar");
        btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btn_Calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Fechar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpl_InformacoesConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpl_CustoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpl_InformacoesConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpl_CustoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Calcular)
                    .addComponent(btn_Limpar)
                    .addComponent(btn_Fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_SimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_SimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_SimActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        int totalPagar = 0;
        int couvert = 0;
        ftf_ConsumoTotal.setText(" ");
        ftf_CustoTotal.setText(" ");
        ftf_ValorPessoa.setText(" ");
        ftf_Couvert.setText(" ");

    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_FecharActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        switch(buttonGroup1.getSelection().getActionCommand()) {
            case "btn1":
            NmPessoas = Integer.parseInt(spnn_NmPessoas.getValue().toString());
            TotalPagar = Double.parseDouble(ftf_ConsumoTotal.getText());
            Couvert = Double.parseDouble(ftf_Couvert.getText());
            ftf_CustoTotal.setText(String.valueOf(((NmPessoas * Couvert) + TotalPagar * 1.1) ));
            ftf_ValorPessoa.setText(String.valueOf((((NmPessoas * Couvert) + TotalPagar* 1.1)) / NmPessoas));
            
            break;

            case "btn2":
            NmPessoas = Integer.parseInt(spnn_NmPessoas.getValue().toString());
            TotalPagar = Double.parseDouble(ftf_ConsumoTotal.getText());
            Couvert = Double.parseDouble(ftf_Couvert.getText());
            ftf_CustoTotal.setText(String.valueOf((NmPessoas * Couvert) + TotalPagar));
            ftf_ValorPessoa.setText(String.valueOf(((NmPessoas * Couvert) + TotalPagar) / NmPessoas));
            
            break;
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void ftf_ConsumoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftf_ConsumoTotalActionPerformed

    }//GEN-LAST:event_ftf_ConsumoTotalActionPerformed

    private void ftf_CustoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftf_CustoTotalActionPerformed

    }//GEN-LAST:event_ftf_CustoTotalActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dividir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dividir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dividir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dividir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dividir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftf_ConsumoTotal;
    private javax.swing.JFormattedTextField ftf_Couvert;
    private javax.swing.JFormattedTextField ftf_CustoTotal;
    private javax.swing.JFormattedTextField ftf_ValorPessoa;
    private javax.swing.JPanel jpl_CustoFinal;
    private javax.swing.JPanel jpl_InformacoesConsumo;
    private javax.swing.JLabel lbl_ConsumoTotal;
    private javax.swing.JLabel lbl_Couvert;
    private javax.swing.JLabel lbl_CustoTotal;
    private javax.swing.JLabel lbl_NmPessoas;
    private javax.swing.JLabel lbl_TaxaServiço;
    private javax.swing.JLabel lbl_ValorPessoa;
    private javax.swing.JRadioButton rdb_Nao;
    private javax.swing.JRadioButton rdb_Sim;
    private javax.swing.JSpinner spnn_NmPessoas;
    // End of variables declaration//GEN-END:variables
}