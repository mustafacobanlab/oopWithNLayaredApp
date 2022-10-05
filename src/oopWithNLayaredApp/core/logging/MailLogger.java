package oopWithNLayaredApp.core.logging;

public class MailLogger implements Logger{
	public void log(String data) {
		System.out.println("Mail gonderildi : " + data);
	}


}
