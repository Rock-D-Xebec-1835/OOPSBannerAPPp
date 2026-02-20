/*
OOPSBannerApp UC8 - Store Character Pattern in a Hashmap and Render via Function

This Use case extends UC7 by utilizing Collections Framework to manage character patterns in a more flexible and efficient manner.
The application retrieves and displays "OOPS" banner using Hashmap.

@author Developer
@version 8
*/
import java.util.HashMap;


public class OOPSBannerApp{
	/*
		Creates a Hashmap containing ASCII art patterns for supported characters
		Each character is apped to an array of strings where each string represents one line of the characters ascii pattern.
		
	*/
	
	public static HashMap<Character, String[]> createCharacterMap(){
		//This method stores the ASCII pattern for characters in a Hashmap and returns the hashmap.
		HashMap<Character, String[]> charMap = new HashMap<>();
		charMap.put('O', new String[]{
				"   ***   ",
				" **   ** ",
				" **   ** ",
				" **   ** ",
				" **   ** ",
				" **   ** ",
				" **   ** ",
				"   ***   "
			}
		);
		charMap.put('P', new String[]{
				" ******  ",
				" **   ** ",
				" ******  ",
				" **      ",
				" **      ",
				" **      ",
				" **      ",
				" **      "
			}
		);
		charMap.put('S', new String[]{
				"   ****** ",
				"  ***     ",
				"  ***     ",
				"    ***   ",
				"      *** ",
				"      *** ",
				"    ***   ",
				" *****    "
			}
		);
		return charMap;
	}
	
	//Retrieves the ASCII for a given character
	//Searches through the character pattern maps to find the matching character.
	//If no character is found, recursively returns the pattern for space.
	
	public static void printMessage(String message, HashMap<Character, String[]> charMap){
		// Nested for loop to print the ASCII pattern using StringBuilder.
		for(int i = 0; i < 8; i++){
			StringBuilder banner = new StringBuilder();
			for(int j = 0; j < message.length(); j++){
				String[] pattern = charMap.get(message.charAt(j));
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
		//Main method to create and initialize the Hashmap and print the banner.
		HashMap<Character,String[]> charMap = createCharacterMap();
		String message = "OOPS";
		printMessage(message, charMap);
	}
}