package calculator;
/** Klasa zawierająca logikę kalkulatora*/
public class TheCalculator {
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
	/** konstrukotr kalkulatora*/
	public TheCalculator()
	{
		buffer = 0;
		operation = ' ';
		current = 0;
		currentB = false;
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
			current = input;
		}
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
				currentB=false;
				current =0;
			
			}
			else if (currentB && bufferB)
			{
				equals();
				operation = input;
				buffer = current;
				currentB=false;
				current =0;
			}
			else if (!currentB && bufferB)
			{
				operation = input;
			}
		}
	}
}