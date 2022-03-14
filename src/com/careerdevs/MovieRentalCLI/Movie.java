package com.careerdevs.MovieRentalCLI;

public class Movie {
    private String genre;
    private String title;
    private boolean rentedMovie;

    public Movie(String genre,String title,boolean rentedMovie){
        this.genre=genre;
        this.title=title;
        this.rentedMovie = false;

    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRentedMovie() {
        return rentedMovie;
    }

    public void setRentedMovie(boolean rentedMovie) {
        this.rentedMovie = rentedMovie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", rentedMovie=" + rentedMovie +
                '}';
    }
}
