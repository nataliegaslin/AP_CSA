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
    private JLabel word;

    public HangmanGUI(Hangman game){
        newWord = game.returnTheWord();
        secretWord = game.returnHiddenWord();
    }

    public static void main(String[] args){
        Hangman myGame = new Hangman("medium");
        HangmanGUI swingControlDemo = new HangmanGUI(myGame);
        swingControlDemo.prepareGUI(myGame);

    }

    private void setDiff(){
        JButton easy = new JButton("easy");
        JButton medium = new JButton("medium");
        JButton hard = new JButton("hard");
        pane.add(easy);
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
        word = new JLabel(secretWord);
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
        if(newGame.returnGameOver() == false){
            newGame.addLetter(letter);
            String workWord = newGame.returnHiddenWord();
            secretWord = "";
            for(int i = 0; i < workWord.length(); i++){
                secretWord += workWord.substring(i, i+1);
                secretWord += " ";
            }
            setUpPicture(pane, newGame.returnNumBodyParts());
            word.setText(secretWord);
        }
        if(newGame.returnGameOver() == true){
            if(newGame.returnNumBodyParts() ==6){
                word.setText("You lost! The word was " + newGame.returnTheWord());
            }
            String newSecretWord = "";
            for(int i = 0; i < secretWord.length(); i+=2){
                newSecretWord += secretWord.substring(i, i+1);
            }
            if (newSecretWord.equals(newGame.returnTheWord())){
                word.setText("Congrats! You won! :) The word was " + newGame.returnTheWord());
            }
        }
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