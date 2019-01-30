package id.netzme.client.randomuser.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Location {
	private String street;
	private String city;
	private String state;
	private Integer postcode;

	public String getSimpleAddress() {
		StringBuilder buildAddress = new StringBuilder();
		buildAddress.append(street);
		buildAddress.append(" ");
		buildAddress.append(city);
		log.info(toString());
		return buildAddress.toString();
	}
	
	
}
