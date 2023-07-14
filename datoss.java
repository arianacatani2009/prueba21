import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class datoss extends javax.swing.JFrame {
    JPanel jpanel = (JPanel) this.getContentPane();
    JTextField jtextfield = new JTextField();
    private JPanel Jpanel;
    private JTextField textApellido;
    private JTextField textCedula;
    private JTextField textCodigo;
    private JTextField textNombre;
    private JComboBox elegirSigno;
    private JComboBox ElegirAño;
    private JComboBox ElegirMes;
    private JComboBox ElegirDia;
    private JCheckBox ChecaRojo;
    private JCheckBox ChecaVerde;
    private JCheckBox ChecaNinguno;
    private JRadioButton BotonSi;
    private JRadioButton Boton2;
    private JButton BotoncargarDatos;
    private JButton BotonguardarDatos;
    private JButton botonAnterior;
    private JButton BotonSiguiente;
    private JLabel Codigo;
    private JLabel Cedula;
    private JLabel Nombre;
    private JLabel Apellido;
    private JLabel Signo;
    private JLabel FechaN;
    private JLabel ColorFavorito;
    private JLabel Casado;

    String file_dir = "data.dat";
    datoss dato[] = new datoss[6];

    public datoss() {
        ElegirAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 1950; i < 2023; i++) {
                    ElegirAño.addItem("" + i);
                }
            }
        });
    }
    public static void main (String[]args){
        JFrame frame = new JFrame("Datos");
        frame.setContentPane(new datoss().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
