import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonEjemplo {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null); // diseño libre (sin layout manager)

        // Crear un botón
        JButton boton = new JButton("Haz clic");
        boton.setBounds(100, 70, 100, 30); // x, y, ancho, alto

        // Agregar acción al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Botón presionado!");
            }
        });

        // Agregar botón a la ventana
        ventana.add(boton);
        ventana.setVisible(true); // mostrar la ventana
    }
}