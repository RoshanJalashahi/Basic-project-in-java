import javax.swing.*;

public class box_layout extends JFrame {
    public JButton b1,b2,b3,b4,b5;
    public void createbutton(){
        b1=new JButton("button1");
        b2=new JButton("button2");
        b3=new JButton("button3");
        b4=new JButton("button 4");
        b5=new JButton("button5");
    }
    public box_layout(){
        createbutton();
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(b1);add(b2);add(b3);add(b4);add(b5);
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        box_layout test=new box_layout();
    }
}
