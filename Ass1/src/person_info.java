import javax.swing.plaf.synth.SynthSliderUI;

public class person_info {
 public person_info(String name, String contact, String nationality) {
		super();
		this.name = name;
		this.contact = contact;
		this.nationality = nationality;
	}
private String name;
 private String contact;
 private String nationality;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void displayinfo()
{
	System.out.println("person name;" +name);
	System.out.println("contactinfo;" +contact);
	System.out.println("person nationality;" + nationality);
}
}
 

