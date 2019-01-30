package id.netzme.client.randomuser.model;

import lombok.Data;

@Data
public class Info {
	private String seed;
	private Integer results;
	private Integer page;
	private String version;
}
