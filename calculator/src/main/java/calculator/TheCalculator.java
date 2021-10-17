package calculator;
/** Klasa zawierająca logikę kalkulatora*/
public class TheCalculator 
{
	/** liczba buforowana*/
	double buffer;
	/** czy buforowana liczba istnieje*/
	boolean bufferB;
	/** operacja buforowana*/
	char operation;
	/** aktualnie wpisywana liczba */
	double current;
	/** czy aktualnie wpisywana liczba istnieje*/
	boolean currentB;
	/** czy użytkownik może usuwać znaki z inputu*/
	boolean deletable;
	/** konstrukotr kalkulatora*/
	public TheCalculator()
	{
		buffer = 0;
		operation = ' ';
		current = 0;
		currentB = false;
		deletable = false;
		bufferB = false;
	}
	/** wczytywanie cyfr
	 * @param cyfra
	 */
	public void inputCurrent(double input)
	{
		if (currentB)
		{
			current*=10;
			current+=input;
		}
		else
		{
			currentB = true;
			current = input;
		}
		deletable = true;
	}
	/**
	 * funkcja "="
	 */
	public void equals()
	{
		if (currentB && bufferB)
		{
			if (operation == '+')
			{
				current = current + buffer;
			}
			if (operation == '-')
			{
				current = buffer - current;
			}
			if (operation == '*')
			{
				current = current * buffer;
			}
			if (operation == '/')
			{
				current = buffer / current;
			}
			bufferB=false;
			buffer = 0;
			operation = ' ';
			deletable = false;
		}
	}
	/** wczytywanie operatorów
	 * @param input operator
	 */
	public void inputOperation(char input)
	{
		if (input == '*' || input == '/' || input == '+' || input == '-')
		{
			if (currentB && !bufferB)
			{
				operation = input;
				buffer = current;
				bufferB=true;
				currentB=false;
				current =0;
			
			}
			else if (currentB && bufferB)
			{
				equals();
				operation = input;
				buffer = current;
				bufferB=true;
				currentB=false;
				current =0;
			}
			else if (!currentB && bufferB)
			{
				operation = input;
			}
		}
	}
	public String getCurrent()
	{
		if (currentB)
			return "  " + Double.toString(current);
		else
			return " ";
	}
	public String getBuffer()
	{
		if (bufferB)
			return "  " + Double.toString(buffer) + " " + operation;
		else
			return " ";
	}
	public void delete()
	{
		if (deletable)
		{
			current -= current%10;
			current /= 10;
		}
	}
}
