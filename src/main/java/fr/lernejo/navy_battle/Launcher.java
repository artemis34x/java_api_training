package fr.lernejo.navy_battle; 

public class Launcher {

	public static int port = 9876;
	public static void main(String[] args) {

		Server httpServer = new Server();
		httpServer.Start(port);
	}
}
