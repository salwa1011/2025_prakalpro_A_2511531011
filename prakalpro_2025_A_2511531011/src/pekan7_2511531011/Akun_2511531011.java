package pekan7_2511531011;

public class Akun_2511531011 {
	//deklarasi variabel
	private String usn, pw, email;
	private int pin=0;
	
	//buat setter dan getter
	public void setUsn (String usn) {
		this.usn=usn;
	}
	public void setPw (String pw) {
		this.pw=pw;
	}
	public void setEmail (String email) {
		this.email=email;
	}
	public void setPin (int pin) {
		this.pin=pin;
	}
	public String getUsn () {
		return usn;
	}
	public String getPw () {
		return pw;
	}
	public String getEmail () {
		return email;
	}
	public int getPin () {
		return pin;
	}
	
	//helper method
	public boolean isPasswordValid() {
		return pw.length()>=8;
	}
	
	public boolean isEmailValid() {
		return email.contains("@")&&email.contains(".");
	}
	
	

}
