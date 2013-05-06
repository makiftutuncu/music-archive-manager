package com.mam;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import com.mam.model.SongTags;
import com.mam.utilities.TagUtils;

public class TagUtilsTest
{
	@Test
	public void testReadTags()
	{
		assertNotNull(TagUtils.readTags(new File("testingSet/Teoman/G�n�l�elen/Teoman - G�n�l�elen.mp3")));
	}
	
	@Test
	public void testTagSong()
	{
		assertTrue(TagUtils.tagSong(new File("testingSet/Teoman/G�n�l�elen/Teoman - G�n�l�elen.mp3"), new SongTags("artist", "album", "title")));
	}
}