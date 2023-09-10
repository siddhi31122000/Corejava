package collectionex;

import java.util.ArrayList;
import java.util.Comparator;

class Movie{
	 String movieName;
	 int movieYear;
	 double rating;
	 public Movie(String movieName,int movieyear,double rating, int movieYear) {
		 this .movieName=movieName;
		 this .movieYear=movieYear;
		 this .rating=rating;
		  }
	 @Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieYear=" + movieYear + ", rating=" + rating + "]";
	}
	 
}
class  SortByYear implements Comparator<Movie> {

	 @Override
	 public int Compare (Movie o1, Movie o2) {
		  //
		 return o1.movieYear-o2.movieYear;
		 
	 }
}
	 
	public class ComparatorEx {

	public static void main(String[] args) {
         ArrayList<Movie> list=new ArrayList<Movie>();
         list.add(new Movie("DDL", 2000, 4.5));
         list.add(new Movie("SITARAMAN", 2022, 4.9));
         list.add(new Movie("KGF", 2021, 4.8));
         list.add(new Movie("ADI", 1998, 4.3));
         Collections.sort(list,new SortByYear());
         for(Movie m: list) {
        	 System.out.println(m);
         }         
         }

}.

}
