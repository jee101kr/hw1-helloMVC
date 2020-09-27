package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {

	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
	
	public void setId(String id) { this.id=id; }
	public void setPassword(String password) { this.password=password; }
	public void setName(String name) { this.name=name; }
	public void setGender(String gender) { this.gender=gender; }
	public void setEmail(String email) { this.email=email; }
	
	public String getId() {	return this.id; }
	public String getPassword() {	return this.password; }
	public String getName() {	return this.name; }
	public String getGender() {	return this.gender; }
	public String getEmail() {	return this.email; }
}
