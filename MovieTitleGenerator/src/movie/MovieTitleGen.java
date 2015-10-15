package movie;
import java.net.URL;
import java.util.Scanner;
public class MovieTitleGen {
	public static void main(String[] args) throws Exception
	{

		MovieTitleGenerator movie= new MovieTitleGenerator();

		System.out.println("Myxyllplyk's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + movie.getAdjLength() + " adjectives ");
		System.out.println("and " + movie.getNounLength() + " nouns (" + (movie.getAdjLength()*movie.getNounLength()) + " combinations).");
		
		

		System.out.println( "Your movie title is: " + movie.getMovie() );
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	


}
