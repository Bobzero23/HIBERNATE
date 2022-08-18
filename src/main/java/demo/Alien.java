package demo;

/*imports*/
import javax.persistence.Entity;
import javax.persistence.Id;


/*POJO class*/
/*add annotation to allow the class to use databases*/
@Entity
public class Alien {

	@Id
	private int aId;
	private String aName;
	private String aColor;
	
	
	
	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaColor() {
		return aColor;
	}

	public void setaColor(String aColor) {
		this.aColor = aColor;
	}
 
}
