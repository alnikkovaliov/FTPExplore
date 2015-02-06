package by.epam.talab.task1.action;

import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;

public final class Explorer {
	
	private Explorer() {
	}
	
	public static void changeDir(FTPClient client, String path) throws 
	IllegalStateException, IOException, FTPIllegalReplyException, FTPException{
		client.changeDirectory(path);
				
	}
	
	
	

}
