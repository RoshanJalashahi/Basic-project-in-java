import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class box_layout_2 extends JFrame {
    JButton buttons[];
    box_layout_2(){
        buttons =new JButton[5];
        Panel container = new Panel();
        Panel container2 = new Panel();
        Panel container3 =new Panel();
        buttons[0]= new JButton("west");
        buttons[2]= new JButton("center");
        buttons[3] = new JButton("East");
        container.add(buttons[0]);
        container.add(buttons[2]);
        container.add(buttons[3]);
        buttons[1]=new JButton("north");
        buttons[4]=new JButton("south");
        container2.add(buttons[1]);
        container3.add(buttons[4]);
        add(container);
        add(container2);
        add(container3);
        container.setLayout(new BoxLayout(container,BoxLayout.X_AXIS));
        container2.setLayout(new BoxLayout(container2,BoxLayout.X_AXIS));
        container3.setLayout(new BoxLayout(container3,BoxLayout.X_AXIS));

        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        setSize(400,400);
        setVisible(true);
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons[4].setLabel("you just clicked north");

            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }


    public static void main(String[] args) {
    box_layout_2 b =new box_layout_2();
    }
}
