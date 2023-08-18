import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class evento extends JFrame{
    private static final int defaultCloseOperation = 0;

    public static void main(String[] args) {
        JFrame casa = new JFrame("A Casa");
        JButton jbQuarto1 = new JButton("Quarto 1");
        jbQuarto1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        casa.add(jbQuarto1);
        casa.setVisible(true);


        JButton jbQuarto2 = new JButton("Quarto 2");
        jbQuarto2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        casa.add(jbQuarto2);
        casa.setVisible(true);


        JButton jbBanheiro1 = new JButton("Banheiro1");
        jbBanheiro1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        casa.add(jbBanheiro1);
        casa.setVisible(true);
        JButton jbBanheiro2 = new JButton("Banheiro2");
        jbBanheiro2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        casa.add(jbBanheiro2);
        casa.setVisible(true);

        JButton jbMostrar = new JButton("Mostrar");
        jbMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        casa.add(jbMostrar);
        casa.setVisible(true);
    }
}
