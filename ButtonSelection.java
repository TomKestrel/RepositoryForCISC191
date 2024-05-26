
public class ButtonSelection implements ButtonsInterface
{

	@Override
	public void increaseSliderValue(CostSlider costSliderInstance, int addValue)
	// Parameter explanation:
	// costSliderInstance -> bring the instance of the costSlider over to the new question onto its associated button
	// addValue -> will increase the costSlider by a certain amount
	{
		int currentValue = costSliderInstance.getValue(); // Retrieve the currentValue on the costSlider
		costSliderInstance.setValue(currentValue + addValue); // Then increase the costSlider by a custom value amount (by adding onto the currentValue)
	}
}
