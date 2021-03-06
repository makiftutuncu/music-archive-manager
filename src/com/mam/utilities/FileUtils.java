package com.mam.utilities;

import java.io.File;
import java.util.ArrayList;

/**
 * FileUtils is the utility class for handling file operations of MAM
 * 
 * @author Ezgi Hacihalil
 * @author Mehmet Akif Tutuncu
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
	 * Moves a file
	 * 
	 * @param source Source file
	 * @param destinationPath Destination path
	 * @param newFileName New name of the file
	 * 
	 * @return true if successful, false if any error occurs
	 */
	public static boolean moveFile(File source, File destinationPath, String newFileName)
	{
		if(!destinationPath.exists())
		{
			if(destinationPath.mkdirs())
			{
				if(source.renameTo(new File(destinationPath.getAbsolutePath() + "/" + newFileName)))
				{
					return true;
				}
			}
		}
		else
		{
			if(source.renameTo(new File(destinationPath.getAbsolutePath() + "/" + newFileName)))
			{
				return true;
			}
		}
		
		return false;
	}
}