package by.epam.talab.task1.action;


import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import it.sauronsoftware.ftp4j.FTPListParseException;

public final class Explorer {
	
	private Explorer() {
	}
	
	public static void changeDir(FTPClient client, String path) throws 
	IllegalStateException, IOException, FTPIllegalReplyException, FTPException,
	FTPDataTransferException, FTPAbortedException, FTPListParseException{
		
		FTPFile[] fileArray = client.list();
		for (int i = 0; i < fileArray.length; i++) {
			if (fileArray[i].getName() == path && 
					fileArray[i].getType() == FTPFile.TYPE_DIRECTORY) {
				client.changeDirectory(path);
			} else {
				throw new IllegalArgumentException("No such directory!");
			}
		}
		
				
	}
	
	
	

}
