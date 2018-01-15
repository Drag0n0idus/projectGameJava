/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.DefaultListModel;
import people.Human.Sex;

/**
 *
 * @author Both
 */
public class loadCharacter extends javax.swing.JFrame {

    private Human personn;
    private Human character;
    DefaultListModel model = new DefaultListModel();

    /**
     * Creates new form loadCharacter
     */
    public loadCharacter() {
        setTitle("Load Game");
        initComponents();
        charList.setModel(model);
        whichCharacter();
    }

    public void whichCharacter() {
        try (BufferedReader br = new BufferedReader(new FileReader("charDataBase.txt"))) {
            String s;
            int i = 0;
            model.clear();
            while ((s = br.readLine()) != null) {
                if (i > 0) {
                    String[] attr = s.split(";");
                    loadFromCharPage(attr[0]);
                }
                i++;
            }
        } catch (Exception e) {
            System.err.println("Chyba při čtení ze souboru.");
        }
    }

    public void loadFromCharPage(String element) {
        try (BufferedReader br = new BufferedReader(new FileReader(element + ".txt"))) {
            String s;
            int i = 0;
            while ((s = br.readLine()) != null) {
                if (i > 0) {
                    String[] attr = s.split(";");
                    switch (attr[0]) {
                        case "Mage":
                            character = new Mage(attr[1]);
                            break;
                        case "Warrior":
                            character = new Warrior(attr[1]);
                            break;
                        case "Ranger":
                            character = new Ranger(attr[1]);
                            break;
                    }
                    character.setStrength(Integer.parseInt(attr[2]));
                    character.setDexterity(Integer.parseInt(attr[3]));
                    character.setIntelligence(Integer.parseInt(attr[4]));
                    character.setConstitution(Float.parseFloat(attr[5]));
                    if (attr[6].equalsIgnoreCase("MAN")) {
                        character.setSex(Human.Sex.MAN);
                    } else {
                        character.setSex(Human.Sex.WOMAN);
                    }
                    character.setToc(attr[7]);
                    character.getWeapon().setName(attr[8]);
                    character.getWeapon().setDamage(Integer.parseInt(attr[9]));
                    if (attr[10].equalsIgnoreCase("SWORD")) {
                        character.getWeapon().setType(Weapons.Type.SWORD);
                    } else if (attr[10].equalsIgnoreCase("BOW")){
                        character.getWeapon().setType(Weapons.Type.BOW);
                    } else {
                        character.getWeapon().setType(Weapons.Type.WAND);
                    }
                    character.getChest().setName(attr[11]);
                    character.getChest().setArmor(Integer.parseInt(attr[12]));
                    character.getHelmet().setName(attr[13]);
                    character.getHelmet().setArmor(Integer.parseInt(attr[14]));
                    character.getShoes().setName(attr[15]);
                    character.getShoes().setArmor(Integer.parseInt(attr[16]));
                    character.setLevel(Integer.parseInt(attr[17]));
                    character.setPoint(Integer.parseInt(attr[18]));
                    character.setExp(Integer.parseInt(attr[19]));
                    character.setHealth(Float.parseFloat(attr[20]));
                    model.addElement(character);
                }
                i++;
            }
        } catch (Exception e) {
            System.err.println("Chyba při čtení ze souboru.");
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
        charList = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        contButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        strLabel = new javax.swing.JLabel();
        dxtLabel = new javax.swing.JLabel();
        intLabel = new javax.swing.JLabel();
        conLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        charList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                charListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(charList);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        contButton.setText("Continue");
        contButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        classLabel.setText("Class");

        strLabel.setText("Strength");

        dxtLabel.setText("Dexterity");

        intLabel.setText("Intelligence");

        conLabel.setText("Constitution");

        genderLabel.setText("Gender");

        deleteButton.setText("Delete");
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
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dxtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dxtLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contButton)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new StartMenu().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void contButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contButtonActionPerformed
        if (charList.getSelectedIndex() > -1) {
            Human person = (Human) model.get(charList.getSelectedIndex());
            new WorldMap(person).setVisible(true);
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_contButtonActionPerformed

    private void charListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_charListMouseClicked
        if (charList.getSelectedIndex() > -1) {
            Human person = (Human) model.get(charList.getSelectedIndex());
            nameLabel.setText("Name: " + person.getName());
            if (person.getSex() == Sex.MAN) {
                genderLabel.setText("Gender: Man");
            }
            if (person.getSex() == Sex.WOMAN) {
                genderLabel.setText("Gender: Woman");
            }
            classLabel.setText("Class: " + person.getClass().getSimpleName());
            strLabel.setText("Strength: " + person.getStrengthS());
            dxtLabel.setText("Dexterity: " + person.getDexterityS());
            intLabel.setText("Intelligence: " + person.getIntelligenceS());
            conLabel.setText("Constitution: " + person.getConstitutionS());
        }
    }//GEN-LAST:event_charListMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedIndex = charList.getSelectedIndex();
        if (selectedIndex != -1) {
            personn = (Human) model.get(selectedIndex);
            model.remove(selectedIndex);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("charDataBase.txt"))) {
            BufferedReader br = new BufferedReader(new FileReader("charDataBase.txt"));
            if (br.readLine() == null) {
                bw.write("toc;name");
                bw.newLine();
            }
            for (int i = 0; i < model.getSize(); i++) {
                Human person = (Human) model.get(i);
                String output = person.getToc() + ";" + person.getName();
                bw.write(output);
                if (i < model.getSize()) {
                    bw.newLine();
                }
            }
            bw.flush();
        } catch (Exception e) {
            System.err.println("Do souboru se nepovedlo zapsat.");
        }

        Path file = FileSystems.getDefault().getPath(personn.getToc() + ".txt");
        try {
            boolean success = Files.deleteIfExists(file);
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(loadCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loadCharacter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JList<String> charList;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel conLabel;
    private javax.swing.JButton contButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dxtLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel intLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel strLabel;
    // End of variables declaration//GEN-END:variables
}
