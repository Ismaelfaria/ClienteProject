/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Controller.ClienteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author alexs
 */
public class ClienteView extends javax.swing.JDialog {

    /**
     * Creates new form Cliente
     */
    public ClienteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ClienteController clientecontroller = new ClienteController();
        
        List<Cliente> listaCliente = new ArrayList();
        
        listaCliente = clientecontroller.getTodosClientesController();
        
       
    }
    
    private void popularTabelaClientes(List<Cliente> pListaDeCliente){
        
        DefaultTableModel modeloTabela= new DefaultTableModel();
        //Link entre a nossa tabela e o nosso model
        this.jtbClientes.setModel(modeloTabela);
        
        modeloTabela.addColumn("Id");
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Endereço");
        
        for (Cliente cliente : pListaDeCliente) {
            modeloTabela.addRow(
                    new Object[]{
                        cliente.getIdCliente(),
                        cliente.getNome(),
                        cliente.getEndereco()
                                }            
    );            
    }                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbClientes = new javax.swing.JTable();
        jtfNome = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jbtSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jtbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbClientes);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setResizable(false);
        getContentPane().setLayout(null);

        jtfNome.setBackground(new java.awt.Color(255, 255, 255));
        jtfNome.setBorder(null);
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome);
        jtfNome.setBounds(80, 180, 250, 30);

        jtfEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jtfEndereco.setBorder(null);
        jtfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfEndereco);
        jtfEndereco.setBounds(80, 320, 260, 30);

        jbtSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jbtSalvar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbtSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jbtSalvar.setText("SAVE");
        jbtSalvar.setBorder(null);
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtSalvar);
        jbtSalvar.setBounds(130, 410, 150, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Black and White Simple Technology Mobile Prototype (3).png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 660);

        setSize(new java.awt.Dimension(427, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
    
        ClienteController clienteController = new ClienteController();
        Cliente cliente = this.getDadosInterface();
        int idClienteSalvo =  clienteController.salvarClienteController(cliente);
        
        if(idClienteSalvo > 0){
        DefaultTableModel modeloTabela =(DefaultTableModel) this.jtbClientes.getModel();       
        
        modeloTabela.addRow(
                new Object[]{
                        idClienteSalvo,
                        cliente.getNome(),
                        cliente.getEndereco()
                    }
        );
        
                    jtfNome.setText("");
                    jtfEndereco.setText("");
                    JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso");
                     
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar o cliente");
        }
                        
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jtfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoActionPerformed

    private Cliente getDadosInterface(){
        
        Cliente cliente = new Cliente();   
        cliente.setNome(this.jtfNome.getText());
        cliente.setEndereco(this.jtfEndereco.getText());
        
        return cliente;
        
        
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteView dialog = new ClienteView(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JTable jtbClientes;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}