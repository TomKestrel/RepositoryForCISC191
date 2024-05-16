import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * References:
 * For a total list of references, refer to the top notes in the "FinalProjectMainPage.java" file
 * 
 * Responsibilities of class:
 * Contains all the framework for the JFrame "Question3Page" that the users will interact
 */

public class Question3Page extends JFrame // Question3Page IS-A JFrame
{	
	public Question3Page(CostSlider costSlider)
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
		
		// The centerPanel is now another BorderLayout that is divided into a north and south side
		// The center-north side (panel) will contain the tier buttons
		JPanel centerPanelNorth = new JPanel();
		centerPanelNorth.setPreferredSize(new Dimension(0,120));
		centerPanelNorth.setBackground(new Color(100,100,100));
		centerPanelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 50)); // I am now converting the centerPanelNorth into a Flowlayout. First int is horizontal spacing, 2nd int is vertical spacing. These will adjust spacing of the buttons
		centerPanel.add(centerPanelNorth, BorderLayout.NORTH);
		// The center-south side (panel) will contain the tier descriptions
		JPanel centerPanelSouth = new JPanel();
		centerPanelSouth.setPreferredSize(new Dimension(0,230));
		centerPanelSouth.setBackground(new Color(100,100,100));
		centerPanelSouth.setLayout(new GridLayout(1,4,0,0)); // I am now converting the centerPanelSouth into a Gridlayout that has 1 row and 4 columns
		centerPanel.add(centerPanelSouth, BorderLayout.SOUTH);

		// Applying the method "addButtonsMethodForQuestion1" and "addDescriptionsMethodforQuestion1" to each of their relevant panels
		ButtonsAndDescriptionsForQuestion3.addButtonsMethodForQuestion3(centerPanelNorth, this, costSlider);
		ButtonsAndDescriptionsForQuestion3.addDescriptionsMethodforQuestion3(centerPanelSouth);
		
		JLabel question1 = new JLabel();
		question1.setText("<html><br><br>This is USA baby! You must have a car! Right?<br><br>How much do you spend on gas per month?");
		question1.setForeground(Color.white); // set text color
		question1.setFont(new Font("", Font.PLAIN, 20)); // set text size and font style
		question1.setVerticalAlignment(JLabel.CENTER);
		northPanel.add(question1, BorderLayout.CENTER);

		this.setVisible(true); // make everything visible including the JFrame itself
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ends the JVM when the JFrame "BeginningPage" is closed
	}
}
