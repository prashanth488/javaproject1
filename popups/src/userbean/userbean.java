package userbean;

public class userbean {
private String firstname;
private String lastname;
private String emailid;
private boolean valid;
public boolean isValid() {
	return valid;
}
public void setValid(boolean valid) {
	this.valid = valid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
