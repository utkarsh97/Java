//Assignment : Homework 1
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 

public class Pi {

	public static void main(String[] args) {
		//Assign value to pi with 6 terms
		double pi = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		System.out.println("pi = " + pi);
		
		//Assign value to pi with 7 terms
		double pi2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
		System.out.println("pi2 = " + pi2);
		
		//Assign value to pi with 1000 terms
		double pi3 = 0;
		int i;
		int j = 1;
		for (i=1; i <= 1000; i++) {
			if (i%2 == 1) {
				pi3 += 1.0/j;
			}
			else if (i%2 == 0) {
				pi3 -= 1.0/j;
			}
			j += 2;
		}
		pi3 *= 4;
		System.out.println("pi3 = " + pi3);
	}

}

