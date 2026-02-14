package string;

import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class PanagramChecker {

	public static void main(String[] args) {
		// Panagram means that string contains all 26 characters, each characters at least once.
		String str = "My name is Aniket!";
		String String = "The quick brown fox jumps over the lazy dog";
		
		isPanagram(str);
		
		isPanagram(String);
		
	}
	
	public static void isPanagram(String str) {
		str = str.toLowerCase();
		char[] chars = str.toCharArray();
		Set<Character> encounterdCharacters = new HashSet<>();
		
		for(char c : chars) {
			if(c >= 'a' && c <= 'z') {
				encounterdCharacters.add(c);
			}
		}
		if(encounterdCharacters.size() == 26) {
			System.out.println("String/sentence " + " \" " + str + " \" " + " is PANAGRAM");
		} else {
			System.out.println("String/sentence " +  " \" " + str + " \" "  + " is not panagram");
		}
	}

}
