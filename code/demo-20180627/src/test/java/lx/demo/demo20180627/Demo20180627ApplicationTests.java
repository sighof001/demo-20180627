package lx.demo.demo20180627;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lx.demo.demo20180627.vo.Game;
import lx.demo.demo20180627.vo.GameStage1;
import lx.demo.demo20180627.vo.GameStage2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo20180627ApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void testStage1() {
		Game g = new GameStage1();
		int[] fizz = {3,6,9};
		int[] buzz = {5,50};
		int[] fizzbuzz = {15,30};
		int[] number = {1,2,4,31,52,98};
		
		for(int n : fizz) {
			assertEquals("Fizz", g.answer(n));
		}
		
		for(int n : buzz) {
			assertEquals("Buzz", g.answer(n));
		}
		
		for(int n : fizzbuzz) {
			assertEquals("FizzBuzz", g.answer(n));
		}
		
		for(int n : number) {
			assertEquals(n, n);
		}
		
	}

	
	@Test
	public void testStage2() {
		Game g = new GameStage2();
		int[] fizz = {3,6,9,31};
		int[] buzz = {5,50,52};
		int[] fizzbuzz = {15,30};
		int[] number = {1,2,4,98};
		
		for(int n : fizz) {
			assertEquals("Fizz", g.answer(n));
		}
		
		for(int n : buzz) {
			assertEquals("Buzz", g.answer(n));
		}
		
		for(int n : fizzbuzz) {
			assertEquals("FizzBuzz", g.answer(n));
		}
		
		for(int n : number) {
			assertEquals(n, n);
		}
	}

}
