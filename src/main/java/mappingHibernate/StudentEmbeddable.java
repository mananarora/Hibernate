package mappingHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class StudentEmbeddable {
	private String lname;
	private int id;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
