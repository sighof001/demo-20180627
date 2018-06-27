package lx.demo.demo20180627.vo;

/**
 * a game 
 * @author LvXin
 */
public abstract class Game {	
	private static final int STUDENT_NUMBER = 100;
	
	/**
	 * 获取所有答案
	 * LvXin
	 * @return
	 */
	public String[] allAnswer(){
		String[] r = new String[STUDENT_NUMBER];
		for (int i = 0; i < STUDENT_NUMBER; i++) {
			r[i] = answer(i + 1);
		}
		
		return r;
	}
	
	/**
	 * 某一个数应该回答什么
	 * LvXin
	 * @param number
	 * @return
	 */
	public String answer(int number) {
		if (isFizz(number) && isBuzz(number)) {
			return "FizzBuzz";
		}
		
		if (isFizz(number)) {
			return "Fizz";
		}
		
		if (isBuzz(number)) {
			return "Buzz";
		}
		
		return String.valueOf(number);
	}
	
	/**
	 * 是否回答Fizz
	 * LvXin
	 * @param number
	 * @return
	 */
	public abstract boolean isFizz(int number);
	/**
	 * 是否回答Buzz
	 * LvXin
	 * @param number
	 * @return
	 */
	public abstract boolean isBuzz(int number);
}
