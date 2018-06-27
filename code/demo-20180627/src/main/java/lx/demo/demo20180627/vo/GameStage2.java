package lx.demo.demo20180627.vo;

/**
 * stage 2
 * @author LvXin
 *
 */
public class GameStage2 extends Game{
	@Override
	public boolean isFizz(int number) {
		return (number % 3 == 0) || isContain(number, 3);
	}

	@Override
	public boolean isBuzz(int number) {
		return (number % 5 == 0) || isContain(number, 5);
	}
	
	/**
	 * src 中是否包含nubmer
	 * LvXin
	 * @param src
	 * @param number
	 * @return
	 */
	private boolean isContain(int src,int number) {
		while(src > 0) {
			if (src % 10 == number) {
				return true;
			}
			
			src = src / 10;
		}
		
		return false;
	}

}
