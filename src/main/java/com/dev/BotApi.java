package com.dev;

import jdk.jshell.spi.ExecutionControl;
import org.apache.commons.lang3.NotImplementedException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.util.concurrent.Flow;

public class BotApi {

	public static String getGroupToken(long vkId) throws IOException, InterruptedException {
		
		HttpResponse<String> response = GET(String.format("http://localhost:8080/app/db/vk-group?vkId=%d", vkId));
		System.out.println(response.body());
		return "Huy";
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
	public static void addUser(long vkId, boolean isVerified, String token) {
	
	}
	private static HttpResponse<String> GET(String requestUri) throws IOException, InterruptedException {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest vkGroupRequest = HttpRequest.newBuilder()
				.uri(URI.create(requestUri))
				.GET()
				.build();
			
			return client.send(vkGroupRequest, HttpResponse.BodyHandlers.ofString());
	}
	private static <Type> HttpResponse<Type> POST(URI uri) {
			throw new NotImplementedException("POST isn't implemented");
	}
}
