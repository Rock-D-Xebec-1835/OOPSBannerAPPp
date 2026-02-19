/*
OOPSBannerApp UC6 - OOPS Banner Display Application using Methods to print letters

This class demonstrates the creation of a visual banner displaying the word "OOPS" with the help of Dedicated methods to print the letters.
@author Developer
@version 6
*/

class Util{
	//Define methods to print letters
	public static String[] printOLetter(){
		String lines[] = {
			"   ***   ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			" **   ** ",
			"   ***   "
		};
		return lines;

	}
	public static String[] printPLetter(){
		String lines[] = {
			" ******  ",
			" **   ** ",
			" ******  ",
			" **      ",
			" **      ",
			" **      ",
			" **      ",
			" **      "
		};
		return lines;

	}
	public static String[] printSLetter(){
		String lines[] = {
		"   ****** ",
		"  ***     ",
		"  ***     ",
		"    ***   ",
		"      *** ",
		"      *** ",
		"    ***   ",
		" *****    "
		};
		return lines;

	}

	
	
}

public class OOPSBannerApp{
	
	public static void main(String[] args){
		String bannerO[] = Util.printOLetter();
		String bannerP[] = Util.printPLetter();
		String bannerS[] = Util.printSLetter();
		for(int i = 0; i < 8; i++){
			System.out.println(bannerO[i] + "  " + bannerO[i] + "  " + bannerP[i] + "  " + bannerS[i]);
		}
	}
}