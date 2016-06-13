package br.com.calculator.view;

import br.com.calculator.controller.CrimeController;
import br.com.calculator.main.ArrestCalculator;
import br.com.calculator.model.Crime;
import br.com.calculator.model.Natureza;
import br.com.calculator.utils.NumberUtils;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CriarCrime extends javax.swing.JFrame {

    public CriarCrime() {
        iniciaTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        artigoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        tempoLabel = new javax.swing.JLabel();
        naturezaLabel = new javax.swing.JLabel();
        confirmarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        artigoTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        tempoTextField = new javax.swing.JTextField();
        minutosLabel = new javax.swing.JLabel();
        naturezaComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        artigoLabel.setText("Artigo:");

        nomeLabel.setText("Nome:");

        tempoLabel.setText("Tempo:");

        naturezaLabel.setText("Natureza:");

        confirmarButton.setText("Confirmar");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        minutosLabel.setText("minutos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(naturezaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naturezaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(artigoLabel)
                            .addComponent(nomeLabel)
                            .addComponent(tempoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutosLabel)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artigoLabel)
                    .addComponent(artigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoLabel)
                    .addComponent(tempoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutosLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naturezaLabel)
                    .addComponent(naturezaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton)
                    .addComponent(cancelarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        setVisible(false);
        dispose();
        CrimeController.telaEditarCrimes();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        if("".equals(artigoTextField.getText())){
            JOptionPane.showMessageDialog(this, "Preencha o número do artigo!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if("".equals(nameTextField.getText())){
            JOptionPane.showMessageDialog(this, "Preencha o nome do crime!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if("".equals(tempoTextField.getText())){
            JOptionPane.showMessageDialog(this, "Preencha o tempo do crime!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            Crime byArtigo = CrimeController.findCrimeByArtigo(artigoTextField.getText());
            Crime byName = CrimeController.findCrimeByName(nameTextField.getText());
            
            if(byArtigo != null){
                JOptionPane.showMessageDialog(this, "Um crime com este artigo já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if(byName != null){
                JOptionPane.showMessageDialog(this, "Um crime com este nome já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if(!NumberUtils.isNumeric(tempoTextField.getText())){
                JOptionPane.showMessageDialog(this, "Digite apenas números no campo de tempo!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                String natureza = Natureza.toEnum(naturezaComboBox.getSelectedItem().toString());                
                Crime c = new Crime(artigoTextField.getText(), nameTextField.getText(), Integer.parseInt(tempoTextField.getText()), Natureza.valueOf(natureza));
                ArrestCalculator.addCrime(c);                
                
                JOptionPane.showMessageDialog(this, "Você criou um crime com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                this.dispose();
                CrimeController.telaEditarCrimes();
            }
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarCrime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artigoLabel;
    private javax.swing.JTextField artigoTextField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel minutosLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox<String> naturezaComboBox;
    private javax.swing.JLabel naturezaLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JTextField tempoTextField;
    // End of variables declaration//GEN-END:variables

    public void iniciaTela() {   
        initComponents();    
        
        for (Natureza n : Natureza.values()) {
            naturezaComboBox.addItem(n.toString());
        }                

        this.setVisible(true);        
        this.setResizable(false);
        this.pack();
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                setVisible(false);
                dispose();
                CrimeController.telaEditarCrimes();                
            }
        });
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setTitle("Criar um Novo Crime");
        URL iconURL = getClass().getResource("/br/com/calculator/view/images/favicon.png");        
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());        
    }
}
