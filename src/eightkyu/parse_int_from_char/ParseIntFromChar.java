package eightkyu.parse_int_from_char;

import eightkyu.UserInput.UserInput;

public class ParseIntFromChar {

	public String problem() {
		
		UserInput user = new UserInput();
		String str;
		
		System.out.println("How old are you between 1-9?");

		str = user.getString();

		for (int i = 0; i < str.length(); i++) {
			boolean chr = Character.isDigit(str.charAt(i));
			if(chr) {
				
				return	"You are " + str.charAt(i) + " years old!";
			}
		}
		return null;
	}
	
//	  Different solution	
//	  public static int howOld(final String herOld) {
//		  
//		  return Character.getNumericValue(herOld.charAt(0));
//		  }
}