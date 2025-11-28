
public class Catalogo 
{
	public static void main(String[] args)
	{
		System.out.println("Esse é o Screen Match");		
		
		int lanchYear = 2022;
		String movie = "Top Gun: Maverick";
		boolean included = true;
		
		System.out.printf("O ano de lançamento do filme '%s' foi %d.%n", movie, lanchYear);
		System.out.printf("Incluído no plano Screen Match? %b", included);
	}
}
