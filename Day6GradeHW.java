
public class Day6GradeHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input a grade score: ");
		Scanner input = new Scanner(System.in);
		
		
		int grade = input.nextInt();

		
		if(grade >= 90) {
			System.out.println("A");
		}else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		}else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		}else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		input.close();
	}
	}