/*
OOPSBannerApp UC7 - Store Character Pattern in a Class

This Use case extends UC6 by implementing  a CharacterPatternMap class to encapsulate character-to-pattern mappings.
The application retrieves and displays "OOPS" banner using these mappings.
@author Developer
@version 7
*/


public class OOPSBannerApp{
	/*
		CharacterPatternMap - Inner class for character-to-pattern mappings
		Encapsulates a single character and its corresponding ASCII Pattern
	*/
	
	static class CharacterPatternMap{
		Character character;
		String[] pattern;
		//Constructs a CharacterPatternMap with a character and its pattern
		public CharacterPatternMap(Character character, String[] pattern){
			this.character = character;
			this.pattern = pattern;
		}
		//Retrieves a mapped character
		public Character getCharacter(){
			return this.character;
		}
		//Retireves the ASCII pattern
		public String[] getPattern(){
			return this.pattern;
		}
	}
	
	// Outer class utility static methods
	
	public static CharacterPatternMap[] createCharacterPatternMaps(){
		//Stores every character pattern of the letters O, P, S, and ' '
		String[] space = {
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        };

        String[] O = {
			"   ***   ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			"   ***   "
		};

        String[] P = {
			" ******  ",
			" **   ** ",
			" ******  ",
			" **      ",
			" **      ",
			" **      ",
			" **      ",
			" **      "
		};

        String[] S = {
		"   ****** ",
		"  ***     ",
		"  ***     ",
		"    ***   ",
		"      *** ",
		"      *** ",
		"    ***   ",
		" *****    "
		};
		// returns the array of class objects
		return new CharacterPatternMap[]{
			new CharacterPatternMap(' ', space),
			new CharacterPatternMap('O', O),
			new CharacterPatternMap('P', P),
			new CharacterPatternMap('S', S),
		};
	}
	
	//Retrieves the ASCII for a given character
	//Searches through the character pattern maps to find the matching character.
	//If no character is found, recursively returns the pattern for space.
	
	public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
		Character space = ' ';
		// To handle the characters other than O, P, S and " ", we need to flag them using null.
		String[] spacePattern = null;
		//Find the character and get the pattern using getter.
		for(CharacterPatternMap map : charMaps){
			if(map.getCharacter() == space){
				spacePattern = map.getPattern();
			}
			if(map.getCharacter() == ch){
				return map.getPattern();
			}
		}
		
		if(spacePattern != null){
			return spacePattern;
		}
		// if any other character, replace with spaces.
		else{
			return new String[]{
				"   ",
				"   ",
				"   ",
				"   ",
				"   ",
				"   ",
				"   "
			};
		}
	}
	
	public static void printMessage(String message, CharacterPatternMap[] charMaps){
		// Nested for loop to print the ASCII pattern using StringBuilder.
		for(int i = 0; i < 8; i++){
			StringBuilder banner = new StringBuilder();
			for(int j = 0; j < message.length(); j++){
				String[] pattern  = getCharacterPattern(message.charAt(j),charMaps);
				String piece = (i < pattern.length) ? pattern[i] : "";
				banner.append(piece);
				if(j != message.length() - 1){
					banner.append("  ");
				}
			}
			System.out.println(banner.toString());
		}
	}
	
	public static void main(String[] args){
		//Main method to create and initialize the character Map and print the banner.
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		String message = "OOPS";
		printMessage(message, charMaps);
	}
}