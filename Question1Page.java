import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Author: Wootark Kim (github username will say Tom Kestrel)
 * 
 * Keeping Track of references:
 * 
 * "How to center the text in a JLabel?"
 * Retrieved from: https://stackoverflow.com/questions/6810581/how-to-center-the-text-in-a-jlabel
 * 
 * "Borders - Learning Java [Book] - O'Reilly"
 * Retrieved from: https://www.oreilly.com/library/view/learning-java/1565927184/ch14s04.html#:~:text=Creating%20and%20setting%20a%20component's,createEtchedBorder(%20))%3B
 * 
 * "RGB Calculator"
 * Retrieved from: https://www.w3schools.com/colors/colors_rgb.asp
 * 
 * "Part 4 | Java GUI Tutorial | How to implement a Java ActionListener to make buttons do something?"
 * Retrieved from: https://www.youtube.com/watch?v=WMITfhvXVJg
 * 
 * "Java GridLayout 🔳"
 * Retrieved from: https://www.youtube.com/watch?v=ohNqQagkDDY
 * 
 * "Java FlowLayout 🌊"
 * https://www.youtube.com/watch?v=pDqjHozkMBs
 * 
 * Next Step to do:
 * Find a way to practice/show implementation of aggregation. Find a way to do that with sliders that I will be adding to the southPanel
 * Then find a way a tier selection will update the slider
 * Question to ask myself: have the tier selection bring a whole new JFrame up, but will it be possible to have the updated slider implemented correctly from one JFrame to next?
 * 
 */

public class Question1Page extends JFrame // BeginningPage IS-A JFrame.
{
	public Question1Page()
	{
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
		
		// setting the centerPanel to have a flowlayout
		// centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 100)); // first int is horizontal spacing, 2nd int is vertical spacing. Will adjust spacing of the buttons

		// Applying the method "addButtonsMethodForQuestion1" and "addDescriptionsMethodforQuestion1" to each of their relevant panels
		ButtonsAndDescriptionsForQuestion1.addButtonsMethodForQuestion1(centerPanelNorth);
		ButtonsAndDescriptionsForQuestion1.addDescriptionsMethodforQuestion1(centerPanelSouth);
		
		JLabel question1 = new JLabel();
		question1.setText("<html><br><br>Insert question here.<br>e.g. How much do you spend per week on eating out?");
		question1.setForeground(Color.white); // set text color
		question1.setFont(new Font("", Font.PLAIN, 20)); // set text size and font style
		question1.setVerticalAlignment(JLabel.CENTER);
		northPanel.add(question1, BorderLayout.CENTER);

		this.setVisible(true); // make everything visible including the JFrame itself
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ends the JVM when the JFrame "BeginningPage" is closed
	}
}


