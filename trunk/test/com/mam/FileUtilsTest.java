package com.mam;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import com.mam.model.SongTags;
import com.mam.utilities.FileUtils;

public class FileUtilsTest
{
	@Test
	public void testGetSubDirectories()
	{
		assertNotNull(FileUtils.getSubDirectories(new File("testingSet")));
	}
	
	@Test
	public void testGetFilesInDirectory()
	{
		assertNotNull(FileUtils.getFilesInDirectory(new File("testingSet/Teoman/G�n�l�elen")));
	}
	
	@Test
	public void testMoveFile()
	{
		assertTrue(FileUtils.moveFile(	new File("testingSet/Teoman/G�n�l�elen/Teoman - �stasyon �nsanlar�.mp3"),
										new File("testingSet/Teoman1/G�n�l�elen2"),
										"Teoman - �stasyon �nsanlar�3.mp3"));
	}
}