package Assignment1;

public class Chapter4_03 {
public static double earthRadius = 6371.01;
	public static void main(String[] args) {


double atlantaLat = 33.748995;
double atlantaLon = -84.387982;
double savannahLat = 32.083541;
double savannahLon = -81.099834;
double charlotteLat = 35.227087;
double charlotteLon = -80.843127;
double orlandoLat = 28.538335;
double orlandoLon = -81.379236;

//Sides for triangle 1
double t1s1= distanceBetween(atlantaLat, atlantaLon, savannahLat, savannahLon);
double t1s2= distanceBetween(atlantaLat, atlantaLon, charlotteLat, charlotteLon);
double t1s3= distanceBetween(charlotteLat, charlotteLon, savannahLat, savannahLon);
//sides for triangle 2
double t2s1= distanceBetween(atlantaLat, atlantaLon, savannahLat, savannahLon);
double t2s2= distanceBetween(atlantaLat, atlantaLon, orlandoLat, orlandoLon);
double t2s3= distanceBetween(orlandoLat, orlandoLon, savannahLat, savannahLon);


double area1 = triangleArea(t1s1, t1s2, t1s3);
double area2 = triangleArea(t2s1, t2s2, t2s3);
double enclosedArea = area1+area2;

System.out.printf("The total area enclosed by the cities are %.2f", enclosedArea);
System.out.print(" Kilometers.");
	}
	
public static double distanceBetween (double lat1, double long1, double lat2, double long2){
		double distance = earthRadius *
                Math.acos(Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) +
                        Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(long1 - long2)));

        return distance;
	}
public static double triangleArea(double side1, double side2, double side3) {
	double s = 0.5 * (side1 + side2 + side3);
    double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
	}
}