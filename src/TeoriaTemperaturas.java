import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeoriaTemperaturas extends JFrame {

    private JTextField Celsius;
    private JTextField Fahrenheit;
    private int cels;
    private int fah;
    private Float resultado;
    public TeoriaTemperaturas(){

        //Configuramos el titulo del Layout y el cierre del mismo
        setTitle("Conversor de temperaturas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Celsius = new JTextField(10);
        add(Celsius);
        Fahrenheit = new JTextField(10);
        add(Fahrenheit);

        //Configuramos JPanel y establecemos FlowLayout como su gestor de layout
        JPanel panel = new JPanel(new FlowLayout());
        JButton celsius = new JButton("Convertir a Celsius");
        JButton Fahrenheit = new JButton("Convertir a Fahrenheit ");

        add(panel, BorderLayout.CENTER);
        panel.add(celsius);
        panel.add(Fahrenheit);

        celsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cels = Integer.parseInt(JOptionPane.showInputDialog ( "Introduzca la temperatura en grados celsius" ));
                    cels = ( fah - 32) * 5/9;
                        JOptionPane.showMessageDialog(null,cels);

            }
        });
        Fahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            fah = Integer.parseInt(JOptionPane.showInputDialog ( "Introduzca la temperatura en grados Fahrenheit" ));
                    fah = (cels * 9/5) +32;
                        JOptionPane.showMessageDialog(null,fah);
            }
        });


        setSize(new Dimension(200,200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
