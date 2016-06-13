package br.com.calculator.view;

import br.com.calculator.controller.CrimeController;
import br.com.calculator.main.ArrestCalculator;
import br.com.calculator.model.Crime;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EditarCrimes extends javax.swing.JFrame {

    public EditarCrimes() {
        iniciaTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crimeSelect = new javax.swing.JComboBox<>();
        crimeSelectLabel = new javax.swing.JLabel();
        editCrimeButton = new javax.swing.JButton();
        createCrimeButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        crimeSelectLabel.setText("Selecione um Crime para Editar/Deletar:");

        editCrimeButton.setText("Editar Crime");
        editCrimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCrimeButtonActionPerformed(evt);
            }
        });

        createCrimeButton.setText("Adicionar Crime");
        createCrimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCrimeButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Voltar ao Menu");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Deletar Crime");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editCrimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createCrimeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crimeSelectLabel)
                            .addComponent(crimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(crimeSelectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCrimeButton)
                    .addComponent(deleteButton)
                    .addComponent(createCrimeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(returnButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editCrimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCrimeButtonActionPerformed
        Crime selecionado = CrimeController.findCrimeByFormattedName(crimeSelect.getSelectedItem().toString());
        this.setVisible(false);
        this.dispose();
                
        CrimeController.telaEditarCrime(selecionado);        
    }//GEN-LAST:event_editCrimeButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        setVisible(false);
        dispose();
        ArrestCalculator.iniciaMenuPrincipal();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void createCrimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCrimeButtonActionPerformed
        this.setVisible(false);
        this.dispose();
                
        CrimeController.telaCriarCrime();   
    }//GEN-LAST:event_createCrimeButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Você realmente deseja deletar este crime?", "Aviso", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
            Crime selecionado = CrimeController.findCrimeByFormattedName(crimeSelect.getSelectedItem().toString());
            ArrestCalculator.removeCrime(selecionado);
            
            this.setVisible(false);
            this.dispose();
            CrimeController.telaEditarCrimes();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCrimes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createCrimeButton;
    private javax.swing.JComboBox<String> crimeSelect;
    private javax.swing.JLabel crimeSelectLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editCrimeButton;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
 
    
    public void iniciaTela() {   
        initComponents();
        
        List<Crime> crimes = ArrestCalculator.getCrimes(); 
        
        for (Crime crime : crimes) {
            crimeSelect.addItem(crime.getArtigo() +" - "+crime.getNome());
        }

        this.setVisible(true);        
        this.setResizable(false);
        this.pack();
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                setVisible(false);
                dispose();
                ArrestCalculator.iniciaMenuPrincipal();
            }
        });
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setTitle("Edição de Crimes");
        URL iconURL = getClass().getResource("/br/com/calculator/view/images/favicon.png");        
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());        
    }
}
