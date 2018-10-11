package ovn8;

import se.lth.cs.window.SimpleWindow;
import java.util.Scanner;

public class TurtleRace {

	public static void main(String[] args) {
		boolean runGame = true;
		Scanner scan = new Scanner(System.in);
		SimpleWindow w = new SimpleWindow(800, 800, "TurtleRace");
		w.setLineWidth(2);
		Turtle t = new Turtle(w, 0, 0);
		Turtle t1 = new Turtle(w, 250, 300);
		Turtle t2 = new Turtle(w, 300, 300);
		Turtle t3 = new Turtle(w, 350, 300);
		RaceTrack track = new RaceTrack(300, 100, t, w);
		RacingEvent event = new RacingEvent(track, t1, t2, t3);
		while (runGame) {
			track.resetTrack();
			event.resetRace(w);

			w.waitForMouseClick();
			event.StartRace(w);
			track.writeWinner(event);
			w.waitForMouseClick();

		}

	}

}