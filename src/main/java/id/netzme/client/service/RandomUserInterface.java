package id.netzme.client.service;

import id.netzme.client.randomuser.response.RandomUserResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomUserInterface {
	@GET("/api")
	Call<RandomUserResponse> getRandomUser();
}
