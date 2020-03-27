package com.example.moviecatalogservice.models;

public class Rating {

	private String movieId;
	private double movieRating;

	public Rating() {

	}

	public Rating(String movieId, double movieRating) {
		super();
		this.movieId = movieId;
		this.movieRating = movieRating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return movieRating;
	}

	public void setRating(double rating) {
		this.movieRating = rating;
	}

}
