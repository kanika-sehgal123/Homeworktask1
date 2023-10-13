
public class CallProgs {
	public static void main(String args[])
	{
		new CallProgs();
	}
	public CallProgs()
	{
		Mathcal mc=new Mathcal();
		mc.CalcVolume();
		Primes pr=new Primes();
		pr.printPrimes();
		StringCharacters sc=new StringCharacters();
		sc.CalcVowels();
		WordSorter wc=new WordSorter();
		wc.SortWords();
		
		
	}
}
