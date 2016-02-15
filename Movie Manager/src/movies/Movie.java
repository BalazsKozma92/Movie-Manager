package movies;

import java.util.List;

public class Movie {
    private String title;
    private Genre genre;
    private long duration;
    private double rate;
    private List<Person> cast;
    
    public Movie(String title, Genre genre, long duration, double rate, List<Person> cast) {
	this.title = title;
	this.genre = genre;
	this.duration = duration;
	this.rate = rate;
	this.cast = cast;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    public long getDuration() {
        return duration;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double getRate() {
        return rate;
    }
    
    public void setCast(List<Person> cast) {
        this.cast = cast;
    }
    
    public List<Person> getCast() {
        return cast;
    }
    
    public String toXMLString() {
		StringBuilder bs = new StringBuilder();
		bs.append("<movie>");
		bs.append(Tools.toXMLTag("title", this.title));
		bs.append(Tools.toXMLTag("genre", this.genre.toString()));
		bs.append(Tools.toXMLTag("duration", String.valueOf(this.duration)));
		bs.append(Tools.toXMLTag("rate", String.valueOf(this.rate)));
		bs.append(Tools.toXMLTag("cast", this.cast.toString()));
		bs.append("\n</movie>\n");
		return bs.toString();

	}
    
}