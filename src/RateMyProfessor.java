import java.io.Serializable;

public class RateMyProfessor implements Serializable {
	
	private String name;
	private int yearOfClass;
	private String section;
	private double rating;
	
	public RateMyProfessor(String name,int yearOfClass,String section,double rating) {
		this.name=name;
		this.yearOfClass = yearOfClass;
		this.section=section;
	this.rating = rating;
		
	}
public RateMyProfessor() {
		
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getYearOfClass() {
	return yearOfClass;
}

public void setYearOfClass(int yearOfClass) {
	this.yearOfClass = yearOfClass;
}

public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}

public double getRating() {
	return rating;
}

public void setRating(double rating) {
	this.rating = rating;
}



}
