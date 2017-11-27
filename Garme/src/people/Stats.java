/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.awt.Color;

/**
 *
 * @author František
 */
public class Stats extends javax.swing.JFrame {

    private Human character;
    private int armor;
    private int str;
    private int dxt;
    private int intel;
    private int con;
    private int points;

    /**
     * Creates new form Stats
     */
    public Stats() {
        initComponents();
    }

    public Stats(Human person) {
        initComponents();
        character = person;
        armor = character.getChest().getArmor() + character.getShoes().getArmor() + character.getHelmet().getArmor();
        sLabel.setText("Strength: " + character.getStrengthS());
        dLabel.setText("Dexterity: " + character.getDexterityS());
        iLabel.setText("Intelligence: " + character.getIntelligenceS());
        cLabel.setText("Constitution: " + character.getConstitutionS());
        aLabel.setText("Armor: " + armor);
        expBar.setValue(character.getExp());
        aPoints.setText("Available attribute points: " + character.getPoint());
        levelLabel.setText("Level: " + character.getLevel());
        if (character.getPoint() == 0) {
            sPlus.setEnabled(false);
            dPlus.setEnabled(false);
            iPlus.setEnabled(false);
            cPlusPlus.setEnabled(false);
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

        sLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        iLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        sPlus = new javax.swing.JButton();
        dPlus = new javax.swing.JButton();
        iPlus = new javax.swing.JButton();
        cPlusPlus = new javax.swing.JButton();
        aPoints = new javax.swing.JLabel();
        expBar = new javax.swing.JProgressBar();
        expLabel = new javax.swing.JLabel();
        expButton = new javax.swing.JButton();
        levelLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sLabel.setText("Strength");

        dLabel.setText("Dexterity");

        iLabel.setText("Intelligence");

        cLabel.setText("Constitution");

        aLabel.setText("Armor");

        backButton.setText("Confirm");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        sPlus.setText("+");
        sPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sPlusActionPerformed(evt);
            }
        });

        dPlus.setText("+");
        dPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPlusActionPerformed(evt);
            }
        });

        iPlus.setText("+");
        iPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iPlusActionPerformed(evt);
            }
        });

        cPlusPlus.setText("+");
        cPlusPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPlusPlusActionPerformed(evt);
            }
        });

        aPoints.setText("points");

        expBar.setMaximum(10);

        expLabel.setText("XP");

        expButton.setText("Add exp");
        expButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expButtonActionPerformed(evt);
            }
        });

        levelLabel.setText("Level");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aLabel)
                    .addComponent(cLabel)
                    .addComponent(sLabel)
                    .addComponent(iLabel)
                    .addComponent(dLabel)
                    .addComponent(expLabel)
                    .addComponent(levelLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dPlus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(expButton))
                    .addComponent(sPlus)
                    .addComponent(iPlus)
                    .addComponent(cPlusPlus)
                    .addComponent(aPoints))
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(expBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sLabel)
                    .addComponent(sPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLabel)
                    .addComponent(dPlus)
                    .addComponent(resetButton)
                    .addComponent(expButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iLabel)
                    .addComponent(iPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLabel)
                    .addComponent(cPlusPlus))
                .addGap(18, 18, 18)
                .addComponent(aLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(aPoints))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Inventory(character).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void expButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expButtonActionPerformed
        character.setExp(character.getExp() + 5);
        expBar.setValue(character.getExp());
        if (character.expCount(character.getExp())) {
            character.levelUp();
            aPoints.setText("Available attribute points: " + character.getPoint());
            levelLabel.setText("Level: " + character.getLevel());
            expBar.setValue(0);
            if (character.getPoint() != 0) {
                sPlus.setEnabled(true);
                dPlus.setEnabled(true);
                iPlus.setEnabled(true);
                cPlusPlus.setEnabled(true);
            }

        }
    }//GEN-LAST:event_expButtonActionPerformed

    private void sPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sPlusActionPerformed
        character.setStrength(character.getStrength() + 1);
        character.setPoint(character.getPoint() - 1);
        if (character.getPoint() == 0) {
            sPlus.setEnabled(false);
            dPlus.setEnabled(false);
            iPlus.setEnabled(false);
            cPlusPlus.setEnabled(false);
        }
        sLabel.setText("Strength: " + character.getStrengthS());
        aPoints.setText("Available attribute points: " + character.getPoint());
    }//GEN-LAST:event_sPlusActionPerformed

    private void dPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPlusActionPerformed
        character.setDexterity(character.getDexterity() + 1);
        character.setPoint(character.getPoint() - 1);
        if (character.getPoint() == 0) {
            sPlus.setEnabled(false);
            dPlus.setEnabled(false);
            iPlus.setEnabled(false);
            cPlusPlus.setEnabled(false);
        }
        dLabel.setText("Dexterity: " + character.getDexterityS());
        aPoints.setText("Available attribute points: " + character.getPoint());
    }//GEN-LAST:event_dPlusActionPerformed

    private void iPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iPlusActionPerformed
        character.setIntelligence(character.getIntelligence() + 1);
        character.setPoint(character.getPoint() - 1);
        if (character.getPoint() == 0) {
            sPlus.setEnabled(false);
            dPlus.setEnabled(false);
            iPlus.setEnabled(false);
            cPlusPlus.setEnabled(false);
        }
        iLabel.setText("Intelligence: " + character.getIntelligenceS());
        aPoints.setText("Available attribute points: " + character.getPoint());
    }//GEN-LAST:event_iPlusActionPerformed

    private void cPlusPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPlusPlusActionPerformed
        character.setConstitution(character.getConstitution() + 1);
        character.setPoint(character.getPoint() - 1);
        if (character.getPoint() == 0) {
            sPlus.setEnabled(false);
            dPlus.setEnabled(false);
            iPlus.setEnabled(false);
            cPlusPlus.setEnabled(false);
        }
        cLabel.setText("Constitution: " + character.getConstitutionS());
        aPoints.setText("Available attribute points: " + character.getPoint());
    }//GEN-LAST:event_cPlusPlusActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        points = 0;
        if(character instanceof Mage){
        str = ((Mage)character).getStr();
        dxt = ((Mage)character).getDxt();
        intel = ((Mage)character).getIntel();
        con = 0;
        }
        if(character instanceof Warrior){
        str = ((Warrior)character).getStr();
        dxt = ((Warrior)character).getDxt();
        intel = ((Warrior)character).getIntel();
        con = ((Warrior)character).getCon();
        }
        if(character instanceof Ranger){
        str = ((Ranger)character).getStr();
        dxt = ((Ranger)character).getDxt();
        intel = ((Ranger)character).getIntel();
        con = ((Ranger)character).getCon();
        }
        if (character.getStrength() > (10 + str)) points += character.getStrength() - (10 + str);
        if (character.getDexterity() > (10 + dxt)) points += character.getDexterity() - (10 + dxt);
        if (character.getIntelligence() > (10 + intel)) points += character.getIntelligence() - (10 + intel);
        if (character.getConstitution() > con) points += character.getConstitution() - (con);
        character.setStrength(10 + str);
        character.setDexterity(10 + dxt);
        character.setIntelligence(10 + intel);
        character.setConstitution(con);
        
        character.setPoint(character.getPoint() + points);
        
        sLabel.setText("Strength: " + character.getStrengthS());
        dLabel.setText("Dexterity: " + character.getDexterityS());
        iLabel.setText("Intelligence: " + character.getIntelligenceS());
        cLabel.setText("constitution: " + character.getConstitutionS());
        aPoints.setText("Available attribute points: " + character.getPoint());
        
        if(character.getPoint() > 0){
            sPlus.setEnabled(true);
            dPlus.setEnabled(true);
            iPlus.setEnabled(true);
            cPlusPlus.setEnabled(true);
        }
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLabel;
    private javax.swing.JLabel aPoints;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cLabel;
    private javax.swing.JButton cPlusPlus;
    private javax.swing.JLabel dLabel;
    private javax.swing.JButton dPlus;
    private javax.swing.JProgressBar expBar;
    private javax.swing.JButton expButton;
    private javax.swing.JLabel expLabel;
    private javax.swing.JLabel iLabel;
    private javax.swing.JButton iPlus;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel sLabel;
    private javax.swing.JButton sPlus;
    // End of variables declaration//GEN-END:variables
}
