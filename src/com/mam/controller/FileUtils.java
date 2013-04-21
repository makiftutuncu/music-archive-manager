package com.mam.controller;

import java.io.File;
import java.util.ArrayList;

/**
 * FileUtils is the utility class for handling file operations of MAM
 * 
 * @author Ezgi Hacihalil
 * @author Mehmet Akif Tutuncu
 * @author Rhahadian Bima Saputra
 */
public class FileUtils
{
	/**
	 * Gets the list of sub directories of the given directory
	 *   
	 * @param root Directory from which the sub directories will be found
	 * 
	 * @return The list of sub directories of the given directory
	 */
	public static ArrayList<File> getSubDirectories(File root)
	{
		ArrayList<File> subDirectories = null;
		
		if(root.isDirectory())
		{
			subDirectories = new ArrayList<File>();
			for(File file : root.listFiles())
			{
				if(file.isDirectory())
				{
					subDirectories.add(file);
		        }
		    }
		}
		
		return subDirectories;
	}
	
	/**
	 * Gets the list of .mp3 files in the given directory
	 *   
	 * @param root Directory from which the files will be found
	 * 
	 * @return The list of all .mp3 files in the given directory
	 */
	public static ArrayList<File> getFilesInDirectory(File root)
	{
		ArrayList<File> files = null;
		
		if(root.isDirectory())
		{
			files = new ArrayList<File>();
			for(File file : root.listFiles())
			{
				if(!file.isDirectory())
				{
					if(file.getName().endsWith(".mp3") || file.getName().endsWith(".MP3"))
					{
						files.add(file);
					}
		        }
		    }
		}
		
		return files;
	}
	
	/**
	 * Gets the name/extension of the file
	 * 
	 * @param file File object from which the name/extension is going to be read
	 * @param isName Control flag
	 * 
	 * @return If isName is true, name of the file;
	 *         if isName is false, extension of the file; null if the file doesn't have any extension
	 */
	public static String getNameOrExtension(File file, boolean isName)
	{
		if(file.getName().contains("."))
		{
			int end = file.getName().lastIndexOf(".");
			
			if(isName)
			{
				return file.getName().substring(0, end);
			}
			else
			{
				return file.getName().substring(end, file.getName().length());
			}
		}
		
		return null;
	}
}