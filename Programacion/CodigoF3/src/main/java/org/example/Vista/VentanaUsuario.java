package org.example.Vista;

import org.example.Controladores.VistaController;

import javax.swing.*;

/**
 * Clase VentanaUsuario.
 * Ventana principal del usuario que muestra las opciones disponibles para consultar información.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaUsuario extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JButton resultadosDeÚltimaJornadaButton;
    private JButton informacionEquiposButton;
    private VistaController vc;

    public VentanaUsuario(VistaController vc) {
        this.vc = vc;
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MenuPrincipal");
        setSize(500,580);
        setLocationRelativeTo(null);
        setResizable(false);
        informacionEquiposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaEquipos ventanaEquipo = new VentanaEquipos(vc);
                ventanaEquipo.setVisible(true);
                setVisible(false);
            }
        });
        resultadosDeÚltimaJornadaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaResultados ventanaResultados = new VentanaResultados(vc);
                ventanaResultados.setVisible(true);
                setVisible(false);
            }
        });
    }
}
