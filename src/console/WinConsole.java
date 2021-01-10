package console;

import java.io.IOException;

public class WinConsole {

	public static void cls() throws InterruptedException, IOException {
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //"cmd", "/c",
		
	}
	
	public static void pause() throws InterruptedException, IOException {
		
		new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor(); //"cmd", "/c",
		
	}
	
	
}
