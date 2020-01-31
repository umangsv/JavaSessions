package JavaPractise;

public class ObjectArrayPractise {

	public static void main(String[] args) {
		

		// super class of all classes
		
//		Object emp[] = new Object[5];
//		
//		emp[0] = "Godo";
//		emp[1] = "21";
//		emp[2] = 'm';
//		emp[3] = true;
//		emp[4] = 5.5;
//		
//		for (Object object : emp) {
//			
//			System.out.println(object);
//		}
		
		// write static array having following cricket data
		
		// name, age, team name, DOB, gender, Strike Rate
		
		// indexes has to be perfect.
		// remember, while declaring, we should declare as per count
		// while assigning, we have to assign using indexes, ie, one count less 
		Object players[][] = new Object[2][5];
		
		players[0][0] = "Monty";
		players[0][1] = "21";
		players[0][2] = "India";
		players[0][3] = 'm';
		players[0][4] = 88;
		
		
		players[1][0] = "Chuha";
		players[1][1] = "21";
		players[1][2] = "India";
		players[1][3] = 'f';
		players[1][4] = 90;
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				
				System.out.println(players[i][j]);
			}
			System.out.println();
		}
		
	}

}
