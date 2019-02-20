/**
 * 
 * Assignment number 2 is meant for us to practice using github
 * by committing and pushing code to github
 * @author RhyecaRiley Class ID: 534
 *
 */
public class Calculator 
{
	private int total;	
	private String history; 	//used for getHistory
	/**
	 * constructor method
	 */
	public Calculator () 
	{
		total = 0; // not needed - included for clarity
		history = new String("0"); //start at an initial value 0
	}
	/**
	 * Return the current total from all the functions
	 * @return the total
	 */
	public int getTotal () 
	{
		return total;
	}
	/**
	 * add the parameter value into the total variable
	 * @param value, given input value
	 */
	public void add (int value) 
	{
		total = total + value;
		history = history + (" + " + value);
	}
	/**
	 * subtract the parameter value from the total variable
	 * @param value, given input value
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + (" - " + value);
	}
	/**
	 * Multiply the total by the parameter 
	 * @param value, given input value
	 */
	public void multiply (int value) 
	{
		total = total * value;
		history = history + (" * " + value);
	}
	/**
	 * divide the total by the parameter
	 * If value equals zero set the total equal to zero
	 * @param value, given input value
	 */
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		history = history + (" / " + value);
	}
	/**
	 * Return a history of all actions performed (add, subtract, divide, multiply)
	 * @return history
	 */
	public String getHistory () 
	{
		return history;
	}
}