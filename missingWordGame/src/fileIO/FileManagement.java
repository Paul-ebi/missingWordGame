package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import Menus.GamePlay;
import Menus.OptionM;

public class FileManagement extends JFrame {

	public static Scanner someScanner;
	public static String file = "C:\\\\Users\\\\PAUL-AB\\\\eclipse-workspace\\\\assignment\\\\src\\\\file.db";
	
	
	
	public static void openFile(String file)
	{
		try
		{
			someScanner = new Scanner
				(
					new File
					(
							file
						//System.getProperty("user.dir") + "/WordBank.txt"
					)
				);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong!");
		}
	}
	
	public ArrayList<String> readFile()
	{
//		while(someScanner.hasNext())
//		{
//			String a = someScanner.nextLine();
//			//System.out.println(a);
//		}
		
		ArrayList<String> someList = new ArrayList<String>();
		while (someScanner.hasNext())
		{
		    someList.add(someScanner.nextLine());  
		}
		
		return someList;
	}
	
	public void closeFile()
	{
		someScanner.close();
	}
	
	public void writeToFile(String newWord)
	{
		try
		{
			BufferedWriter someWriter = new BufferedWriter
				(
					new FileWriter
						(
								file, true
						)
				);
			someWriter.append("\n" + newWord);
			someWriter.close();
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong!");
		}
	}
	
	public void writeCleanToFile(ArrayList<String> updatedFile)
	{
		try
		{
			BufferedWriter someWriter = new BufferedWriter
				(
					new FileWriter
						(
								file, false
						)
				);
	
			boolean firstRun = true;
			for (String x: updatedFile)
			{
				if(firstRun == true)
				{
					someWriter.write(x);
					firstRun = false;
				}
				else
				{
					someWriter.write("\n" + x);
				}
			}
			someWriter.close();
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong!");
		}
	}
}
