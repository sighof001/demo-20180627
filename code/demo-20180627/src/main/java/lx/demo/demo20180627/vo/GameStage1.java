package lx.demo.demo20180627.vo;

/**
 * stage 1
 * @author LvXin
 *
 */
public class GameStage1 extends Game{

	@Override
	public boolean isFizz(int number) {
		return number % 3 == 0;
	}

	@Override
	public boolean isBuzz(int number) {
		return number % 5 == 0;
	}

}
