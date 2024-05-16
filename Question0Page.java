import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * References:
 * For a total list of references, refer to the top notes in the "FinalProjectMainPage.java" file
 * 
 * Responsibilities of class:
 * Contains all the framework for the first JFrame "Question0Page" that the users will interact
 */

public class Question0Page extends JFrame // Question0Page IS-A JFrame
{
	private JTextField enterGuess; // Question0Page HAS-A enterGuess
	private JButton submitButton; // Question0Page HAS-A submitButton
	
	public Question0Page()
	{
		// JFrame settings for the LaunchPage itseld
		this.setTitle("Lifestyle calculator");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setLocationRelativeTo(null); // this will make the JFrame appear in the middle of the screen
		this.setLayout(new BorderLayout());
		
		enterGuess = new JTextField();
		enterGuess.setPreferredSize(new Dimension(200,50));
		
		submitButton = new JButton("submit answer");
		submitButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				saveTextToFile(enterGuess.getText());
			}		
		});
		
		JLabel question = new JLabel();
		question.setText("<html>How much do you believe you spend per month?<br><br>Input a number only response and click submit");
		question.setFont(new Font("", Font.PLAIN, 20)); // set text size and font style
		question.setForeground(Color.WHITE);
		
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(0,200));
		northPanel.setBackground(new Color(12,80,80));
		northPanel.add(question);
		this.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(200,0));
		centerPanel.setBackground(new Color(100,100,100));
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.add(enterGuess);
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(100,200));
		southPanel.setBackground(new Color(12,80,80));
		this.add(southPanel, BorderLayout.SOUTH);
		southPanel.add(submitButton); // adding the submit button to the south panel
		
		this.setVisible(true);
	}
		
	// A method to save text to a file
	private void saveTextToFile(String string) 
	{
		try (PrintWriter writer = new PrintWriter("spending.txt"))
		{
			// Checking to see if the input contains only numeric characters or not
			if(!isNumeric(string))
			{
				throw new NonNumberInputException("Only enter numbers please!");
			}
			
			writer.println(string);
			writer.flush();
			JOptionPane.showMessageDialog(this, "You've stated: $" + string);
			writer.close();
			
			this.dispose(); // disposes the current JFrame instance
			new Question1Page(); // proceeds to the next JFrame
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error! Could not save to file");
		}
		// Implemented a custom Exception class to prevent users from proceeding forward if they put in a non-numerical expenditure input
		catch (NonNumberInputException e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error! Non number character detected. Enter numbers only please!");
		}
		
	}
	
	// A method to check if a string contains only numeric characters
	public static boolean isNumeric(String string)
	{
		for (char c: string.toCharArray())
		{
			if (!Character.isDigit(c))
			{
				// Return false if a non-digit char is found
				return false;
			}
		}
		// Return true if all characters are digits
		return true;
	}
}
