package br.com.calculator.view;

import br.com.calculator.controller.CrimeController;
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

public class EditarCrime extends javax.swing.JFrame {

    public EditarCrime() {
        iniciaTela();
    }

    public EditarCrime(Crime selecionado) {
        this.crime = selecionado;
        iniciaTela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        artigoTextField = new javax.swing.JTextField();
        artigoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        tempoLabel = new javax.swing.JLabel();
        tempoTextField = new javax.swing.JTextField();
        naturezaLabel = new javax.swing.JLabel();
        naturezaComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        minutesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        artigoLabel.setText("Artigo:");

        nomeLabel.setText("Nome:");

        tempoLabel.setText("Tempo:");

        naturezaLabel.setText("Natureza:");

        confirmButton.setText("Confirmar");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        minutesLabel.setText("minutos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(naturezaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naturezaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(confirmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(artigoLabel)
                                .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tempoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutesLabel))
                            .addComponent(artigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artigoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoLabel)
                    .addComponent(tempoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutesLabel))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naturezaLabel)
                    .addComponent(naturezaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.setVisible(false);
        this.dispose();
        CrimeController.telaEditarCrimes();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if("".equals(artigoTextField.getText())){
            JOptionPane.showMessageDialog(this, "Preencha o número do artigo!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if("".equals(nomeTextField.getText())){
            JOptionPane.showMessageDialog(this, "Preencha o nome do crime!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if("".equals(tempoTextField.getText())){
            JOptionPane.showMessageDialog(this, "Preencha o tempo do crime!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            Crime byArtigo = CrimeController.findCrimeByArtigo(artigoTextField.getText());
            Crime byName = CrimeController.findCrimeByName(nomeTextField.getText());
            
            if(byArtigo != null && !byArtigo.equals(crime)){
                JOptionPane.showMessageDialog(this, "Um crime com este artigo já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if(byName != null && !byName.equals(crime)){
                JOptionPane.showMessageDialog(this, "Um crime com este nome já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if(!NumberUtils.isNumeric(tempoTextField.getText())){
                JOptionPane.showMessageDialog(this, "Digite apenas números no campo de tempo!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                crime.setArtigo(artigoTextField.getText());
                crime.setNome(nomeTextField.getText());
                crime.setTempo(Integer.parseInt(tempoTextField.getText()));                 
                String natureza = Natureza.toEnum(naturezaComboBox.getSelectedItem().toString());
                crime.setNatureza(Natureza.valueOf(natureza));  
                
                JOptionPane.showMessageDialog(this, "Você alterou este crime com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                this.dispose();
                CrimeController.telaEditarCrimes();
            }            
        }        
    }//GEN-LAST:event_confirmButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCrime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artigoLabel;
    private javax.swing.JTextField artigoTextField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JComboBox<String> naturezaComboBox;
    private javax.swing.JLabel naturezaLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JTextField tempoTextField;
    // End of variables declaration//GEN-END:variables

    private Crime crime;
    
    public void iniciaTela() {   
        initComponents();                
                        
        for (Natureza n : Natureza.values()) {
            naturezaComboBox.addItem(n.toString());            
        }
        
        artigoTextField.setText(crime.getArtigo());        
        nomeTextField.setText(crime.getNome());
        tempoTextField.setText(""+crime.getTempo());        

        String natureza = crime.getNatureza().toString();
        
        for(int i = 0; i < naturezaComboBox.getItemCount(); i++){           
            if(naturezaComboBox.getItemAt(i).equals(natureza)){
                naturezaComboBox.setSelectedIndex(i);
            }
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
        
        this.setTitle("Editando um Crime");
        URL iconURL = getClass().getResource("/br/com/calculator/view/images/favicon.png");        
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());  
    }
    
}
