package ch09_class_quiz;

public class movie {
	private  String title;
	private  String quote;
	private  String actor;
	private  String word;

	
		
public movie() {
	
}

public movie(String title, String quote, String actor, String word) {
	
	this.title=title;
	this.quote=quote;
	this.actor=actor;
	this.word=word;
	
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getQuote() {
	return quote;
}

public void setQuote(String quote) {
	this.quote = quote;
}

public String getActor() {
	return actor;
}

public void setActor(String actor) {
	this.actor = actor;
}

public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}

@Override
public String toString() {
	return "movie [title=" + title + ", quote=" + quote + ", actor=" + actor + ", word=" + word + "]";
}

	


}
