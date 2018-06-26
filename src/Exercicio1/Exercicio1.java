package Exercicio1;

import java.awt.TextField;
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
public class Exercicio1 {
    private JFrame jFrame;
    private JLabel jLabelNome, jLabelResultado;
    private JLabel jLabelSobrenome;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldSobrenome;
    private JButton jButtonConcatenar;
   

    public Exercicio1() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcoes();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame("Exercicio 01");
        jFrame.setSize(600, 600);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void gerarDimensoes() {
        jTextFieldNome.setSize(200,25);
        jTextFieldSobrenome.setSize(200,25);
        jLabelNome.setSize(jTextFieldNome.getSize());
        jLabelSobrenome.setSize(jTextFieldSobrenome.getSize());
        jButtonConcatenar.setSize(100,35);
        jLabelResultado.setSize(500,35);
    }

    private void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10,40);
        jLabelSobrenome.setLocation(230,10);
        jTextFieldSobrenome.setLocation(230,40);
        jButtonConcatenar.setLocation(10,200);
        jLabelResultado.setLocation(10,350);
        
    }
    
    private void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
        jFrame.add(jLabelResultado);
        

       
    }

    private void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField ();
        jLabelSobrenome = new JLabel("Sobrenome");
        jButtonConcatenar = new JButton("Concatenar");
        jLabelResultado = new JLabel("");
        
    }

    private void adicionarAcoes() {
        jButtonConcatenar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelResultado.setText("E ai," + " " + jTextFieldNome.getText()+ " " + jTextFieldSobrenome.getText());
            }
        });
    }    
}
