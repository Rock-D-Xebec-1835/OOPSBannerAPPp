/*
OOPSBannerApp UC3 - OOPS Banner Display Application

This class demonstrates the creation of a visual banner displaying the word "OOPS" with the help of .join()method.
@author Developer
@version 4
*/



public class OOPSBannerApp{
	// Main method to run the banner display
	public static void main(String[] args){
		//String.join() method is used to concatenate the strings.
		String[] banner = new String[8];
		//The banner[i] represents one row in O, O, P, S
		banner[0] = String.join(" | ", "   ***   "  , "   ***   "  , " ******  "  , "   ****** ");
		banner[1] = String.join(" | ", " **   ** "  , " **   ** "  , " **   ** "  , "  ***     ");
		banner[2] = String.join(" | ", " **   ** "  , " **   ** "  , " **   ** "  , "  ***     ");
		banner[3] = String.join(" | ", " **   ** "  , " **   ** "  , " ******  "  , "    ***   ");
		banner[4] = String.join(" | ", " **   ** "  , " **   ** "  , " **      "  , "      *** ");
		banner[5] = String.join(" | ", " **   ** "  , " **   ** "  , " **      "  , "      *** ");
		banner[6] = String.join(" | ", " **   ** "  , " **   ** "  , " **      "  , "    ***   ");
		banner[7] = String.join(" | ", "   ***   "  , "   ***   "  , " **      "  , " *****    ");
		// For loop to print the whole banner line by line
		for(int i = 0; i < banner.length; i++){
			System.out.println(banner[i]);
		}
	}
}