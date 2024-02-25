package com.dev;

import com.google.gson.Gson;
import jdk.jshell.spi.ExecutionControl;
import org.apache.commons.lang3.NotImplementedException;

import java.io.Console;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.util.concurrent.Flow;

public class BotApi {
	private static final Gson gson = new Gson();
	
	public static String getGroupToken(long vkId) throws IOException, InterruptedException {
		
		HttpResponse<String> response = GET(String.format("http://localhost:8080/app/db/vk-group?vkId=%d", vkId));
		System.out.println(response.body());
		return "Huy";
	}
	public static long getGroupId() {
			return 69;
	}
	public static void sendUserKeyboard() {
			throw new NotImplementedException("NotImplemented");
	}
	public static void sendAdminKeyboard() {
			throw new NotImplementedException("NotImplemented");
	}
	public static void sendDefaultKeyboard() {
			throw new NotImplementedException("NotImplemented");
	}
	
	public static void sendTestKeyboard() {
			throw new NotImplementedException("NotImplemented");
	}
	public static void sendMessage(String message) {
			throw new NotImplementedException("NotImplemented");
	}
	public static String getUserToken(long vkId) {
		return "Suka";
	}
	public static void addTokenToUser(long userId) {
	
	}
	public static void addUser(long vkId, boolean isVerified, String token) throws IOException, InterruptedException {
		HttpResponse<String> response = POST(String.format("http://localhost:8080/app/person?method-persist&vkId=%d&isVerified=%b&token=%s", vkId, isVerified, token), HttpRequest.BodyPublishers.noBody());
			System.out.println(response.body());
	}
	public static User getUser(long vkId) throws IOException, InterruptedException {
			HttpResponse<String> response = GET(String.format("http://localhost:8080/app/person?vkId=%d", vkId));
			return gson.fromJson(response.body(), User.class);
		}
	private static HttpResponse<String> GET(String requestUri) throws IOException, InterruptedException {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(requestUri))
				.GET()
				.build();
			
			return client.send(request, HttpResponse.BodyHandlers.ofString());
	}
	private static HttpResponse<String> POST(String requestUri, HttpRequest.BodyPublisher publisher) throws IOException, InterruptedException {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(requestUri))
				.POST(publisher)
				.build();
				
			return client.send(request, HttpResponse.BodyHandlers.ofString());
	}
}
