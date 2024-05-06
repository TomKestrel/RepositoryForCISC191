import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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

public class ButtonsAndDescriptionsForQuestion1 
{
	// A method that will add the 4 tier buttons and their relevant actionListener and actionPerformed results
	public static void addButtonsMethodForQuestion1(JPanel chooseWhichPanel)
	
	// [Explanation notes]
	//
	// Parameter Explanation: "chooseWhichPanel" as in add it to northPanel, southPanel, or centerPanel found in the BeginningPage class.
	//
	// Keyword Explanation: Added "static" so that the method belongs to the class itself rather than to any instances of 
	// 						it. Adding static to a method means I can invoke the method by directly calling on the class
	// 						itself (without creating an instance of the class).
	
	{	
		JButton tier1Button = new JButton("Tier 1");
		tier1Button.setPreferredSize(new Dimension(150,50));
		tier1Button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Tier 1 selected");
				// additional functionalities to add: selection will proceed to the new question (open a new JFrame perhaps but will this cause a problem with the slider widgets?)
				//									  selection will update the slider widgets
			}
		});
		chooseWhichPanel.add(tier1Button);
		
		JButton tier2Button = new JButton("Tier 2");;
		tier2Button.setPreferredSize(new Dimension(150,50));
		tier2Button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Tier 2 selected");
			}
		});
		chooseWhichPanel.add(tier2Button);
		
		JButton tier3Button = new JButton("Tier 3");;
		tier3Button.setPreferredSize(new Dimension(150,50));
		tier3Button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Tier 3 selected");
			}
		});
		chooseWhichPanel.add(tier3Button);
		
		JButton tier4Button = new JButton("Tier 4");;
		tier4Button.setPreferredSize(new Dimension(150,50));
		tier4Button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Tier 4 selected");
			}
		});
		chooseWhichPanel.add(tier4Button);
	}
	
	// A method that will add the tier descriptions labels underneath each of the buttons
	public static void addDescriptionsMethodforQuestion1(JPanel chooseWhichPanel)
	{
		JLabel tier1Description = new JLabel();
		tier1Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier1Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier1Description.setText("<html>Insert tier 1 description here.");
		tier1Description.setForeground(Color.white); // set text color
		tier1Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier1Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier1Description);
		
		JLabel tier2Description = new JLabel();
		tier2Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier2Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier2Description.setText("<html>Insert tier 2 description here.");
		tier2Description.setForeground(Color.white); // set text color
		tier2Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier2Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier2Description);
		
		JLabel tier3Description = new JLabel();
		tier3Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier3Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier3Description.setText("<html>Insert tier 3 description here.");
		tier3Description.setForeground(Color.white); // set text color
		tier3Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier3Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier3Description);
		
		JLabel tier4Description = new JLabel();
		tier4Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier4Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier4Description.setText("<html>Insert tier 4 description here.");
		tier4Description.setForeground(Color.white); // set text color
		tier4Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier4Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier4Description);
	}

	//tier1Description.setText("<html><div style='text-align: center;'>Centered Text</div></html>");
}
