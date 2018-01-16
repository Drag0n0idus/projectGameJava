/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author František
 */
public class CreateMenu extends javax.swing.JFrame {
    private Human character;
    private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    Date date;
    /**
     * Creates new form CreateMenu
     */
    public CreateMenu() {
        setTitle("Create new character");
        initComponents();
        createNewButton.setEnabled(false);
        renameButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classButtonGroup = new javax.swing.ButtonGroup();
        sexButtonGroup = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        classLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        warriorButton = new javax.swing.JRadioButton();
        mageButton = new javax.swing.JRadioButton();
        rangerButton = new javax.swing.JRadioButton();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        createNewButton = new javax.swing.JButton();
        wStrenght = new javax.swing.JLabel();
        mStrenght = new javax.swing.JLabel();
        rStrenght = new javax.swing.JLabel();
        wDexterity = new javax.swing.JLabel();
        mDexterity = new javax.swing.JLabel();
        rDexterity = new javax.swing.JLabel();
        wIntelligence = new javax.swing.JLabel();
        mIntelligence = new javax.swing.JLabel();
        rIntelligence = new javax.swing.JLabel();
        wConstitution = new javax.swing.JLabel();
        mConstitution = new javax.swing.JLabel();
        rConstitution = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        renameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        classLabel.setText("Class");

        sexLabel.setText("Sex");

        classButtonGroup.add(warriorButton);
        warriorButton.setSelected(true);
        warriorButton.setText("Warrior");
        warriorButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                warriorButtonStateChanged(evt);
            }
        });

        classButtonGroup.add(mageButton);
        mageButton.setText("Mage");

        classButtonGroup.add(rangerButton);
        rangerButton.setText("Ranger");

        sexButtonGroup.add(maleButton);
        maleButton.setSelected(true);
        maleButton.setText("Male");

        sexButtonGroup.add(femaleButton);
        femaleButton.setText("Female");

        createNewButton.setText("Create");
        createNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewButtonActionPerformed(evt);
            }
        });

        wStrenght.setText("Strenght:      13");

        mStrenght.setText("Strenght:        8");

        rStrenght.setText("Strenght:      11");

        wDexterity.setText("Dexterity:        8");

        mDexterity.setText("Dexterity:      11");

        rDexterity.setText("Dexterity:     13");

        wIntelligence.setText("Intelligence: 11");

        mIntelligence.setText("Intelligence: 13");

        rIntelligence.setText("Intelligence:  8");

        wConstitution.setText("Constitution:  2");

        mConstitution.setText("Constitution:  0");

        rConstitution.setText("Constitution:  1");

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        renameButton.setText("Rename");
        renameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameButtonActionPerformed(evt);
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
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(renameButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warriorButton)
                                    .addComponent(wStrenght)
                                    .addComponent(wDexterity)
                                    .addComponent(wIntelligence)
                                    .addComponent(wConstitution))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mConstitution)
                                    .addComponent(mageButton)
                                    .addComponent(mStrenght)
                                    .addComponent(mDexterity)
                                    .addComponent(mIntelligence))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rangerButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rStrenght)
                                            .addComponent(rDexterity)
                                            .addComponent(rIntelligence)))
                                    .addComponent(rConstitution))))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton)
                    .addComponent(renameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleButton)
                    .addComponent(femaleButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(warriorButton)
                        .addComponent(mageButton)
                        .addComponent(rangerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mStrenght)
                            .addComponent(rStrenght)
                            .addComponent(wStrenght))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mDexterity)
                            .addComponent(rDexterity)
                            .addComponent(wDexterity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mIntelligence)
                            .addComponent(rIntelligence)
                            .addComponent(wIntelligence))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rConstitution)
                            .addComponent(wConstitution)
                            .addComponent(mConstitution))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new StartMenu().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed


    private void createNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewButtonActionPerformed


        date = new Date();
        String dateTime = sdf.format(date);
        if (mageButton.isSelected()) {
            character = new Mage("m");
            character.setName(nameTextField.getText());
            character.setToc(dateTime);
            if (maleButton.isSelected()) {
                character.setSex(Human.Sex.MAN);
            } else {
                character.setSex(Human.Sex.WOMAN);
            }
        }
        if (warriorButton.isSelected()) {
            character = new Warrior("w");
            character.setName(nameTextField.getText());
            character.setToc(dateTime);
            if (maleButton.isSelected()) {
                character.setSex(Human.Sex.MAN);
            } else {
                character.setSex(Human.Sex.WOMAN);
            }
        }
        if (rangerButton.isSelected()) {
            character = new Ranger("r");
            character.setName(nameTextField.getText());
            character.setToc(dateTime);
            if (maleButton.isSelected()) {
                character.setSex(Human.Sex.MAN);
            } else {
                character.setSex(Human.Sex.WOMAN);
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("charDataBase.txt", true))) {
            BufferedReader br = new BufferedReader(new FileReader("charDataBase.txt"));
            if (br.readLine() == null) {
                bw.write("toc;name");
                bw.newLine();
            }
            String output = character.getToc() + ";" + character.getName();
            bw.write(output);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            System.err.println("There was an error lol you lost your progress get rekt.");
        }
        
        String newChar = dateTime + ".txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newChar, true))) {
            BufferedReader br = new BufferedReader(new FileReader(newChar));
            if (br.readLine() == null) {
                bw.write("class;name;strength;dexterity;intelligence;constitution;sex;toc;weaponName;weaponDmg;weaponType;"
                        + "chestName;chestArmor;helmetName;helmetArmor;shoesName;shoesArmor;level;attrPoints;exp");
                bw.newLine();
            }
            String output = character.getClass().getSimpleName() + ";"
                    + character.getName() + ";"
                    + character.getStrength() + ";"
                    + character.getDexterity() + ";"
                    + character.getIntelligence() + ";"
                    + character.getConstitution() + ";"
                    + character.getSex() + ";"
                    + character.getToc() + ";"
                    + character.getWeapon().getName() + ";"
                    + character.getWeapon().getDamage() + ";"
                    + character.getWeapon().getType() + ";"
                    + character.getChest().getName() + ";"
                    + character.getChest().getArmor() + ";"
                    + character.getHelmet().getName() + ";"
                    + character.getHelmet().getArmor() + ";"
                    + character.getShoes().getName() + ";"
                    + character.getShoes().getArmor() + ";"
                    + character.getLevel() + ";"
                    + character.getPoint() + ";"
                    + character.getExp() + ";"
                    + character.getHealth() + ";"
                    + character.getX() + ";"
                    + character.getY(); 
            bw.write(output);
            bw.newLine();
            bw.flush();
            new PopupInfoMenu(character).setVisible(true);
        } catch (Exception e) {
            System.err.println("Do souboru se nepovedlo zapsat.");
        }
        
        new WorldMap(character).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_createNewButtonActionPerformed

    private void warriorButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_warriorButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_warriorButtonStateChanged

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        if(nameTextField.getText().equalsIgnoreCase("")){
           createNewButton.setEnabled(false);
           new PopupInfoMenu("No suitable name entered!").setVisible(true);
        }
        else {
            createNewButton.setEnabled(true);
            new PopupInfoMenu("The name is valid!").setVisible(true);
            nameTextField.setEditable(false);
            nameTextField.setEnabled(false);
            checkButton.setEnabled(false);
            renameButton.setEnabled(true);
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void renameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameButtonActionPerformed
        createNewButton.setEnabled(false);
        nameTextField.setEditable(true);
        nameTextField.setEnabled(true);
        checkButton.setEnabled(true);
        nameTextField.setText("");
        renameButton.setEnabled(false);
    }//GEN-LAST:event_renameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkButton;
    private javax.swing.ButtonGroup classButtonGroup;
    private javax.swing.JLabel classLabel;
    private javax.swing.JButton createNewButton;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel mConstitution;
    private javax.swing.JLabel mDexterity;
    private javax.swing.JLabel mIntelligence;
    private javax.swing.JLabel mStrenght;
    private javax.swing.JRadioButton mageButton;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel rConstitution;
    private javax.swing.JLabel rDexterity;
    private javax.swing.JLabel rIntelligence;
    private javax.swing.JLabel rStrenght;
    private javax.swing.JRadioButton rangerButton;
    private javax.swing.JButton renameButton;
    private javax.swing.ButtonGroup sexButtonGroup;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel wConstitution;
    private javax.swing.JLabel wDexterity;
    private javax.swing.JLabel wIntelligence;
    private javax.swing.JLabel wStrenght;
    private javax.swing.JRadioButton warriorButton;
    // End of variables declaration//GEN-END:variables
}
