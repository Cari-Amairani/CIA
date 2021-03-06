/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import models.modelVENTAS;
import views.ViewVENTAS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Octaviano
 */
public class ControllerVENTAS {
    modelVENTAS modelVENTAS;
    ViewVENTAS viewVENTAS;

    ActionListener list = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewVENTAS.jcb_rfc){
                modelVENTAS.setRFC_empleado((String) viewVENTAS.jcb_rfc.getSelectedItem());
                modelVENTAS.llenarTextFieldsEmpleados();
                viewVENTAS.jtf_nombre_empleado.setText(modelVENTAS.getNombre_empleado()+"  "+modelVENTAS.getApellido_pat_empleado()+"  "+modelVENTAS.getApellido_mat_empleado());
                viewVENTAS.jcb_numero_sucursal.setEnabled(true);//habilitando jcb numero sucursal
            }else if (e.getSource() == viewVENTAS.jcb_numero_sucursal){
                viewVENTAS.jcb_rfc_cliente.setEnabled(true);//habilitando jcb numero sucursal
            }else if (e.getSource() == viewVENTAS.jcb_rfc_cliente){
                modelVENTAS.setRFC_cliente((String) viewVENTAS.jcb_rfc_cliente.getSelectedItem());
                modelVENTAS.llenarTextFieldsClientes();
                viewVENTAS.jtf_nombre_cliente.setText(modelVENTAS.getNombre_cliente()+"  "+modelVENTAS.getApell_pat_cliente()+"  "+modelVENTAS.getApell_mat_cliente());
                viewVENTAS.jtf_puntos_acumulados.setText(Integer.toString(modelVENTAS.getPuntos_acumulados()));
                viewVENTAS.jcb_codigo_producto.setEnabled(true);
            }else if (e.getSource() == viewVENTAS.jcb_codigo_producto){
                Productos();
                viewVENTAS.jb_agregar.setEnabled(true);
            }else if (e.getSource() == viewVENTAS.jcb_codigo_descuento){
                modelVENTAS.setCodigo_descuento(Integer.parseInt((String) viewVENTAS.jcb_codigo_descuento.getSelectedItem()));
                modelVENTAS.llenarTextFieldsDescuentos();
                viewVENTAS.jtf_puntos_requeridos.setText(Integer.toString(modelVENTAS.getCantidad_puntos()));
                viewVENTAS.jtf_porcentaje.setText(Integer.toString(modelVENTAS.getPorcentaje()));
                viewVENTAS.jb_aplicar_descuento.setEnabled(true);
            }else if (e.getSource() == viewVENTAS.jb_agregar){
                jtf_agregar();
            }else if(e.getSource() == viewVENTAS.jb_aplicar_descuento){
                descuento();
            }else if(e.getSource() == viewVENTAS.jb_nuevo){
                nuevo();
                viewVENTAS.jb_nuevo.setEnabled(false);
            }else if(e.getSource() == viewVENTAS.jb_eliminar){
                eliminar();
                viewVENTAS.jb_eliminar.setEnabled(false);
            }else if(e.getSource() == viewVENTAS.jb_modificar){
                modificar();
                viewVENTAS.jb_modificar.setEnabled(false);
            }else if(e.getSource() == viewVENTAS.jb_realizar_venta){
                PuntosGanados();
                realizarCompra();
            }
        }
        
    };
    MouseListener ml = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == viewVENTAS.jt_vista) {
                jt_vista_MouseClicked();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
          
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }    
        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    };
    KeyListener key = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
    
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
           if (e.getSource() == viewVENTAS.jtf_cantidad){
               totalProducto();
            }else if (e.getSource() == viewVENTAS.jtf_efectivo){
            try{
                modelVENTAS.setEfectivo(Float.parseFloat(viewVENTAS.jtf_efectivo.getText()));
                modelVENTAS.Cambio();
                viewVENTAS.jtf_cambio.setText(Float.toString(modelVENTAS.getCambio()));
            }catch(Exception key){
                 System.out.println("error ignorado Cambio");
            } 
            }
        }    
    };
    
    public ControllerVENTAS(modelVENTAS modelVENTAS, ViewVENTAS viewVENTAS) {
        this.modelVENTAS = modelVENTAS;
        this.viewVENTAS = viewVENTAS;
        
        viewVENTAS.jtf_cantidad.addKeyListener(key);
        viewVENTAS.jtf_efectivo.addKeyListener(key);
        this.viewVENTAS.jt_vista.addMouseListener(ml);//agregar a la table el evento de MouseListener
        
        modelVENTAS.Conectar();//Llamar a la conexion a la Base de datos 
        LimpiarCombox();
        LlenarCombox();
        setActionListener(); 
        deshabiltarObjetos();
        
        // obetner el numero de venta y mostrarlo
        modelVENTAS.numeroVentas();
        viewVENTAS.jtf_numero_venta.setText(Integer.toString(modelVENTAS.getNumero_venta()));
        viewVENTAS.jt_vista.setModel(modelVENTAS.getModel_ventas());//agrenado modelo a la tabla
        
    }
    /**
     * agregar el evento de ActionListener a los ComboBox y a los botones de la vista Ventas
     */
    public void setActionListener(){
       viewVENTAS.jcb_codigo_producto.addActionListener(list);
       viewVENTAS.jcb_numero_sucursal.addActionListener(list);
       viewVENTAS.jcb_rfc.addActionListener(list);
       viewVENTAS.jcb_rfc_cliente.addActionListener(list);
       viewVENTAS.jcb_codigo_descuento.addActionListener(list);
       //Botones 
       viewVENTAS.jb_agregar.addActionListener(list);
       viewVENTAS.jb_nuevo.addActionListener(list);
       viewVENTAS.jb_eliminar.addActionListener(list);
       viewVENTAS.jb_modificar.addActionListener(list);
       viewVENTAS.jb_aplicar_descuento.addActionListener(list);
       viewVENTAS.jb_realizar_venta.addActionListener(list);
    }
     public void deshabiltarObjetos(){
        viewVENTAS.jcb_numero_sucursal.setEnabled(false);
        viewVENTAS.jcb_rfc_cliente.setEnabled(false);
        viewVENTAS.jcb_codigo_producto.setEnabled(false);
        viewVENTAS.jcb_codigo_descuento.setEnabled(false);
        //Deshabilitar cajas de texto
        viewVENTAS.jtf_cantidad.setEditable(false);
        viewVENTAS.jtf_precio.setEditable(false);
        //Deshablitar botones
        viewVENTAS.jb_agregar.setEnabled(false);
        viewVENTAS.jb_modificar.setEnabled(false);
        viewVENTAS.jb_nuevo.setEnabled(false);
        viewVENTAS.jb_realizar_venta.setEnabled(false);
        viewVENTAS.jb_eliminar.setEnabled(false);
        viewVENTAS.jb_aplicar_descuento.setEnabled(false);
        //Deshabilitando la tabla de compras 
        viewVENTAS.jt_vista.setEnabled(false);
    }
     //************************************ BOTONES DE NUEVO, AGREGAR, Eliminar ***********************************************
    public void nuevo(){
        viewVENTAS.jtf_nombre_producto.setText("  ");
        viewVENTAS.jtf_tipo_producto.setText(" ");
        viewVENTAS.jtf_marca_producto.setText(" ");
        viewVENTAS.jtf_cantidad.setText("0");
        viewVENTAS.jtf_precio.setText("0.0");
        viewVENTAS.jtf_total.setText("0.0");
        viewVENTAS.jb_agregar.setEnabled(false);
        viewVENTAS.jb_modificar.setEnabled(false);
        viewVENTAS.jb_eliminar.setEnabled(false);
        viewVENTAS.jtf_cantidad.setEditable(true);
        viewVENTAS.jcb_codigo_producto.setEnabled(true);
    }
    /**
     * metodo que sirve para eliminar una fila seleccionda dentro de la tabla
     */
    public void eliminar(){
        modelVENTAS.getModel_ventas().removeRow(viewVENTAS.jt_vista.getSelectedRow()); //eliina la fila seleccionada en la jtable
        //volviando a calcular el importe
        float fila=0;
        float total=0;
        for (int i = 0; i < viewVENTAS.jt_vista.getRowCount(); i++){
            fila = Float.parseFloat(viewVENTAS.jt_vista.getValueAt(i,6).toString());
            total += fila;    
        }
        modelVENTAS.setImporte(total);
        modelVENTAS.importe();
        viewVENTAS.jtf_importe.setText(Float.toString(modelVENTAS.getImporte()));
        viewVENTAS.jtf_iva.setText(Float.toString(modelVENTAS.getIva()));
        viewVENTAS.jtf_subtotal.setText(Float.toString(modelVENTAS.getSubtotal())); 
        viewVENTAS.jb_eliminar.setEnabled(false);
        viewVENTAS.jb_nuevo.setEnabled(false);
    }
    public void modificar(){
        eliminar();
        jtf_agregar();
    }
    /**
     * Metodo que limpiara los ComboBox de la vista VENTAS
     */
    public void LimpiarCombox(){
       viewVENTAS.jcb_codigo_producto.removeAllItems();
       viewVENTAS.jcb_numero_sucursal.removeAllItems();
       viewVENTAS.jcb_rfc.removeAllItems();
       viewVENTAS.jcb_rfc_cliente.removeAllItems();
       viewVENTAS.jcb_codigo_descuento.removeAllItems();
    }
    /**
     * Metodo que realizara el llenado de los ComboBox con los datos corespondientes 
     * obtenidos de la base de datos 
     */
    public void LlenarCombox(){
        modelVENTAS.llenarCombo();//metodo en el modelo para llenar los comboBox
        for (int p = 0; p < modelVENTAS.getNumero_empleado().size(); p++) {
            viewVENTAS.jcb_rfc.addItem((String) modelVENTAS.getNumero_empleado().get(p));
        }
        for (int p = 0; p < modelVENTAS.getNumero_sucursal().size(); p++) {
            viewVENTAS.jcb_numero_sucursal.addItem((String) modelVENTAS.getNumero_sucursal().get(p));
        }
        for (int p = 0; p < modelVENTAS.getProducto().size(); p++) {
            viewVENTAS.jcb_codigo_producto.addItem((String) modelVENTAS.getProducto().get(p));
        }
        for (int p = 0; p < modelVENTAS.getNumero_cliente().size(); p++) {
            viewVENTAS.jcb_rfc_cliente.addItem((String) modelVENTAS.getNumero_cliente().get(p));
        }
        for (int p = 0; p < modelVENTAS.getDescuento_combo().size(); p++) {
            viewVENTAS.jcb_codigo_descuento.addItem((String) modelVENTAS.getDescuento_combo().get(p));
        }
    }
    /**
     * este metodo realizara  las siguientes acciones 
     * 1. llenara los textFields con los datos que le correspondan segun el item seleccionado en el ComboBox
     * 2. identificara si el producto seleccionado esta en venta 
     * 3. si el producto no esta en venta notificara que el producto no se puede vender 
     * 4. identificara si el producto seleccionado esta en promociones
     * 5. si el producto esta en promociones aplicara el descuento que le corresponda 
     * 6. verificar con la fecha final de la promocion, para verificar si todavia es aplicable
     */
    public void Productos(){
        viewVENTAS.jcb_numero_sucursal.setEnabled(false);
        viewVENTAS.jcb_rfc_cliente.setEnabled(false);
        viewVENTAS.jcb_rfc.setEnabled(false);
        viewVENTAS.jb_agregar.setEnabled(false);
        viewVENTAS.jt_vista.setEnabled(true);
        viewVENTAS.jtf_cantidad.setEditable(true);
        modelVENTAS.setCodigo_producto((String) viewVENTAS.jcb_codigo_producto.getSelectedItem());
        modelVENTAS.setCodigo_producto_Promo((String) viewVENTAS.jcb_codigo_producto.getSelectedItem());
        modelVENTAS.llenarTextFieldsProductos();
        viewVENTAS.jtf_cantidad.setText("1");
        viewVENTAS.jtf_nombre_producto.setText(modelVENTAS.getNombre_producto());
        viewVENTAS.jtf_tipo_producto.setText(modelVENTAS.getTipo_producto());
        viewVENTAS.jtf_marca_producto.setText(modelVENTAS.getMarca_producto());
        viewVENTAS.jl_status_producto.setText(modelVENTAS.getStatus_vista());
        viewVENTAS.jtf_precio.setText(Float.toString(modelVENTAS.getPrecio_venta()));
        totalProducto();
        
    }
    /**
     * metodo que al haer clic en una fila de la tabla, pasara cada dato en sus Jtf correspondientes 
     * para poder modificar o eliminar la fila seleccionada
     */
    public void jt_vista_MouseClicked(){
        modelVENTAS.setRec(viewVENTAS.jt_vista.getSelectedRow());//a la variable se le asigna el elemento seleccionado en la tabla
        viewVENTAS.jcb_codigo_producto.setSelectedItem(viewVENTAS.jt_vista.getValueAt(modelVENTAS.getRec(), 1).toString());
        viewVENTAS.jtf_nombre_producto.setText(viewVENTAS.jt_vista.getValueAt(modelVENTAS.getRec(), 2).toString());
        viewVENTAS.jtf_marca_producto.setText(viewVENTAS.jt_vista.getValueAt(modelVENTAS.getRec(), 3).toString());
        viewVENTAS.jtf_precio.setText(viewVENTAS.jt_vista.getValueAt(modelVENTAS.getRec(), 4).toString());
        viewVENTAS.jtf_cantidad.setText(viewVENTAS.jt_vista.getValueAt(modelVENTAS.getRec(), 5).toString());
        viewVENTAS.jtf_total.setText(viewVENTAS.jt_vista.getValueAt(modelVENTAS.getRec(), 6).toString());
        viewVENTAS.jb_modificar.setEnabled(true);
        viewVENTAS.jb_eliminar.setEnabled(true);
        viewVENTAS.jb_agregar.setEnabled(false);
    }
    /***
     * el siguiente metodo mandara a las variables dentro del modelo el valor de la cajas de precio y cantidad
     * de la venta
     * y recibira el total por producto para mandarlo a la caja que mostrara el total por producto
     */
    public void totalProducto(){
       try{
        modelVENTAS.setCantidad_venta(Integer.parseInt(viewVENTAS.jtf_cantidad.getText()));
        modelVENTAS.setPrecio_venta(Float.parseFloat(viewVENTAS.jtf_precio.getText()));
        modelVENTAS.TotalProductoVendido();
        viewVENTAS.jtf_total.setText(Float.toString(modelVENTAS.getTotal_por_producto()));
        }catch(Exception e){
            System.out.println("error ignorado Total Producto");
        } 
    }
    /**
     * metodo que llenara la tabla con cada producto vendido e ira calculando el importe
     */
    public void AgregarDatosVenta(){
        modelVENTAS.setNumero_venta(Integer.parseInt(viewVENTAS.jtf_numero_venta.getText()));
        modelVENTAS.setCodigo_producto((String) viewVENTAS.jcb_codigo_producto.getSelectedItem());
        modelVENTAS.setNombre_producto(viewVENTAS.jtf_nombre_producto.getText());
        modelVENTAS.setMarca_producto(viewVENTAS.jtf_marca_producto.getText());
        modelVENTAS.setPrecio_venta(Float.parseFloat(viewVENTAS.jtf_precio.getText()));
        modelVENTAS.setCantidad_venta(Integer.parseInt(viewVENTAS.jtf_cantidad.getText()));
        modelVENTAS.setTotal_por_producto(Float.parseFloat(viewVENTAS.jtf_total.getText()));
        modelVENTAS.AgregarDatosVenta();
        
        // ****************************** Calculando el importe ************************* 
        //haciendo la suma de toda la columna de total por producto
        float fila=0f;
        float total=0f;
        for (int i = 0; i < viewVENTAS.jt_vista.getRowCount(); i++){
            fila = Float.parseFloat(viewVENTAS.jt_vista.getValueAt(i,6).toString());
            total += fila;    
        }
        modelVENTAS.setImporte(total);
        modelVENTAS.setRFC_cliente((String) viewVENTAS.jcb_rfc_cliente.getSelectedItem());
        modelVENTAS.importe();
        viewVENTAS.jtf_importe.setText(Float.toString(modelVENTAS.getImporte()));
        viewVENTAS.jtf_iva.setText(Float.toString(modelVENTAS.getIva()));
        viewVENTAS.jtf_subtotal.setText(Float.toString(modelVENTAS.getSubtotal())); 
        viewVENTAS.jtf_puntos_ganados.setText(Integer.toString(modelVENTAS.getPuntos_ganados()));
        
        viewVENTAS.jb_agregar.setEnabled(false);
        viewVENTAS.jb_nuevo.setEnabled(true);
    }
    /**
     * metodo que evalua si el producto esta en venta, o no 
     * si el producto ya no esta en venta, no dejara que se agrege a la venta
     */
    public void jtf_agregar(){
        switch (modelVENTAS.getStatus_producto()) {
            case "en venta":
               AgregarDatosVenta();
               viewVENTAS.jcb_codigo_producto.setEnabled(false);
                break;
            case "ya no se maneja":
                JOptionPane.showMessageDialog(null,"no se puede vender este producto");
                viewVENTAS.jcb_codigo_producto.setEnabled(true);
                break;
            case "Producto en **Promocion**":
                AgregarDatosVenta();
                viewVENTAS.jcb_codigo_producto.setEnabled(false);
                break;
        }
        viewVENTAS.jtf_cantidad.setEditable(false);
        viewVENTAS.jcb_codigo_descuento.setEnabled(true);
        viewVENTAS.jb_realizar_venta.setEnabled(true);
        viewVENTAS.jt_vista.setEnabled(true);
        viewVENTAS.jtf_nombre_producto.setText("  ");
        viewVENTAS.jtf_tipo_producto.setText(" ");
        viewVENTAS.jtf_marca_producto.setText(" ");
        viewVENTAS.jtf_cantidad.setText("0");
        viewVENTAS.jtf_precio.setText("0.0");
        viewVENTAS.jtf_total.setText("0.0");
        viewVENTAS.jl_status_producto.setText("Normal");
    }
    /**
     * Metodo que manda a llamar el metodo para aplicar el descuento si el cliente
     * cumple con los puntos requeridos de lo contrario, no se aplicara el descuento deseado
     */
    public void descuento(){
        modelVENTAS.setPorcentaje(Integer.parseInt(viewVENTAS.jtf_porcentaje.getText()));
        modelVENTAS.setImporte(Float.parseFloat(viewVENTAS.jtf_importe.getText()));
        modelVENTAS.DescuentoImporte();
        viewVENTAS.jtf_descuento.setText(Float.toString(modelVENTAS.getDescuento()));
        viewVENTAS.jtf_importe.setText(Float.toString(modelVENTAS.getDescuento_prod()));
        //calculando de nuevo el iva y el subtotal
        viewVENTAS.jtf_iva.setText(Float.toString(modelVENTAS.getIva()));
        viewVENTAS.jtf_subtotal.setText(Float.toString(modelVENTAS.getSubtotal()));
        if ("deshabilitado".equals(modelVENTAS.getActivo())){
            viewVENTAS.jcb_codigo_descuento.setEnabled(false);
            viewVENTAS.jtf_puntos_requeridos.setText("0.0");
            viewVENTAS.jtf_porcentaje.setText("0.0");
            viewVENTAS.jb_aplicar_descuento.setEnabled(false);
        }else{
            viewVENTAS.jb_aplicar_descuento.setEnabled(false);
            viewVENTAS.jtf_puntos_requeridos.setText("0.0");
            viewVENTAS.jtf_porcentaje.setText("0.0");
        }
    }
    /**
     * metodo  que guardara cada dato de la Venta en su respectiva tabla
     * en detalle Venta, se agudaran los datos dentro de la jtable
     * en Ventas, se llenara con los datos de jos jtf que le corresponden a la tabla
     * este meodo finalizara toda la compra de la tabla
     */
    public void realizarCompra(){
        try{
            // se guarda en Ventas **agregando datos para guardar
            modelVENTAS.setRFC_cliente((String) viewVENTAS.jcb_rfc_cliente.getSelectedItem());
            modelVENTAS.setSubtotal(Float.parseFloat(viewVENTAS.jtf_subtotal.getText()));
            modelVENTAS.setIva(Float.parseFloat(viewVENTAS.jtf_iva.getText()));
            modelVENTAS.setImporte(Float.parseFloat(viewVENTAS.jtf_importe.getText()));
            modelVENTAS.setNumero_venta(Integer.parseInt(viewVENTAS.jtf_numero_venta.getText()));
            modelVENTAS.setRFC_empleado((String) viewVENTAS.jcb_rfc.getSelectedItem());
            modelVENTAS.setNum_sucursal(Integer.parseInt((String) viewVENTAS.jcb_numero_sucursal.getSelectedItem()));
            modelVENTAS.setCodigo_descuento(Integer.parseInt((String) viewVENTAS.jcb_codigo_descuento.getSelectedItem()));
            modelVENTAS.setPuntos_ganados(Integer.parseInt(viewVENTAS.jtf_puntos_ganados.getText()));
            modelVENTAS.finalizarCompratablaVenta();//llamamos al metodo de guardar en compra 
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"error14 FinalizarVentas "+ e);
          } 
        //se guardara en detalle_compras ***agregando datos
        try{
        for (int i = 0; i < viewVENTAS.jt_vista.getRowCount(); i++){
            modelVENTAS.setNumero_venta(Integer.parseInt((String) viewVENTAS.jt_vista.getValueAt(i,0)));
            modelVENTAS.setCodigo_producto(viewVENTAS.jt_vista.getValueAt(i,1).toString());
            modelVENTAS.setCantidad_venta(Integer.parseInt((String) viewVENTAS.jt_vista.getValueAt(i,5)));
            modelVENTAS.setPrecio_venta(Float.parseFloat((String) viewVENTAS.jt_vista.getValueAt(i,4)));
            modelVENTAS.setTotal_por_producto(Float.parseFloat((String)viewVENTAS.jt_vista.getValueAt(i,6)));
            modelVENTAS.finalizarCompratablaDetalleVenta(); //llamamos el metodo de guardar en detalle_compra   
        }
        //Actualizar stock al realizar la compra
        for (int i = 0; i < viewVENTAS.jt_vista.getRowCount(); i++){
           modelVENTAS.setNum_sucursal(Integer.parseInt((String)viewVENTAS.jcb_numero_sucursal.getSelectedItem()));
           modelVENTAS.setCodigo_producto(viewVENTAS.jt_vista.getValueAt(i,1).toString());
           modelVENTAS.setCantidad_venta(Integer.parseInt((String) viewVENTAS.jt_vista.getValueAt(i,5))); 
           modelVENTAS.existencias();   
        }
        JOptionPane.showMessageDialog(null,"Se realizo la Venta con exito");  
        deshabiltarObjetos();
        //LIMPIAR TABLA 
        for (int i = 0; i <  viewVENTAS.jt_vista.getRowCount(); i++) {
           modelVENTAS.getModel_ventas().removeRow(i);
            i-=1;
        }
        viewVENTAS.jtf_nombre_empleado.setText(" ");
        viewVENTAS.jtf_nombre_cliente.setText(" ");
        viewVENTAS.jtf_puntos_acumulados.setText(" ");
        viewVENTAS.jtf_nombre_producto.setText("  ");
        viewVENTAS.jtf_tipo_producto.setText(" ");
        viewVENTAS.jtf_marca_producto.setText(" ");
        viewVENTAS.jtf_cantidad.setText("0");
        viewVENTAS.jtf_precio.setText("0.0");
        viewVENTAS.jtf_total.setText("0.0");
        viewVENTAS.jtf_importe.setText("0.0");
        viewVENTAS.jtf_iva.setText("0.0");
        viewVENTAS.jtf_subtotal.setText("0.0");
        viewVENTAS.jtf_descuento.setText(" ");
        viewVENTAS.jtf_puntos_ganados.setText("0");
        viewVENTAS.jtf_efectivo.setText("0.0");
        viewVENTAS.jtf_cambio.setText("0.0");
        viewVENTAS.jcb_rfc.setEnabled(true);
        modelVENTAS.numeroVentas();
        viewVENTAS.jtf_numero_venta.setText(Integer.toString(modelVENTAS.getNumero_venta()));
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"error15 FinalizarVentas "+ e);
        } 
    }
    //*********** Sumando al cliente los puntos Ganados ***************** 
    public void PuntosGanados(){
        modelVENTAS.setRFC_cliente((String) viewVENTAS.jcb_rfc_cliente.getSelectedItem());
        modelVENTAS.setPuntos_ganados(Integer.parseInt(viewVENTAS.jtf_puntos_ganados.getText()));
        modelVENTAS.SumarPuntos();
    }
}
