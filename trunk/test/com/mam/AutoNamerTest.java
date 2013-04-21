package com.mam;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import com.mam.controller.AutoNamer;
import com.mam.model.SongTags;

public class AutoNamerTest
{
	@Test
	public void testReadTags()
	{
		assertNotNull(new AutoNamer("testingSet").readTags(new File("testingSet/Teoman/G�n�l�elen/Teoman - G�n�l�elen.mp3")));
	}
	
	@Test
	public void testUpdateFileName()
	{
		assertNotNull(new AutoNamer("testingSet").updateFileName(	new File("testingSet/Teoman/G�n�l�elen/Teoman - G�n�l�elen.mp3"),
																new SongTags("artist", "album", "title"),
																new File("testingSet/Teoman"),
																new File("testingSet/Teoman/G�n�l�elen")));
		
		assertNotNull(new AutoNamer("testingSet").updateFileName(	new File("testingSet/Teoman/G�n�l�elen/Teoman - Mavi.mp3"),
																new SongTags(null, "album", "title"),
																new File("testingSet/Teoman"),
																new File("testingSet/Teoman/G�n�l�elen")));
	}
}