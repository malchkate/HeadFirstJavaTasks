 public class PhraseOMatic{
 	public static void main (String[] args){
 		String[] wordListOne = {"six", "good", "kind", "popular", "strict", "red"};
 		String[] wordListTwo = {"single", "cool", "high"};
 		String[] wordListThree = {"post", "mall", "dog", "JOOOOB", "Boss"};

 		int oneLength = wordListOne.length;
 		int twoLength = wordListTwo.length;
 		int threeLength = wordListThree.length;

 		int rand1 = (int) (Math.random()*oneLength);
 		int rand2 = (int) (Math.random()*twoLength);
 		int rand3 = (int) (Math.random()* threeLength);
 		
 		String phrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3];

 		System.out.println("All we need is " + phrase);
 	}
 }