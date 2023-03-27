import java.awt.*;
import javax.swing.*;
public class PicturePanel extends JPanel{
    private int numBodyParts;


    public PicturePanel(int numParts){
        numBodyParts = numParts;
    }

    public void paint(Graphics g){
        int offset = 100;
        g.drawLine(getSize().width/2+offset,50,getSize().width/2+offset,20);
        g.drawLine(getSize().width/2+offset,20,getSize().width/2+offset-100,20);
        g.drawLine(getSize().width/2-100+offset,20,getSize().width/2-100+offset,360);
        g.drawLine(getSize().width/2-180+offset,360,getSize().width/2-20+offset,360);

        if (numBodyParts >= 1){
            g.drawOval(getSize().width/2-40+offset, 50, 80, 80);
        }
        if(numBodyParts >= 2){
            g.drawLine(getSize().width/2+offset,130,getSize().width/2+offset,250);
        }
        if(numBodyParts >= 3){
            g.drawLine(getSize().width/2+offset,170,getSize().width/2+offset+70,100);
        }
        if(numBodyParts >= 4){
            g.drawLine(getSize().width/2+offset,170,getSize().width/2+offset-70,100);
        }
        if(numBodyParts >= 5){
            g.drawLine(getSize().width/2+offset,250,getSize().width/2+60+offset,300);
        }
        if(numBodyParts >= 6){
            g.drawLine(getSize().width/2+offset,250,getSize().width/2-60+offset,300);
        }
    }
}