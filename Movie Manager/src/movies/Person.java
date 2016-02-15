package movies;

public class Person {
    private String firstName;
    private String lastName; 
    private Gender gender;
    private boolean hasOscar;
    private boolean hasGoldenGlobe;
    
    public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.hasOscar = hasOscar;
	this.hasGoldenGlobe = hasGoldenGlobe;
    }
    
    public void setFirstName(String firstName) { 
    	this.firstName = firstName; 
    	}
    
    public String getFirstName() { 
    	return firstName; 
    	}
    
    public void setLastName(String lastName) {	
    	this.lastName = lastName; 
    	}
    
    public String getLastName() { 
    	return lastName; 
    	}
   
    public void setGender(Gender gender) {
    	this.gender = gender; 
    	}
    
    public Gender getGender() {
    	return gender; 
    	}
    
    public void setHasOscar(boolean hasOscar) { 
    	this.hasOscar = hasOscar;
    	}
    
    public boolean isHasOscar() {
    	return hasOscar; 
    	}
    
    public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
    	this.hasGoldenGlobe = hasGoldenGlobe; 
    	}
    
    public boolean isHasGoldenGlobe() {
    	return hasGoldenGlobe; 
    	}

    public String toString() {
	return firstName + " " + lastName;
    }
    
    public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<person>");
		sb.append(Tools.toXMLTag("firstName", this.firstName));
		sb.append(Tools.toXMLTag("lastName", this.lastName));
		sb.append(Tools.toXMLTag("gender", this.gender.toString()));
		sb.append(Tools.toXMLTag("hasOscar", String.valueOf(this.hasOscar)));
		sb.append(Tools.toXMLTag("hasGoldenGlobe", String.valueOf(this.hasGoldenGlobe)));
		sb.append("\n</person>\n");
		return sb.toString();
	}
}