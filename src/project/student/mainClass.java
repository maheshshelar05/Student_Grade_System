package project.student;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GradeSystem students[] = new GradeSystem[1];

		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter Roll No, Name, and 3 Subject Marks:");
			int r = s.nextInt();
			s.nextLine();
			String n = s.nextLine();
			int m[] = new int[3];
			for (int j = 0; j < 3; j++) {
				m[j] = s.nextInt();
			}
			students[i] = new GradeSystem(r, n, m);
		}

		System.out.println("\n----- Result -----");
		for (int i = 0; i < students.length; i++) {
			students[i].calculateResult();
		}

		s.close();
	}
}
