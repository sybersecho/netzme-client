package id.netzme.client.util;

import id.netzme.client.randomuser.model.Result;
import id.netzme.client.randomuser.response.RandomUserResponse;

public class ParseResponseUtil {

	public static String getSimpleAddress(RandomUserResponse response) {
		return isResultEmpty(response) ? "" : firstResult(response).getSimpleAddress();
	}

	public static String getFullName(RandomUserResponse response) {
		return isResultEmpty(response) ? "" : firstResult(response).getFullName();
	}

	public static String getGender(RandomUserResponse response) {
		return isResultEmpty(response) ? "" : firstResult(response).getGender();
	}

	public static String getPicture(RandomUserResponse response) {
		return isResultEmpty(response) ? "" : firstResult(response).getLargePicture();
	}

	private static Result firstResult(RandomUserResponse response) {
		return response.getResults().get(0);
	}

	private static boolean isResultEmpty(RandomUserResponse response) {
		return response.getResults().isEmpty();
	}

}
