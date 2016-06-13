package br.com.calculator.view;

import br.com.calculator.controller.CrimeController;
import br.com.calculator.main.ArrestCalculator;
import br.com.calculator.model.Crime;
import br.com.calculator.model.Natureza;
import br.com.calculator.parser.XMLManager;
import br.com.calculator.utils.NumberUtils;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        iniciaTela();                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcularButton = new javax.swing.JButton();
        playerid = new javax.swing.JTextField();
        labelPlayerid = new javax.swing.JLabel();
        timeDisplay = new javax.swing.JLabel();
        resetarCrimes = new javax.swing.JButton();
        minutesDisplay = new javax.swing.JLabel();
        arrestCommand = new javax.swing.JTextField();
        copyCommand = new javax.swing.JButton();
        editCrimes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        calcularButton.setText("Calcular Tempo");
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });

        playerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playeridActionPerformed(evt);
            }
        });

        labelPlayerid.setText("ID do Jogador (Opcional):");

        timeDisplay.setForeground(new java.awt.Color(255, 0, 0));
        timeDisplay.setText("TIME PLACEHOLDER");

        resetarCrimes.setText("Resetar Crimes");
        resetarCrimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarCrimesActionPerformed(evt);
            }
        });

        minutesDisplay.setForeground(new java.awt.Color(255, 0, 0));
        minutesDisplay.setText("MINUTES PLACEHOLDER");

        copyCommand.setText("Copiar");
        copyCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyCommandActionPerformed(evt);
            }
        });

        editCrimes.setText("Editar Crimes");
        editCrimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCrimesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editCrimes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyCommand)
                    .addComponent(minutesDisplay)
                    .addComponent(timeDisplay)
                    .addComponent(arrestCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcularButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetarCrimes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPlayerid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minutesDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arrestCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyCommand))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelPlayerid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetarCrimes)
                            .addComponent(calcularButton)
                            .addComponent(editCrimes))))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        int total = CrimeController.calculateTotalTime(checkBoxList, crimeCorrespondente);
        int hours = total/60;
        int minutes = total%60;
        timeDisplay.setText("Tempo Total: "+hours+" Horas e "+minutes+" minutos.");
        timeDisplay.setVisible(true);
        minutesDisplay.setText("Em minutos: "+total+" minutos.");
        minutesDisplay.setVisible(true);
        
        if(!"".equals(playerid.getText())){
            if(NumberUtils.isNumeric(playerid.getText())){              
                arrestCommand.setText("/prender 1 "+playerid.getText()+" "+total);
                copyCommand.setVisible(true);
                arrestCommand.setVisible(true);
            } else {
                copyCommand.setVisible(false);
                arrestCommand.setVisible(false);
            }            
        } else {
            copyCommand.setVisible(false);
            arrestCommand.setVisible(false);
        }
    }//GEN-LAST:event_calcularButtonActionPerformed

    private void playeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playeridActionPerformed
       
    }//GEN-LAST:event_playeridActionPerformed

    private void resetarCrimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarCrimesActionPerformed
        CrimeController.resetarCrimes(checkBoxList);
        copyCommand.setVisible(false);
        arrestCommand.setVisible(false);
        timeDisplay.setVisible(false);
        minutesDisplay.setVisible(false);
    }//GEN-LAST:event_resetarCrimesActionPerformed

    private void copyCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyCommandActionPerformed
        StringSelection stringSelection = new StringSelection(arrestCommand.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);        
    }//GEN-LAST:event_copyCommandActionPerformed

    private void editCrimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCrimesActionPerformed
        this.setVisible(false);
        this.dispose();
        CrimeController.telaEditarCrimes();
    }//GEN-LAST:event_editCrimesActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrestCommand;
    private javax.swing.JButton calcularButton;
    private javax.swing.JButton copyCommand;
    private javax.swing.JButton editCrimes;
    private javax.swing.JLabel labelPlayerid;
    private javax.swing.JLabel minutesDisplay;
    private javax.swing.JTextField playerid;
    private javax.swing.JButton resetarCrimes;
    private javax.swing.JLabel timeDisplay;
    // End of variables declaration//GEN-END:variables
    
    private JPanel[] panelList;
    private Border[] borderList;
    private JCheckBox[] checkBoxList;
    private Crime[] crimeCorrespondente;
    
    public void iniciaTela() {        
        List<Crime> crimes = ArrestCalculator.getCrimes();
        checkBoxList = new JCheckBox[crimes.size()];
        crimeCorrespondente = new Crime[crimes.size()];
        
        panelList = new JPanel[Natureza.values().length];            
        borderList = new Border[Natureza.values().length];         
        
        int index = 0;
        for(Natureza n : Natureza.values()){            
            panelList[index] = new JPanel();            
            panelList[index].setLayout(new BoxLayout(panelList[index], BoxLayout.Y_AXIS));             
            borderList[index] = BorderFactory.createTitledBorder(n.toString());            
            index++;                        
        }       

        for(int i = 0; i < crimes.size(); i++) {
            Crime c = crimes.get(i);
            checkBoxList[i] = new JCheckBox(c.getArtigo() +" - " +c.getNome());            
            panelList[c.getNatureza().ordinal()].add(checkBoxList[i]);
            crimeCorrespondente[i] = c;
        }
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        
        for(int i = 0; i < panelList.length; i++){   
            JScrollPane jsp = new JScrollPane(panelList[i], JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            jsp.getVerticalScrollBar().setUnitIncrement(8);
            jsp.setBorder(borderList[i]);
            contentPane.add(jsp);            
        }                
                                       
        this.setLayout(new GridLayout(4, 4, 10, 10));
        this.setVisible(true);
        this.setPreferredSize(new Dimension(1250, 800));
        this.setResizable(false);
        this.pack();
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                XMLManager xmlm = new XMLManager(new File("crimes.xml"));                
                Collections.sort(ArrestCalculator.getCrimes(), new Comparator<Crime>() {
                    @Override
                    public int compare(Crime c1, Crime c2) {
                        return c1.getArtigo().compareTo(c2.getArtigo());
                    }
                });
                xmlm.saveCrimes(ArrestCalculator.getCrimes());                
                System.exit(0);
            }
        });
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setTitle("LSPD Arrest Calculator v2.0 by Viih");
        URL iconURL = getClass().getResource("/br/com/calculator/view/images/favicon.png");        
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        initComponents();       
        
        playerid.setColumns(4);        
        playerid.setDocument(new JTextFieldLimit(3));
        
        timeDisplay.setVisible(false);
        minutesDisplay.setVisible(false);
        copyCommand.setVisible(false);
        arrestCommand.setVisible(false);
    }
}
