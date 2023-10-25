import java.util.regex.Pattern;

public class Ejecutable {

	public static void main(String[] args) {
		String[] palabras = {"This","is","ñoqui","the","last","?","exercise"," ","sí"};
		String caracteresPermitidos = "[a-z[A-Z[' ']]]";
		String stringFinal ="";
		
		for(int i=0;i<palabras.length; i++) {
			int j=0;
			boolean aceptar = true;
			while(aceptar && j<palabras[i].length())
				aceptar = Pattern.matches(caracteresPermitidos,String.valueOf(palabras[i].charAt(j++)));
			if(aceptar)
				stringFinal += palabras[i]+" ";
		}
		stringFinal = (stringFinal.substring(0,stringFinal.length()-1)).toLowerCase();
				 
		System.out.println(stringFinal);
	}

}
