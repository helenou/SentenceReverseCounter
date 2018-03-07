import java.util.HashMap;
import java.util.Scanner;


public class YourSentence {

	public static void main(String[] args) {
		System.out.println("Bonjour, veuillez entrer votre phrase:");
		Scanner sc = new Scanner(System.in);
		String phrase= sc.nextLine();
		 int value;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		System.out.println("Votre saisie: "+phrase);
		
		// Inverser l'input
		StringBuilder inputInv = new StringBuilder();
		// add my input sentence
		inputInv.append(phrase);
		// reverse string
		inputInv= inputInv.reverse();
		// Print reversed string
		System.out.println("Reversed : " +inputInv);
		
		
		int counter = 0;
		
		 for (int i = 0; i < phrase.length(); i++) {
			if(Character.isLetter(phrase.charAt(i)))
				counter++;
		}
		System.out.println("Cette phrase contient " +counter + " lettres.");
		 
		 
		 
	        for (int i=0; i<phrase.length(); i++){
	        	if(Character.isLetter(phrase.charAt(i)))
	            if(map.containsKey(phrase.charAt(i))){
	                value = map.get(phrase.charAt(i));
	                value ++;
	                map.put(phrase.charAt(i),value);
	            }else{
	                map.put(phrase.charAt(i),1);
	            }
	        }
	        for ( Character key : map.keySet()){
	            System.out.println("Character : '"+key+"' Count :"+map.get(key));
	        }
		
	        sc.close();
	}

}
