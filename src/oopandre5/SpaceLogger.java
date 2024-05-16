package oopandre5;

public class SpaceLogger implements Logger{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String text) {
		String spacedText = " ";
		for (int i = 0; i < text.length ();
				i++) {
			spacedText = spacedText + text.charAt(i)+ " ";
		}
		System.out.println (spacedText);
	}

	@Override
	public void error(String text) {
		String spacedText = "Error:";
		for(int i = 0; i < text.length ();
				i++) {
			spacedText += text.charAt(i)
					+ " ";
		}
		System.out.println (spacedText);
		}
			
		
	}

