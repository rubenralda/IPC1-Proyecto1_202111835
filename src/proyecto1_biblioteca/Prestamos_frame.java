/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruben
 */
public class Prestamos_frame extends javax.swing.JFrame {

    /**
     * Creates new form Prestamos_frame
     */
    Usuarios[] usuarios;
    Libros[] libros;
    int posi;
    int[] disponibles;

    public Prestamos_frame(Usuarios[] usuarios, Libros[] libros, int posi) {
        this.usuarios = usuarios;
        this.libros = libros;
        this.posi = posi;
        this.disponibles = new int[50];
        initComponents();
        int j = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if (libros[i].getTipo() != 3) {
                    mostrar(j, i);
                    j++;
                }
            }
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
        tabla_libros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        combo_atributo = new javax.swing.JComboBox<>();
        txt_buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combo_filtro = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tipo", "Autor", "Año ", "ISBN", "Titulo", "Edición", "Palabras clave", "Descripción", "Temas", "Copias", "Categoria", "Ejemplares", "Área", "Disponibles"
            }
        ));
        jScrollPane1.setViewportView(tabla_libros);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo_atributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor", "Año Publicación", "ISBN", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Copias", "Categoría", "Ejemplares", "Área" }));

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cerrar sesión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Prestar libro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar por");

        combo_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Revistas" }));

        jButton6.setText("Filtrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver prestamos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Reporte existencias");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton7))
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_buscar)
                                .addComponent(combo_atributo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(12, 12, 12))
                                .addComponent(combo_filtro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton6)
                                    .addGap(46, 46, 46)))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_atributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton5)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)))
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabla_libros.getModel();
        int fila = tabla_libros.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
        int j = 0;
        try {
            switch (combo_atributo.getSelectedIndex()) {
                case 0:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            if (libros[i].getAutor().equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            if (String.valueOf(libros[i].getAnio_publi()).equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() == 0) {
                            if (String.valueOf(libros[i].getIsbn()).equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            if (libros[i].getTitulo().equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            if (String.valueOf(libros[i].getEdicion()).equalsIgnoreCase(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 5://palabras clave
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            for (int k = 0; k < libros[i].getClaves().length; k++) {
                                if (libros[i].getClaves()[k].equalsIgnoreCase(txt_buscar.getText())) {
                                    mostrar(j, i);
                                    j++;
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            if (libros[i].getDescripcion().equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 7://temas
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            for (int k = 0; k < libros[i].getTemas().length; k++) {
                                if (libros[i].getTemas()[k].equalsIgnoreCase(txt_buscar.getText())) {
                                    mostrar(j, i);
                                    j++;
                                }
                            }
                        }
                    }
                    break;
                case 8:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() != 3) {
                            if (String.valueOf(libros[i].getCopias()).equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 9:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() == 1) {
                            if (String.valueOf(libros[i].getCategoria()).equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 10:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() == 1) {
                            if (String.valueOf(libros[i].getEjemplares()).equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                case 11:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() == 2) {
                            if (libros[i].getArea().equals(txt_buscar.getText())) {
                                mostrar(j, i);
                                j++;
                            }
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error, revise y vuelva a intentarlo. \nError: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Usuario_comun regresar = new Usuario_comun(usuarios, libros, posi);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Login login = new Login(usuarios, libros);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Libros[] digital = usuarios[posi].getLibros();
        int ultimo = 0;
        boolean existe = false;
        if (tabla_libros.getSelectedRow() != -1) {
            while (digital[ultimo] != null && existe == false) {
                if (digital[ultimo].equals(libros[disponibles[tabla_libros.getSelectedRow()]])) {
                    existe = true;
                    JOptionPane.showMessageDialog(null, "El libro ya ha sido "
                            + "prestado",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                ultimo++;
            }
            if (!existe) {
                int i = disponibles[tabla_libros.getSelectedRow()];
                if (libros[i].getDisponible() > 0) {
                    digital[ultimo] = libros[i];
                    libros[i].setDisponible(libros[i].getDisponible() - 1);
                    usuarios[posi].setLibros(digital);
                    JOptionPane.showMessageDialog(null, "Se ha prestado el libro a su biblioteca");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudó realizar el préstamo porque "
                            + "actualmente no hay disponibles",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabla_libros.getModel();
        int fila = tabla_libros.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
        int j = 0;
        try {
            switch (combo_filtro.getSelectedIndex()) {
                case 0:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() == 0) {
                            mostrar(j, i);
                            j++;
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < libros.length; i++) {
                        if (libros[i] != null && libros[i].getTipo() == 1) {
                            mostrar(j, i);
                            j++;
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error, revise y vuelva a intentarlo. \nError: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Ver_prestamos ver = new Ver_prestamos(this, true, usuarios, posi, libros);
        ver.setVisible(true);
        usuarios = ver.getUsuario();
        libros = ver.getLibro();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String cwd = System.getProperty("user.dir");
        File dir = new File(cwd + "\\Reportes");
        FileWriter escribir;
        PrintWriter nuevaLinea;
        if (!dir.exists() && !dir.isDirectory()) {
            try {
                dir.mkdir();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        File archivo = new File(cwd + "\\Reportes\\reportexistentes.html");
        archivo.delete();
        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            escribir = new FileWriter(archivo, true);
            nuevaLinea = new PrintWriter(escribir);
            nuevaLinea.println("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "<head>\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <title>Reporte</title>\n"
                    + "</head>\n"
                    + "<body>");

            nuevaLinea.println("<h1>Reporte Libros para prestar</h1>");
            nuevaLinea.println("<br>");
            nuevaLinea.println("<table border=\"1\">");
            nuevaLinea.println("<tr>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Titulo</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Autor</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Año de publicación</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Edición</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Copias</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Disponible</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.print("<td>");
            nuevaLinea.print("<b>Tipo</b>");
            nuevaLinea.print("</td>");
            nuevaLinea.println("</tr>");
            for (int i = 0; i < libros.length; i++) {
                if (libros[i] != null) {
                    //muestro el libro
                    if (libros[i].getTipo() != 3) {
                        nuevaLinea.println("<tr>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getTitulo());
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getAutor());
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getAnio_publi());
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getEdicion());
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getCopias());
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getDisponible());
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(libros[i].getTipo());
                        nuevaLinea.print("</td>");
                        nuevaLinea.println("</tr>");
                    }
                }
            }
            nuevaLinea.println("</table>");
           // ---------------------------
            nuevaLinea.println("</body>\n"
                    + "</html>");
            // me cierra mi archivo
            escribir.close();
            JOptionPane.showMessageDialog(this, "El reporte se ha creado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton7ActionPerformed
    public void mostrar(int i, int j) {
        Object matriz[][] = new Object[libros.length][16];
        switch (libros[j].getTipo()) {
            case 0:
                disponibles[i] = j;
                matriz[i][0] = i;
                matriz[i][1] = "Libro";
                matriz[i][2] = libros[j].getAutor();
                matriz[i][3] = String.valueOf(libros[j].getAnio_publi());
                matriz[i][4] = String.valueOf(libros[j].getIsbn());
                matriz[i][5] = libros[j].getTitulo();
                matriz[i][6] = String.valueOf(libros[j].getEdicion());
                matriz[i][7] = "";
                for (int k = 0; k < libros[j].getClaves().length; k++) {
                    matriz[j][7] += libros[j].getClaves()[k] + ",";
                }
                matriz[i][8] = libros[j].getDescripcion();
                matriz[i][9] = "";
                for (int k = 0; k < libros[j].getTemas().length; k++) {
                    matriz[i][9] += libros[j].getTemas()[k] + ",";
                }
                matriz[i][10] = String.valueOf(libros[j].getCopias());
                matriz[i][11] = " ";
                matriz[i][12] = " ";
                matriz[i][13] = " ";
                matriz[i][14] = String.valueOf(libros[j].getDisponible());
                break;
            case 1:
                disponibles[i] = j;
                matriz[i][0] = i;
                matriz[i][1] = "Revista";
                matriz[i][2] = libros[j].getAutor();
                matriz[i][3] = String.valueOf(libros[j].getAnio_publi());
                matriz[i][4] = " ";
                matriz[i][5] = libros[j].getTitulo();
                matriz[i][6] = String.valueOf(libros[j].getEdicion());
                matriz[i][7] = "";
                for (int k = 0; k < libros[j].getClaves().length; k++) {
                    matriz[i][7] += libros[j].getClaves()[k] + ",";
                }
                matriz[i][8] = libros[j].getDescripcion();
                matriz[i][9] = "";
                for (int k = 0; k < libros[j].getTemas().length; k++) {
                    matriz[i][9] += libros[j].getTemas()[k] + ",";
                }
                matriz[i][10] = String.valueOf(libros[j].getCopias());
                matriz[i][11] = libros[j].getCategoria();
                matriz[i][12] = String.valueOf(libros[j].getEjemplares());
                matriz[i][13] = " ";
                matriz[i][14] = String.valueOf(libros[j].getDisponible());
                break;
            case 2:
                disponibles[i] = j;
                matriz[i][0] = i;
                matriz[i][1] = "Tesis";
                matriz[i][2] = libros[j].getAutor();
                matriz[i][3] = String.valueOf(libros[j].getAnio_publi());
                matriz[i][4] = " ";
                matriz[i][5] = libros[j].getTitulo();
                matriz[i][6] = String.valueOf(libros[j].getEdicion());
                matriz[i][7] = "";
                for (int k = 0; k < libros[j].getClaves().length; k++) {
                    matriz[i][7] += libros[j].getClaves()[k] + ",";
                }
                matriz[i][8] = libros[j].getDescripcion();
                matriz[i][9] = "";
                for (int k = 0; k < libros[j].getTemas().length; k++) {
                    matriz[i][9] += libros[j].getTemas()[k] + ",";
                }
                matriz[i][10] = String.valueOf(libros[j].getCopias());
                matriz[i][11] = " ";
                matriz[i][12] = " ";
                matriz[i][13] = libros[j].getArea();
                matriz[i][14] = String.valueOf(libros[j].getDisponible());
                break;
            default:
                throw new AssertionError();
        }
        DefaultTableModel model = (DefaultTableModel) tabla_libros.getModel();
        model.addRow(matriz[i]);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_atributo;
    private javax.swing.JComboBox<String> combo_filtro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_libros;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
