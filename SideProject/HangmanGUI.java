//information about Java Swing from https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HangmanGUI{
    private JFrame frame;
    private JPanel pane;
    private String newWord = "";
    private String secretWord = "";

    public HangmanGUI(Hangman game){
        //prepareGUI(game);
        newWord = game.returnTheWord();
        secretWord = game.returnHiddenWord();
    }

    public static void main(String[] args){
        Hangman myGame = new Hangman("easy");
        HangmanGUI swingControlDemo = new HangmanGUI(myGame);
        swingControlDemo.prepareGUI(myGame);

    }
   
   private void setUpLetters(JPanel pane, Hangman game){
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
            constra.ipady = 20;
            constra.anchor = GridBagConstraints.PAGE_START;
            numXLetters++;
            if(letter.equals("m")){
                numYLetters++;
                numXLetters = 0;
            }
            pane.add(a, constra);

            a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setVisible(false);
                updateWord(letter, game);
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

    }

    private void setUpWord(JPanel pane, String guessWord){
        secretWord = "";
        for(int i = 0; i < guessWord.length(); i++){
            secretWord += guessWord.substring(i, i+1);
            secretWord += " ";
        }
        JLabel word = new JLabel(secretWord);
        word.setHorizontalAlignment(SwingConstants.CENTER);
        word.setFont(new java.awt.Font("Arial", Font.BOLD, 32));
        GridBagConstraints constra = new GridBagConstraints();
        constra.fill = GridBagConstraints.HORIZONTAL;
        constra.gridx = 0;
        constra.gridy = 12;
        constra.gridwidth = 13;
        constra.ipady = 20;
        pane.add(word, constra);

    }

    private void updateWord(String letter, Hangman newGame){
        newGame.addLetter(letter);
        JPanel pane = new JPanel(new GridBagLayout());
        String workWord = newGame.returnHiddenWord();
        secretWord = " ";
        for(int i = 0; i < workWord.length(); i++){
            secretWord += workWord.substring(i, i+1);
            secretWord += " ";
        }
        JLabel word = new JLabel(secretWord);
        word.setHorizontalAlignment(SwingConstants.CENTER);
        word.setFont(new java.awt.Font("Arial", Font.BOLD, 32));
        GridBagConstraints constra = new GridBagConstraints();
        constra.fill = GridBagConstraints.HORIZONTAL;
        constra.gridx = 0;
        constra.gridy = 12;
        constra.gridwidth = 13;
        constra.ipady = 20;
        pane.add(word, constra);
        JPanel picture = new PicturePanel(newGame.returnNumBodyParts());
        GridBagConstraints constrai = new GridBagConstraints();
        constrai.fill = GridBagConstraints.HORIZONTAL;
        constrai.gridx = 0;
        constrai.gridy = 2;
        constrai.gridwidth = 13;
        constrai.ipady = 400;
        pane.add(picture, constrai);
        frame.setSize(1600,1200);
        frame.add(pane);
    }

    private void prepareGUI(Hangman newGame){
        frame = new JFrame("Play Hangman");
        pane = new JPanel(new GridBagLayout());
        setUpLetters(pane, newGame);
        setUpPicture(pane,newGame.returnNumBodyParts());
        setUpWord(pane, secretWord);
        
        frame.setSize(1200,800);
        frame.add(pane); 
        frame.setVisible(true);
        
    }
}