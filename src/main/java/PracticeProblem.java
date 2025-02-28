public class PracticeProblem {
	public static void main(String args[]) {
		boolean q1 = totalWordsChecker("Hello'a b c d e f g h i j");
		System.out.println(q1);
	}
	public static int calculate(int num, int num2, char operator){
		int result = 0;
		switch(operator){
			case '+':
				result = num + num2;
				break;
			case '-':
				result = num - num2;
				break;
			case '*':
				result = num * num2;
				break;
			case '/':
				result = num/num2;
				break;
			case '%':
				result = num%num2;
				break;
			case '^':
				result = (int)Math.pow(num, num2);
		}
		return result;
	}
	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String word){
		boolean result = false;
		String check = "[^A-Za-z'_]+";
		String [] words = word.split(check);
		if(words.length <= MAXIMUM){
			result = true;
		}
		return result;
	}

	public static String minString(String word, String word2, String word3){
		word = word.toLowerCase();
		word2 = word2.toLowerCase();
		word3 = word3.toLowerCase();
		String result;
		if(word.compareTo(word2) < 0 && word.compareTo(word3) < 0){
			result = word;
		}
		else if(word2.compareTo(word) < 0 && word2.compareTo(word3) < 0){
			result = word2;
		}
		else{
			result = word3;
		}
		return result;
	}
}
