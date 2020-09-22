package view;

import controller.Cars;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);

		for(int i = 0; i < 4; i++) {
			Cars car = new Cars(semaphore, (i+1));
			car.start();
		}

	}

}
