/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.ModelClientes;
import views.ViewClientes;

/**
 *
 * @author Octaviano
 */
public class ControllerClientes {

    public ModelClientes modelClientes;
    public ViewClientes viewClientes;
    MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == viewClientes.jt_vista) {
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

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    };

    public ControllerClientes(ModelClientes modelClientes, ViewClientes viewClientes) {
        this.modelClientes = modelClientes;
        this.viewClientes = viewClientes;
        this.viewClientes.jt_vista.addMouseListener(ml);//agregar a la table el evento de MouseListener
        ConexionBD();
    }
      public void ConexionBD(){
        modelClientes.Conectar();
        modelClientes.mostrar();
        viewClientes.jt_vista.setModel(modelClientes.getModelo_Clientes()); //asignar a la tabla los valores correspondientes
    }

}


