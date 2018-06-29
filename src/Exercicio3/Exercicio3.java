package Exercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

/**
 *
 * @author Leonardo
 */
public class Exercicio3 {

    private JFrame jFrame;
    private JLabel jLabelNumero,
            jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;

    public Exercicio3() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcoes();
        configurarJScrollPane();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame("Exercicio 03");
        jFrame.setSize(255, 500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void gerarDimensoes() {
        jLabelNumero.setSize(250, 25);
        jTextFieldNumero.setSize(200, 25);
        jButtonTabuada.setSize(200, 50);
        jScrollPaneTabuada.setSize(200, 280);

    }

    private void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(jLabelNumero.getX(), jLabelNumero.getY() + jLabelNumero.getHeight() + 5);
        jButtonTabuada.setLocation(jTextFieldNumero.getX(), jTextFieldNumero.getHeight() + jTextFieldNumero.getY() + 10);
        jScrollPaneTabuada.setLocation(jButtonTabuada.getX(), jButtonTabuada.getY()+ jButtonTabuada.getHeight() + 10);

    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(jScrollPaneTabuada);

    }

    private void instanciarComponentes() {
        jLabelNumero = new JLabel("Informe o numero para obter a tabuada");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Calcular");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane(jTextAreaTabuada);
        

    }
    private void configurarJScrollPane(){
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setEditable(false);
        
    }

    private void adicionarAcoes() {
        jButtonTabuada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                String tabuada = "";
                for (int i = 0; i <= 20; i++) {
                    tabuada += "\n" + i + "x" + numero + "=" + (numero * i);
                    
                }
                jTextAreaTabuada.setText(tabuada);

            }
        });

    }
}
