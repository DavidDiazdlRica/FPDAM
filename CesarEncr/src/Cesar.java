public class Cesar {

	private String mensaje;
	private int offset = 3;

	private String encriptar() {
		String temp = "abcdefghijklmnopqrstuvwxyz ";
		String translate = new String();
		for (int i = 0; i < mensaje.length(); i++) {
			String t = Character.toString(mensaje.charAt(i));
			int index = temp.indexOf(t);
			index = (index + offset) % 28;
			String add = Character.toString(temp.charAt(index));
			translate += add;
		}
		return translate;
	}

	private String desencriptar() {
		String temp = "abcdefghijklmnopqrstuvwxyz ";
		String translate = new String();
		for (int i = 0; i < mensaje.length(); i++) {
			String t = Character.toString(mensaje.charAt(i));
			int index = temp.indexOf(t);
			index = (index + offset + 28) % 28;
			String add = Character.toString(temp.charAt(index));
			translate += add;
		}
		return translate;
	}

	public static void main(String[] args) {
		String encriptado;
		Cesar Crip = new Cesar();
		Crip.mensaje = "cesur centro de formacion";
		Crip.offset = 3;
		System.out.println(Crip.mensaje);

		System.out.println(encriptado = Crip.encriptar());

		Crip.mensaje = encriptado;
		System.out.println(Crip.desencriptar());
	}
}