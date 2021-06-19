package entities;

public class Comment {
	private String text;

//Constructors 
	
	public Comment() {
		
	}

	public Comment(String text) {
		super();
		this.text = text;
	}

//Getters & Setters 
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	
	
	
}	