package movie;
import java.net.URL;
import java.util.Scanner;


public class MovieTitleGenerator {
	String[] adjectives;
	String[] nouns ;
	
	public MovieTitleGenerator () throws Exception{
		adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
		nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");
		
	}
	public int getAdjLength() {
		return adjectives.length;
	}
	public int getNounLength() {
		return nouns.length;
	}
	public String getMovie(){
		int adj   = 0 + (int)(Math.random()* adjectives.length       ); // male
		int n   = 0 + (int)(Math.random()* nouns.length     ); // female
        String MovieTitle;
		String adjective = adjectives[adj];
		String noun = nouns[n];
		MovieTitle = adjective +" "+ noun;
		return MovieTitle;
		
	}
	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}
