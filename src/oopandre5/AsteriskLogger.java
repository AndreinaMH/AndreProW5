package oopandre5;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String text) {
		System.out.println ("***" + text + "***");
		
	}

	@Override
	public void error(String text) {
		System.out.println ("***ERROR: "+ text + "***");
		// TODO Auto-generated method stub
		
	}

}
