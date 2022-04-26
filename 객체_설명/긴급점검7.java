package test;

import java.util.ArrayList;
import java.util.List;

class Movie{
	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}

public class 긴급점검7 {
	
	public static List<Movie> getMovieList(){
		List<Movie> list = new ArrayList<Movie>();
		Movie movie = new Movie();
		movie.setMovieName("로스트 시티");
		Movie movie2 = new Movie();
		movie2.setMovieName("공기살인");
		
		list.add(movie);
		list.add(movie2);
		
		for(Movie mov : list) {
			System.out.println(mov.getMovieName());
		}
		return list;
	}

	public static void main(String[] args) {
		//로스트 시티, 공기살인
//		1. List 데이터 타입 확인
//		2. 객체 생성(인스턴스 화)
//		3. add
//		4. for-each
		getMovieList();
		
	}
}
