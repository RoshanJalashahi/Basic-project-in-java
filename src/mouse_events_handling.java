import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class roshan extends Frame implements MouseListener {
    Label la =new Label();
    roshan(){
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        la.setBounds(80,80,80,80);
        la.setBackground(Color.blue);
        add(la);
        addMouseListener((MouseListener) this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        la.setText("mouse is cliked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        la.setText("mouse is pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        la.setText("mouse is  released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        la.setText("mouse is entered");
        int x= e.getX();
        int y= e.getY();
        la.setText(x+" "+y);
    }

    @Override
    public void mouseExited(MouseEvent e) {

        la.setText("mouse is closed");
    }
}
public class mouse_events_handling {
    public static void main(String[] args) {
        roshan rose= new roshan();
    }
}
