package id.netzme.client.randomuser.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Named {
	private String title;
	private String first;
	private String last;

	public String getFullName() {
		StringBuilder buildPersonName = new StringBuilder();
		buildPersonName.append(title);
		buildPersonName.append(" ");
		buildPersonName.append(first);
		buildPersonName.append(" ");
		buildPersonName.append(last);
		log.info(toString());
		return buildPersonName.toString();
	}

}
