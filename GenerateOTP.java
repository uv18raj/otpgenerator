package basic;

public class GenerateOTP { 

	public static String generateOTP() 
	{ 
		int randomPin =(int) (Math.random()*9000)+1000; 
		String otp = String.valueOf(randomPin); 
		return otp; 
	} 
			public static void main(String args[])
	{ 
		String otpSting =generateOTP(); 
		System.out.println("Your randomly generated OTP is: "+otpSting); 
	} 
}
