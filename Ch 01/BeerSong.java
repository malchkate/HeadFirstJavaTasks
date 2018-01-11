public class BeerSong{
	public static void main (String[] args){
		int x = 99;
		String str_1 = " bottles of beer on the wall, ";
		String str_2 = " bottles of beer.";
		String str_3 = "Take one down and pass it around, ";
		String str_4 = " bottles of beer on the wall.";

		String str1_1 = " bottle of beer on the wall, ";
		String str1_2 = "  bottle of beer.";
		String str1_3 = " Take one down and pass it around, no more bottles of beer on the wall.";

		String str0_1 = "No more bottles of beer on the wall, no more bottles of beer.";
		String str0_2 = "Go to the store and buy some more, 99 bottles of beer on the wall.";

		while ( x >= 0){
			if (x > 1){
				System.out.println(x + str_1 + x + str_2);
				System.out.println(str_3 + (x-1) + str_4);
				System.out.println(" ");
			} else if (x == 1){
				System.out.println(x + str1_1 + x + str1_2);
				System.out.println(str1_3);
				System.out.println(" ");
			}else {
				System.out.println(str0_1);
				System.out.println(str0_2);
				System.out.println(" ");
			}

			x = x - 1;
		}
	}
}