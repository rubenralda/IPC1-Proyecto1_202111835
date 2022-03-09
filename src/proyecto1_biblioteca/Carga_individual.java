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
public class Carga_individual extends javax.swing.JDialog {

    /**
     * Creates new form Carga_individual
     */
    private Libros[] libros;

    public Carga_individual(java.awt.Frame parent, boolean modal, Libros[] libros) {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_anio = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_clave = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_temas = new javax.swing.JTextField();
        txt_copias = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_ejem = new javax.swing.JTextField();
        txt_area = new javax.swing.JTextField();
        txt_disponible = new javax.swing.JTextField();
        txt_tamano = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carga Individual");

        jLabel1.setText("Autor");

        jLabel2.setText("Año de publicación");

        jLabel3.setText("Titulo");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Palabras clave");

        jLabel6.setText("Edicion");

        jLabel7.setText("Temas");

        jLabel8.setText("Copias");

        jLabel9.setText("Area");

        jLabel10.setText("Categoria");

        jLabel11.setText("ISBN");

        jLabel12.setText("Ejemplares");

        jLabel13.setText("Disponibles");

        txt_categoria.setEnabled(false);

        txt_ejem.setEnabled(false);

        txt_area.setEnabled(false);

        txt_tamano.setEnabled(false);

        jLabel14.setText("Tamaño");

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Libro digital" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });

        jButton1.setText("CARGAR");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(115, 115, 115)
                                .addComponent(txt_titulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_autor, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_anio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_isbn)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_temas)
                                            .addComponent(txt_copias)
                                            .addComponent(txt_categoria)
                                            .addComponent(txt_ejem)
                                            .addComponent(txt_area)
                                            .addComponent(txt_disponible)
                                            .addComponent(txt_tamano)
                                            .addComponent(txt_descripcion, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_clave, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_edicion))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_temas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_copias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ejem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
        switch (combo_tipo.getSelectedIndex()) {
            case 0:
                txt_categoria.setEnabled(false);
                txt_ejem.setEnabled(false);
                txt_area.setEnabled(false);
                txt_tamano.setEnabled(false);
                txt_isbn.setEnabled(true);
                txt_copias.setEnabled(true);
                txt_disponible.setEnabled(true);
                break;
            case 1:
                txt_categoria.setEnabled(true);
                txt_ejem.setEnabled(true);
                txt_area.setEnabled(false);
                txt_tamano.setEnabled(false);
                txt_isbn.setEnabled(false);
                txt_copias.setEnabled(true);
                txt_disponible.setEnabled(true);
                break;
            case 2:
                txt_categoria.setEnabled(false);
                txt_ejem.setEnabled(false);
                txt_area.setEnabled(true);
                txt_tamano.setEnabled(false);
                txt_isbn.setEnabled(false);
                txt_copias.setEnabled(true);
                txt_disponible.setEnabled(true);
                break;
            case 3:
                txt_categoria.setEnabled(false);
                txt_ejem.setEnabled(false);
                txt_area.setEnabled(false);
                txt_tamano.setEnabled(true);
                txt_isbn.setEnabled(false);
                txt_copias.setEnabled(false);
                txt_disponible.setEnabled(false);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i = 0;
        int j = 0;
        try {
            for (; libros[i] != null; i++) {
            }
            String[] claves = txt_clave.getText().split(",");
            String[] temas = txt_temas.getText().split(",");
            switch (combo_tipo.getSelectedIndex()) {
                case 0:
                    //libros
                    libros[i] = new Libros(combo_tipo.getSelectedIndex(), txt_autor.getText(), Integer.parseInt(txt_anio.getText()),
                             Integer.parseInt(txt_isbn.getText()), txt_titulo.getText(), Integer.parseInt(txt_edicion.getText()), claves, txt_descripcion.getText(), temas,
                            Integer.parseInt(txt_copias.getText()),
                             Integer.parseInt(txt_disponible.getText()));
                    JOptionPane.showMessageDialog(null, "El libro se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    //revista
                    libros[i] = new Libros(combo_tipo.getSelectedIndex(), txt_autor.getText(), Integer.parseInt(txt_anio.getText()),
                             txt_titulo.getText(), Integer.parseInt(txt_edicion.getText()), claves, txt_descripcion.getText(), temas,
                            Integer.parseInt(txt_copias.getText()), txt_categoria.getText(), Integer.parseInt(txt_ejem.getText()),
                             Integer.parseInt(txt_disponible.getText()));
                    JOptionPane.showMessageDialog(null, "La revista se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    //tesis
                    libros[i] = new Libros(combo_tipo.getSelectedIndex(), txt_autor.getText(), Integer.parseInt(txt_anio.getText()),
                             txt_titulo.getText(), Integer.parseInt(txt_edicion.getText()), claves, txt_descripcion.getText(), temas,
                            Integer.parseInt(txt_copias.getText()), txt_area.getText(),
                             Integer.parseInt(txt_disponible.getText()));
                    JOptionPane.showMessageDialog(null, "La tesis se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    //digital
                    libros[i] = new Libros(combo_tipo.getSelectedIndex(), txt_autor.getText(), Integer.parseInt(txt_anio.getText()),
                             txt_titulo.getText(), Integer.parseInt(txt_edicion.getText()), claves, txt_descripcion.getText(), temas,
                            Integer.parseInt(txt_tamano.getText()));
                    JOptionPane.showMessageDialog(null, "El libro digital se creó con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error, revise y vuelva a intentarlo. \nError: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_copias;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_disponible;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_ejem;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_tamano;
    private javax.swing.JTextField txt_temas;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
