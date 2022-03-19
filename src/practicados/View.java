/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import static practicados.View.cantidad;

/**
 *
 * @author Lusvin
 */
public class View extends javax.swing.JFrame {

    protected Thread hilo;
    protected FileNameExtensionFilter f = new FileNameExtensionFilter("*.CSV (Separados por coma)", "csv");
    protected static File archivo;

    protected static String m[][];

    protected static Integer cantidad[];
    protected static String nombre[];
    protected static ChartPanel chpanel;

    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupDireccion = new javax.swing.ButtonGroup();
        btngroupMetodo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlbtitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnexaminar = new javax.swing.JLabel();
        btngenerar = new javax.swing.JLabel();
        jtxtUrl = new javax.swing.JTextField();
        btnordenar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtnasc = new javax.swing.JRadioButton();
        rbtndesc = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbtnBubble = new javax.swing.JRadioButton();
        rbtnInsertion = new javax.swing.JRadioButton();
        jlbtitulo1 = new javax.swing.JLabel();
        jlbtitulo2 = new javax.swing.JLabel();
        jpgrafica = new javax.swing.JPanel();
        btnlimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlbtitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbtitulo.setText("Grafico");
        getContentPane().add(jlbtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicados/img/1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 48, 48));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese la ruta del archivo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 560, 20));

        btnexaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicados/img/examinar.png"))); // NOI18N
        btnexaminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexaminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexaminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnexaminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnexaminarMouseExited(evt);
            }
        });
        getContentPane().add(btnexaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 130, 40));

        btngenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicados/img/generar.png"))); // NOI18N
        btngenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngenerarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngenerarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngenerarMouseExited(evt);
            }
        });
        getContentPane().add(btngenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 130, 40));

        jtxtUrl.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        getContentPane().add(jtxtUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 510, -1));

        btnordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicados/img/ordenar.png"))); // NOI18N
        btnordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnordenarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnordenarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnordenarMouseExited(evt);
            }
        });
        getContentPane().add(btnordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 40));

        jPanel2.setBackground(new java.awt.Color(0, 116, 124));

        rbtnasc.setBackground(new java.awt.Color(0, 187, 201));
        btngroupDireccion.add(rbtnasc);
        rbtnasc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnasc.setForeground(new java.awt.Color(255, 255, 255));
        rbtnasc.setText("Ascendente");
        rbtnasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnascActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnasc);

        rbtndesc.setBackground(new java.awt.Color(0, 187, 201));
        btngroupDireccion.add(rbtndesc);
        rbtndesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtndesc.setForeground(new java.awt.Color(255, 255, 255));
        rbtndesc.setText("Desendente");
        rbtndesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtndescActionPerformed(evt);
            }
        });
        jPanel2.add(rbtndesc);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 160, 80));

        jPanel3.setBackground(new java.awt.Color(0, 116, 124));

        rbtnBubble.setBackground(new java.awt.Color(0, 187, 201));
        btngroupMetodo.add(rbtnBubble);
        rbtnBubble.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnBubble.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBubble.setText("Bubble Sort");
        rbtnBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBubbleActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnBubble);

        rbtnInsertion.setBackground(new java.awt.Color(0, 187, 201));
        btngroupMetodo.add(rbtnInsertion);
        rbtnInsertion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnInsertion.setForeground(new java.awt.Color(255, 255, 255));
        rbtnInsertion.setText("Insertion Sort");
        rbtnInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInsertionActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnInsertion);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 160, 80));

        jlbtitulo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbtitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbtitulo1.setText("Método de Orden:");
        getContentPane().add(jlbtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 170, 30));

        jlbtitulo2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbtitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jlbtitulo2.setText("Dirección de Orden:");
        getContentPane().add(jlbtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 170, 30));

        jpgrafica.setBackground(new java.awt.Color(0, 51, 51));
        jpgrafica.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jpgrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 590, 410));

        btnlimpiar.setText("limpi");
        btnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicados/img/bg.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        ImageIcon icon = new ImageIcon("src/practicados/img/2.png");
        jLabel3.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        ImageIcon icon = new ImageIcon("src/practicados/img/1.png");
        jLabel3.setIcon(icon);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        ImageIcon icon = new ImageIcon("src/practicados/img/3.png");
        jLabel3.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnexaminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexaminarMouseEntered
        ImageIcon icon = new ImageIcon("src/practicados/img/examinar 2.png");
        btnexaminar.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnexaminarMouseEntered

    private void btnexaminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexaminarMouseExited
        ImageIcon icon = new ImageIcon("src/practicados/img/examinar.png");
        btnexaminar.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnexaminarMouseExited

    private void btngenerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarMouseEntered
        ImageIcon icon = new ImageIcon("src/practicados/img/generar 2.png");
        btngenerar.setIcon(icon);

    }//GEN-LAST:event_btngenerarMouseEntered

    private void btngenerarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarMouseExited
        ImageIcon icon = new ImageIcon("src/practicados/img/generar.png");
        btngenerar.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_btngenerarMouseExited

    private void btnexaminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexaminarMouseClicked

        //Creamos el objeto file chooser
        JFileChooser buscador = new JFileChooser();

        buscador.setFileFilter(f);

        //comportamiento al seleccionar
        int respuesta = buscador.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivo = buscador.getSelectedFile();

            JOptionPane.showMessageDialog(null, "Archivo: " + archivo.getName() + ", cargado correctamente!", "Carga", JOptionPane.INFORMATION_MESSAGE);
            jtxtUrl.setText(archivo.getAbsolutePath());
        }


    }//GEN-LAST:event_btnexaminarMouseClicked

    private void btnordenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnordenarMouseEntered
        ImageIcon icon = new ImageIcon("src/practicados/img/ordenar2.png");
        btnordenar.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnordenarMouseEntered

    private void btnordenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnordenarMouseExited
        ImageIcon icon = new ImageIcon("src/practicados/img/ordenar.png");
        btnordenar.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnordenarMouseExited

//Metodo que carga los datos del CSV a la variable texto-----------------------------------------------------------------
    static String cargaDatos(File f) throws IOException {

        String texto = "";
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(f));
            String linea = br.readLine();

            while (linea != null) {
                texto += linea + "\n";
                linea = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Ocurrior un error");
        } finally {
            if (br != null) {
                br.close();
            }
        }

        return texto;
    }
//Metodo que agrega los valores a una matriz de String

    static String[][] CrearMatriz(String texto) {
        String filas[] = texto.split("\n");
        int num_colum = filas[0].split(",").length;

        String matriz[][] = new String[filas.length][num_colum];

        for (int i = 0; i < filas.length; i++) {

            String columnas[] = filas[i].split(",");
            for (int j = 0; j < columnas.length; j++) {
                matriz[i][j] = columnas[j];
            }
        }
        return matriz;
    }

    //Metodo que separa la matriz en vectores de string la primer columna
    static String[] separarNombre(String m[][]) {
        String vnombres[] = new String[m.length];
        for (int i = 1; i < m.length; i++) {
            vnombres[i] = m[i][0];
        }
        return vnombres;
    }

    //Metodo que separa la matriz en vectores de enteros la segunada columna
    static Integer[] separarCantidad(String m[][]) {
        Integer vcantidad[] = new Integer[m.length];
        for (int i = 1; i < m.length; i++) {
            vcantidad[i] = Integer.parseInt(m[i][1]);
        }

        return vcantidad;
    }


    private void btngenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarMouseClicked
        //METODO PARA GENERAR LA GRAFICA________________________________________/////////////////////////////////////////////////////////
        try {
            //Cargar los datos en un texto string 
            String tx = cargaDatos(archivo);
            System.out.println(tx);

            //Convertir los datos en una matriz de String
            m = CrearMatriz(tx);
            for (int i = 1; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            //Separa la matriz global en dos vectores de string y enteros
            System.out.println();
            nombre = separarNombre(m);
            for (int i = 1; i < m.length; i++) {
                System.out.print(nombre[i] + "\t ");
            }
            System.out.println();
            cantidad = separarCantidad(m);
            for (int i = 1; i < m.length; i++) {
                System.out.print(cantidad[i] + "\t");

            }
            jpgrafica.removeAll();
            generarGrafica();

        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btngenerarMouseClicked

    private void rbtnascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnascActionPerformed

    private void rbtndescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtndescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtndescActionPerformed

    private void rbtnBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBubbleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnBubbleActionPerformed

    private void rbtnInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInsertionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnInsertionActionPerformed

//METODO ORDENAR MATRIZ EN BURBBLE SORT-----------------------------------------------------------------------------
    public void ordenarMatrizBurbble() throws InterruptedException {

        hilo = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < cantidad.length; i++) {
                    System.out.print(cantidad[i] + nombre[i]);
                    generarGrafica();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (int j = 1; j < cantidad.length - 1; j++) {
                        if (cantidad[j] < cantidad[j + 1]) {
                            //Intercambio de valores enteros
                            Integer temp = cantidad[j];
                            cantidad[j] = cantidad[j + 1];
                            cantidad[j + 1] = temp;
                            //Intercambio de nombres
                            String tempnombre = nombre[j];
                            nombre[j] = nombre[j + 1];
                            nombre[j + 1] = tempnombre;
                        }
                    }
                    limpiarJpanel();
                }
            }
        };
        
        hilo.start();
    }
    //Metodo para generar la gráfica 

    public void generarGrafica() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for (int i = 1; i < cantidad.length; i++) {
            datos.setValue(cantidad[i], nombre[i], " ");
        }

        JFreeChart grafica_barras = ChartFactory.createBarChart("Habitantes", "Paises", "Cantidad", datos, PlotOrientation.VERTICAL, true, true, false);

        chpanel = new ChartPanel(grafica_barras);

        chpanel.setMouseWheelEnabled(true);
        chpanel.setPreferredSize(new Dimension(550, 400));

        jpgrafica.add(chpanel, BorderLayout.NORTH);

        pack();
        repaint();
        

        System.out.println("se genero la grafica");

    }

    void limpiarJpanel() {
        jpgrafica.removeAll();
        jpgrafica.revalidate();
    }

    private void btnordenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnordenarMouseClicked

        try {

            ordenarMatrizBurbble();

        } catch (InterruptedException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnordenarMouseClicked

    private void btnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarMouseClicked
        jpgrafica.removeAll();
        jpgrafica.revalidate();
        System.out.println("se limpia");


        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnexaminar;
    private javax.swing.JLabel btngenerar;
    private javax.swing.ButtonGroup btngroupDireccion;
    private javax.swing.ButtonGroup btngroupMetodo;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel btnordenar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbtitulo;
    private javax.swing.JLabel jlbtitulo1;
    private javax.swing.JLabel jlbtitulo2;
    protected static javax.swing.JPanel jpgrafica;
    private javax.swing.JTextField jtxtUrl;
    private javax.swing.JRadioButton rbtnBubble;
    private javax.swing.JRadioButton rbtnInsertion;
    private javax.swing.JRadioButton rbtnasc;
    private javax.swing.JRadioButton rbtndesc;
    // End of variables declaration//GEN-END:variables
}

class HiloBurbuja extends Thread {

//    View vg = new View();
    @Override
    public void run() {
    }

}
