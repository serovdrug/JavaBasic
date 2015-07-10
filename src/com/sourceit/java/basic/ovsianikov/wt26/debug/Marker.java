package com.sourceit.java.basic.ovsianikov.wt26.debug;

class Marker {
	public int marks;

	public Marker() {
		// no initialisation to do
		marks = 44;
		printGrade(marks);
	}

	/**
	 * @param mark
	 */
	public void printGrade(int mark) {
		/*
		 * if (mark >= 85) System.out.println("High Distinction"); if (mark >=
		 * 75) System.out.println("Distinction"); if (mark >= 65)
		 * System.out.println("Credit"); if (mark >= 50)
		 * System.out.println("Pass"); if (mark >= 45)
		 * System.out.println("Concessional Pass"); if (mark < 45)
		 * System.out.println("Fail");
		 */

		if (mark >= 85) {
			System.out.println("High Distinction");
		} else {
			if (mark >= 75) {
				System.out.println("Distinction");
			} else {
				if (mark >= 65) {
					System.out.println("Credit");
				} else {
					if (mark >= 50) {
						System.out.println("Pass");
					} else {
						if (mark >= 45) {
							System.out.println("Fail");
						} else {
							if (mark < 45) {
								System.out.println("Fail");
							}
						}
					}
				}
			}

		}

	}
}
