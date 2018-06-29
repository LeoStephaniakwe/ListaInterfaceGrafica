package Exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo
 */
public class Exercicio5 {

    private JFrame jFrame, jFrame2;
    private JLabel jLabelNumero01,jLabelNumero02,jLabelResultado, faceSmash;
    private JTextField jTextFieldNumero01,jTextFieldNumero02;
    private JButton jButtonSomar,jButtonSubtrair,jButtonMultiplicar,jButtonDividir;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private double numero1 = 0, numero2 = 0, resultado = 0;
    
    public Exercicio5() {
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
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        
        jFrame2 = new JFrame("Nada de letras!");
        jFrame2.setSize(510, 290);
        jFrame2.setLayout(null);
        jFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame2.setLocationRelativeTo(null);
    }

    private void gerarDimensoes() {
        jTextFieldNumero01.setSize(200,25);
        jTextFieldNumero02.setSize(200,25);
        jLabelNumero01.setSize(80,jTextFieldNumero01.getHeight());
        jLabelNumero02.setSize(80,jTextFieldNumero02.getHeight());
        jLabelResultado.setSize(100,25);
        jScrollPaneResultado.setSize(285,100);
        jButtonSomar.setSize(100,50);
        jButtonSubtrair.setSize(100,50);
        jButtonMultiplicar.setSize(100,50);
        jButtonDividir.setSize(100,50);
        faceSmash.setSize(faceSmash.getIcon().getIconWidth(),faceSmash.getIcon().getIconHeight());

    }

    private void gerarLocalizacoes() {
        jLabelNumero01.setLocation(20,20);
        jLabelNumero02.setLocation(jLabelNumero01.getX(),jLabelNumero01.getY()+jLabelNumero01.getHeight()+5);
        jTextFieldNumero01.setLocation(jLabelNumero01.getX()+jLabelNumero01.getWidth()+5,jLabelNumero01.getY());
        jTextFieldNumero02.setLocation(jLabelNumero02.getX()+jLabelNumero02.getWidth()+5,jLabelNumero02.getY());
        jLabelResultado.setLocation(jLabelNumero02.getX(),jTextFieldNumero02.getY()+jTextFieldNumero02.getHeight()+25);
        jScrollPaneResultado.setLocation(jLabelResultado.getX(),jLabelResultado.getY()+jLabelResultado.getHeight()+10);
        jButtonSomar.setLocation(jTextFieldNumero01.getX()+jTextFieldNumero01.getWidth()+20,20);
        jButtonSubtrair.setLocation(jButtonSomar.getX(),jButtonSomar.getY()+jButtonSomar.getHeight()+10);
        jButtonMultiplicar.setLocation(jButtonSomar.getX(),jButtonSubtrair.getY()+jButtonSubtrair.getHeight()+10);
        jButtonDividir.setLocation(jButtonSomar.getX(),jButtonMultiplicar.getY()+jButtonMultiplicar.getHeight()+10);
        faceSmash.setLocation(0, 0);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jLabelResultado);
        jFrame.add(jTextFieldNumero01);
        jFrame.add(jTextFieldNumero02);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);
        jFrame.add(jScrollPaneResultado);
        jFrame2.add(faceSmash);
    }
    private void instanciarComponentes() {
        jLabelNumero01 = new JLabel("Campo 01");
        jLabelNumero02 = new JLabel("Campo 02");
        jLabelResultado = new JLabel("Resultado");
        jTextFieldNumero01 = new JTextField();
        jTextFieldNumero02 = new JTextField();
        jButtonSomar = new JButton("Somar");
        jButtonSubtrair = new JButton("Subtrair");
        jButtonMultiplicar = new JButton("Multiplicar");
        jButtonDividir = new JButton("Dividir");
        jTextAreaResultado = new JTextArea();
        jScrollPaneResultado = new JScrollPane(jTextAreaResultado);
        faceSmash = new JLabel("");
        faceSmash.setIcon(new ImageIcon(getClass().getResource("/Icon/giphy.gif")));

    }

    private void adicionarAcoes() {
        jButtonSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    numero1 = Double.parseDouble(jTextFieldNumero01.getText().trim());
                    numero2 = Double.parseDouble(jTextFieldNumero02.getText().trim());
                }catch(NumberFormatException ex){
                    if(jTextFieldNumero01.getText().trim().isEmpty()){
                        jTextAreaResultado.setText("Digite uma informação no caampo 1");
                        return;
                    }else if(jTextFieldNumero02.getText().trim().isEmpty()){
                        jTextAreaResultado.setText("Digite uma informação no caampo 2");
                        return;
                    }
                    jFrame2.setVisible(true);
                    if(jFrame2.isVisible()){
                        return;
                    }
                    
                }
                    resultado = numero1 + numero2;
                    jTextAreaResultado.setText(""+resultado);
                
            }
            
        });

    }
}
