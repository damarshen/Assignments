package Chapter_5;

public class Chapter5_07 {

	public static void main(String[] args) {
	int year = 0;	
	double tuition =10000;
	double yearsPassed=0;
	double sumTuition=0;
	double percentage =1.05;
	double newTuition = 0;
	
	for(year=0; year<=10; year++) {
		newTuition= tuition * percentage;
		tuition =newTuition;
		System.out.println("Tution for year " + year + " is: "+ tuition );
		}
	
	for (int i=0; i<4; i++) {
		newTuition= tuition * percentage;
		tuition =newTuition;
		sumTuition+=tuition;
		
	}
	System.out.println("four years’ worth of tuition after the tenth year is:" +sumTuition);
	}
	

}
