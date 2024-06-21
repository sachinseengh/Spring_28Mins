package com.example.Spring_in28min;

import com.example.Spring_in28min.game.GameRunner;
import com.example.Spring_in28min.game.Mario;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		Mario mario= new Mario();
		//Pacman packman = new Pacman();
		GameRunner gr = new GameRunner(mario);
		gr.run();
		
		

	}

}
