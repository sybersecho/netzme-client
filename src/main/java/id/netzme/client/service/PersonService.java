package id.netzme.client.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import id.netzme.client.model.Person;
import id.netzme.client.randomuser.response.RandomUserResponse;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Slf4j
@Service
public class PersonService implements APIConfiguration {

	private RandomUserInterface service;

	public PersonService() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL)
				.addConverterFactory(GsonConverterFactory.create()).build();

		service = retrofit.create(RandomUserInterface.class);
	}

	public Person getPerson() throws IOException {
		log.info("calling service..");
		Call<RandomUserResponse> retrofitCall = service.getRandomUser();
		log.info("waiting for response");
		Response<RandomUserResponse> response = retrofitCall.execute();

		return new Person(response.body());
	}

}
