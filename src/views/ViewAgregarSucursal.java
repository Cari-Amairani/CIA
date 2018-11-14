/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Octaviano
 */
public class ViewAgregarSucursal extends javax.swing.JPanel {

    /**
     * Creates new form ViewAgregarSucursal
     */
    public ViewAgregarSucursal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_titulo = new javax.swing.JPanel();
        jl_titulo = new javax.swing.JLabel();
        jp_datos = new javax.swing.JPanel();
        jl_telefono = new javax.swing.JLabel();
        jtf_numero = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jl_no_sucursal = new javax.swing.JLabel();
        jtf_no_sucursal = new javax.swing.JTextField();
        jtf_colonia = new javax.swing.JTextField();
        jtf_calle = new javax.swing.JTextField();
        jl_calle = new javax.swing.JLabel();
        jl_numero = new javax.swing.JLabel();
        jl_colonia = new javax.swing.JLabel();
        jl_buscar = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_vista = new javax.swing.JTable();
        jp_botones = new javax.swing.JPanel();
        jb_nuevo = new javax.swing.JButton();
        jl_nuevo = new javax.swing.JLabel();
        jb_modificar = new javax.swing.JButton();
        jl_modificar = new javax.swing.JLabel();
        jb_eliminar = new javax.swing.JButton();
        jl_eliminar = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jl_guadar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRequestFocusEnabled(false);

        jp_titulo.setBackground(new java.awt.Color(153, 204, 255));

        jl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(102, 102, 102));
        jl_titulo.setText("Agregar sucursal");

        javax.swing.GroupLayout jp_tituloLayout = new javax.swing.GroupLayout(jp_titulo);
        jp_titulo.setLayout(jp_tituloLayout);
        jp_tituloLayout.setHorizontalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_tituloLayout.setVerticalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_titulo)
        );

        jp_datos.setBackground(new java.awt.Color(255, 255, 255));
        jp_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        jl_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_telefono.setForeground(new java.awt.Color(51, 51, 51));
        jl_telefono.setText("Telefono:");

        jl_no_sucursal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_no_sucursal.setForeground(new java.awt.Color(51, 51, 51));
        jl_no_sucursal.setText("No. sucursal:");

        jtf_no_sucursal.setEditable(false);

        jl_calle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_calle.setForeground(new java.awt.Color(51, 51, 51));
        jl_calle.setText("Calle:");

        jl_numero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_numero.setForeground(new java.awt.Color(51, 51, 51));
        jl_numero.setText("Numero:");

        jl_colonia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_colonia.setForeground(new java.awt.Color(51, 51, 51));
        jl_colonia.setText("Colonia:");

        javax.swing.GroupLayout jp_datosLayout = new javax.swing.GroupLayout(jp_datos);
        jp_datos.setLayout(jp_datosLayout);
        jp_datosLayout.setHorizontalGroup(
            jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_datosLayout.createSequentialGroup()
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_calle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_datosLayout.createSequentialGroup()
                                .addComponent(jl_telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jp_datosLayout.createSequentialGroup()
                                    .addComponent(jl_colonia)
                                    .addGap(196, 196, 196))
                                .addComponent(jtf_colonia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_datosLayout.createSequentialGroup()
                                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_calle)
                                    .addComponent(jl_numero)
                                    .addComponent(jl_no_sucursal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_no_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(27, 27, 27))
        );
        jp_datosLayout.setVerticalGroup(
            jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_datosLayout.createSequentialGroup()
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_no_sucursal)
                    .addComponent(jtf_no_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_calle))
                .addGap(18, 18, 18)
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_colonia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero)
                    .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefono)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jl_buscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_buscar.setForeground(new java.awt.Color(102, 153, 255));
        jl_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar .png"))); // NOI18N
        jl_buscar.setText("buscar por numero de sucursal:");

        jt_vista.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jt_vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No  Sucursal", "Calle", "Colonia", "Numero", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jt_vista);

        jp_botones.setBackground(new java.awt.Color(255, 255, 51));

        jb_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo.png"))); // NOI18N

        jl_nuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_nuevo.setForeground(new java.awt.Color(51, 51, 51));
        jl_nuevo.setText("Nuevo");

        jb_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modificar.png"))); // NOI18N

        jl_modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_modificar.setForeground(new java.awt.Color(51, 51, 51));
        jl_modificar.setText("Modificar");

        jb_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N

        jl_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_eliminar.setForeground(new java.awt.Color(51, 51, 51));
        jl_eliminar.setText("Eliminar");

        jb_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jl_guadar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_guadar.setForeground(new java.awt.Color(51, 51, 51));
        jl_guadar.setText("Guardar");

        javax.swing.GroupLayout jp_botonesLayout = new javax.swing.GroupLayout(jp_botones);
        jp_botones.setLayout(jp_botonesLayout);
        jp_botonesLayout.setHorizontalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_botonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_modificar))
                .addGap(195, 195, 195))
            .addGroup(jp_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_guadar))
                .addGap(59, 59, 59)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_botonesLayout.setVerticalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_modificar)
                    .addComponent(jl_nuevo))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_eliminar))
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jl_guadar))
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 604, Short.MAX_VALUE)
                        .addComponent(jl_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)))
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jb_eliminar;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_modificar;
    public javax.swing.JButton jb_nuevo;
    private javax.swing.JLabel jl_buscar;
    public javax.swing.JLabel jl_calle;
    public javax.swing.JLabel jl_colonia;
    public javax.swing.JLabel jl_eliminar;
    public javax.swing.JLabel jl_guadar;
    public javax.swing.JLabel jl_modificar;
    public javax.swing.JLabel jl_no_sucursal;
    public javax.swing.JLabel jl_nuevo;
    public javax.swing.JLabel jl_numero;
    public javax.swing.JLabel jl_telefono;
    public javax.swing.JLabel jl_titulo;
    public javax.swing.JPanel jp_botones;
    public javax.swing.JPanel jp_datos;
    private javax.swing.JPanel jp_titulo;
    public javax.swing.JTable jt_vista;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_calle;
    public javax.swing.JTextField jtf_colonia;
    public javax.swing.JTextField jtf_no_sucursal;
    public javax.swing.JTextField jtf_numero;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
