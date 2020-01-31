package JavaPractise;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 4. Object Array
		Object emp[] = new Object[5];
		emp[0] = "Chuha";
		emp[1] = "32";
		emp[2] = 'f';
		emp[3] = true;
		emp[4] = 5.6;
		
		// for array, we use arr.length but for arrayList, it is arr.size()
		
		System.out.println(emp[4]);
		
		for (int i = 0; i < emp.length; i++) {
			
			System.out.println(emp[i]);
		}
		
	}

}
