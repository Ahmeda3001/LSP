package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * JUnit test cases for the SongsDatabase class
 * the toString and toArray classes aren't tested because they only exist for testing purposes
 * @author ahmed
 *
 */
class SongsDatabaseTest {
	SongsDatabase songDb;

	/**
	 * setUp method for initializing the SongsDatabase object
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		songDb = new SongsDatabase();
	}

	/**
	 * test for addSongs method functionality
	 */
	@DisplayName("addSong test, should add a key value pairing")
	@Test
	void testAddSong() {
		songDb.addSong("rap", "Savage");
		assertEquals("{rap=[Savage]}", songDb.toString());
		songDb.addSong("rap", "Alright");
		assertEquals("{rap=[Savage, Alright]}", songDb.toString());
	}

	/**
	 * test getSongs method functionality
	 */
	@DisplayName("getSongs test, should return the set of songs in a genre")
	@Test
	void testGetSongs() {
		songDb.addSong("rap", "Savage");
		songDb.addSong("rap", "Alright");
		assertEquals(songDb.getMap().get("rap"), songDb.getSongs("rap"));
		assertEquals(null, songDb.getSongs("Jazz"));
	}

	/**
	 * test getGenreOfSongs method functionality
	 */
	@DisplayName("getGenreOfSong test, should return the genre of the specified song")
	@Test
	void testGetGenreOfSong() {
		songDb.addSong("rap", "Savage");
		assertEquals("rap", songDb.getGenreOfSong("Savage"));
	}

}
