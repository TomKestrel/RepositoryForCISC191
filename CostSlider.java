import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * References:
 * For a total list of references, refer to the top notes in the "FinalProjectMainPage.java" file
 * 
 * Responsibilities of class:
 * This is the CostSlider class that will have a method to create a costSlider widget.
 * This class will also contain all the relevant get methods associated with each button selections that will then also increment the current value based on user's button selection
 */

public class CostSlider
{
	// parameters are as follow: (lowestSliderValue, maximumSliderValue, initialSliderPosition)
	private JSlider costSlider = new JSlider(0, 5000, 0); // CostSlider HAS-A costSlider
	private JLabel totalCost = new JLabel(); // CostSlider HAS-A totalCost
	
	public void addCostSlider (JPanel panel)
	{
		costSlider.setMajorTickSpacing(1000);
		costSlider.setPreferredSize(new Dimension(900, 100)); // arguements are: (width, height)
		costSlider.setPaintTicks(true); // allows the tick to be implemented
		costSlider.setMajorTickSpacing(1000); // sets major tick notches
		costSlider.setPaintLabels(true); // allows the numerical major tick values to be displayed
		costSlider.setEnabled(false); // disabling the slider to prevent users from manually interacting with it (the slider will update only based on tier selections)
		totalCost.setText("Total monthly cost so far: $" + costSlider.getValue()); // incrementally displays the total monthly expenditure
		totalCost.setForeground(Color.white); // sets text color
		panel.add(costSlider);
		panel.add(totalCost);
	}
	
	//===================================================================================================================================
	// Methods for ButtonsAndDescriptionsForQuestion1
	public void question1IncreaseSliderValueTier1()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 0); // $0 x 4 weeks = $0 per month
	}

	public void question1IncreaseSliderValueTier2()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 60); // $15 x 4 weeks = $60 per month
	}
	
	public void question1IncreaseSliderValueTier3()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 120); // $30 x 4 weeks = $120 per month
	}
	
	public void question1IncreaseSliderValueTier4()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 400); // $100 x 4 weeks = $400 per month
	}
	
	//===================================================================================================================================
	// Methods for ButtonsAndDescriptionsForQuestion2
	public void question2IncreaseSliderValueTier1()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 0); // $0 x 4 weeks = $0 per month
	}
	
	public void question2IncreaseSliderValueTier2()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 100); // $100 x 1 week = $100 per month
	}
	
	public void question2IncreaseSliderValueTier3()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 300); // $300 x 1 week = $300 per month
	}
	
	public void question2IncreaseSliderValueTier4()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 600); // $600 x 1 week = $600 per month
	}
	
	//===================================================================================================================================
	// Methods for ButtonsAndDescriptionsForQuestion3
	public void question3IncreaseSliderValueTier1()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 0); // $0 per month in gas
	}
	
	public void question3IncreaseSliderValueTier2()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 100); // $100 per month in gas
	}
	
	public void question3IncreaseSliderValueTier3()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 200); // $200 per month
	}
	
	public void question3IncreaseSliderValueTier4()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 300); // $300 per month
	}
	
	//===================================================================================================================================
	// Methods for ButtonsAndDescriptionsForQuestion4
	public void question4IncreaseSliderValueTier1()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 0); // $0 per month in health insurance
	}
	
	public void question4IncreaseSliderValueTier2()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 400); // $400 per month in health insurance
	}
	
	public void question4IncreaseSliderValueTier3()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 800); // per month in health insurance
	}
	
	public void question4IncreaseSliderValueTier4()
	{
		int currentValue = costSlider.getValue();
		costSlider.setValue(currentValue + 1200); // per month in health insurance
	}

	//===================================================================================================================================
	public int getValue()
	{
		return costSlider.getValue(); //gets the value from costSlider (used in the ResultPage class)
	}
	
}
