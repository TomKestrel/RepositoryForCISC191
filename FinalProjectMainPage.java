/**
 * Lead Author: 
 * Wootark Kim (github username will say Tom Kestrel)
 * 
 * Other contributors:
 * Chris from "BroCode" Youtube channel. Did not receive direct personal help but I got to watch his tutorial videos on multiple subjects. References will be listed below.
 * Choob from "choobtorials" Youtube channel. Did not receive direct personal help but I got to watch his tutorial videos on ActionListener. References will be listed below.
 * 
 * References - [Readings]
 * ==========================================================================================================================================================================
 * "Borders - Learning Java [Book] - O'Reilly"
 * Retrieved from: https://www.oreilly.com/library/view/learning-java/1565927184/ch14s04.html#:~:text=Creating%20and%20setting%20a%20component's,createEtchedBorder(%20))%3B
 * 
 * "Character isDigit() method in Java with examples"
 * https://www.geeksforgeeks.org/character-isdigit-method-in-java-with-examples/
 * 
 * "Check If a String Is Numeric in Java"
 * https://www.baeldung.com/java-check-string-number
 * note: I didn't exactly understood regex fully so decided to not use this method, but it was still a cool reading
 * 
 * "How to center the text in a JLabel?"
 * Retrieved from: https://stackoverflow.com/questions/6810581/how-to-center-the-text-in-a-jlabel
 * 
 * "RGB Calculator"
 * Retrieved from: https://www.w3schools.com/colors/colors_rgb.asp
 * 
 * References - [Videos]
 * ==========================================================================================================================================================================
 * "Part 4 | Java GUI Tutorial | How to implement a Java ActionListener to make buttons do something?"
 * Retrieved from: https://www.youtube.com/watch?v=WMITfhvXVJg
 * 
 * "Java GridLayout 🔳"
 * Retrieved from: https://www.youtube.com/watch?v=ohNqQagkDDY
 * 
 * "Java FlowLayout 🌊"
 * https://www.youtube.com/watch?v=pDqjHozkMBs
 * 
 * "How to accept user input in Java ⌨️【8 minutes】"
 * https://www.youtube.com/watch?v=wAEPokhj5Q4&t=163s
 * 
 * "Java textfield 📛"
 * https://www.youtube.com/watch?v=dyDDUndlMnU&t=411s
 * 
 * "Java FileWriter (write to a file) 📝"
 * https://www.youtube.com/watch?v=kjzmaJPoaNc&t=13s
 * 
 * "Java FileReader (read a file) 📖"
 * https://www.youtube.com/watch?v=Hr8tLlj32BQ
 * ==========================================================================================================================================================================
 * 
 * Version/date:
 * 1.0 (1st submission: 27 April 2024) 
 *  - Project Proposal 
 * 2.0 (2nd submission: 6 May 2024)
 *  - Implemented a basic framework of JFrame and ButtonsAndDescription methods as "boilerplate templates" 
 *  - Implemented and checked to see if all relevant widgets worked 
 *  - Realized I had to massively revamp the UML diagram from my original plan
 * 3.0 (3rd submission: 16 May 2024)
 *  - Strung together multiple JFrames of (Question0Page -> Question1Page -> Question2Page ->... ResultPage) through action listener based on buttons pressed
 *  - Implemented a costSlider widget that gets updated based on user's expenditure selections
 *  - Implemented a way for the same instance of a costSlider to be transported from one JFrame to another
 *  - Implemented a ListArray that will keep track of user's selection.
 *  - Implemented a PrintWriter class to take in user's input that will then save to a file
 *  - Implemented a custom Exception class to prevent users from proceeding forward if they put in a non-numerical expenditure input
 *  - Implemented a "ResultPage" that will display the total racked up expenditures. Will also display the user's original guess
 * 4.0 (4th submission: 25 May 2024)
 *  - Implemented polymorphism through the "ButtonsInterface" class. The method found within it is then defined in the "ButtonDelection" class. Instances of ButtonInterface is then made and utilized to customize how much value to be added in costSlider during a button press.
 * 
 * Current LOs checklist:
 * (LO1 - Object Oriented Design)-----------Demonstrated through general practice of Object Oriented Design all throughout the project (e.g. aggregation, inheritance, methods, etc.)
 * (LO2 - Arrays)---------------------------Do not need to implement arrays into final project (already have senior through video submission)
 * (LO3 - Beginning Classes)----------------Demonstrated through (other than basic class creations) object aggregation of the CostSlider class (e.g. "CostSlider costSlider;")
 * (LO4 - Inheritance and PolyMorphism)-----Demonstrated Polymorphism through the interface class "ButtonsInterface," the ButtonSelection class, and applied onto "ButtonsAndDescriptionsForQuestions3,4, and 5" (note that I left 1 and 2 alone to show the difference between the old vs new) Demonstrates inheriteance through "extends" keywords (e.g. "NonNumberInputException extends Exception" and "Question1Page extends JFrame")
 * (LO5 - Generic Data Structure)-----------Demonstrated through the ArrayList called tierCounter that keeps and tracks of all the selection the user chose
 * (LO6 - GUI)------------------------------Demonstrated through the project's utilization of numerous GUI widgets (e.g. JFrames, JLabels, Layoutmanagers, etc.)
 * (LO7 - Exception Handling)---------------Demonstrated through the custom exception usage "NonNumberInputException" and general practices of exception try-catch blocks when utilizing PrintWriter in the Question0Page class
 * (LO8 - Input/Output)---------------------Demonstrated through input of user spending guess to text file and then the file being read back to the user in the ResultPage
 * 
 * Responsibilities of class:
 * The main class that will start the program
 */

public class FinalProjectMainPage
{
	public static void main(String args[])
	{
		new Question0Page();
	}
}

