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
	
	public static boolean downloadFile(FTPClient client, String filename, String destinationFolder)
			throws IllegalStateException, FileNotFoundException, 
			IOException, FTPIllegalReplyException, FTPException, 
			FTPDataTransferException, FTPAbortedException {
		
		File file = new File(destinationFolder);
		
		if (!file.exists()) {
			file.mkdir(); 
			file.mkdirs(); 
		} else if (file.isDirectory()) {
			client.download(filename, new File(destinationFolder, filename));
		} else {
			throw new IllegalArgumentException("There is a file with destinationFolder name!");
		}
		
		return true;
	} 
}
