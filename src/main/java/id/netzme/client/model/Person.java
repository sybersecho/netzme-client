package id.netzme.client.model;

import id.netzme.client.randomuser.response.RandomUserResponse;
import id.netzme.client.util.ParseResponseUtil;
import lombok.Data;

@Data
public class Person {
	private String gender;
	private String fullname;
	private String address;
	private String picture;

	public Person(RandomUserResponse response) {
		address = ParseResponseUtil.getSimpleAddress(response);
		fullname = ParseResponseUtil.getFullName(response);
		gender = ParseResponseUtil.getGender(response);
		picture = ParseResponseUtil.getPicture(response);
	}
}
