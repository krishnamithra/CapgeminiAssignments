package day4;

public class GenderAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		
		if(gender.equalsIgnoreCase("Female")){
			if(age>=1 && age<=58) {
				System.out.println("Interest is 8.2%");
			}
			else if(age>=59 && age<=120) {
				System.out.println("Interest is 7.6%");
			}
			else {
				System.out.println("No result");
			}
		}
		else {
			if(age>=1 && age<=60) {
				System.out.println("Interest is 9.2%");
			}
			else if(age>=61 && age<=120) {
				System.out.println("Interest is 8.3%");
			}
			else {
				System.out.println("No result");
			}
		}

	}

}
