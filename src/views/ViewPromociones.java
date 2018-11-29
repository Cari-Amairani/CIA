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
public class ViewPromociones extends javax.swing.JPanel {

    /**
     * Creates new form ViewAgregarSucursal
     */
    public ViewPromociones() {
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
        jp_datos1 = new javax.swing.JPanel();
        jl_telefono1 = new javax.swing.JLabel();
        jtf_numero1 = new javax.swing.JTextField();
        jtf_telefono1 = new javax.swing.JTextField();
        jl_no_sucursal1 = new javax.swing.JLabel();
        jtf_no_promocion = new javax.swing.JTextField();
        jtf_colonia1 = new javax.swing.JTextField();
        jtf_causa = new javax.swing.JTextField();
        jl_calle1 = new javax.swing.JLabel();
        jl_numero1 = new javax.swing.JLabel();
        jl_colonia1 = new javax.swing.JLabel();
        jcb_buscar = new javax.swing.JComboBox<>();
        jl_calle = new javax.swing.JLabel();
        jl_colonia = new javax.swing.JLabel();
        jDC_fe_inicio = new com.toedter.calendar.JDateChooser();
        jDC_fe_final = new com.toedter.calendar.JDateChooser();
        jp_productos = new javax.swing.JPanel();
        jl_codigo_producto = new javax.swing.JLabel();
        jl_nombre_producto = new javax.swing.JLabel();
        jtf_nombre_producto = new javax.swing.JTextField();
        jl_marca_producto = new javax.swing.JLabel();
        jtf_marca_producto = new javax.swing.JTextField();
        jcb_codigo_producto = new javax.swing.JComboBox<>();
        jl_tipo_producto = new javax.swing.JLabel();
        jtf_tipo_producto = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1059, 707));
        setMinimumSize(new java.awt.Dimension(1059, 707));
        setPreferredSize(new java.awt.Dimension(1059, 707));
        setRequestFocusEnabled(false);

        jp_titulo.setBackground(new java.awt.Color(153, 204, 255));

        jl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(102, 102, 102));
        jl_titulo.setText("Promociones");

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

        jl_buscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_buscar.setForeground(new java.awt.Color(102, 153, 255));
        jl_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar .png"))); // NOI18N

        jt_vista.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jt_vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "numero promocion", "causa", "descuento promocion", "costo con descuento", "unidad de medida", "codigo producto", "nombre del producto", "fecha inicio", "fecha final"
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
                .addGap(18, 18, 18)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_modificar))
                .addGap(18, 18, 18)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_guadar))
                .addGap(26, 26, 26)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_eliminar))
                .addGap(42, 42, 42))
        );
        jp_botonesLayout.setVerticalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_modificar)
                            .addComponent(jl_nuevo)))
                    .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp_botonesLayout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jl_guadar))
                        .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_eliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_datos1.setBackground(new java.awt.Color(255, 255, 255));
        jp_datos1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos promocion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        jl_telefono1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_telefono1.setForeground(new java.awt.Color(51, 51, 51));
        jl_telefono1.setText("unidad de medida:");

        jl_no_sucursal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_no_sucursal1.setForeground(new java.awt.Color(51, 51, 51));
        jl_no_sucursal1.setText("No. promocion:");

        jtf_no_promocion.setEditable(false);

        jl_calle1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_calle1.setForeground(new java.awt.Color(51, 51, 51));
        jl_calle1.setText("causa:");

        jl_numero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_numero1.setForeground(new java.awt.Color(51, 51, 51));
        jl_numero1.setText("costo con descuento:");

        jl_colonia1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_colonia1.setForeground(new java.awt.Color(51, 51, 51));
        jl_colonia1.setText("descuento:");

        javax.swing.GroupLayout jp_datos1Layout = new javax.swing.GroupLayout(jp_datos1);
        jp_datos1.setLayout(jp_datos1Layout);
        jp_datos1Layout.setHorizontalGroup(
            jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_datos1Layout.createSequentialGroup()
                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_datos1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_causa, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_datos1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_datos1Layout.createSequentialGroup()
                                .addComponent(jl_telefono1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_datos1Layout.createSequentialGroup()
                                .addComponent(jl_numero1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jp_datos1Layout.createSequentialGroup()
                                    .addComponent(jl_colonia1)
                                    .addGap(196, 196, 196))
                                .addComponent(jtf_colonia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_datos1Layout.createSequentialGroup()
                                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_calle1)
                                    .addComponent(jl_no_sucursal1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_no_promocion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))))
                .addGap(27, 27, 27))
        );
        jp_datos1Layout.setVerticalGroup(
            jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_datos1Layout.createSequentialGroup()
                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_no_sucursal1)
                    .addComponent(jtf_no_promocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_causa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_calle1))
                .addGap(18, 18, 18)
                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_colonia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_colonia1))
                .addGap(18, 18, 18)
                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero1)
                    .addComponent(jtf_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefono1)
                    .addComponent(jtf_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jcb_buscar.setBackground(new java.awt.Color(153, 204, 255));
        jcb_buscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jcb_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo producto", "numero sucursal", " ", " " }));

        jl_calle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_calle.setForeground(new java.awt.Color(51, 51, 51));
        jl_calle.setText("fecha inicio:");

        jl_colonia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_colonia.setForeground(new java.awt.Color(51, 51, 51));
        jl_colonia.setText("fecha final:");

        jp_productos.setBackground(new java.awt.Color(255, 255, 255));
        jp_productos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 153, 255))); // NOI18N
        jp_productos.setForeground(new java.awt.Color(51, 153, 255));

        jl_codigo_producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_codigo_producto.setText("Codigo producto:");

        jl_nombre_producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_nombre_producto.setText("Nombre producto:");

        jtf_nombre_producto.setEditable(false);

        jl_marca_producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_marca_producto.setText(" Marca producto:");

        jtf_marca_producto.setEditable(false);

        jcb_codigo_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jl_tipo_producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_tipo_producto.setText("Costo sin descuento:");

        jtf_tipo_producto.setEditable(false);

        javax.swing.GroupLayout jp_productosLayout = new javax.swing.GroupLayout(jp_productos);
        jp_productos.setLayout(jp_productosLayout);
        jp_productosLayout.setHorizontalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jl_marca_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_marca_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jl_codigo_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addComponent(jl_tipo_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_tipo_producto)
                .addGap(31, 31, 31))
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_nombre_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nombre_producto))
        );
        jp_productosLayout.setVerticalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_codigo_producto)
                    .addComponent(jcb_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre_producto)
                    .addComponent(jtf_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_marca_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_marca_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_tipo_producto)
                    .addComponent(jtf_tipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                                .addComponent(jl_buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_colonia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDC_fe_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_calle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDC_fe_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jl_buscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDC_fe_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_calle))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_colonia)
                                    .addComponent(jDC_fe_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jp_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28))))
                    .addComponent(jp_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser jDC_fe_final;
    public com.toedter.calendar.JDateChooser jDC_fe_inicio;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jb_eliminar;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_modificar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JComboBox<String> jcb_buscar;
    public javax.swing.JComboBox<String> jcb_codigo_producto;
    private javax.swing.JLabel jl_buscar;
    public javax.swing.JLabel jl_calle;
    public javax.swing.JLabel jl_calle1;
    public javax.swing.JLabel jl_codigo_producto;
    public javax.swing.JLabel jl_colonia;
    public javax.swing.JLabel jl_colonia1;
    public javax.swing.JLabel jl_eliminar;
    public javax.swing.JLabel jl_guadar;
    public javax.swing.JLabel jl_marca_producto;
    public javax.swing.JLabel jl_modificar;
    public javax.swing.JLabel jl_no_sucursal1;
    public javax.swing.JLabel jl_nombre_producto;
    public javax.swing.JLabel jl_nuevo;
    public javax.swing.JLabel jl_numero1;
    public javax.swing.JLabel jl_telefono1;
    public javax.swing.JLabel jl_tipo_producto;
    public javax.swing.JLabel jl_titulo;
    public javax.swing.JPanel jp_botones;
    public javax.swing.JPanel jp_datos1;
    public javax.swing.JPanel jp_productos;
    private javax.swing.JPanel jp_titulo;
    public javax.swing.JTable jt_vista;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_causa;
    public javax.swing.JTextField jtf_colonia1;
    public javax.swing.JTextField jtf_marca_producto;
    public javax.swing.JTextField jtf_no_promocion;
    public javax.swing.JTextField jtf_nombre_producto;
    public javax.swing.JTextField jtf_numero1;
    public javax.swing.JTextField jtf_telefono1;
    public javax.swing.JTextField jtf_tipo_producto;
    // End of variables declaration//GEN-END:variables
}
