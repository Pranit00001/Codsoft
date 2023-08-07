package WordCounter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WordCounterApp 
{

  private JFrame frame;
  private JTextField textArea;
  private JButton countButton;
  private JLabel wordCountLabel;

  public WordCounterApp() 
  {
    frame = new JFrame("Word Counter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textArea = new JTextField();
    textArea.setColumns(20);

    countButton = new JButton("Count");
    countButton.addActionListener(new ActionListener() 
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        String text = textArea.getText();
        int numberOfWords = countWords(text);
        wordCountLabel.setText("Number of words: " + numberOfWords);
      }
    });

    wordCountLabel = new JLabel("Number of words: 0");

    JPanel panel = new JPanel();
    panel.add(textArea);
    panel.add(countButton);
    panel.add(wordCountLabel);

    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
  }

  private static int countWords(String text) 
  {
    String[] words = text.split(" ");
    int numberOfWords = 0;
    for (String word : words) {
      if (word.matches("[a-zA-Z]+")) 
      {
        numberOfWords++;
      }
    }
    return numberOfWords;
  }

  public static void main(String[] args)
  {
    new WordCounterApp();
  }
}
