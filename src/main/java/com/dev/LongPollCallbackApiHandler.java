package com.dev;


import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class LongPollCallbackApiHandler extends CallbackApiLongPoll {
		
		VkApiClient client;
		GroupActor actor;

		public LongPollCallbackApiHandler(VkApiClient client, UserActor actor, int groupId) {
				
				super(client, actor, groupId);
				this.client = client;
		}

		
		@Override
		public void messageNew(Integer groupId, Message message) {
				
				try {
						if(isNewUser(message)) {
								BotApi.addUser(message.getId(), false, null);
								BotApi.sendMessage("Привет! Вижу ты тут новенький. Можешь написать свой возраст?");
								
						}
				} catch (ClientException | ApiException | IOException | InterruptedException e) {
						throw new RuntimeException(e);
				}
		}
		
		private boolean isNewUser(Message message) throws ClientException, ApiException {
				List<Message> directMessages = this.client.messages().getHistory(this.actor).userId(message.getId()).execute().getItems();
				return directMessages.size() < 2;
		}
}
