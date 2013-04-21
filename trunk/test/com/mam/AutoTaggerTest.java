package com.mam;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import com.mam.controller.AutoTagger;
import com.mam.model.SongTags;

public class AutoTaggerTest
{
	@Test
	public void testExtractTitleFromFileName()
	{
		assertNotNull(new AutoTagger("testingSet").extractTitleFromFileName("Teoman - Mavi.mp3", "\\-", 1));
	}
	
	@Test
	public void testTagSong()
	{
		assertTrue(new AutoTagger("").tagSong(	new File("testingSet/Teoman/G�n�l�elen/Teoman - G�n�l�elen.mp3"),
												new SongTags("artist", "album", "title")));
	}
}