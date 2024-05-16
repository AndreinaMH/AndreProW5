package oopandre5;

public class App {

	public static void main(String[] args) {
		Logger objeto = new AsteriskLogger ();
		objeto.log("Hello");
		objeto.error("Hello");
		
		Logger spacedObjeto = new SpaceLogger ();
		spacedObjeto.log("Hello");
		spacedObjeto.error("Hello");
	}

}
