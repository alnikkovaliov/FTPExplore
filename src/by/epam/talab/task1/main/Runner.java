package by.epam.talab.task1.main;


import java.io.IOException;
import by.epam.talab.task1.action.Printer;
import by.epam.talab.task1.action.Tester;
import it.sauronsoftware.ftp4j.*;

public class Runner {

	public static void main(String[] args) 
			throws IllegalStateException, IOException, 
			FTPIllegalReplyException, FTPException, 
			FTPDataTransferException, FTPAbortedException, FTPListParseException {
		
		String ftpLink = "ftp.mozilla.org";
		String login = "anonymous";
		String passPhrase = "ftp4j";
		FTPClient client = Tester.getFTPAccess(ftpLink, login, passPhrase);
		
				
		String dir = client.currentDirectory();
		Printer.toConsole(dir);
		FTPFile[] fileArray = client.list();
		for (int i = 0; i < fileArray.length; i++) {
			System.out.println(fileArray[i].getName().toString());
		}
		
//		client.changeDirectory("pub/");
//		dir = client.currentDirectory();
//		
//		Printer.toConsole(dir);
//		fileArray = client.list();
//		for (int i = 0; i < fileArray.length; i++) {
//			System.out.println(fileArray[i].getName().toString());
//			
//		}
		
	}
}
