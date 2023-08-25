/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ViewEstacionamento;

import Controller.EstacionamentoController;
import java.util.ArrayList;
import java.util.List;
import model.Estacionamento;

/**
 *
 * @author alexs
 */
public class EstacionamentoView extends javax.swing.JDialog {

    /**
     * Creates new form EstacionamentoView
     */
    public EstacionamentoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        EstacionamentoController estacionamentocontroller = new EstacionamentoController();
        
        List<Estacionamento> listaEstacionamento = new ArrayList();
        
        listaEstacionamento = estacionamentocontroller.getTodosEstacionamentoController();
        
        for (Estacionamento estacionamento : listaEstacionamento
                ) {
            System.out.println(estacionamento);
        
    } }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jbtSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estacionamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa do Veiculo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 140, 300, 42);

        jtfPlaca.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlaca.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfPlaca);
        jtfPlaca.setBounds(40, 200, 270, 50);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(156, 1480, 0, 0);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cor do Veiculo ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 270, 280, 30);

        jtfCor.setBackground(new java.awt.Color(255, 255, 255));
        jtfCor.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jtfCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCorActionPerformed(evt);
            }
        });
        getContentPane().add(jtfCor);
        jtfCor.setBounds(40, 320, 300, 50);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome do Proprietário");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 400, 380, 40);

        jtfNome.setBackground(new java.awt.Color(255, 255, 255));
        jtfNome.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome);
        jtfNome.setBounds(40, 450, 290, 50);

        jbtSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jbtSalvar.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jbtSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jbtSalvar.setText("Salvar");
        jbtSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtSalvar);
        jbtSalvar.setBounds(200, 560, 200, 60);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro de Carros");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 0, 440, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Estacionamento Grátis Preto Urbano Story do Instagram (2).png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-130, -120, 820, 1010);

        setSize(new java.awt.Dimension(620, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCorActionPerformed
        // TODO add your handlingcode here:
    }//GEN-LAST:event_jtfCorActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        
        EstacionamentoController estacionamentoController = new EstacionamentoController();
        Estacionamento estacionamento = this.getDadosInterface();
        estacionamentoController.salvarEstacionamentoController(estacionamento);
        
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaActionPerformed
        private Estacionamento getDadosInterface(){
        
        Estacionamento estacionamento = new Estacionamento();  
        
        estacionamento.setCorCarro(this.jtfCor.getText());
        estacionamento.setNomePiloto(this.jtfNome.getText());
        estacionamento.setPlacaCarro(this.jtfPlaca.getText());
        
        return estacionamento;
    }
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
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstacionamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstacionamentoView dialog = new EstacionamentoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JTextField jtfCor;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPlaca;
    // End of variables declaration//GEN-END:variables
}