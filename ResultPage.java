import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.SwingConstants;

/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * References:
 * For a total list of references, refer to the top notes in the "FinalProjectMainPage.java" file
 * 
 * Responsibilities of class:
 * Contains all the framework for the last JFrame "ResultPage" that the users will interact
 */

public class ResultPage extends JFrame // ResultPage IS-A JFrame.
{	
	// Transporting the ArrayList tierCounter from the last ButtonsAndDescriptionsForQuestion class to this class
	private static ArrayList<String> tierCounter = ButtonsAndDescriptionsForQuestion4.getTierCounterFromQuestion4();
	
	public ResultPage(CostSlider costSlider)
	{
		//this.costSlider = costSlider;
		// "this" keyword can be used since the class BeginningPage IS-A JFrame. Therefore the keyword "this" can be called
		// to refer to the class itself and add things onto the JFrame
		this.setTitle("Lifestyle calculator");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setLocationRelativeTo(null); // this will make the JFrame appear in the middle of the screen
		this.setLayout(new BorderLayout());
		Border border = BorderFactory.createLineBorder(Color.black,3); // a border setting to be used for panels
		
		// Everything dealing with the North panel
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(0,200));
		northPanel.setBackground(new Color(12,80,80));
		northPanel.setBorder(border);
		this.add(northPanel, BorderLayout.NORTH);
		
		// Everything dealing with the South panel
		// To-do: add total cost slider widgets in the south panel
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(0,200));
		southPanel.setBackground(new Color(12,80,80));
		southPanel.setBorder(border);
		costSlider.addCostSlider(southPanel); // adding costSlider to the southPanel
		this.add(southPanel, BorderLayout.SOUTH);
		
		// Everything dealing with the Center panel
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(200,0));
		centerPanel.setBackground(new Color(100,100,100));
		centerPanel.setLayout(new BorderLayout()); // I am now converting the centerPanel into another BorderLayout that is divided into a north and south side
		this.add(centerPanel, BorderLayout.CENTER);
			
		//This try block will read from the file and display the user's initial cost guess back as well as all the tiers the user chose in chronological order
		try
		{
			// Will utilize FileReader to read from the "spending.txt" file (which contains the user's original guess on their monthly expenditures) and then to display that result back to the user
			FileReader reader = new FileReader("spending.txt");
			String userGuess ="";
			int data = reader.read();
			while(data != -1)
			{
				userGuess += ((char)data);
				data = reader.read();
			}
			reader.close();
			// Will insert a new JLabel that will contain the user's original guess on their monthly expenditures as well as displaying all their chosen expenditures 
			JLabel userOriginalCostGuess = new JLabel();
			userOriginalCostGuess.setHorizontalAlignment(SwingConstants.CENTER);
			userOriginalCostGuess.setVerticalAlignment(SwingConstants.CENTER);
			userOriginalCostGuess.setText("<html>Compare this to your original cost<br>Which you stated was: $" + userGuess + "<br><br>In addition, here's the list of expenditures you've selected in chronological order:<br>" + tierCounter );
			userOriginalCostGuess.setFont(new Font("", Font.PLAIN, 20)); // set text size and font style
			userOriginalCostGuess.setForeground(Color.white); // set text color
			centerPanel.add(userOriginalCostGuess);
		}
		catch (FileNotFoundException e)
		{ 
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}		
		
		JLabel resultPage = new JLabel();
		resultPage.setText("<html><br>Result Page<br><br>Your total monthly expenditure is: $" + costSlider.getValue());
		resultPage.setForeground(Color.white); // set text color
		resultPage.setFont(new Font("", Font.PLAIN, 20)); // set text size and font style
		resultPage.setVerticalAlignment(JLabel.CENTER);
		northPanel.add(resultPage, BorderLayout.CENTER);

		

		this.setVisible(true); // make everything visible including the JFrame itself
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ends the JVM when the JFrame "BeginningPage" is closed
	}
}



