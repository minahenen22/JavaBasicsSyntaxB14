package class11;

public class PhoneH {
	String make;
	String model;
	int resolution;
	double weight;
	String battery;
	String origin;
	
	void video () {
		System.out.println ("High resolution video");
	}
	void satalitte () {
		System.out.println("Can connect to satalite in emergency cases");
		
	}
	void msOffice () {
		System.out.println("Enable MS package");
		
	}
	void voicecommand () {
		System.out.println("Taking user void commands");
	}
	public static void main(String[] args) {
		PhoneH iphone=new PhoneH ();
		iphone.make="Apple";
		iphone.model="Iphone 14";
		iphone.battery="36 Hours";
		System.out.println(iphone.make +" "+ iphone.model +" "+iphone.battery);
		iphone.satalitte ();
		System.out.println("                     *********************");
		PhoneH samsung= new PhoneH ();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.weight= 220.30;
		samsung.resolution=2000;
		System.out.println(samsung.make +" "+ samsung.model +" "+ samsung.resolution + " pixel");
		samsung.msOffice();
		
		System.out.println("                     *********************");
		PhoneH pixel = new PhoneH();
		pixel.make="Google";
		pixel.model="Wonder";
		pixel.resolution= 1800;
		System.out.println(pixel.make +" "+ pixel.model +" "+pixel.resolution + " pixel");
				 
		pixel.voicecommand ();
		
		
	}

}
