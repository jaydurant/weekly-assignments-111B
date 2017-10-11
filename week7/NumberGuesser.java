//Jason Durant

public class NumberGuesser {
	private int originalLowBound;
	private int originalHighBound;
	private int lowBound;
	private int highBound;
	
	NumberGuesser(int lowerBound,int higherBound){
		originalLowBound = lowerBound;
		originalHighBound = higherBound;
		lowBound = lowerBound;
		highBound = higherBound;
	}
	
	public void higher(){
		int midPoint = (lowBound + highBound) / 2;
		lowBound = midPoint + 1;
	}
	
	public void lower(){
		int midPoint = (lowBound + highBound) / 2;
		highBound = midPoint - 1;
	}
	
	public int getCurrentGuess(){
		int result = 0;
		result = (lowBound + highBound)/ 2 ;
		return result;
	}
	
	public void reset(){
		lowBound = originalLowBound;
		highBound = originalHighBound;
	}
}
