package wolfinsheepclothing;

import java.util.ArrayList;
import java.util.List;

public class Challenge {

	public static void main(String[] args) {
		WolfInSheepClothing();
	}

	public static void WolfInSheepClothing() {
//		String[] strArr = {"sheep", "sheep", "sheep", "wolf", "sheep"};
		List<String> animals = new ArrayList<>();
		
//		animals.add("sheep");
//		animals.add("sheep");
		animals.add("sheep");
		animals.add("sheep");
		animals.add("sheep");
		animals.add("wolf");
		animals.add("sheep");
		animals.add("sheep");
		
		System.out.println(animals);
	
		for(String str: animals) {
			if(str.equals("wolf")) {
				int wolfPosition = animals.indexOf("wolf");
//				System.out.println("Oi! Sheep number " + (wolfPosition - 1) + " ! You are about to be eaten by a wolf!");
			}
		}

//		for(String str: strArr) {
//			if(str.equals("wolf")) {
////				System.out.println("Oi! Sheep number " + str.indexOf(str) + " ! You are about to be eaten by a wolf!");
//				
//			}
//			else {
//				System.out.println("no wolf");
//			}
//		}	
	}
}
