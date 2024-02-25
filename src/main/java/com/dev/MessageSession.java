package com.dev;

import com.vk.api.sdk.objects.messages.Message;

public class MessageSession implements Runnable {
		Message message;
		public MessageSession(Message message) {
			this.message = message;
		}
		@Override
		public void run() {

		}
}
