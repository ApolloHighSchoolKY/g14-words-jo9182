import java.util.List;
import java.util.ArrayList;

public class Word
{
	//Instance field(variable)
	private String word;

	//Class field(variable)
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{

	}

	public Word(String newWord)
	{
		word = newWord;
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
		int count = 0;
		//Loop for every letter in "word"

			//Use indexOf to see if the letter is in the string "vowels"
		for(int i = 0; i < word.length(); i++){
			if(VOWELS.contains(word.substring(i,i+1))){
				count++;
			}
		}

		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return "" + word;
	}
}