package id.netzme.client.randomuser.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Result {
	private String gender;
	private String email;
	private String phone;
	private String cell;
	private String nat;

	private Named name;
	private Location location;
	private Login login;
	private Dob dob;
	private Registered registered;
	private Id id;
	private Picture picture;

	public String getSimpleAddress() {
		return location.getSimpleAddress();
	}

	public String getFullName() {
		return name.getFullName();
	}

	public String getLargePicture() {
		log.info(picture.toString());
		return picture.getLarge();
	}
}
