package Exercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo
 */
public class Exercicio4 {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;

    public Exercicio4() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcoes();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame("Exercicio 04");
        jFrame.setSize(250, 200);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void gerarDimensoes() {
         jLabelNumero.setSize(250, 25);
        jTextFieldNumero.setSize(200, 25);
        jButtonVerificar.setSize(200, 50);
        
    }
    private void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(jLabelNumero.getX(), jLabelNumero.getY() + jLabelNumero.getHeight() + 5);
        jButtonVerificar.setLocation(jTextFieldNumero.getX(), jTextFieldNumero.getHeight() + jTextFieldNumero.getY() + 10);

    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);

    }

    private void instanciarComponentes() {
        jLabelNumero = new JLabel("Digite um numero");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");

    }

    private void adicionarAcoes() {
       jButtonVerificar.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String texto = "";
               if(jTextFieldNumero.getText().trim().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Voce deve escrever alguma coisa");
                   return;
               }
               int numero;
                try{
                    numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Você deve escrever apenas números inteiros no campo");
                    return;
                }
               if(numero == 0){
                   JOptionPane.showMessageDialog(null, "Numero neutro!!!!");
                   return;
               }
               
               if(numero % 2 == 0){
                   texto = "Numero par";
               }else{
                   texto = "Numero impar";
                   
               }
               if(numero > 0){
                   texto += " e Positivo";
               }else{
                   texto += " e negativo";
               }
               JOptionPane.showMessageDialog(null, texto);
           }
       });

    }
}
