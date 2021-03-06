package mastery.schooltracs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StaffConfig {

	private Boolean adminWapp = false;
	private Boolean mkupSchSkip = false;
	
	public Boolean getAdminWapp() {
		return adminWapp;
	}
	public void setAdminWapp(Boolean adminWapp) {
		this.adminWapp = adminWapp;
	}
	public Boolean getMkupSchSkip() {
		return mkupSchSkip;
	}
	public void setMkupSchSkip(Boolean mkupSchSkip) {
		this.mkupSchSkip = mkupSchSkip;
	}
	
}
