package com.acma.properties;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestClientException;

import com.acma.properties.models.Users;
import com.acma.properties.outbound.AcmaUsersOutboundApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootTest
class AcmaUsermgmtServiceApplicationTests {

	String accessToken = null;
	
	@Test
	void contextLoads() {
		accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ5cHFuM2lZR0xDV1pKcl8yUlVpZmlqcEVzZWF3MUJBeHd5SnpqSk5neHFzIn0.eyJleHAiOjE3MjcwNjA3NDcsImlhdCI6MTcyNzA1OTI0NywianRpIjoiZTZjN2MzYjYtNmE3MS00ZWQxLWI1YWUtMDQ3YzMxOTBhY2E1IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgxL3JlYWxtcy9hY21hIiwiYXVkIjpbInJlYWxtLW1hbmFnZW1lbnQiLCJhY2NvdW50Il0sInN1YiI6ImZlZjQxMzA5LTk4MWMtNDY1MS1hMDRjLTIxN2VlNjI5N2ZmZCIsInR5cCI6IkJlYXJlciIsImF6cCI6InN0YXRlZm9ybS1zdmMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLWFjbWEiLCJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsicmVhbG0tbWFuYWdlbWVudCI6eyJyb2xlcyI6WyJtYW5hZ2UtdXNlcnMiXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiY2xpZW50SG9zdCI6IjE3Mi4xOC4wLjEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc3RhdGVmb3JtLXN2YyIsImNsaWVudEFkZHJlc3MiOiIxNzIuMTguMC4xIiwiY2xpZW50X2lkIjoic3RhdGVmb3JtLXN2YyJ9.TLDzvkW5YO3zWl3lhC3bZymmPdg0N-gvHbds5OymgPFdCjov4rTOmH1u5gwbuKZDL5P7BEIYXPdcF23jMmovCmv8voxGZmLMpvikejxNbZxJLGS57qmFIzVuT2JkCxkd86R5Dx1rt3cxWBxgmSQ3o8CVmjetmXFtG5f3cSIhvcsxqBqfo6JhGU5jHbivvEwU6oxv-ihUNGwUHbtIcfK7e4PC6T2lKh14AB6t2xpDYR2n8SM80EfVNPiMEVsGdAnQz86xP81ZbRUkcIB6C5D6czFxSMMztWaZihJl_DI1EaZbXqfNco4dY90LTyihZ1uS-RtK0pk7_wgqdinENnFi1g";
	}
	
	

	@Autowired
	private AcmaUsersOutboundApi usersAPI;
	
	//@Test
	
	public void testGetAllUsers() throws RestClientException, URISyntaxException, JsonMappingException, JsonProcessingException {
		//String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ5cHFuM2lZR0xDV1pKcl8yUlVpZmlqcEVzZWF3MUJBeHd5SnpqSk5neHFzIn0.eyJleHAiOjE3MjcwNTg0MjQsImlhdCI6MTcyNzA1NjkyNCwianRpIjoiOTFlMjdlNjctYjNmZi00YWI5LThlMjMtYjkzYzQwZGFmYmFiIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgxL3JlYWxtcy9hY21hIiwiYXVkIjpbInJlYWxtLW1hbmFnZW1lbnQiLCJhY2NvdW50Il0sInN1YiI6ImZlZjQxMzA5LTk4MWMtNDY1MS1hMDRjLTIxN2VlNjI5N2ZmZCIsInR5cCI6IkJlYXJlciIsImF6cCI6InN0YXRlZm9ybS1zdmMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLWFjbWEiLCJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsicmVhbG0tbWFuYWdlbWVudCI6eyJyb2xlcyI6WyJtYW5hZ2UtdXNlcnMiXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiY2xpZW50SG9zdCI6IjE3Mi4xOC4wLjEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc3RhdGVmb3JtLXN2YyIsImNsaWVudEFkZHJlc3MiOiIxNzIuMTguMC4xIiwiY2xpZW50X2lkIjoic3RhdGVmb3JtLXN2YyJ9.wBej-LmWoSvu9ueBWJluI1AXhDVKmXSsVQNWtYN9lx6NftuGMjetFn7EGQlx4m-LgSSr0O9H6IgC15WejwN4gFdVwgT6wWwGh2wXdyXxMEFhd17o8J5yOTWVKinqG0po7ejxaFU2VcFM9zf3Rc6nRJKB0QyXsmLAbR1c7BzDJLW_DPu8cLW2iYXsqXAUk5FuOMndFVcfLcWuRfC__2IMNobVr2ANv1SaVQJW7CIF_7cTQ0472ZTDW9I_5IHb-18fPaS3Q7POd68UgTW2Qo2rVLMNPw8KOZTLsO0LjFedVSZx9FAMxPRDZ3A_JdIGKOdEEq6rywfmoJd7JqQqNfpmxw";
		usersAPI.getAllPropertyOwners(accessToken);
	}
	
	@Test
	public void testCreateUser() {
		Users newUser = Users.builder()
							.firstName("deepak")
							.lastName("vats")
							.email("dipkvts@yopmail.com")
							.username("dipkvts")
							.build();
		
		String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ5cHFuM2lZR0xDV1pKcl8yUlVpZmlqcEVzZWF3MUJBeHd5SnpqSk5neHFzIn0.eyJleHAiOjE3MjcwNjA3NDcsImlhdCI6MTcyNzA1OTI0NywianRpIjoiZTZjN2MzYjYtNmE3MS00ZWQxLWI1YWUtMDQ3YzMxOTBhY2E1IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgxL3JlYWxtcy9hY21hIiwiYXVkIjpbInJlYWxtLW1hbmFnZW1lbnQiLCJhY2NvdW50Il0sInN1YiI6ImZlZjQxMzA5LTk4MWMtNDY1MS1hMDRjLTIxN2VlNjI5N2ZmZCIsInR5cCI6IkJlYXJlciIsImF6cCI6InN0YXRlZm9ybS1zdmMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLWFjbWEiLCJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsicmVhbG0tbWFuYWdlbWVudCI6eyJyb2xlcyI6WyJtYW5hZ2UtdXNlcnMiXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiY2xpZW50SG9zdCI6IjE3Mi4xOC4wLjEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc3RhdGVmb3JtLXN2YyIsImNsaWVudEFkZHJlc3MiOiIxNzIuMTguMC4xIiwiY2xpZW50X2lkIjoic3RhdGVmb3JtLXN2YyJ9.TLDzvkW5YO3zWl3lhC3bZymmPdg0N-gvHbds5OymgPFdCjov4rTOmH1u5gwbuKZDL5P7BEIYXPdcF23jMmovCmv8voxGZmLMpvikejxNbZxJLGS57qmFIzVuT2JkCxkd86R5Dx1rt3cxWBxgmSQ3o8CVmjetmXFtG5f3cSIhvcsxqBqfo6JhGU5jHbivvEwU6oxv-ihUNGwUHbtIcfK7e4PC6T2lKh14AB6t2xpDYR2n8SM80EfVNPiMEVsGdAnQz86xP81ZbRUkcIB6C5D6czFxSMMztWaZihJl_DI1EaZbXqfNco4dY90LTyihZ1uS-RtK0pk7_wgqdinENnFi1g";		
		//System.out.println(accessToken);
		usersAPI.createUser(newUser, accessToken);
		
	}
}
