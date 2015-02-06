package by.epam.talab.task1.action;

import it.sauronsoftware.ftp4j.FTPClient;

public final class Connector {
		
	private Connector() {
	}
	
	private static class ConnectionHolder {
		private static final FTPClient CONNECTION = new FTPClient();
	}
	
	public static FTPClient getInstance() {
		
		return ConnectionHolder.CONNECTION;
	}

}
