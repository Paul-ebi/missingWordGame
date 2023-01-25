package fileIO;

import java.util.ArrayList;

public class FileInstantiation {
FileManagement someFileManagement;
	
	public static void writeNewWord(String wordToAdd)
	{
		FileManagement someFileManagement = new FileManagement();
		someFileManagement.writeToFile(wordToAdd);
	}
	
	public static ArrayList<String> getRandomWordArrList()
	{
		FileManagement someFileManagement = new FileManagement();
		someFileManagement.openFile(FileManagement.file);
		ArrayList<String> arrayListToReturn = someFileManagement.readFile();
		someFileManagement.closeFile();
		
			return arrayListToReturn;

}
	
}
