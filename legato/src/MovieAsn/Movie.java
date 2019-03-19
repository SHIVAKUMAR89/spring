package MovieAsn;

public class Movie {

		private static  int movieId=0;
		private String name;
		private double duration;
		//public static getCountr=100;
		
		public int getMovieId()
		{
			return movieId;
		}
		public void setMovieId(int movieId)
		{
			this.movieId=movieId;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public double getDuration()
		{
			return duration;
		}
		public void setDuration(double duration)
		{
			this.duration=duration;
		}
		
		void getMovieDetails()
		{
			
			System.out.println("movieId=" + this.getMovieId() +"\n"+ "name=" + this.getName()+"\n"+ "duration=" + this.getDuration()+"\n");
		
		}
		
	}


