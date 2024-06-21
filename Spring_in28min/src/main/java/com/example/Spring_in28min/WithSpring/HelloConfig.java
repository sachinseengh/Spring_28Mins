package com.example.Spring_in28min.WithSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Spring_in28min.game.GameRunner;
import com.example.Spring_in28min.game.Gamingc;
import com.example.Spring_in28min.game.Mario;

@Configuration
public class HelloConfig {

	@Bean
	 public Gamingc game() {
		var game = new Mario();
		return game;
	}
	
	@Bean
	public GameRunner gmr(Gamingc game) {
		var gm = new GameRunner(game);
		return gm;
		
	}
	
}
