package com.example.Spring_in28min.game;

public class GameRunner {

	// This is tightly coupled with Mario game to run other game we have to change
	//Mario m;
	//Pacman m;

	
	//Using interface to make it loosely coupled
	Gamingc m;
	public GameRunner(Gamingc m) {
		this.m = m;
	}

	public void run() {
		System.out.println("Game Running" + m);
		m.up();
		m.down();
	}
}
