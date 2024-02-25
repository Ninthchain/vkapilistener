package com.dev;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.ads.Client;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        VkApiClient client = new VkApiClient(HttpTransportClient.getInstance());
        client.groupsLongPoll().setLongPollSettings(new GroupActor(Math.toIntExact(BotApi.getGroupId()), BotApi.getGroupToken(BotApi.getGroupId())))
             .enabled(true)
             .messageNew(true);
        
    }
}
