package org.howard.edu.lsp.exam.question42;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

/**
 * songsDatabase class
 * @author ahmed
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	
	public Map<String, Set<String>> getMap(){
		return map;
	}
	
	/**
	 * addSong method to add a song into the map
	 * @param genre: string that is the genre of the song
	 * @param songTitle: string that is the title of the song
	 */
	public void addSong(String genre, String songTitle) {
		Set<String>  set = map.get(genre);
		if (set == null) {
			set = new HashSet<String>();
			map.put(genre, set);
		}
		set.add(songTitle);
	}
	
	/**
	 * getSongs method to get all of the songs in the input genre
	 * @param genre: string the genre that is being searched for 
	 * @return the set of strings are the value for the key being searched for
	 */
	public Set<String> getSongs(String genre){
		Set<String> songSet = map.get(genre);
		return songSet;
	}

	/**
	 * getGenreOfSong method which returns the genre of the input song
	 * @param songTitle: the title of the song
	 * @return the string which is the genre of the song inputed
	 */
	public String getGenreOfSong(String songTitle) {
		for (String Key : map.keySet()) {
			Set<String> value = map.get(Key);
			if (value.contains(songTitle)) {
				for (String Key2 : map.keySet()) {
					if (map.get(Key2) == value) {
						return Key2;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * A method to turn the map into a string for testing only
	 */
	public String toString () {
	    StringBuilder result = new StringBuilder("{");
	    for (String key : map.keySet()) {
	        result.append(key + "=" + map.get(key) + ", ");
	    }
	    result.delete(result.length()-2, result.length()).append("}");
	    return result.toString();
	}
	
	/**
	 * A method to turn a set into an array for testing only
	 * @param set the set of strings being made into an array
	 * @return an array of strings
	 */
	public Object[] toArray(Set<String> set) {
		return set.toArray();
	}
}
