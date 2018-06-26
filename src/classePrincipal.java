
import Exercicio1.Exercicio1;
import Exercicio2.Exercicio2;
import Exercicio3.Exercicio3;
import Exercicio4.Exercicio4;
import Exercicio5.Exercicio5;
import Exercicio6.Exercicio6;
import Exercicio7.Exercicio7;
import Exercicio8.Exercicio8;
import Exercicio9.Exercicio9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Leonardo
 */
public class classePrincipal {

    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;

    public classePrincipal() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton00();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        jFrame.setVisible(true);
    }

    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void adicionarComponentes() {
        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);

    }

    public void instanciarComponentes() {
        jButton00 = new JButton("Exercicio 1");
        jButton01 = new JButton("Exercicio 2");
        jButton02 = new JButton("Exercicio 3");
        jButton03 = new JButton("Exercicio 4");
        jButton04 = new JButton("Exercicio 5");
        jButton05 = new JButton("Exercicio 6");
        jButton06 = new JButton("Exercicio 7");
        jButton07 = new JButton("Exercicio 8");
        jButton08 = new JButton("Exercicio 9");

    }

    public void gerarLocalizacoes() {
        jButton00.setLocation(10, 10);
        jButton01.setLocation(120, 10);
        jButton02.setLocation(230, 10);
        jButton03.setLocation(340, 10);
        jButton04.setLocation(10, 120);
        jButton05.setLocation(120, 120);
        jButton06.setLocation(230, 120);
        jButton07.setLocation(340, 120);
        jButton08.setLocation(10, 230);
        
    }

    public void gerarDimensoes() {
        jButton00.setSize(110, 100);
        jButton01.setSize(110, 100);
        jButton02.setSize(110, 100);
        jButton03.setSize(110, 100);
        jButton04.setSize(110, 100);
        jButton05.setSize(110, 100);
        jButton06.setSize(110, 100);
        jButton07.setSize(110, 100);
        jButton08.setSize(110, 100);
        

    }

    public void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Exercicio1();
            }
        });
    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio2();
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio3();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio4();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio5();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio6();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio7();
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio8();
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio9();
            }
        });
    }

}
