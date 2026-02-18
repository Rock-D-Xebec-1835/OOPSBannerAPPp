/*
OOPSBannerApp UC3 - OOPS Banner Display Application

This class demonstrates the creation of a visual banner displaying the word "OOPS" with the help of .join()method.
@author Developer
@version 3
*/


public class OOPSBannerAppUC3{
	// Main method to run the banner display
	public static void main(String[] args){
		//String.join() method is used to concatenate the strings.
		System.out.println(String.join(" ", "   ***   "  , "   ***   "  , "****** "  , "   ******"));
		System.out.println(String.join(" ", " **   ** "  , " **   ** "  , "**   **"  , "  ***    "));
		System.out.println(String.join(" ", " **   ** "  , " **   ** "  , "**   **"  , "  ***    "));
		System.out.println(String.join(" ", " **   ** "  , " **   ** "  , "****** "  , "    ***  "));
		System.out.println(String.join(" ", " **   ** "  , " **   ** "  , "**     "  , "      ***"));
		System.out.println(String.join(" ", " **   ** "  , " **   ** "  , "**     "  , "      ***"));
		System.out.println(String.join(" ", " **   ** "  , " **   ** "  , "**     "  , "    ***  "));
		System.out.println(String.join(" ", "   ***   "  , "   ***   "  , "**     "  , " *****   "));
	}
}