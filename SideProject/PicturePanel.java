import java.awt.*;
import javax.swing.*;
public class PicturePanel extends JPanel{
    private int numBodyParts;

    public PicturePanel(int numParts){
        numBodyParts = numParts;
    }

    public void paint(Graphics g){
        if (numBodyParts >= 1){
            g.drawOval(getSize().width/2-40, 50, 80, 80);
        }
        if(numBodyParts >= 2){
            g.drawLine(getSize().width/2,130,getSize().width/2,300);
        }
        if(numBodyParts >= 3){
            g.drawLine(getSize().width/2,170,getSize().width/2+70,100);
        }
        if(numBodyParts >= 4){
            g.drawLine(getSize().width/2,170,getSize().width/2-70,100);
        }
        if(numBodyParts >= 5){
            g.drawLine(getSize().width/2,300,getSize().width/2+70,400);
        }
        if(numBodyParts >= 6){
            g.drawLine(getSize().width/2,300,getSize().width/2-70,400);
        }
    }
}