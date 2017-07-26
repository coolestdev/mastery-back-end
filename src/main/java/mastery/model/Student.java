package mastery.model;

import mastery.schooltracs.model.CustomerMap;
import mastery.schooltracs.util.SchoolTracsConst;
import mastery.schooltracs.util.SchoolTracsUtil;
import mastery.schooltracs.util.SchoolTracsConst.Level;

public class Student {
	
	private String id;
	private String name;
	private SchoolTracsConst.Level lvl;
	private Boolean paid;
	private Boolean isMakeup;
	
	public Student() {
		super();
	}
	
	public Student(String id, String name, Level lvl, Boolean paid) {
		super();
		this.id = id;
		this.name = name;
		this.lvl = lvl;
		this.paid = paid;
	}

	public Student(CustomerMap map){
		this.id = map.getCustomerId();
		this.name = map.getName();
		this.lvl = SchoolTracsUtil.classifyLevel(map.getLevel());
		this.paid = true;
		if(map.getPaid()==null){
			this.paid=false;
		}
		this.isMakeup = false;
		if(map.getMoveFromId()!=null){
			this.isMakeup=true;
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public SchoolTracsConst.Level getLvl() {
		return lvl;
	}

	public void setLvl(SchoolTracsConst.Level lvl) {
		this.lvl = lvl;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Boolean getIsMakeup() {
		return isMakeup;
	}

	public void setIsMakeup(Boolean isMakeup) {
		this.isMakeup = isMakeup;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lvl=" + lvl + ", paid=" + paid + ", isMakeup=" + isMakeup
				+ "]";
	}
	
}
