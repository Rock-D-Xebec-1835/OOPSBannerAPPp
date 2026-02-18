/*
OOPSBannerApp UC5 - OOPS Banner Display Application using Inline Array Initialization

This class demonstrates the creation of a visual banner displaying the word "OOPS" with the help of Inline Array Initialization.
@author Developer
@version 5
*/



public class OOPSBannerApp{
	// Main method to run the banner display
	public static void main(String[] args){
		//Define String Array Variable to hold the OOPS banner lines
		//Each line represents a row in the banner for the letters O, O, P, S
		String[] lines = {
			String.join(" | ", "   ***   "  , "   ***   "  , " ******  "  , "   ****** "),
			String.join(" | ", " **   ** "  , " **   ** "  , " **   ** "  , "  ***     "),
			String.join(" | ", " **   ** "  , " **   ** "  , " **   ** "  , "  ***     "),
			String.join(" | ", " **   ** "  , " **   ** "  , " ******  "  , "    ***   "),
			String.join(" | ", " **   ** "  , " **   ** "  , " **      "  , "      *** "),
			String.join(" | ", " **   ** "  , " **   ** "  , " **      "  , "      *** "),
			String.join(" | ", " **   ** "  , " **   ** "  , " **      "  , "    ***   "),
			String.join(" | ", "   ***   "  , "   ***   "  , " **      "  , " *****    ")
		};
		//For loop to print all the lines so that it will print OOPS altogether.
		for(String line : lines){
			System.out.println(line);
		}
		
		
	}
}