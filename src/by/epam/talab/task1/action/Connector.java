package by.epam.talab.task1.action;

import it.sauronsoftware.ftp4j.FTPClient;

public final class Connector {
	private static FTPClient INSTANCE;
	
	private Connector() {
	}
	
	public static synchronized FTPClient getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new FTPClient();
		}
		return INSTANCE;
	}
	
}
