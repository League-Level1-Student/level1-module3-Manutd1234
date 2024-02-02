package _04_netflix;

import java.util.ArrayList;

public class _04_netflixrunner {
	public class NetflixQueue {
	private final int stars = 0;
	private final String title = null;
	ArrayList<Movie> movies = new ArrayList<Movie>();
		Object getBestMovie() {
			this.sortMoviesByRating();
			return Movie.get(0);
			
		}
		public String getTicketPrice() {
			if (this.stars > 2) {
				return "That will be $12 please.";
			} else if (this.title.contains("Twilight")) {
				return "This movie is so bad, we'll pay YOU to watch it!";
			} else {
				return "Don't waste your money on this horrible rubbish.";
			}
		}
		public void printMovies() {
			System.out.println("Your Netflix queue contains: ");
			for (Movie movie : movies) {
				System.out.println(movie);
			}
		}
		private Object sortMoviesByRating() {
			// TODO Auto-generated method stub
			Object get(int i) {
				// TODO Auto-generated method stub
				return null;
			}
			
		}
	}
		

		

	}

