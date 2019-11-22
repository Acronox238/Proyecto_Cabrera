package main_package;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View_main extends JFrame implements ActionListener {

    public JPanel p_actual = new JPanel();
    public JButton b_registrar = new JButton("Registrar");
    public JButton b_stock = new JButton("Stock");
    public JButton b_trans = new JButton("Transacción");
    public JButton b_back = new JButton("Volver");

    public View_main() {

        super("Lectora v1.0");
        this.setResizable(false);
        initComponents();
    }

    public void initComponents() {

        p_actual.setVisible(false);
        this.setSize(300, 400);

        JPanel p_opciones = new JPanel();
        p_opciones.setLayout(new BoxLayout(p_opciones, BoxLayout.PAGE_AXIS));

        JLabel lb_título = new JLabel("Lectora v1.0");
        lb_título.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
        lb_título.setForeground(Color.red);

        lb_título.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_registrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_registrar.setAlignmentY(Component.CENTER_ALIGNMENT);
        b_stock.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_stock.setAlignmentY(Component.CENTER_ALIGNMENT);
        b_trans.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_trans.setAlignmentY(Component.CENTER_ALIGNMENT);

        b_registrar.addActionListener(this);
        b_stock.addActionListener(this);
        b_trans.addActionListener(this);

        p_opciones.add(Box.createRigidArea(new Dimension(0, 100)));
        p_opciones.add(lb_título);
        p_opciones.add(Box.createRigidArea(new Dimension(0, 25)));
        p_opciones.add(b_registrar);
        p_opciones.add(Box.createRigidArea(new Dimension(0, 15)));
        p_opciones.add(b_stock);
        p_opciones.add(Box.createRigidArea(new Dimension(0, 15)));
        p_opciones.add(b_trans);

        this.remove(p_actual);
        p_actual = p_opciones;
        this.add(p_actual);
    }

    public void registroView() {

        p_actual.setVisible(false);
        this.setSize(300, 300);

        JPanel p_registro = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setVgap(20);
        layout.setHgap(25);
        p_registro.setLayout(layout);
        /*p_labels.setLayout(new BoxLayout(p_labels, BoxLayout.PAGE_AXIS));
        JPanel p_texts = new JPanel();
        p_texts.setLayout(new BoxLayout(p_texts, BoxLayout.PAGE_AXIS));*/

        JLabel lb_bar_code = new JLabel("Código de barras");
        JTextField t_bar_code = new JTextField(13);
        JLabel lb_producto = new JLabel("Producto");
        JTextField t_producto = new JTextField(15);
        JLabel lb_precio = new JLabel("Precio");
        JTextField t_precio = new JTextField(15);
        JLabel lb_fecha = new JLabel("Fecha");
        JTextField t_fecha = new JTextField(15);
        JLabel lb_stock = new JLabel("En stock");
        JTextField t_stock = new JTextField(15);
        b_back.setAlignmentX(CENTER_ALIGNMENT);

        b_back.addActionListener(this);

        p_registro.add(lb_bar_code);
        p_registro.add(t_bar_code);
        p_registro.add(lb_producto);
        p_registro.add(t_producto);
        p_registro.add(lb_precio);
        p_registro.add(t_precio);
        p_registro.add(lb_fecha);
        p_registro.add(t_fecha);
        p_registro.add(lb_stock);
        p_registro.add(t_stock);
        p_registro.add(Box.createRigidArea(new Dimension(0, 20)));
        p_registro.add(b_back);

        this.remove(p_actual);
        p_actual = p_registro;
        this.add(p_actual);
    }

    public static void main(String[] args) {

        View_main Lectora = new View_main();
        //Lectora.setSize(800, 600);
        Lectora.setVisible(true);
        Lectora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lectora.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b_registrar) {
            registroView();
        }
        if (e.getSource() == b_back) {
            initComponents();
        }
    }

}
