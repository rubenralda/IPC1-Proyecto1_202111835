/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto1_biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Carga_masiva extends javax.swing.JDialog {

    /**
     * Creates new form Carga_masiva
     */
    Libros[] libros;

    public Carga_masiva(java.awt.Frame parent, boolean modal, Libros[] libros) {
        super(parent, modal);
        this.libros = libros;
        initComponents();
    }

    public Libros[] getLibros() {
        return libros;
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
        txt_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jLabel1.setText("CARGA MASIVA");

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButton1)
                        .addGap(79, 79, 79)
                        .addComponent(jButton2))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] tipos = txt_area.getText().split("\n");
        String[] libro;
        for (int i = 0; i < tipos.length; i++) {
            if (tipos[i] != null) {
                libro = tipos[i].split(";");
                try {
                    for (; libros[i] != null; i++) {
                    }
                    String[] claves;
                    String[] temas;
                    switch (Integer.parseInt(libro[0])) {
                        case 0:
                            //libros
                            claves=libro[6].split(",");
                            temas=libro[8].split(",");
                            libros[i] = new Libros(Integer.parseInt(libro[0]), libro[1], Integer.parseInt(libro[2]),
                                     Integer.parseInt(libro[3]), libro[4], Integer.parseInt(libro[5]), claves, libro[7], temas,
                                    Integer.parseInt(libro[9]),
                                     Integer.parseInt(libro[13]));
                            JOptionPane.showMessageDialog(null, "El libro se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 1:
                            //revista
                            claves=libro[6].split(",");
                            temas=libro[8].split(",");
                            libros[i] = new Libros(Integer.parseInt(libro[0]), libro[1], Integer.parseInt(libro[2]),
                                     libro[4], Integer.parseInt(libro[5]), claves, libro[7], temas,
                                    Integer.parseInt(libro[9]), libro[10], Integer.parseInt(libro[11]),
                                     Integer.parseInt(libro[13]));
                            JOptionPane.showMessageDialog(null, "La revista se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 2:
                            //tesis
                            claves=libro[6].split(",");
                            temas=libro[8].split(",");
                            libros[i] = new Libros(Integer.parseInt(libro[0]), libro[1], Integer.parseInt(libro[2]),
                                     libro[4], Integer.parseInt(libro[5]), claves, libro[7], temas,
                                   Integer.parseInt(libro[9]),libro[12],
                                     Integer.parseInt(libro[13]));
                            JOptionPane.showMessageDialog(null, "La tesis se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 3:
                            //digital
                            claves=libro[6].split(",");
                            temas=libro[8].split(",");
                            libros[i] = new Libros(Integer.parseInt(libro[0]), libro[1], Integer.parseInt(libro[2]),
                                     libro[4], Integer.parseInt(libro[5]), claves, libro[7], temas,
                                    Integer.parseInt(libro[14]));
                            JOptionPane.showMessageDialog(null, "El libro digital se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            throw new AssertionError();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Se produjo un error, revise y vuelva a intentarlo. \nError: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_area;
    // End of variables declaration//GEN-END:variables
}
