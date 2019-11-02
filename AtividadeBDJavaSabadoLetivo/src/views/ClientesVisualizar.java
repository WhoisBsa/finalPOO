
package views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sql.DBconn;

public class ClientesVisualizar extends javax.swing.JFrame {
    protected int id;
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String sql = "select * from cliente";
        
    

    public ClientesVisualizar() {
        initComponents();
        conexao = DBconn.conectar();
        
        
        try {
            pst = conexao.prepareStatement(sql);
            
            rs = pst.executeQuery();
            rs.next();
            
            id = Integer.parseInt(rs.getString("id"));
            nome = rs.getString("nome");
            idade = Integer.parseInt(rs.getString("idade"));
            cpf = rs.getString("cpf");
            endereco = rs.getString("endereco");
            telefone = rs.getString("telefone");
            
//            System.out.println(id);
            
            lblId.setText(String.valueOf(id));
            lblNome.setText(nome);
            lblIdade.setText(String.valueOf(idade));
            lblCPF.setText(cpf);
            lblEndereco.setText(endereco);
            lblTelefone.setText(telefone);

        } 
        catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
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
        lblId = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        lblId.setText("jLabel7");

        lblIdade.setText("jLabel7");

        lblNome.setText("jLabel7");

        lblCPF.setText("jLabel7");

        lblEndereco.setText("jLabel7");

        lblTelefone.setText("jLabel7");

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        jLabel7.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblTelefone)
                            .addComponent(lblEndereco)
                            .addComponent(lblCPF)
                            .addComponent(lblNome)
                            .addComponent(lblIdade))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximo)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        try {
            rs.next();
            
            id = Integer.parseInt(rs.getString("id"));
            nome = rs.getString("nome");
            idade = Integer.parseInt(rs.getString("idade"));
            cpf = rs.getString("cpf");
            endereco = rs.getString("endereco");
            telefone = rs.getString("telefone");
            
            lblId.setText(String.valueOf(id));
            lblNome.setText(nome);
            lblIdade.setText(String.valueOf(idade));
            lblCPF.setText(cpf);
            lblEndereco.setText(endereco);
            lblTelefone.setText(telefone);
        }
        catch (Exception e) {
        
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        try {
            rs.previous();
            
            id = Integer.parseInt(rs.getString("id"));
            nome = rs.getString("nome");
            idade = Integer.parseInt(rs.getString("idade"));
            cpf = rs.getString("cpf");
            endereco = rs.getString("endereco");
            telefone = rs.getString("telefone");
            
            lblId.setText(String.valueOf(id));
            lblNome.setText(nome);
            lblIdade.setText(String.valueOf(idade));
            lblCPF.setText(cpf);
            lblEndereco.setText(endereco);
            lblTelefone.setText(telefone);
        }
        catch (Exception e) {
        
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesVisualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
