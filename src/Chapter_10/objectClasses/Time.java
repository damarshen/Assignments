package Chapter_10.objectClasses;

public class Time {
private long hour;
private long minute;
private long second;

public Time () {
	long totalMilliseconds = System.currentTimeMillis();
	long totalSeconds = totalMilliseconds / 1000;
	long totalMinutes = totalSeconds / 60;
	long totalHours = totalMinutes / 60;
	second = totalSeconds % 60;
	minute = totalMinutes % 60;
	hour = totalHours % 24;
}

public Time(long elapseTime) {
    long totalSeconds = elapseTime / 1000;
    long totalMinutes = totalSeconds / 60;
    long totalHours = totalMinutes / 60;
    this.hour = totalHours % 24;
    this.minute = totalMinutes % 60;
    this.second = totalSeconds % 60;
}



public Time (long a, long b, long c) {
	hour=a;
	minute=b;
	second=c;		
	
}

public long getHour() {
    return hour;
}


public long getMinute() {
    return minute;
}


public long getSecond() {
    return second;
}

public void setTime (long timeElapsed) {
	long totalSeconds = timeElapsed /1000;
	long totalMinutes = totalSeconds / 60;
	long totalHours = totalMinutes / 60;
	this.hour = totalHours % 24;
    this.minute = totalMinutes % 60;
    this.second = totalSeconds % 60;
}

}

