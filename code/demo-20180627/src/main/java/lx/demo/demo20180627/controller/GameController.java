package lx.demo.demo20180627.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lx.demo.demo20180627.vo.Game;
import lx.demo.demo20180627.vo.GameStage1;
import lx.demo.demo20180627.vo.GameStage2;

@RestController
public class GameController {
	@RequestMapping("/stage1")
	public String[] stage1(){
		Game g = new GameStage1();
		return g.allAnswer();
	}

	@RequestMapping("/stage2")
	public String[] stage2(){
		Game g = new GameStage2();
		return g.allAnswer();
	}
}
