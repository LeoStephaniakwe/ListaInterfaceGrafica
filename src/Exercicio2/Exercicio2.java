package Exercicio2;

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
    private JLabel jLabel, resultado;
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
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void gerarDimensoes() {
        
    }

    private void gerarLocalizacoes() {
        
    }

    private void adicionarComponentes() {
        jFrame.add(jLabel);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(resultado);       
    }

    private void instanciarComponentes() {
        jLabel = new JLabel("Informe um numero");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton();
        resultado = new JLabel();
        
        
    }

    private void adicionarAcoes() {
        
    }    
}
