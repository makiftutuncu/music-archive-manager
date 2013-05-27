package com.mam.controller;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 * General controller for the Music Archive Manager
 * 
 * @author Ezgi Hacihalil
 * @author Mehmet Akif Tutuncu
 */
public class MAM
{
	/**	The progress bar in the main frame */
	protected JProgressBar myProgressBar;
	
	/** Text area for the logging in the main frame */
	protected JTextArea myOutputLog;
	
	/**
	 * Constructor for MAM
	 * 
	 * @param progressBar The progress bar in the main frame
	 * @param outputLog Text area for the logging in the main frame
	 */
	public MAM(JProgressBar progressBar, JTextArea outputLog)
	{
		myProgressBar = progressBar;
		myOutputLog = outputLog;
	}

	/**
	 * Performs auto-tagging on the given music archive directory
	 * 
	 * @param musicArchive Path of the music archive directory
	 */
	public void autoTag(String musicArchive)
	{
		new AutoTagger(musicArchive, myProgressBar, myOutputLog).run();
	}
	
	/**
	 * Performs auto-naming on the given music archive directory
	 * 
	 * @param musicArchive Path of the music archive directory
	 */
	public void autoName(String musicArchive)
	{
		new AutoNamer(musicArchive, myProgressBar, myOutputLog).run();
	}
	
	/**
	 * Performs auto-filing on the given music archive directory
	 * 
	 * @param musicArchive Path of the music archive directory
	 */
	public void autoFile(String musicArchive)
	{
		new AutoFiler(musicArchive, myProgressBar, myOutputLog).run();
	}
}