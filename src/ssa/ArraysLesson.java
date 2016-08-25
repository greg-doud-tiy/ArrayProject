package ssa;

public class ArraysLesson {
	
	void test() {
		
		int[][] testScores = { 
			{ 95, 89, 66, 96, 100, 91, 78, 42, 99, 100 },
			{ 95, 89, 66, 96, 100, 91, 78, 42, 99, 100 },
			{ 95, 89, 66, 96, 100, 91, 78, 42, 99, 100 },
			{ 95, 89, 66, 96, 100, 91, 78, 42, 99, 100 },
			{ 95, 89, 66, 96, 100, 91, 78, 42, 99, 100 }
		};
		
		testScores[2][3] = 69;
		
		for(int[] studentTestScores : testScores) {
			int totalTestScores = 0;
			for(int score : studentTestScores) {
				// totalTestScores = totalTestScores + score;
				totalTestScores += score;
				
			}
			int averageScore = totalTestScores / studentTestScores.length;
			System.out.println("The average is " + averageScore);
		}
		
		for(int idxo = 0; idxo < testScores.length; idxo++) {
			for(int idxi = 0; idxi < testScores[0].length; idxi++) {
				testScores[idxo][idxi] = 0;
			}
		}
		
		
//		Account accounts[] = new Account[10];
//		
//		System.out.println("Length of accounts is " + accounts.length);
//		Account gregChecking = new Account();
//		accounts[0] = gregChecking;
//		gregChecking.id = 59;
//		Account rickChecking = new Account();
//		accounts[1] = rickChecking;
//		rickChecking.id = 57;
//		Account sherryChecking = new Account();
//		accounts[2] = sherryChecking;
//		sherryChecking.id = 56;
//		
//		for(int idx = 0; idx < 3; idx++) {
//			Account account = accounts[idx];
//			System.out.println(account.id);
//		}
//
//		System.out.println("Accounts index zero id is " + accounts[0].id);
		
//		int i = 1;
//		int n = i;
		
		
//		int age[] = { 58, 57, 56, 55, 51, 49 };
//	
//		int gregsAge = age[0];
//		int lorisAge = age[5];
//		
//		System.out.println("Greg's age is " + gregsAge 
//				+ " and the length is " + age.length
//				+ " and his sister Lori's age is " + lorisAge);
	}
}
class Account {
	public int id = 1;
}
