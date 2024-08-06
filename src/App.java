import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    static JFrame frame;
    static JLabel contadorLabel;
    static int contador = 0;

    public static void main(String[] args) {
        frame = new JFrame("Contador de Número");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.CENTER;

        contadorLabel = new JLabel("Contador: " + contador);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(contadorLabel, constraints);

        JButton incButton = new JButton("Incrementar");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(incButton, constraints);

        JButton zeroButton = new JButton("Zerar");
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(zeroButton, constraints);

        incButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementarContador();
            }
        });

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarContador();
            }
        });
    }

    private static void incrementarContador() {
        contador++;
        contadorLabel.setText("Contador: " + contador);
    }

    private static void zerarContador() {
        contador = 0;
        contadorLabel.setText("Contador: " + contador);
    }
}
