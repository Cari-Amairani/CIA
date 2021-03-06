/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;

/**
 *
 * @author Salvador Hernández Mendoza
 */
public class MenuAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ModelClientes modelClientes = new ModelClientes();
        ViewClientes viewClientes = new ViewClientes();
        ControllerClientes controllerClientes = new ControllerClientes(modelClientes, viewClientes);

        ModelEmpleadosCompras modelEmpleadosCompras = new ModelEmpleadosCompras();
        ViewEmpleadosCompras viewEmpleadosCompras = new ViewEmpleadosCompras();
        ControllerEmpleadosCompras controllerEmpleadosCompras = new ControllerEmpleadosCompras(modelEmpleadosCompras, viewEmpleadosCompras);

        ModelEmpleadosVentas modelEmpleadosVentas = new ModelEmpleadosVentas();
        ViewEmpleadosVentas viewEmpleadosVentas = new ViewEmpleadosVentas();
        ControllerEmpleadosVentas controllerEmpleadosVentas = new ControllerEmpleadosVentas(modelEmpleadosVentas, viewEmpleadosVentas);

        ModelProductos modelProductos = new ModelProductos();
        ViewProductos viewProductos = new ViewProductos();
        ControllerProductos controllerProductos = new ControllerProductos(modelProductos, viewProductos);

        ModelProveedores modelProveedores = new ModelProveedores();
        ViewProveedores viewProveedores = new ViewProveedores();
        ControllerProveedores controllerProveedores = new ControllerProveedores(modelProveedores, viewProveedores);

        ModelSucursales modelSucursales = new ModelSucursales();
        ViewSucursales viewSucursales = new ViewSucursales();
        ControllerSucursales controllerSucursales = new ControllerSucursales(modelSucursales, viewSucursales);

        ModelAgregarSucursal modelAgregarSucursal = new ModelAgregarSucursal();
        ViewAgregarSucursal viewAgregarSucursal = new ViewAgregarSucursal();
        ControllerAgregarSucursal controllerAgregarSucursal = new ControllerAgregarSucursal(modelAgregarSucursal, viewAgregarSucursal);

        ModelDetalleCompras modelDetalleCompras = new ModelDetalleCompras();
        ViewDetalleCompra viewDetalleCompra = new ViewDetalleCompra();
        ControllerDetalleCompra controllerDetalleCompra = new ControllerDetalleCompra(modelDetalleCompras, viewDetalleCompra);

        ModelDetalleVentas modelDetalleVentas = new ModelDetalleVentas();
        ViewDetalleVentas viewDetalleVentas = new ViewDetalleVentas();
        ControllerDetalleVentas controllerDetalleVenta = new ControllerDetalleVentas(modelDetalleVentas, viewDetalleVentas);

        ModelPromociones modelPromociones = new ModelPromociones();
        ViewPromociones viewPromociones = new ViewPromociones();
        ControllerPromociones controllerPromociones = new ControllerPromociones(modelPromociones, viewPromociones);

        ModelDescuentos modelDescuentos = new ModelDescuentos();
        ViewDescuentos viewDescuentos = new ViewDescuentos();
        ControllerDescuentos controllerDescuentos = new ControllerDescuentos(modelDescuentos, viewDescuentos);

        Object[] controllers = new Object[11];
        controllers[0] = controllerClientes;
        controllers[1] = controllerEmpleadosCompras;
        controllers[2] = controllerEmpleadosVentas;
        controllers[3] = controllerProductos;
        controllers[4] = controllerProveedores;
        controllers[5] = controllerSucursales;
        controllers[6] = controllerAgregarSucursal;
        controllers[7] = controllerDetalleCompra;
        controllers[8] = controllerDetalleVenta;
        controllers[9] = controllerPromociones;
        controllers[10] = controllerDescuentos;
       

        ModelMenuAdmin modelMenuAdmin = new ModelMenuAdmin();
        ViewMenuAdmin viewMenuAdmin = new ViewMenuAdmin();
        ControllerMenuAdmin controllerMenuAdmin = new ControllerMenuAdmin(modelMenuAdmin, viewMenuAdmin, controllers);
    }

}
