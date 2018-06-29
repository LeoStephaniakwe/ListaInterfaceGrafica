package Exercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo
 */
public class Exercicio2 {

    private JFrame jFrame;
    private JLabel jLabelNumero, resultado;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public Exercicio2() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcoes();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame("Exercicio 02");
        jFrame.setSize(300, 250);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void gerarDimensoes() {
        jButtonTabuada.setSize(100, 25);
        jLabelNumero.setSize(300, 25);
        jTextFieldNumero.setSize(150, 25);
        resultado.setSize(150, 25);

    }

    private void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(jLabelNumero.getX(), jLabelNumero.getY() + jLabelNumero.getHeight() + 10);
        jButtonTabuada.setLocation(jTextFieldNumero.getX(), jTextFieldNumero.getHeight() + jTextFieldNumero.getY() + 5);
        resultado.setLocation(jTextFieldNumero.getX(), jTextFieldNumero.getY() + jTextFieldNumero.getHeight() + 50);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(resultado);
        
    }

    private void instanciarComponentes() {
        jLabelNumero = new JLabel("Informe o numero que deseja multiplicar por 50");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Calcular");
        resultado = new JLabel("Resultado");

    }

    private void adicionarAcoes() {
        jButtonTabuada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                numero *= 50;
                resultado.setText("Resultado = " + numero+ "\n");

            }
        });

    }
}
