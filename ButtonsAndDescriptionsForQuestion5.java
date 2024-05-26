import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * References:
 * For a total list of references, refer to the top notes in the "FinalProjectMainPage.java" file
 * 
 * Responsibilities of class:
 * Contains all the relevant methods and actionPerformed/ActionEvents for Question4
 */

public class ButtonsAndDescriptionsForQuestion5
{
	private static ButtonsInterface ButtonInstance = new ButtonSelection();
	
	// Transporting the ArrayList tierCounter from the last ButtonsAndDescriptionsForQuestion class to this class
	private static ArrayList<String> tierCounter = ButtonsAndDescriptionsForQuestion4.getTierCounterFromQuestion4();
	
	// A method that will add the 4 tier buttons and their relevant actionListener and actionPerformed results
	public static void addButtonsMethodForQuestion5(JPanel chooseWhichPanel, JFrame question5PageInstance, CostSlider costSliderInstance)
	
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
				tierCounter.add("Rent cost: $0"); // adds this String onto the ArrayList called tierCounter
				question5PageInstance.dispose(); // disposes this current JFrame
				
				// Practicing an instance of Polymorphism (LO4)
				ButtonInstance.increaseSliderValue(costSliderInstance, 0); // Rent cost: add $0 per month onto costSlider
				
				new ResultPage(costSliderInstance); // proceeds to the next JFrame
				
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
				tierCounter.add("Rent cost: $600"); // adds this String onto the ArrayList called tierCounter
				question5PageInstance.dispose(); // disposes this current JFrame

				// Practicing an instance of Polymorphism (LO4)
				ButtonInstance.increaseSliderValue(costSliderInstance, 600); // Rent cost: add $600 per month onto costSlider
				
				new ResultPage(costSliderInstance); // proceeds to the next JFrame
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
				tierCounter.add("Rent cost: $1500"); // adds this String onto the ArrayList called tierCounter
				question5PageInstance.dispose(); // disposes this current JFrame

				// Practicing an instance of Polymorphism (LO4)
				ButtonInstance.increaseSliderValue(costSliderInstance, 1500); // Rent cost: add $1500 per month onto costSlider
				
				new ResultPage(costSliderInstance); // proceeds to the next JFrame
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
				System.out.println("Tier 3 selected");
				tierCounter.add("Rent cost: $2500"); // adds this String onto the ArrayList called tierCounter
				question5PageInstance.dispose(); // disposes this current JFrame

				// Practicing an instance of Polymorphism (LO4)
				ButtonInstance.increaseSliderValue(costSliderInstance, 2500); // Rent cost: add $2500 per month onto costSlider
				
				new ResultPage(costSliderInstance); // proceeds to the next JFrame
			}
		});
		chooseWhichPanel.add(tier4Button);
	}
	
	// A method that will add the tier descriptions labels underneath each of the buttons
	public static void addDescriptionsMethodforQuestion5(JPanel chooseWhichPanel)
	{
		JLabel tier1Description = new JLabel();
		tier1Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier1Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier1Description.setText("<html>$0<br><br>You either live with your parents or you were born in the 1950s when homes costed like a penny and 2 blueberry bushels<br>");
		tier1Description.setForeground(Color.white); // set text color
		tier1Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier1Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier1Description);
		
		JLabel tier2Description = new JLabel();
		tier2Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier2Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier2Description.setText("<html>$600<br><br>You live with multiple room/housemates<br>");
		tier2Description.setForeground(Color.white); // set text color
		tier2Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier2Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier2Description);
		
		JLabel tier3Description = new JLabel();
		tier3Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier3Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier3Description.setText("<html>$1500<br><br>You value privacy<br>");
		tier3Description.setForeground(Color.white); // set text color
		tier3Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier3Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier3Description);
		
		JLabel tier4Description = new JLabel();
		tier4Description.setBorder(BorderFactory.createEtchedBorder( ));
		tier4Description.setHorizontalAlignment(SwingConstants.CENTER);
		tier4Description.setText("<html>$2500<br>You intend to build no equity<br>");
		tier4Description.setForeground(Color.white); // set text color
		tier4Description.setFont(new Font("", Font.PLAIN, 12)); // set text size and font style
		tier4Description.setVerticalAlignment(JLabel.CENTER);
		chooseWhichPanel.add(tier4Description);
	}
	
	// A method to transport the ArrayList tierCounter from "ButtonsAndDescriptionsForQuestion1" class to "ButtonsAndDescriptionsForQuestion2"
	public static ArrayList<String> getTierCounterFromQuestion4()
	{
		return tierCounter;
	}
}