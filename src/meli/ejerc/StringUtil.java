package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		String replica =  "";
		for (int i = 0; i < n; i++) {
			replica = c+replica;
		}
		return replica;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		return replicate(c,n-s.length())+s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] sArray = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sArray[i] = String.valueOf(arr[i]);
		}
		return sArray;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] iArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			iArray[i] = Integer.parseInt(arr[i]);
		}
		return iArray;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int max = 0;
		for (String elem:arr) {
			if (elem.length()>max) max =elem.length();
		}
		return max;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static String[] lNormalize(String arr[], char c)
	{
		int maxLength = maxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i]= lpad(arr[i],maxLength,'0');
		}
		return arr;
	}
}
