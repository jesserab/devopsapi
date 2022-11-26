package devopsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class DevopsapiApplication {

	static String test(){
		String token = "b6243b33-7d85-4af1-985a-51769c5c91b1";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("X-CMC_PRO_API_KEY","Bearer"+ token);

		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";

		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> result =  restTemplate.exchange(uri, HttpMethod.GET,request,String.class);

		String json = result.getBody();
		System.out.println(json);

		System.out.println("Pipeline works fine");

		String s = "j" ;
		return  s;

	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsapiApplication.class, args);
		test();
	}

}
