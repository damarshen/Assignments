package Assignment1;

public class Chapter1_11 {

	public static void main(String[] args) {


		/*
		 * Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
		 */
				int startingPopulation = 312032486;
				int yearInSeconds = 60*60*24*365;
				int birthRate = 7;
				int deathRate = 13;
				int immigrationRate = 45;
				
				int peopleBorn = yearInSeconds / birthRate;
				int peopleDied = yearInSeconds / deathRate;
				int peopleImmigrated = yearInSeconds / immigrationRate;
				
				for (int i=1; i<=5; i++) {
					int currentPopulation = startingPopulation + (peopleBorn - peopleDied + peopleImmigrated)*i;
					System.out.println("The current population after " + i + " year is: " + currentPopulation );
				}

	}

}
