package com.dev;

import com.vk.api.sdk.objects.messages.Message;

import java.io.IOException;

public class MessageSession implements Runnable {
    Message message;

    public MessageSession(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            User user = BotApi.getUser(message.getId());
            if (user.getStatus() == UserStatus.Unknown.code()) {
                BotApi.sendDefaultKeyboard();
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
