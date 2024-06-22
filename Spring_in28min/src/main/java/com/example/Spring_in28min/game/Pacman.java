package com.example.Spring_in28min.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements Gamingc{
	public void up() {
		System.out.println("going up");
	}
	
	public void down() {
		System.out.println("Going Down");
	}
}
