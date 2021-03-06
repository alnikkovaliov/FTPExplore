package by.epam.talab.task1.action;

import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;

public final class Tester {
	public static FTPClient getFTPAccess(String ftpLink, String login, String passPhrase) throws 
	IllegalStateException, IOException, FTPIllegalReplyException, FTPException {
		
		FTPClient client = Connector.getInstance();
		client.connect(ftpLink);
		client.login(login, passPhrase);
	
		return client;
	}
	
	public static FTPClient disconnectFTP(FTPClient client) 
			throws IllegalStateException, IOException, FTPIllegalReplyException, 
			FTPException {
		
		client.logout();
		client.disconnect(true);
		return client;
	}
	
	public static FTPClient breakFTP(FTPClient client) 
			throws IllegalStateException, IOException, 
			FTPIllegalReplyException, FTPException {
		
		client.disconnect(false);
		return client;
	}
	
	
}
