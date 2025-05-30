package org.example.Vista;

import org.example.Controladores.VistaController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Clase VentanaResultados.
 * Representa una ventana gráfica que muestra los resultados de un procedimiento
 * y permite al usuario interactuar con el sistema.
 */
public class VentanaResultados extends JFrame {
    private JButton bLogo;
    private JButton SALIRButton;
    private JTextArea textArea1;
    private JPanel pPrincipal;
    private VistaController vc;
    private JFrame ventanaUser;

    public VentanaResultados(VistaController vc, String nombre, JFrame ventanaUsuario) {
        try{
            this.vc = vc;
            this.ventanaUser = ventanaUsuario;
            setContentPane(pPrincipal);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("MenuPrincipal");
            setSize(680,580);
            setLocationRelativeTo(null);
            setResizable(true);
            iconoVentana();

            inicializarCampos();
            agregarListeners(nombre);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void iconoVentana(){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
        setIconImage(icon.getImage());
    }

    public void inicializarCampos() throws Exception{
        textArea1.setText(vc.mostrarProcedimientoResultado());
        textArea1.setFont(new Font("Monospaced", Font.PLAIN, 12));
    }

    public void agregarListeners(String nombre) {
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaUser.setVisible(true);
                dispose();
            }
        });
        bLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                vc.mostrarVentanaInicio();
            }
        });
    }
}
