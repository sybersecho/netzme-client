package id.netzme.client.randomuser.response;

import java.util.ArrayList;
import java.util.List;

import id.netzme.client.randomuser.model.Info;
import id.netzme.client.randomuser.model.Result;
import lombok.Data;

@Data
public class RandomUserResponse {
	private List<Result> results = new ArrayList<Result>();
	private Info info;
}
