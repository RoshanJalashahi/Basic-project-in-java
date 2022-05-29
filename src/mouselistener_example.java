import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistener_example extends Frame implements MouseListener {
    Label l =new  Label();
    mouselistener_example(){
        setVisible(true);
        setSize(400,600);
        addMouseListener(this);
        l.setBounds(70,90,100,60);
        add(l);
        setLayout(null);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("mouse is entered");
        int x=e.getX();
        int y =e.getY();
        l.setText(x+","+y);

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public static void main(String[] args) {
        mouselistener_example m =new mouselistener_example();

    }
}
