package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 12345678901231222l;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield";
	double runningKM = 750.90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler twoWheel = new TwoWheeler();
		System.out.println(twoWheel.noOfWheels);
		System.out.println(twoWheel.noOfMirrors);
		System.out.println(twoWheel.chassisNumber);
		System.out.println(twoWheel.isPunctured);
		System.out.println(twoWheel.bikeName);
		System.out.println(twoWheel.runningKM);
	}

}
