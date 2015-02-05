package by.epam.talab.task1.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;

public final class Downloader {
	
	private Downloader() {
	}
	
	public static boolean downloadFile(FTPClient client, String filename, String destination)
			throws IllegalStateException, FileNotFoundException, 
			IOException, FTPIllegalReplyException, FTPException, 
			FTPDataTransferException, FTPAbortedException {
		
		File file = new File(destination);
		file.mkdir();
		file.mkdirs();
		client.download(filename, file);
		
		return file.mkdir() && file.mkdirs();
	} 
}
