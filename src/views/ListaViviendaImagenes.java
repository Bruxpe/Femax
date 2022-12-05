/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import clases.repositorios.ViviendaImagenesRepositorio;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.ViviendaImagenes;



/**
 *
 * @author j-aco
 */
public class ListaViviendaImagenes extends javax.swing.JFrame {

    String id="";
    File filesSelected[];
    ViviendaImagenesRepositorio viRepo = new ViviendaImagenesRepositorio();
    /**
     * Creates new form ViviendaImagenes
     */
    public ListaViviendaImagenes(String idVivienda) {
        initComponents();
        id = idVivienda;
        cargarImagenes();
        
    }
    
    public void cargarImagenes(){
        
        List<ViviendaImagenes> lista = viRepo.List(Integer.parseInt(id));
        DefaultListModel demoList = new DefaultListModel();
 
        for(ViviendaImagenes item:lista){
            System.out.println(item.imagen);
            demoList.addElement(item.imagen);
            //lstImgs.add(item.imagen,this.lstImgs);
            //lstImgs.add(item.imagen);
        }
        lstImgs.setModel(demoList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        btnUploadImages = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstImgs = new javax.swing.JList<>();
        lblCountImagesSelected = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Imágenes");

        btnUploadImages.setText("Abrir");
        btnUploadImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImagesActionPerformed(evt);
            }
        });

        btnSave.setEnabled(false);
        btnSave.setLabel("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Imagen");

        lstImgs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstImgsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstImgs);

        lblCountImagesSelected.setForeground(new java.awt.Color(0, 153, 0));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblCountImagesSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSave)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnUploadImages))
                                    .addComponent(jButton1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(202, 202, 202)))))
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblCountImagesSelected)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUploadImages))
                                .addGap(23, 23, 23)
                                .addComponent(btnSave)
                                .addGap(24, 24, 24)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImagesActionPerformed
        // TODO add your handling code here:
        lblCountImagesSelected.setText("");
        btnSave.setEnabled(false);
        JFileChooser j = new JFileChooser();
 
        // Open the save dialog
        j.setMultiSelectionEnabled(true);
        j.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // get the Selected files
            File files[] = j.getSelectedFiles();
            filesSelected = files;
 
            if(files.length==0){
                JOptionPane.showMessageDialog(null, "No seleciono ninguna imagen");
                
            }else{
                
                btnSave.setEnabled(true);
                lblCountImagesSelected.setText(files.length+" "+"imagenes seleccionadas");
                // set the label to the path of the selected files
                
            }
            
            
                    
        }
        // if the user cancelled the operation
        //else{           
        //}
        
       
    }//GEN-LAST:event_btnUploadImagesActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        BufferedImage bi;
        int t = 0;
        for(File f: filesSelected){
            //l.setText(l.getText() + " " + files[t - 1].getName());
            System.out.println("img "+f.getName());
            try {
                System.out.println("llego");
                bi = ImageIO.read(f);
                System.out.println("llego2");
                String fileName = id+"-"+f.getName();
                System.out.println("llego3");
                
                String extension = "";

                int i = fileName.lastIndexOf('.');
                if (i > 0) {
                    extension = fileName.substring(i+1);
                }
                ImageIO.write(bi, extension, new File("C://Users//j-aco//OneDrive//Documentos//NetBeansProjects//Femax Trabajo FInal//src//Imagenes//viviendas//"+fileName));
                System.out.println("llego4");
                ViviendaImagenes vi = new ViviendaImagenes();
                vi.id_vivienda = Integer.parseInt(id);
                vi.imagen = fileName;
                System.out.println("llego5");
                vi = viRepo.crearViviendaImagenes(vi);
                if(vi == null){
                    JOptionPane.showMessageDialog(null, "No se pudo insertar la imagen");
                }
                else{
                    cargarImagenes();
                }
            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "No se pudo insertar la imagen");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lstImgsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstImgsMouseClicked
        // TODO add your handling code here:
        //System.out.println("value "+lstImgs.getSelectedValue());
        Image img = new ImageIcon("C://Users//j-aco//OneDrive//Documentos//NetBeansProjects//Femax Trabajo FInal//src//Imagenes//viviendas//"+lstImgs.getSelectedValue()).getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon imgIcon = new ImageIcon(img);
        //lblImg = new JLabel("",img,JLabel.CENTER);
        lblImg.setIcon(imgIcon);
    }//GEN-LAST:event_lstImgsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViviendaImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViviendaImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViviendaImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViviendaImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaViviendaImagenes("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadImages;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountImagesSelected;
    private javax.swing.JLabel lblImg;
    private javax.swing.JList<String> lstImgs;
    // End of variables declaration//GEN-END:variables
}
