//information about Java Swing from https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HangmanGUI{
    private JFrame frame;

    public HangmanGUI(){
        prepareGUI();
    }

    public static void main(String[] args){
        HangmanGUI swingControlDemo = new HangmanGUI();
        swingControlDemo.prepareGUI();

    }
   
   private void setUpLetters(JPanel pane){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] lettersArray = new String[26];
        for(int i = 0; i < letters.length(); i++){
            lettersArray[i] = letters.substring(i,i+1);
        }

        int numXLetters = 0;
        int numYLetters = 0;

        for(String letter : lettersArray){
            JButton a = new JButton(letter);
            GridBagConstraints constra = new GridBagConstraints();
            a.setVisible(true);
            constra.fill = GridBagConstraints.HORIZONTAL;
            constra.gridx = numXLetters;
            constra.gridy = numYLetters;
            constra.anchor = GridBagConstraints.PAGE_START;
            numXLetters++;
            if(letter.equals("m")){
                numYLetters++;
                numXLetters = 0;
            }
            pane.add(a, constra);
            pane.setVisible(true);

            a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setVisible(false);
            }
            });
            
        }
   }

    private void setUpPicture(JPanel pane, int numBodyParts){
        JPanel picture = new PicturePanel(numBodyParts);
        GridBagConstraints constra = new GridBagConstraints();
        constra.fill = GridBagConstraints.HORIZONTAL;
        constra.gridx = 0;
        constra.gridy = 2;
        constra.gridwidth = 13;
        constra.ipady = 400;
        pane.add(picture, constra);
        pane.setVisible(true);

    }

    private void setUpWord(JPanel pane, String guessWord){
        String newWord = "";
        for(int i = 0; i < guessWord.length(); i++){
            newWord += guessWord.substring(i, i+1);
            newWord += " ";
        }
        JLabel word = new JLabel(newWord);
        word.setHorizontalAlignment(SwingConstants.CENTER);
        word.setFont(new java.awt.Font("Arial", Font.BOLD, 32));
        GridBagConstraints constra = new GridBagConstraints();
        constra.fill = GridBagConstraints.HORIZONTAL;
        constra.gridx = 0;
        constra.gridy = 12;
        constra.gridwidth = 13;
        constra.ipady = 20;
        pane.add(word, constra);
        pane.setVisible(true);

    }

    private void prepareGUI(){
        frame = new JFrame("Play Hangman");
        JPanel pane = new JPanel(new GridBagLayout());
        setUpLetters(pane);
        setUpPicture(pane,6);
        setUpWord(pane,"I did it!!!");
        frame.add(pane); 
        frame.setSize(1200,800);
        frame.setVisible(true);
        pane.setVisible(true);
    }
}