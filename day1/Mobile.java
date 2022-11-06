package week1.day1;

public class Mobile {

	
	String mobileBrandName = "Samsung";
	char MobileLogo = 's';
	short noOfMobilePiece = 990;
	int modelNumber = 1100;
	long mobileIMEINumber = 123440404393l;
	float mobilePrice = 4500.56909f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobile samsung = new Mobile();
     System.out.println(samsung.mobileBrandName);
     System.out.println(samsung.MobileLogo);
     System.out.println(samsung.noOfMobilePiece);
     System.out.println(samsung.modelNumber);
     System.out.println(samsung.mobileIMEINumber);
     System.out.println(samsung.mobilePrice);
     System.out.println(samsung.isDamaged);
	}

}
